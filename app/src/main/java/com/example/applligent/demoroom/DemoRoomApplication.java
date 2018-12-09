package com.example.applligent.demoroom;

import android.app.Application;
import android.arch.persistence.room.Room;

public class DemoRoomApplication extends Application {
    final static String DATABASE_NAME = "db-room-demo";
    private static MyDatabase myDatabase;
    private static DemoRoomApplication demoRoomApplication;

    public static MyDatabase getDatabase() {
        if (myDatabase == null) {
            myDatabase = Room.databaseBuilder(demoRoomApplication,
                    MyDatabase.class, DATABASE_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return myDatabase;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        demoRoomApplication = this;
    }

}

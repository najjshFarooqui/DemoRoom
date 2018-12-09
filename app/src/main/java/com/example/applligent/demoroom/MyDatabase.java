package com.example.applligent.demoroom;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = Product.class, version = 1)
public abstract class MyDatabase extends RoomDatabase {
    public abstract ProductDao productDao();
}

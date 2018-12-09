package com.example.applligent.demoroom;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
@Entity
public class Product {
    @PrimaryKey(autoGenerate = true)
    public int uid;
    public String name;
    public String imageUrl;
}

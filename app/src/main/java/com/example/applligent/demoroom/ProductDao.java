package com.example.applligent.demoroom;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface ProductDao {
    @Query("select * from Product")
    List<Product> getAll();

    @Query("select max(uid) from product limit 1 ")
    int getMaxId();

    @Query("select * from product where uid =:uid ")
     int getUid(int uid);

    @Query("Delete from product where name= :name ")
     void deleteMany(List<String> name);

    @Query("SELECT * from Product where name like :name limit 1")
    Product findByName(String name);

    @Insert
    void insertAll(List<Product> products);

    @Insert
    void insert(Product product);

    @Update
    void update(Product product);

    @Delete
    void delete(Product product);
}

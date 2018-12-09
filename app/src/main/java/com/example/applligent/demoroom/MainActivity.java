package com.example.applligent.demoroom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ProductDao productDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productDao = DemoRoomApplication.getDatabase().productDao();
       /* Product product = new Product();
        product.name = "najish";
        product.imageUrl = "url";
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(product);
        productDao.insertAll(products);

        Product newProduct= new Product();
        newProduct.name="Applligent";
        newProduct.imageUrl="image2";
        ArrayList<Product> newProducts= new ArrayList<>();
        newProducts.add(newProduct);
        productDao.insertAll(newProducts);*/
       Product product = new Product();

       productDao.getMaxId();
       int maxId=productDao.getMaxId();

       productDao.getUid(maxId);
        printProducts();
    }

    public void printProducts() {
        List<Product> products = productDao.getAll();
        for (Product product : products) {
            Log.d("abc123", Integer.toString(product.uid));
        }
    }
}

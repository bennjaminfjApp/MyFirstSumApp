package com.example.user.myfirstsumapp;

import android.widget.ImageView;

/**
 * Created by user on 12/11/2017.
 */

public class Product {

   private String name ;
   private String description ;
   private String price ;


   public Product ( String name , String description , String price ){
       this.name = name ;
       this.description = description ;
       this.price = price ;
   }

    public String getName () {
        return this.name;
    }

    public void setName ( String name ){
        this.name = name;

   }

    public String getDescription () {
        return this.description;
    }

    public void setDescription ( String description ){
        this.description = description;

    }

    public String getPrice () {
        return this.price;
    }

    public void setPrice ( String price ){
        this.price = price;

    }
}

package com.example.admin.a1541180021_ivonfadhilarahma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Food {

    private long id;
    private String nama_food;
    private String menu_food;
    private String harga_food;

    public Food()
    {

    }

    /**
     * @return the id
     */
    public long getId() {

        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {

        this.id = id;
    }

    /**
     * @return the nama_food
     */
    public String getNama_food() {

        return nama_food;
    }

    /**
     * @param nama_food the nama_food to set
     */
    public void setNama_food(String nama_food) {

        this.nama_food = nama_food;
    }

    /**
     * @return the menu_food
     */
    public String getMenu_food() {

        return menu_food;
    }

    /**
     * @param menu_food the menu_food to set
     */
    public void setMenu_food(String menu_food) {

        this.menu_food = menu_food;
    }

    /**
     * @return the harga_food
     */
    public String getHarga_food() {

        return harga_food;
    }

    /**
     * @param harga_food the harga_food to set
     */
    public void setHarga_food(String harga_food) {

        this.harga_food = harga_food;
    }

    @Override
    public String toString()
    {
        return "Food "+ nama_food +" "+ menu_food + " "+ harga_food;
    }
}



package com.programmerhuntbd.bulbul.recyclerviewpractice;

/**
 * Created by bulbul on 8/29/2018.
 */

public class Contact {
    int img_id;
    String name,email;


    public Contact(int img_id, String name, String email) {
        this.img_id = img_id;
        this.name = name;
        this.email = email;
    }


    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getImg_id() {
        return img_id;
    }

    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

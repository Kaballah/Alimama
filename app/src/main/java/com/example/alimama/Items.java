package com.example.alimama;

public class Items {
    String [] item = new String[10];

    public void itemSelected(String itemName, String itemPrice) {
        item[1] = itemName;
        item[2] = itemPrice;
    }
}

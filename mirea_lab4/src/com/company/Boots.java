package com.company;

public class Boots implements Priceable{
    private String name;
    private String material;
    private int price;

    public Boots(String name, String material, int price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public int  getPrice(){
        return price;
    }
}

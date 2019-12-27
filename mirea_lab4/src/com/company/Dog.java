package com.company;

public class Dog implements Priceable{
    private String kind;
    private String gender;
    private int price;

    public Dog(String kind, String gender, int price) {
        this.kind = kind;
        this.gender = gender;
        this.price = price;
    }

    public int  getPrice(){
        return price;
    }
}

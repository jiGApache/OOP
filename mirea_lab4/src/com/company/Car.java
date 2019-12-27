package com.company;

public class Car implements Priceable{
    private String name;
    private int price;
    private String colour;

    public Car(String name, int price, String colour) {
        this.name = name;
        this.price = price;
        this.colour = colour;
    }

   public int  getPrice(){
        return price;
   }
}

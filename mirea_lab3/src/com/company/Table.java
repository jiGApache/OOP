package com.company;

public class Table extends Furniture{
    private int legs;
    private String colour;

    public Table(int height, int length, int depth, String name, int price, int legs, String colour, int quantity) {
        super(height, length, depth, name, price, quantity);
        this.colour = colour;
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public String getColour() {
        return colour;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void showInfo(){
        System.out.println("Характеристики данного твара:\n" +
                "\tДлина: " + getLength() + "\n" +
                "\tГлубина: " + getDepth() + "\n" +
                "\tВысота: " + getHeight() + "\n" +
                "\tНазвание: "+ getName() + "\n" +
                "\tЦена: " + getPrice() + "\n" +
                "\tКоличесвто ножек: " + getLegs() + "\n" +
                "\tЦвет: " + getColour());
    }
}

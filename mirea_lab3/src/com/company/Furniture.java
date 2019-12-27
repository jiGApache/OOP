package com.company;

public abstract class Furniture {
    private int height;
    private int length;
    private int depth;
    private String name;
    private int price;
    private int quantity;

    public Furniture(int height, int length, int depth, String name, int price, int quantity) {
        this.height = height;
        this.length = length;
        this.depth = depth;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    abstract void showInfo();

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getDepth() {
        return depth;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

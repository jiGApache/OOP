package com.company;

public class Sofa extends Furniture{
    private String material;
    private int pillow;

    public Sofa(int height, int length, int depth, String name, int price, String material, int pillow, int quantity){
        super (height, length, depth, name, price, quantity);
        this.material = material;
        this.pillow = pillow;
    }

    public String getMaterial() {
        return material;
    }

    public int getPillow() {
        return pillow;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPillow(int pillow) {
        this.pillow = pillow;
    }

    public void showInfo(){
        System.out.println("Характеристики данного твара:\n" +
                          "\tДлина: " + getLength() + "\n" +
                          "\tГлубина: " + getDepth() + "\n" +
                          "\tВысота: " + getHeight() + "\n" +
                          "\tНазвание: "+ getName() + "\n" +
                          "\tЦена: " + getPrice() + "\n" +
                          "\tМатериал: " + getMaterial() + "\n" +
                          "\tКоличество подушек: " + getPillow());
    }
}

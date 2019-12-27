package com.company;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(){
        super();
        width = length = 0.0;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return 2*(width + length);
    }

    public String toString(){
        return "This rectangle is " + getWidth() + " in width, " + getLength() +" in length and colored in " + getColor();
    }
}

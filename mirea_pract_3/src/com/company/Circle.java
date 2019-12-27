package com.company;

public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;
    public Circle(){
        super();
        radius = 0.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return PI*PI*radius;
    }

    public double getPerimeter(){
        return 2*PI*radius;
    }

    public String toString(){
        return "This circle is " + getRadius() + " in radius and colored in " + getColor();
    }
}

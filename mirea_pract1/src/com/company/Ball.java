package com.company;

public class Ball {
    private double radius;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Ball(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "The work of toString Function:   " +
                "Ball{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public void calcVolume(){
        System.out.println("The volume of this ball is: "+3.14*radius*radius + " cubic meters");
    }
}

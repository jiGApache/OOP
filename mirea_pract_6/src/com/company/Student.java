package com.company;

public class Student {
    private String name;
    private int averageScore;
    Student(String name){
        this.averageScore = (int)(2 + Math.random()*10);
        this.name = name;
    }

    public int getAverage_score() {
        return averageScore;
    }
}

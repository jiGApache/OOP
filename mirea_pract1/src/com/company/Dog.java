package com.company;

public class Dog {
    private String name;
    private int age;

    public String getBreed() {
        return name;
    }

    public void setBreed(String breed) {
        this.name = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "The work of toString function:   " +
                "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void intoHumanAge(){
        System.out.println(name +"'s age in human years is "+age*7+" years");
    }
}

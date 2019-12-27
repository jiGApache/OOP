package com.company;

public class User {
    private String name;
    private String INN;

    public User(){
        name = "somebody";
        INN = "123456789123";
    }
    public User(String name, String INN){
        this.name = name;
        this.INN = INN;
    }
    public String getName(){
        return name;
    }
    public String getINN(){
        return INN;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setINN(String INN){
        this.INN = INN;
    }
}

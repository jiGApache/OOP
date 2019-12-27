package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        System.out.println("Enter your name: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        user.setName(name);
        try{
            System.out.println("Enter your INN: ");
            String INN = in.nextLine();
            user.setINN(INN);
            if(user.getINN().length() != 12){
                throw new MyException("Wrong INN: " + user.getINN());
            }
            System.out.println("User " + user.getName() + " " + user.getINN() + " has been created!");
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}
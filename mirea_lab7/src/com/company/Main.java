package com.company;

public class Main {

    public static void main(String[] args) {
        //Тест add() и get()
        MyArrayList <String> arr = new MyArrayList<>(5);
        arr.add("JJJ");
        arr.add("FFFF");
        arr.add("zzzzz");
        arr.add(1, "KKKKKK");
        arr.add(3, "LLLLLLL");
        arr.add("LLLLLLL");
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }

        //Тест remove()
        arr.remove(0);
        arr.remove("LLLLLLL");
        System.out.println("\n");
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }

        //Тест set()
        arr.set(1, "LLLLLLL");
        System.out.println("\n");
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }

        //Тест indexOf(), lastIndexOf() и size()
        System.out.println("\n");
        for(int i = 0; i<10; i++)
            arr.add("qq");
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
        System.out.println("Index of the first occurrence of an object: " + arr.indexOf("qq"));
        System.out.println("Index of the last occurrence of an object: " + arr.lastIndexOf("qq"));
        System.out.print("Size: " + arr.size());
    }
}

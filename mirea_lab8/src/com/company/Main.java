package com.company;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        boolean keep = true;
        try {
            RandomAccessFile file = new RandomAccessFile("C:\\Users\\Mi\\Desktop\\FFF.txt", "rw");
            System.out.println("Для перезаписи файла - 1\n" +
                    "Для добавления в конец - 2\n" +
                    "Для считывания строки из файла - 3\n" +
                    "Для выхода из программы - 4");

            while (keep) {
                choice = in.nextInt();
                switch (choice) {
                    case 1:
                        String rewrite;
                        in.nextLine();
                        rewrite = in.nextLine();
                        file.setLength(0);
                        file.write(rewrite.getBytes());
                        System.out.println("Success!");
                        break;
                    case 2:
                        String add;
                        in.nextLine();
                        add = in.nextLine();
                        file.seek(file.length());
                        file.write(add.getBytes());
                        System.out.println("Success!");
                        break;
                    case 3:
                        String read = "";
                        file.seek(0);
                        int b = file.read();
                        while (b != -1){
                            read = read + (char)b;
                            b = file.read();
                        }
                        System.out.println(read);
                        break;
                    case 4:
                        keep = false;
                        System.out.println("Пока");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("то-то пошло не так...");
        }
    }
}
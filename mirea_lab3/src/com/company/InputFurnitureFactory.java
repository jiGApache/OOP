package com.company;

import java.util.Scanner;

class InputFurnitureFactory implements InputFurniture{
    private String[] tabl = new String[]{"Ширина: ", "Длина: ", "Глубина: ", "Название: ","Цена: ",
                                         "Количество ножек: ", "Цвет: ", "Количесвто поступающего товара: "};
    private String[] sof = new String[]{"Ширина: ", "Длина: ", "Глубина: ","Название: ", "Цена: ",
                                        "Материал: ", "Количесвто подушек: ", "Количесвто поступающего товара: "};
    private String[] chars = new String[8];
    private Scanner input = new Scanner(System.in);
    private String in;


    public Furniture input() {
        Scanner add = new Scanner(System.in);
        int choice = add.nextInt();

        if (choice == 1) {
            for (int i = 0; i < tabl.length; i++) {
                System.out.print(tabl[i]);
                in = input.nextLine();
                chars[i] = in;
            }
            return new Table(Integer.parseInt(chars[0]), Integer.parseInt(chars[1]), Integer.parseInt(chars[2]), chars[3],
                             Integer.parseInt(chars[4]), Integer.parseInt(chars[5]), chars[6], Integer.parseInt(chars[7]));
        } else if (choice == 2) {
            for (int i = 0; i < tabl.length; i++) {
                System.out.print(sof[i]);
                in = input.nextLine();
                chars[i] = in;
            }
            return new Sofa(Integer.parseInt(chars[0]), Integer.parseInt(chars[1]), Integer.parseInt(chars[2]), chars[3],
                            Integer.parseInt(chars[4]), chars[5], Integer.parseInt(chars[6]), Integer.parseInt(chars[7]));
        } else {
            return null;
        }
    }
}

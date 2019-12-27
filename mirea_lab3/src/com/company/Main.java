package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean keep = true;
        Scanner choice = new Scanner(System.in);
        FurnitureShop fs = new FurnitureShop();

        System.out.println("Добро пожаловать в программу управлением магазина.");
        while (keep)
        {
            System.out.println("Выберете действие:" +
                                "\n1. Добавить новый товар в каталог;" +
                                "\n2. Удалить товар из каталога;" +
                                "\n3. Начать продажи;" +
                                "\n4. Показать текущий баланс магазина;" +
                                "\n5. заврешить работу магазина.");
            int main_choice = choice.nextInt();
            if(main_choice == 5){
                break;
            }
            switch(main_choice){
                case 1:
                    System.out.print("Какой товар выбрать для добавления?");
                    System.out.println("\n1. Стол" +
                                       "\n2. Диван");
                    InputFurnitureFactory iff = new InputFurnitureFactory();
                    Furniture add = iff.input();
                    if(add != null){
                        fs.addGood(add);
                    }
                    break;
                case 2:
                    System.out.println("Какой из товоров удалить из каталога?");
                    fs.getGoods();
                    int delete_choice = choice.nextInt();
                    fs.deleteGood(delete_choice);
                    break;
                case 3:
                    System.out.println("Какой из товаров продать?");
                    fs.getGoods();
                    int sell_choice = choice.nextInt();
                    fs.sell(sell_choice);
                    break;
                case 4:
                    System.out.println("Баланс магазина составляет: " + fs.getBalance());
                    break;
            }
        }
        System.out.print("Power off.");
    }
}

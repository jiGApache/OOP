package com.company;

public class Main {

    public static void main(String[] args) {
        Priceable[] goods = new Priceable[]{new Car("Жигули", 50000, "вишневый"),
                                            new Dog("Бульдог", "самец", 10000),
                                            new Boots("Кеды", "замша", 5000)};

        System.out.println("Цена Жигулей: " +  goods[0].getPrice());
        System.out.println("Цена Бульдога: " +  goods[1].getPrice());
        System.out.println("Цена Кед: " +  goods[2].getPrice());
    }
}

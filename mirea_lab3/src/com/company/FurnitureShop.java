package com.company;

public class FurnitureShop {
    private Furniture[] goods;
    private int balance = 0;
    public FurnitureShop(){
        goods = new Furniture[]{};
        //Стандартный склад магазина
    }

    public void addGood(Furniture add) {
        Furniture[] temp = new Furniture[goods.length];
        System.arraycopy(goods, 0, temp, 0, goods.length);
        goods = new Furniture[temp.length+1];
        System.arraycopy(temp, 0, goods, 0, temp.length);
        goods[goods.length-1] = add;
        System.out.println("Успешно добавлено!\n");
    };

    public void deleteGood(int delete_choice){
        Furniture[] temp = new Furniture[goods.length-1];
        for(int i = delete_choice-1; i<goods.length-1; i++){
            goods[i] = goods[i+1];
        }
        System.arraycopy(goods,0, temp, 0, goods.length-1);
        goods = new Furniture[temp.length];
        System.arraycopy(temp,0, goods,0, temp.length);
        System.out.println("Успешно удалено!\n");
    };
    public void getGoods(){
        if (goods.length == 0) {
            System.out.println("Empty");
        } else {
            for(int i = 0; i < goods.length; i++){
                System.out.println((i+1)+ ". " + goods[i].getName() + "(" + goods[i].getQuantity() + ")" + ": " + goods[i].getPrice() + "$");
            }
        }
    }
    public void sell(int sellChoice) {
        if (goods[sellChoice-1].getQuantity() == 0){
            System.out.println("Ошибка продажи! Данный товар отсутсвует в наличии!");
            System.out.println("Отправлена автоматическая заявка на пополнение склада отсутсвующей единицей мебели в размере 5 шт.");
            goods[sellChoice-1].setQuantity(5);
            return;
        }
        balance += goods[sellChoice-1].getPrice();
        goods[sellChoice-1].setQuantity(goods[sellChoice-1].getQuantity()-1);
        System.out.println("Товар успешно продан!\n");
    }
    public int getBalance(){
        return balance;
    }
}
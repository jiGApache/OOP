package com.company;

public class TestClass {

    public static void main(String[] args) {
        Book[] books = {new Book("Crime and punishment", "Dostoyevsky", 1866),
                        new Book("Man in case", "Chekhov", 1898)};
        Ball[] balls = {new Ball(0.15, "White"),
                        new Ball(0.2, "Black")};
        Dog[] dogs = {new Dog("Sharik", 10),
                      new Dog("Max", 3)};

        books[0].calcDuration();
        balls[0].calcVolume();
        dogs[0].intoHumanAge();

        System.out.println(books[1]);
        System.out.println(balls[1]);
        System.out.println(dogs[1]);
    }
}

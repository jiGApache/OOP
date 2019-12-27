package com.company;

import java.util.ArrayDeque;

public class PlayerDeque implements Player{
    private ArrayDeque<Integer> cards;

    public PlayerDeque(){ cards = new ArrayDeque<Integer>(); }

    public void addLast(int num) { cards.addLast(num); }

    public Integer pollFirst() { return cards.pollFirst(); }

    public Integer getFirst() {
        return cards.getFirst();
    }

    public Integer getSize(){ return cards.size(); }

    public void show(){
        if (getSize() != 0) {
            for (int i = 0; i < getSize(); i++) {
                System.out.print(getFirst());
                int temp = pollFirst();
                addLast(temp);
            }
            System.out.println(" ");
        } else {
            System.out.println("----------");
        }
    }
}

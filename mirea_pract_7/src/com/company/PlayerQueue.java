package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class PlayerQueue implements Player{
    private Queue<Integer> cards;

    public PlayerQueue(){ cards = new LinkedList<Integer>(); }

    public void addLast(int num) { cards.add(num); }

    public Integer pollFirst() { return cards.poll(); }

    public Integer getFirst() { return cards.peek(); }

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

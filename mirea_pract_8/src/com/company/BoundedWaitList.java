package com.company;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int capacity){ this.capacity = capacity; }

    public int getCapacity() { return capacity; }

    public E remove(){
        capacity++;
        return queue.remove();
    }

    public void add(E e) {
        if (capacity > 0){
            queue.add(e);
            capacity--;
        } else {
            System.out.println("Capacity is 0!");
        }
    }
}
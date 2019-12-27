package com.company;

import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> queue;

    public WaitList(){ queue = new ConcurrentLinkedQueue<>(); }

    public WaitList (ConcurrentLinkedQueue<E> queue){ this.queue = queue; }

    public void add(E element) { queue.add(element); }

    public E remove() { return queue.remove(); }

    public boolean contains(E e) { return queue.contains(e); }

    public boolean containsAll(ConcurrentLinkedQueue<E> queue) { return this.queue.containsAll(queue); }

    public boolean isEmpty() { return queue.isEmpty(); }

    public String toString(){ return queue.toString(); }
}
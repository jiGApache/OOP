package com.company;

import java.util.concurrent.ConcurrentLinkedQueue;

public interface IWaitList<E> {
    void add(E element);
    E remove();
    boolean contains(E e);
    boolean containsAll(ConcurrentLinkedQueue<E> queue);
    boolean isEmpty();
}
package com.company;

public interface MyInterface<E> {
    void add(E item);
    void add(int index, E item);
    E get (int index);
    void remove(int index);
    void remove(E item);
    void set(int index, E item);
    int size();
    int indexOf(E item);
    int lastIndexOf(E item);
}
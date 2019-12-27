package com.company;

public class SuperArray<E> {
    private Object[] array;

    public SuperArray(E[] a){
        array = new Object[a.length];
        for (int i = 0; i < a.length; i++){
            array[i] = a[i];
        }
    }

    public E get(int index){
        if (index >= array.length){
            throw new IndexOutOfBoundsException("Index: " + index + ", Array.length: " + array.length);
        }
        return (E) array[index];
    }

    public int get(){
        return array.length;
    }
}

package com.company;

public class MyArrayList<E>{
    private int size;
    private Object[] elements;

    public MyArrayList(){
        elements = new Object[3];
        size = 0;
    }
    public void add (E o){
        if(size<elements.length){
            elements[size] = o;
        } else {
            Object[] temp = elements;
            elements = new Object[temp.length*2];
            for (int i = 0; i < temp.length; i++){
                elements[i] = temp[i];
            }
            elements[size] = o;
        }
        size++;
    };
    public E get (int index){
        if (index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E)elements[index];
    };
    public int getSize(){
        return size;
    }
}

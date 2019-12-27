package com.company;

public class MyArrayList<E> implements MyInterface {
    private final int INIT_SIZE = 10;
    private final int CUT_RATE = 4;
    private Object[] array;
    private int pointer = 0;

    public MyArrayList(){
        array = new Object[INIT_SIZE];
        array[0] = null;
    }

    public MyArrayList(int size){
        array = new Object[size];
        array[0] = null;
    }

    @Override
    public void add(Object item) {
        if(pointer == array.length-1)
            resize(array.length*2);
        array[pointer] = item;
        pointer++;
    }

    @Override
    public void add(int index, Object item) {
        if(pointer == array.length-1)
            resize(array.length*2);
        for (int i = pointer; i > index; i--)
            array[i] = array[i-1];
        array[index] = item;
        pointer++;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public void remove(int index) {
        for(int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if(array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length/2);
    }

    @Override
    public void remove(Object item) {
        int index;
        for(int i = 0; i < pointer; i++) {
            if (array[i] == item) {
                index = i;
                remove(index);
            }
        }
    }

    @Override
    public void set(int index, Object item) {
        array[index] = item;
    }

    @Override
    public int size() {
        if(array[0] == null)
            return 0;
        else
            return pointer;
    }

    @Override
    public int indexOf(Object item) {
        int index = -1;
        for(int i = 0; i<pointer; i++){
            if(array[i] == item){
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object item) {
        int index = -1;
        for(int i = pointer-1; i>-1; i--) {
            if (array[i] == item) {
                index = i;
                break;
            }
        }
        return index;
    }

    private void resize (int newLength){
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}

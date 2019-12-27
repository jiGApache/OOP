package com.company;

public class ArrayQueue extends AbstractQueue{
    private final int CAPACITY = 20;
    private Object array[];
    private int size;
    private int head;
    private int tail;

    public ArrayQueue() {
        array = new Object[CAPACITY];
        size = 0;
        head = 0;
        tail = 0;
    }

    private void checkCapacity(int capacity) {
        if (capacity >= array.length) {
            Object[] temp = new Object[array.length*2];
            int count;
            if (tail < head){
                count = array.length - head;
            } else {
                count = size;
            }
            System.arraycopy(array, head, temp, 0, count);
            if (tail < head)
                System.arraycopy(array, 0, temp, count, tail);
            array = temp;
            head = 0;
            tail = size;
        }
    }

    public void enqueueRealisation(Object element) {
        assert element != null;
        checkCapacity(size + 1);
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    public Object elementRealisation() {
        assert size > 0;
        return array[head];
    }

    public Object dequeueRealisation() {
        assert size > 0;
        Object result = element();
        array[head] = null;
        size--;
        head = (head + 1) % array.length;
        return result;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void clear() {
        size = 0;
        head = 0;
        tail = 0;
        array = new Object[CAPACITY];
    }
}

package com.company;

public class ArrayQueueModule {
    private static final int CAPACITY = 20;
    private static Object array[] = new Object[CAPACITY];
    private static int size = 0;
    private static int head = 0;
    private static int tail = 0;

//    public ArrayQueueModule() {
//        array = new Object[CAPACITY];
//        size = 0;
//        head = 0;
//        tail = 0;
//    }

    private static void checkCapacity(int capacity) {
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

    //pre: element != null
    //post: elements[tail] = element
    //      tail = (tail + 1) % elements.length
    //      size = size + 1
    public static void enqueue(Object element) {
        assert element != null;
        checkCapacity(size + 1);
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    //pre: size > 0
    //post: return = elements[head]
    public static Object element() {
        assert size > 0;
        return array[head];
    }

    //pre: size > 0
    //post: return = elements[head]
    //      head = (head + 1) % elements.length
    //      size = size - 1
    public static Object dequeue() {
        assert size > 0;
        Object result = element();
        array[head] = null;
        size--;
        head = (head + 1) % array.length;
        return result;
    }

    //post: return = size
    public static int size() {
        return size;
    }

    //post: return = (size == 0)
    public static boolean isEmpty() {
        return (size == 0);
    }

    //post: size = 0
    //      head = 0
    //      tail = 0
    public static void clear() {
        size = 0;
        head = 0;
        tail = 0;
        array = new Object[CAPACITY];
    }
}

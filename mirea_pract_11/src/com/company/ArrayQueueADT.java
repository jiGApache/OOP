package com.company;

public class ArrayQueueADT {
    private static final int CAPACITY = 20;
    private Object array[] = new Object[CAPACITY];
    private int size = 0;
    private int head = 0;
    private int tail = 0;

//    public ArrayQueueModule() {
//        array = new Object[CAPACITY];
//        size = 0;
//        head = 0;
//        tail = 0;
//    }

    private static void checkCapacity(ArrayQueueADT adt, int capacity) {
        if (capacity >= adt.array.length) {
            Object[] temp = new Object[adt.array.length*2];
            int count;
            if (adt.tail < adt.head){
                count = adt.array.length - adt.head;
            } else {
                count = adt.size;
            }
            System.arraycopy(adt.array, adt.head, temp, 0, count);
            if (adt.tail < adt.head)
                System.arraycopy(adt.array, 0, temp, count, adt.tail);
            adt.array = temp;
            adt.head = 0;
            adt.tail = adt.size;
        }
    }

    //pre: element != null
    //post: elements[tail] = element
    //      adt.tail = (adt.tail + 1) % adt.elements.length
    //      adt.size = adt.size + 1
    public static void enqueue(ArrayQueueADT adt, Object element) {
        assert element != null;
        checkCapacity(adt, adt.size + 1);
        adt.array[adt.tail] = element;
        adt.tail = (adt.tail + 1) % adt.array.length;
        adt.size++;
    }

    //pre: adt.size > 0
    //post: return = elements[head]
    public static Object element(ArrayQueueADT adt) {
        assert adt.size > 0;
        return adt.array[adt.head];
    }

    //pre: adt.size > 0
    //post: return = elements[head]
    //      adt.head = (head + 1) % adt.elements.length
    //      adt.size = adt.size - 1
    public static Object dequeue(ArrayQueueADT adt) {
        assert adt.size > 0;
        Object result = element(adt);
        adt.array[adt.head] = null;
        adt.size--;
        adt.head = (adt.head + 1) % adt.array.length;
        return result;
    }

    //post: return = adt.size
    public static int size(ArrayQueueADT adt) {
        return adt.size;
    }

    //post: return = (adt.size == 0)
    public static boolean isEmpty(ArrayQueueADT adt) {
        return (adt.size == 0);
    }

    //post: adt.size = 0
    //      adt.head = 0
    //      adt.tail = 0
    public static void clear(ArrayQueueADT adt) {
        adt.size = 0;
        adt.head = 0;
        adt.tail = 0;
        adt.array = new Object[CAPACITY];
    }
}
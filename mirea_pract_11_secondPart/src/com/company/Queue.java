package com.company;

public interface Queue {
    //pre: element != null
    //post: elements[tail] = element
    //      tail = (tail + 1) % elements.length
    //      size = size + 1
    void enqueue(Object element);

    //pre: size > 0
    //post: return = elements[head]
    Object element();

    //pre: size > 0
    //post: return = elements[head]
    //      head = (head + 1) % elements.length
    //      size = size - 1
    Object dequeue();

    //post: return = size
    int size();

    //post: return = (size == 0)
    boolean isEmpty();

    //post: size = 0
    //      head = 0
    //      tail = 0
    void clear();
}

package com.company;

public class LinkedQueue extends AbstractQueue{
    private Node head;
    private Node tail;
    private int size;

    public LinkedQueue(){
        head = null;
        tail = null;
        size = 0;
    }

    public void enqueueRealisation(Object element){
        if (size == 0){
            head = new Node(element, null, null);
            tail = new Node(null,null, head);
            head.next = tail;
        } else {
            tail.element = element;
            tail = new Node(null, null, tail);
            tail.prev.next = tail;
        }
        size++;
    }

    public Object elementRealisation(){
        return head.element;
    }

    public Object dequeueRealisation(){
        Object result;
        result = element();
        head = head.next;
        head.prev = null;
        size--;
        return result;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public void clear(){
        while (!isEmpty()) {
            dequeue();
        }
    }

    private class Node{
        Object element;
        Node prev;
        Node next;

        Node(Object element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}

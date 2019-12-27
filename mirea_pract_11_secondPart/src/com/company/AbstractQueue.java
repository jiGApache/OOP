package com.company;

public abstract class AbstractQueue implements Queue{

    protected abstract void enqueueRealisation(Object element);

    protected abstract Object elementRealisation();

    protected abstract Object dequeueRealisation();

    public void enqueue(Object element) {
        assert element != null;
        enqueueRealisation(element);
    }

    public Object element() {
        return elementRealisation();
    }

    public Object dequeue() {
        Object result = dequeueRealisation();
        dequeueRealisation();
        return result;
    }
}

package com.company;

public class QueueTest {
    public static void main(String[] args) {
        ArrayQueueModule.enqueue(11111);
        ArrayQueueModule.enqueue("eeeeeee");
        ArrayQueueModule.enqueue(12.56789);

        System.out.println(ArrayQueueModule.size());
        System.out.println(ArrayQueueModule.element());
        System.out.println("QueueModule isEmpty: " + ArrayQueueModule.isEmpty());
        int tempSize = ArrayQueueModule.size();
        for (int i = 0; i < tempSize; i++){
            System.out.print(ArrayQueueModule.dequeue() + " ");
        }
        System.out.println("\nQueueModule isEmpty: " + ArrayQueueModule.isEmpty() + "\n\n\n\n");




        ArrayQueueADT queueAdt = new ArrayQueueADT();
        ArrayQueueADT.enqueue(queueAdt, 111);
        ArrayQueueADT.enqueue(queueAdt,"eeee");
        ArrayQueueADT.enqueue(queueAdt,12.56);

        System.out.println(ArrayQueueADT.size(queueAdt));
        System.out.println(ArrayQueueADT.element(queueAdt));
        System.out.println("QueueADT isEmpty: " + ArrayQueueADT.isEmpty(queueAdt));
        int tempSize1 = ArrayQueueADT.size(queueAdt);
        for (int i = 0; i < tempSize1; i++){
            System.out.print(ArrayQueueADT.dequeue(queueAdt) + " ");
        }
        System.out.println("\nQueueADT isEmpty: " + ArrayQueueADT.isEmpty(queueAdt) + "\n\n\n\n");



        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.enqueue("e");
        queue.enqueue(12.5);

        System.out.println(queue.size());
        System.out.println(queue.element());
        System.out.println("Queue isEmpty: " + queue.isEmpty());
        int tempSize2 = queue.size();
        for (int i = 0; i < tempSize2; i++) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}

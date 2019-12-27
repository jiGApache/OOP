package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class UnfairWaitList<E> extends WaitList<E> {
    protected ArrayList<E> notAllowed = new ArrayList<>();

    public UnfairWaitList(){}

    public void add(E element) {
        if(notAllowed.contains(element)) {
            System.out.println("Element was in the queue before!");
        } else {
            queue.offer(element);
        }
    }

    public void remove(E element) {

        boolean wasFound = false;
        if(queue.peek() != element){
            for (int i = 0; i < queue.size(); i++){
                E t = queue.remove();
                if (t == element) {
                    wasFound = true;
                    notAllowed.add(t);
                    for(int k = i; k < queue.size(); k++){
                        E tmp = queue.remove();
                        queue.offer(tmp);
                    }
                    break;
                } else {
                    queue.offer(t);
                }
            }
            if(wasFound) {
                System.out.println("Put the element to the back? (Y/N)");
                Scanner in = new Scanner(System.in);
                String s = in.nextLine();
                if(s.equals("Y")){
                    moveToBack(element);
                }
            } else {
                System.out.println("Element was not found!");
            }
        } else {
            System.out.println("Can't remove first element!");
        }
    }

    private void moveToBack(E element){
        queue.offer(element);
    }
}
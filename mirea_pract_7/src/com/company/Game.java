package com.company;

import java.util.Scanner;

public class Game {
    private final String[] WINNER = new String[]{"First", "Second", "Ботва"};
    private final int TIMER = 106;
    private Player p1, p2;

    public Game(String p_1, String p_2){
        if (p_1.equals("Deque")){
            p1 = new PlayerDeque();
        } else if (p_1.equals("Queue")){
            p1 = new PlayerQueue();
        }
        if (p_2.equals("Deque")){
            p2 = new PlayerDeque();
        } else if (p_2.equals("Queue")){
            p2 = new PlayerQueue();
        }
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            int num = in.nextInt();
            p1.addLast(num);
        }
        for (int i = 0; i < 5; i++){
            int num = in.nextInt();
            p2.addLast(num);
        }
    }

    public void gaming(){
        int i;
        for (i = TIMER; i > 0; i--){
            if (p1.getSize() == 0){
                System.out.println(WINNER[1] + " за " + (TIMER-i) + " ходов");
                break;
            } else if (p2.getSize() == 0) {
                System.out.println(WINNER[0] + " за " + (TIMER - i) + " ходов");
                break;
            } else {
                if (p1.getFirst() == 0 && p2.getFirst() == 9){
                    int temp;
                    p1.addLast(p2.pollFirst());
                    temp = p1.pollFirst();
                    p1.addLast(temp);
                } else if (p2.getFirst() == 0 && p1.getFirst() == 9) {
                    int temp;
                    p2.addLast(p1.pollFirst());
                    temp = p2.pollFirst();
                    p2.addLast(temp);
                } else if (p1.getFirst() > p2.getFirst()){
                    int temp;
                    p1.addLast(p2.pollFirst());
                    temp = p1.pollFirst();
                    p1.addLast(temp);
                } else if (p1.getFirst() < p2.getFirst()){
                    int temp;
                    p2.addLast(p1.pollFirst());
                    temp = p2.pollFirst();
                    p2.addLast(temp);
                }
            }
            p1.show();
            p2.show();
            System.out.print("\n");
        }
        if (i == 0)
            System.out.print(WINNER[2]);
    }
}

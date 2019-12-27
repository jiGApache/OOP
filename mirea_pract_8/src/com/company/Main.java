package com.company;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        BoundedWaitList<String> bbb = new BoundedWaitList<>(5);
        UnfairWaitList<String> aaa = new UnfairWaitList<>();

        bbb.add("1111");
        bbb.add("2222");
        bbb.add("3333");
        bbb.add("4444");
        bbb.add("5555");
        bbb.add("6666");

        System.out.println(bbb);
        System.out.println(bbb.getCapacity());

        System.out.println(bbb.remove());
        System.out.println(bbb.getCapacity());

        aaa.add("qqqq");
        aaa.add("wwww");
        aaa.add("eeee");
        aaa.add("rrrr");
        aaa.add("tttt");

        System.out.println(aaa);
        aaa.remove("eeee");
        System.out.println(aaa);
        aaa.add("eeee");
        System.out.println(aaa);
        aaa.add("qwer");
        System.out.println(aaa);
    }
}
package com.company;

public class Main {

    public static <E> void arrayToList(E[] a, MyArrayList<E> lst) {
        for (E e : a) lst.add(e);
    }

    public static void main(String[] args) {
        MyArrayList<String> lst = new MyArrayList<>();
        String[] str = new String[]{"q", "w", "e", "r", "t", "y"};
        arrayToList(str, lst);

        System.out.println(lst.getSize());
        for(int i = 0; i<lst.getSize(); i++){
            System.out.print(lst.get(i));
        }

        MyArrayList<Integer> lst_1 = new MyArrayList<>();
        Integer[] nt = new Integer[]{1, 2, 3, 4, 5, 6};
        arrayToList(nt, lst_1);

        System.out.println("\n\n" + lst_1.getSize());
        for(int i = 0; i<lst_1.getSize(); i++){
            System.out.print(lst_1.get(i));
        }


        Integer[] k = new Integer[]{1, 1, 2, 3, 5, 8, 13};
        SuperArray<Integer> sa = new SuperArray<>(k);
        System.out.println("\n\n" + sa.get(6));
    }
}

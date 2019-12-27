package com.company;

import java.util.Scanner;

public class Main {
    public static boolean palindrome(String s, int i) {
        if (i == s.length() / 2)
            return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;
        else
            return palindrome(s, i + 1);
    }

    public static int zeroOne(int a, int b, int num) {
        if (a == 0 && b == 0) {
            return num;
        } else if (a == 0 && b != 0) {
            num = num + 1;
            return num;
        } else if (a == 1) {
            num = num + b + 1;
            return num;
        } else if (a > 1 && b == 0) {
            return 0;
        } else {
            num = zeroOne(a - 1, b - 1, num) + zeroOne(a, b - 1, num);
        }
        return num;
    }

    private static int doReverse(int n, int res) {
        if (n == 0) {
            return res;
        } else {
            int rear = n % 10;
            res = res * 10 + rear;
            res = doReverse(n / 10, res);
        }
        return res;
    }

    public static int reverse(int n) {
        return doReverse(n, 0);
    }

    public static int onesCount() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int num_2;

        if (num == 0) {
            num_2 = in.nextInt();
            if (num_2 == 0)
                return 0;
            else if (num_2 == 1)
                return onesCount() + 1;
        } else {
            if (num == 1)
                return onesCount() + 1;
        }
        return onesCount();
    }

    public static void main(String[] args) {
        //#1
        String s = "q1";
        if (palindrome(s, 0)) {
            System.out.println("Является");
        } else {
            System.out.println("Не является");
        }

        //#2
        //a - zero, b - one
        int num = 0;
        System.out.println(zeroOne(3, 2, num));

        //#3
        int res = 0;
        System.out.println(reverse(1));

        //#4
        System.out.print(onesCount());
    }
}

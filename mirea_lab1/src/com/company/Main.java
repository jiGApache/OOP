//Variant #5

package com.company;

import java.util.Scanner;

public class Main {
    public static int fact(int a) {
        int res = 1;
        if (a == 0) {
            return res;
        } else if (a < 0) {
            res = 0;
            return res;
        }

        for (int i = 1; i <= a; i++) {
            res *= i;
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int a = f.nextInt();
        if (fact(a) != 0) {
            System.out.print(a + "! = " + fact(a));
        } else {
            System.out.print("Negative numbers are not allowed!");
        }
    }
}

package com.app;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && a);
        System.out.println(a && b);
        System.out.println(b && a);
        System.out.println(b && b);
        System.out.println();

        System.out.println(a || a);
        System.out.println(a || b);
        System.out.println(b || a);
        System.out.println(b || b);
        System.out.println();

        System.out.println(a ^ a);
        System.out.println(a ^ b);
        System.out.println(b ^ a);
        System.out.println(b ^ b);
        System.out.println();

        System.out.println(!a);
        System.out.println(!b);
        System.out.println();


    }
}

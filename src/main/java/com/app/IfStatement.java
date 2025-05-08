package com.app;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        // If Statement
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Sorry you can't register!");
        }
        else {
            System.out.println("You have registered successfully!");
        }

        System.out.println("Exit!");

    }
}

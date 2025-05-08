package com.app;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your position (T, B, R, L): ");
        String position = scanner.next();

        if (position.equalsIgnoreCase("T")) {
            System.out.println("You are going UP");
        }
        else if (position.equalsIgnoreCase("B")) {
            System.out.println("You are going DOWN");
        }
        else if (position.equalsIgnoreCase("R")) {
            System.out.println("You are going RIGHT");
        }
        else if (position.equalsIgnoreCase("L")) {
            System.out.println("You are going LEFT");
        }
        else {
            System.out.println("Invalid position!");
        }
    }
}

package com.app;
import java.util.Scanner;
public class MultiIfStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        double grade = scanner.nextDouble();

        if (grade >= 70) {
            System.out.println("Your grade is A");
        }
        else if (grade >= 50 && grade <= 59) {
            System.out.println("Your grade C");
        }
        else if (grade >= 60 && grade <= 69){
            System.out.println("Your grade B");
        }
        else if (grade >= 45 && grade <= 49) {
            System.out.println("Your grade D");
        }
        else if (grade >= 40 && grade <= 44) {
            System.out.println("Your grade E");
        }
        else {
            System.out.println("Your grade F");
        }



    }
}

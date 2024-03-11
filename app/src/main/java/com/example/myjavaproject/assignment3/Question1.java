package com.example.myjavaproject.assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        try {
            System.out.println("Enter number 1: ");
            number1 = scanner.nextInt();
            System.out.println("Enter number 2: ");
            number2 = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println(e);
        }

        int divisor, dividend;
        try {
            System.out.println("Enter divisor: ");
            divisor = scanner.nextInt();
            System.out.println("Enter dividend: ");
            dividend = scanner.nextInt();
            double divide = divisor / dividend;
        } catch (Exception e){
            System.out.println(e);
            System.out.println("Divide is not valid!");
        }
    }
}

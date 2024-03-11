package com.example.myjavaproject.assignment1;

import java.util.Scanner;

public class Question9 {
    public static boolean isNumberic(String str){
        if (str == null) {
            return false;
        }
        try {
            int number = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number;
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        input = scanner.nextLine();
        while (!isNumberic(input)){
            System.out.println("Invalid input, please try again");
            input = scanner.nextLine();
        }
        number = Integer.parseInt(input);
        if (isPrimeNumber(number)){
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }
    }
}

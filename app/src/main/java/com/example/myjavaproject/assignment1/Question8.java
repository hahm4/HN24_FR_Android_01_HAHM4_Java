package com.example.myjavaproject.assignment1;

import java.util.Scanner;

public class Question8 {
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

    public static void main(String[] args) {
        String input;
        int number1, number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1: ");
        input = scanner.nextLine();
        while (!isNumberic(input)){
            System.out.println("Invalid input, please try again");
            input = scanner.nextLine();
        }
        number1 = Integer.parseInt(input);

        System.out.println("Enter a number 2: ");
        input = scanner.nextLine();
        while (!isNumberic(input)){
            System.out.println("Invalid input, please try again");
            input = scanner.nextLine();
        }
        number2 = Integer.parseInt(input);

        int gcd = 0;
        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of number 1 and number 2 is " + gcd);
    }
}

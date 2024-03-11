package com.example.myjavaproject.assignment1;

import java.util.Scanner;

public class Question5 {
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
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        input = scanner.nextLine();
        while (!isNumberic(input)){
            System.out.println("Invalid input, please try again");
            input = scanner.nextLine();
        }
        number = Integer.parseInt(input);
        while (number < 0){
            System.out.println("A positive integer number must be > 0");
            input = scanner.nextLine();
            while (!isNumberic(input)){
                System.out.println("Invalid input, please try again");
                input = scanner.nextLine();
            }
            number = Integer.parseInt(input);
        }
        int result = 1;
        for (int i = 1; i <= number; i++){
            result *= i;
        }
        System.out.println("Result: " + number + "! = " + result);
    }
}

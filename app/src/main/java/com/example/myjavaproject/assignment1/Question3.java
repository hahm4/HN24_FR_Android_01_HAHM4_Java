package com.example.myjavaproject.assignment1;

import java.util.Scanner;

public class Question3 {
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

    public static boolean isOperator(String str){
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter number 1: ");
        input = scanner.nextLine();
        while (!isNumberic(input)){
            System.out.println("Invalid input, please try again");
            input = scanner.nextLine();
        }
        int a = Integer.parseInt(input);

        System.out.println("Enter number 2: ");
        input = scanner.nextLine();
        while (!isNumberic(input)){
            System.out.println("Invalid input, please try again");
            input = scanner.nextLine();
        }
        int b = Integer.parseInt(input);

        System.out.println("Enter operator (+,-,*,/): ");
        String operator;
        operator = scanner.nextLine();
        while (!isOperator(operator)){
            System.out.println("Enter operator (+,-,*,/): ");
            operator = scanner.nextLine();
        }

        switch (operator) {
                case "+":
                    System.out.println("Result: " + (a + b));
                    break;

                case "-":
                    System.out.println("Result: " + (a - b));
                    break;

                case "*":
                    System.out.println("Result: " + (a * b));
                    break;

                case "/":
                    System.out.println("Result: " + (a / b));
                    break;

        }

    }

}

package com.example.myjavaproject.assignment1;

import java.util.Scanner;

public class Question10 {
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

    public static boolean isLeapYear(int year){
        if (year % 4 == 0){
            if (year % 100 != 0){
                return true;
            } else if (year % 400 == 0){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number;
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        input = scanner.nextLine();
        while (!isNumberic(input)){
            System.out.println("Invalid input, please try again");
            input = scanner.nextLine();
        }
        number = Integer.parseInt(input);

        if (isLeapYear(number)){
            System.out.println(number + " is a leap year");
        } else {
            System.out.println(number + " is not a leap year");
        }
    }
}

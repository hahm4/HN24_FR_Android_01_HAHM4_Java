package com.example.myjavaproject.assignment1;

import java.util.Scanner;

public class Question2 {

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
        Scanner scanner = new Scanner(System.in);
        String str1, str2;

        System.out.println("Enter number 1: ");
        str1 = scanner.nextLine();
        while (!isNumberic(str1)){
            System.out.println("Invalid input, please try again");
            str1 = scanner.nextLine();
        }
        int a = Integer.parseInt(str1);

        System.out.println("Enter number 2: ");
        str2 = scanner.nextLine();
        while (!isNumberic(str2)){
            System.out.println("Invalid input, please try again");
            str2 = scanner.nextLine();
        }
        int b = Integer.parseInt(str2);

        System.out.println("The largest number is " + Math.max(a, b));
    }
}

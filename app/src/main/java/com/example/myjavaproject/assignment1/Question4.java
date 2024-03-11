package com.example.myjavaproject.assignment1;

import java.util.Scanner;

public class Question4 {
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
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month (1-12): ");
        input = scanner.nextLine();
        while (!isNumberic(input)){
            System.out.println("Invalid input, please try again");
            input = scanner.nextLine();
        }
        number = Integer.parseInt(input);
        while (number < 1 || number > 12){
            System.out.println("A month must be from 1 to 12");
            input = scanner.nextLine();
            while (!isNumberic(input)){
                System.out.println("Invalid input, please try again");
                input = scanner.nextLine();
            }
            number = Integer.parseInt(input);
        }
        switch (number){
            case 1:
            case 2:
            case 3:
                System.out.println("1st Quarter of the year");
                break;

            case 4:
            case 5:
            case 6:
                System.out.println("2nd Quarter of the year");
                break;

            case 7:
            case 8:
            case 9:
                System.out.println("3rd Quarter of the year");
                break;

            case 10:
            case 11:
            case 12:
                System.out.println("4nd Quarter of the year");
                break;
        }
    }
}

package com.example.myjavaproject.assignment1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        int number = -1;
        Scanner scanner = new Scanner(System.in);
        while (number < 0 || number > 10){
            try{
                System.out.println("Enter an average score (0-10): ");
                number = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
            }
        }
        if (number >= 5){
            System.out.println("Passed");
        } else {
            System.out.println("Not Passed");
        }
    }
}
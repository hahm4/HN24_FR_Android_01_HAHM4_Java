package com.example.myjavaproject.assignment3;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        try{
            for (int i = 0; i < n; i++){
                System.out.printf("array[%d] = ", i);
                array[i] = scanner.nextInt();
                if (array[i] == 100){
                    n = i;
                    throw new ArithmeticException("Cannot enter 100!");
                }
            }
        } catch (ArithmeticException e){
            System.out.println(e);
        } finally {
            System.out.println("Result:");
            for (int i = 0; i < n; i++){
                System.out.printf("array[%d] = %d\n", i, array[i]);
            }
        }

    }
}

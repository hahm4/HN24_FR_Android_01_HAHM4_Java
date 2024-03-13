package com.example.hahm8_finaltest_hoangmanhha.question1;

import java.util.Scanner;

public class Main {
    public static int isPositiveInteger() {
        boolean isValid = false;
        int number = 0;
        while (!isValid) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a positive integer number have 5-7 digits: ");
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
                isValid = true;
            } catch (Exception e) {
                System.out.println("Invalid input, try again");
            }
            if (number <= 0) {
                isValid = false;
            }

        }
        return number;
    }

    public static void calculatedNumber(int number) {
        int sum = 0;
        while (true) {
            sum += number % 10;
            number /= 10;
            if (number == 0) {
                break;
            }
        }
        System.out.println("Sum of all digits of " + number + " is: " + sum);
    }

    public static void displayPrimeDivisors(int number) {
        System.out.print("Prime divisors of " + number + " is: ");
        int temp[] = new int[number];
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                boolean isPrime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    number /= i;
                    temp[i] = i;
                }
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) {
                System.out.print(temp[i] + " ");
            }
        }
        System.out.println();
    }

    public static void displayDivisors(int number) {
        System.out.print("Divisors of " + number + " is: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void displayProductOfPrimeDivisors(int number) {
        System.out.print(number + " = ");
        int temp[] = new int[number];
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                number /= i;
                temp[i] = i;
                i = 2;
            }
        }
        for (int i = 0; i < temp.length; i++){
            System.out.print(temp[i] + " ");

        }
    }



    public static void main(String[] args) {
        int number = isPositiveInteger();
        calculatedNumber(number);
        displayProductOfPrimeDivisors(number);
        displayDivisors(number);
        displayPrimeDivisors(number);
    }
}

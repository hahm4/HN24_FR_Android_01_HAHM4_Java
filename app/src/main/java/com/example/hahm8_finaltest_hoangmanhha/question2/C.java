package com.example.hahm8_finaltest_hoangmanhha.question2;

public class C {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean allDigitsPrime(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (!isPrime(digit)) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("All numbers have all digits prime:");
        for (int i = 10000; i < 10000000; i++) {
            if (allDigitsPrime(i)) {
                System.out.println(i);
            }
        }
    }
}

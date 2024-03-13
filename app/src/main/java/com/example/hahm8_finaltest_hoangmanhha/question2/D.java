package com.example.hahm8_finaltest_hoangmanhha.question2;

public class D {
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

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("All numbers have sum of digits prime:");
        for (int i = 10000; i < 1000000; i++) {
            int sum = sumOfDigits(i);
            if (isPrime(sum)) {
                System.out.println(i);
            }
        }
    }
}

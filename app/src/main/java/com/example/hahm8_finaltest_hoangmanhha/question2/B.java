package com.example.hahm8_finaltest_hoangmanhha.question2;

public class B {

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
            temp /= 10;
        }
        return number == reversedNumber;
    }

    public static void displayPalindromeNumbers() {
        System.out.println("All palindrome numbers:");
        for (int i = 10000; i < 1000000; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        displayPalindromeNumbers();
    }
}

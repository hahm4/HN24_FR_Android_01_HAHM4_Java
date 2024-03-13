package com.example.hahm8_finaltest_hoangmanhha.question2;

public class A {
    public static void isPrimeNumber() {
        System.out.println("Prime numbers: ");
        for (int i = 10000; i < 10000000; i++){
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if ((i % j == 0)){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        isPrimeNumber();
    }
}

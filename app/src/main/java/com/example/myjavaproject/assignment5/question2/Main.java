package com.example.myjavaproject.assignment5.question2;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Thread1 thread1 = new Thread1(data);
        Thread2 thread2 = new Thread2(data);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

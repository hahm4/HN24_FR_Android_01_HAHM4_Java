package com.example.myjavaproject.assignment5.question3;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Thread1 thread1 = new Thread1(data, -100, 0);
        Thread1 thread2 = new Thread1(data, 0, 100);

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();
    }
}

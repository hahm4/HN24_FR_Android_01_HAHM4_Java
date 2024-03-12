package com.example.myjavaproject.assignment5.question1;

public class SquareDisplayThread extends Thread{
    public static final Object lock = new Object();
    public static int number;

    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: "+ (number * number));
                lock.notify();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

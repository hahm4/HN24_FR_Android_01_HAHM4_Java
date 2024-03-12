package com.example.myjavaproject.assignment5.question1;

import java.util.Random;
public class NumberGeneratorThread extends Thread{
    private final Random random = new Random();

    public void run() {
        while (true) {
            int number = random.nextInt(20) + 1;
            System.out.println("Thread 1: " + number);
            synchronized (SquareDisplayThread.lock) {
                SquareDisplayThread.number = number;
                SquareDisplayThread.lock.notify();
                try {
                    SquareDisplayThread.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.example.myjavaproject.assignment5.question3;

import java.util.Random;

public class Thread1 extends Thread{
    private final Data data;
    private final int minValue;
    private final int maxValue;
    private final Random random = new Random();

    public Thread1(Data data, int minValue, int maxValue) {
        this.data = data;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    @Override
    public void run() {
        while (true) {
            int randomNumber = random.nextInt(maxValue - minValue + 1) + minValue;
            data.addToTotal(randomNumber);
            System.out.println(Thread.currentThread().getName() + " generated: " + randomNumber + ", Total: " + data.getTotal());
            if (data.getTotal() <= -100 || data.getTotal() >= 100) {
                System.out.println("Total out of range. Stopping " + Thread.currentThread().getName());
                break;
            }
        }
    }
}

package com.example.myjavaproject.assignment5.question2;

import java.util.Random;

public class Thread1 extends Thread{
    private Data character;
    private Random random;

    public Thread1(Data character) {
        this.character = character;
        this.random = new Random();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            char randomChar = (char) ('a' + random.nextInt(26));
            character.setCharacter(randomChar);
            System.out.println("Thread 1: " + randomChar);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

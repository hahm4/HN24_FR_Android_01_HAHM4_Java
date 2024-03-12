package com.example.myjavaproject.assignment5.question2;

public class Thread2 extends Thread{
    private Data character;

    public Thread2(Data character) {
        this.character = character;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            char lowercaseChar = character.getCharacter();
            char uppercaseChar = Character.toUpperCase(lowercaseChar);
            System.out.println("Thread 2: " + uppercaseChar);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.example.myjavaproject.assignment5.question2;

public class Data {
    private char character;
    private boolean isGenerated = false;

    public synchronized void setCharacter(char character) {
        while (isGenerated) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.character = character;
        isGenerated = true;
        notify();
    }

    public synchronized char getCharacter() {
        while (!isGenerated) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isGenerated = false;
        notify();
        return character;
    }
}

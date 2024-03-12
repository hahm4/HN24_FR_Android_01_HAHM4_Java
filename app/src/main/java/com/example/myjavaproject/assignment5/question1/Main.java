package com.example.myjavaproject.assignment5.question1;

public class Main {
    public static void main(String[] args) {
        NumberGeneratorThread numberGeneratorThread = new NumberGeneratorThread();
        SquareDisplayThread squareDisplayThread = new SquareDisplayThread();

        numberGeneratorThread.start();
        squareDisplayThread.start();
    }
}

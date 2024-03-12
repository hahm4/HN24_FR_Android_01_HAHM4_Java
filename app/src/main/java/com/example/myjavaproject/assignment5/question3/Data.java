package com.example.myjavaproject.assignment5.question3;

public class Data {
    private int total = 0;

    public synchronized void addToTotal(int value) {
        total += value;
    }

    public synchronized int getTotal() {
        return total;
    }
}

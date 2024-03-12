package com.example.myjavaproject.assignment5.question4;

import java.util.ArrayList;
import java.util.Random;

public class Thread1 extends Thread{
    private ArrayList<Integer> list1;

    public Thread1() {
        this.list1 = new ArrayList<>();
    }

    public void run() {
        Random rand = new Random();
        int count = 0;
        while (count < 10) {
            try {
                Thread.sleep(1000);
                int randomNumber = rand.nextInt(101); // Random number from 0 to 100
                list1.add(randomNumber);
                System.out.println("Thread 1: " + randomNumber);
                count++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Integer> getList1() {
        return list1;
    }
}

package com.example.myjavaproject.assignment5.question4;

import java.util.ArrayList;
import java.util.Random;
public class Thread2 extends Thread{
    private ArrayList<Character> list2;

    public Thread2() {
        this.list2 = new ArrayList<>();
    }

    public void run() {
        Random rand = new Random();
        int count = 0;
        while (count < 10) {
            try {
                Thread.sleep(2000);
                char randomChar = (char) (rand.nextInt(26) + 'a'); // Random character from 'a' to 'z'
                list2.add(randomChar);
                System.out.println("Thread 2: " + randomChar);
                count++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Character> getList2() {
        return list2;
    }
}

package com.example.myjavaproject.assignment5.question4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ArrayList<Integer> list1 = t1.getList1();
        ArrayList<Character> list2 = t2.getList2();

        System.out.println("Final results:");
        System.out.println("Thread 1: " + list1);
        System.out.println("Thread 2: " + list2);
    }
}

package com.example.myjavaproject.assignment3;

public class Question3 {
    public static void main(String[] args) {
        int[] array = new int[5];
        try{
            System.out.println(array[7]);
        } catch (Exception e){
            System.out.println("Error: ");
            System.out.println(e);
        }
    }
}

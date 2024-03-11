package com.example.myjavaproject.assignment3;

public class Question4 {
    public static void main(String[] args) {
        String string = "This is a string";
        try{
            int a = Integer.parseInt(string);
        } catch (Exception e){
            System.out.println("Error:");
            System.out.println(e);
        }
    }
}

package com.example.myjavaproject.assignment3;

public class Question5 {
    public static Integer getNumber(){
        return null;
    }
    public static void main(String[] args) {
        try{
            int i = getNumber();
        }catch (Exception e){
            System.out.println("Error: ");
            System.out.println(e);
        }
    }
}

package com.example.myjavaproject.assignment4.question2;

import java.util.Scanner;

public class Main {

    public static int menu(){
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------Menu---------------");
        System.out.println("1. Add student");
        System.out.println("2. Display student list");
        System.out.println("3. Search student by RollNo");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        //Enter choice
        String input = scanner.nextLine();
        while (!student.isNumeric(input)) {
            System.out.println("Invalid input, please try again");
            input = scanner.nextLine();
        }
        int choice = Integer.parseInt(input);
        while (choice < 1 || choice > 4){
            System.out.println("Enter from 1 to 4: ");
            input = scanner.nextLine();
            while (!student.isNumeric(input)) {
                System.out.println("Invalid input, you must enter from 1 to 4: ");
                input = scanner.nextLine();
            }
            choice = Integer.parseInt(input);
        }
        return choice;
    }

    public static void main(String[] args) {
        Student student = new Student();
        int choice = 0;
        while (choice != 4){
            choice = menu();
            switch (choice){
                case 1: student.addStudent();
                    break;

                case 2: student.displayStudent();
                    break;

                case 3: student.searchStudent();
                    break;

            }
        }


    }
}

package com.example.hahm8_finaltest_hoangmanhha.question4;

import java.util.Scanner;

public class Main {
    public static void menu(){
        Management management = new Management();
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------Menu---------------");
        System.out.println("1. Add");
        System.out.println("2. Update");
        System.out.println("3. Search");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");

    }
    public static void main(String[] args) {
        Management management = new Management();
        menu();
        management.addContact();
        management.updateContact();
    }
}

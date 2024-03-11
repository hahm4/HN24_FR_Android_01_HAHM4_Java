package com.example.myjavaproject.assignment4.question3;

import java.util.Scanner;

public class Main {
    public static void enterChoice(){
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        boolean isValidChoice = true;
        while (isValidChoice){
            System.out.println("Enter choice (add/display/update/find/exit):");
            String choice = scanner.nextLine();
            if (choice.equals("add")){
                employee.addEmployee();
            } else if (choice.equals("display")){
                employee.displayEmployee();
            } else if (choice.equals("update")){
                employee.updateEmployee();
            } else if (choice.equals("find")) {
                employee.findEmployee();
            } else if (choice.equals("exit")){
                isValidChoice = false;
            }
        }

    }

    public static void main(String[] args) {
        enterChoice();
    }
}

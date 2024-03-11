package com.example.myjavaproject.assignment2.question1;

import java.util.Scanner;

public class MainClass {
    public static float DEFAULT_SALARY_OF_PRODUCTION_STAFF = 3000000;
    public static void main(String[] args) {
        ProductionStaff pStaff = new ProductionStaff();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Production Staff Information:");
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter date of birth: ");
        String dob = scanner.nextLine();
        System.out.println("Enter the number of products: ");
        int product = Integer.parseInt(scanner.nextLine());
        float salary = DEFAULT_SALARY_OF_PRODUCTION_STAFF + product * 5000;
        pStaff.setName(name);
        pStaff.setDateOfBirth(dob);
        pStaff.setSalary(salary);

        OfficeStaff oStaff = new OfficeStaff();
        System.out.println("Office Staff Information:");
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter date of birth: ");
        dob = scanner.nextLine();
        System.out.println("Enter the number of working days: ");
        int day = Integer.parseInt(scanner.nextLine());
        salary = day * 100000;
        oStaff.setName(name);
        oStaff.setDateOfBirth(dob);
        oStaff.setSalary(salary);

        System.out.println("------------");
        System.out.println("Name\tDate of birth\tSalary\tType");
        System.out.println(pStaff.getName() + " \t" + pStaff.getDateOfBirth() + " \t" + pStaff.getSalary() + "\tProduction Staff");
        System.out.println(oStaff.getName() + " \t" + oStaff.getDateOfBirth() + " \t" + oStaff.getSalary() + "\tOffice Staff");
    }
}

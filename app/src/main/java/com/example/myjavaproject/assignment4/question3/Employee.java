package com.example.myjavaproject.assignment4.question3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private String gender;
    private String dateOfBirth;
    private int phoneNumber;
    private String qualification;
    private HashMap<Integer, Employee> employeeHashMap = new HashMap<Integer, Employee>();

    public Employee() {
    }

    public Employee(int id, String name, String gender, String dateOfBirth, int phoneNumber, String qualification) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.qualification = qualification;
    }


    public HashMap<Integer, Employee> getEmployeeHashMap() {
        return employeeHashMap;
    }

    public void setEmployeeHashMap(HashMap<Integer, Employee> employeeHashMap) {
        this.employeeHashMap = employeeHashMap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", qualification='" + qualification + '\'' +
                '}';
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public boolean isDuplicated(int id) {
        for (int key : getEmployeeHashMap().keySet()) {
            if (id == key) {
                return true;
            }
        }
        return false;
    }

    public boolean isValidGender(String gender) {
        if (gender.equals("Male")) {
            return true;
        } else return gender.equals("Female");
    }

    public boolean isValidDate(String date) {
        if (date.isEmpty()) {
            return true;
        } else {
            SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/mm/yyyy");
            sdfrmt.setLenient(false);
            try {
                Date javaDate = sdfrmt.parse(date);
            }
            /* Date format is invalid */ catch (Exception e) {
                System.out.println(date + " is Invalid Date format");
                return false;
            }
            /* Return true if date format is valid */
            return true;
        }
    }

    public boolean isValidQualification(String input) {
        if (input.equals("high school")) {
            return true;
        } else if (input.equals("college")) {
            return true;
        } else return input.equals("university");
    }

    public void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        //ID
        int id = getEmployeeHashMap().size() + 1;
        System.out.println("ID=" + id);

        //Name
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        //Gender
        System.out.println("Enter gender (Male/Female): ");
        String gender = scanner.nextLine();
        while (!isValidGender(gender)) {
            System.out.println("You must enter 'Male' or 'Female'");
            gender = scanner.nextLine();
        }

        //Date of birth
        System.out.println("Enter date of birth (dd/mm/yyyy)");
        String dateOfBirth = scanner.nextLine();
        while (!isValidDate(dateOfBirth)) {
            System.out.println("You must enter in dd/mm/yyyy format!");
            dateOfBirth = scanner.nextLine();
        }

        //Phone number
        System.out.println("Enter phone number:");
        String input = scanner.nextLine();
        while (!isNumeric(input)) {
            System.out.println("Invalid input, please try again");
            input = scanner.nextLine();
        }
        int phoneNumber = Integer.parseInt(input);

        //Qualification
        System.out.println("Enter qualification (high school/college/university):");
        String qualification = scanner.nextLine();
        while (!isValidQualification(qualification)) {
            System.out.println("You must enter 'high school/college/university'!");
            qualification = scanner.nextLine();
        }
        employeeHashMap.put(id, new Employee(id, name, gender, dateOfBirth, phoneNumber, qualification));
        System.out.println(employeeHashMap);
    }

    public void displayEmployee() {
        if (getEmployeeHashMap().isEmpty()) {
            System.out.println("Not found information");
        } else {
            System.out.println("Employee list:");
            for (int key : getEmployeeHashMap().keySet()) {
                System.out.println("ID." + key + ":\t" + getEmployeeHashMap().get(key).toString());
            }
        }
    }

    public void updateEmployee() {
        Scanner scanner = new Scanner(System.in);
        if (employeeHashMap.isEmpty()) {
            System.out.println("Employee list is empty");
        } else {
            int temp = employeeHashMap.size();
            for (int i = 1; i <= temp; i++) {
                employeeHashMap.remove(i);
                //ID
                System.out.println("Employee ID." + i);
                int id = i;

                //Name
                System.out.println("Update name:");
                String name = scanner.nextLine();

                //Gender
                System.out.println("Update gender (Male/Female): ");
                String gender = scanner.nextLine();
                while (!isValidGender(gender)) {
                    System.out.println("You must enter 'Male' or 'Female'");
                    gender = scanner.nextLine();
                }

                //Date of birth
                System.out.println("Update date of birth (dd/mm/yyyy)");
                String dateOfBirth = scanner.nextLine();
                while (!isValidDate(dateOfBirth)) {
                    System.out.println("You must enter in dd/mm/yyyy format!");
                    dateOfBirth = scanner.nextLine();
                }

                //Phone number
                System.out.println("Update phone number:");
                String input = scanner.nextLine();
                while (!isNumeric(input)) {
                    System.out.println("Invalid input, please try again");
                    input = scanner.nextLine();
                }
                int phoneNumber = Integer.parseInt(input);

                //Qualification
                System.out.println("Update qualification (high school/college/university):");
                String qualification = scanner.nextLine();
                while (!isValidQualification(qualification)) {
                    System.out.println("You must enter 'high school/college/university'!");
                    qualification = scanner.nextLine();
                }
                employeeHashMap.put(id, new Employee(id, name, gender, dateOfBirth, phoneNumber, qualification));
            }
        }
    }

    public void findEmployee() {
        Scanner scanner = new Scanner(System.in);
        boolean isFound = false;
        System.out.println("Find employee by id or name:");
        String input = scanner.nextLine();
        for (int i = 1; i <= getEmployeeHashMap().size(); i++) {
            //find by ID
            if (isNumeric(input)) {
                if (getEmployeeHashMap().containsKey(Integer.parseInt(input))) {
                    System.out.println("ID: " + input + " " + getEmployeeHashMap().get(Integer.parseInt(input)).toString());
                    isFound = true;
                    break;
                }
            }
            //find by name
            else if (input.equals(getEmployeeHashMap().get(i).getName())) {
                System.out.println("ID: " + getEmployeeHashMap().get(i).getId() + " " + getEmployeeHashMap().get(i).toString());
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Not found information");
        }
    }
}

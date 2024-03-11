package com.example.myjavaproject.assignment4.question2;

import java.util.HashMap;
import java.util.Scanner;

public class Student {
    private int rollNo;
    private String name;
    private String sex;
    private int age;
    private String email;
    private String address;

    private HashMap<Integer, Object> studentMap = new HashMap<>();

    public HashMap<Integer, Object> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(HashMap<Integer, Object> studentMap) {
        this.studentMap = studentMap;
    }

    public Student() {
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String name, String sex, int age, String email, String address) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
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

    public boolean isDuplicated(int rollNo){
        for (int key: getStudentMap().keySet()){
            if (rollNo == key){
                return true;
            }
        }
        return false;
    }

    public boolean isValidSex(String sex){
        if (sex.equals("Male")){
            return true;
        } else if (sex.equals("Female")){
            return true;
        } else {
            return false;
        }
    }
    public void addStudent(){
        Scanner scanner = new Scanner(System.in);

        //Number of students
        System.out.println("Enter number of students you want to add: ");
        String input = scanner.nextLine();
        while (!isNumeric(input)){
            System.out.println("Invalid input, please try again");
            input = scanner.nextLine();
        }
        int numberOfStudents = Integer.parseInt(input);

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            //RollNo
            System.out.println("Enter RollNo:");
            input = scanner.nextLine();
            while (!isNumeric(input)) {
                System.out.println("Invalid input, please try again");
                input = scanner.nextLine();
            }
            int rollNo = Integer.parseInt(input);
            //Check duplicate RollNo
            while (isDuplicated(rollNo)){
                System.out.println("RollNo." + rollNo + " is existed. Please enter different RollNo");
                input = scanner.nextLine();
                while (!isNumeric(input)) {
                    System.out.println("Invalid input, please try again");
                    input = scanner.nextLine();
                }
                rollNo = Integer.parseInt(input);
            }

            //Name
            System.out.println("Enter name:");
            String name = scanner.nextLine();

            //Sex
            System.out.println("Enter sex (Male/Female): ");
            String sex = scanner.nextLine();
            while (!isValidSex(sex)){
                System.out.println("You must enter 'Male' or 'Female'");
                sex = scanner.nextLine();
            }


            //Age
            System.out.println("Enter age:");
            input = scanner.nextLine();
            while (!isNumeric(input)) {
                System.out.println("Invalid input, please try again");
                input = scanner.nextLine();
            }
            int age = Integer.parseInt(input);

            //Email
            System.out.println("Enter email:");
            String email = scanner.nextLine();

            //Address
            System.out.println("Enter address: ");
            String address = scanner.nextLine();

            studentMap.put(rollNo, new Student(name, sex, age, email, address));
        }

    }

    public void displayStudent(){
        if (getStudentMap().isEmpty()){
            System.out.println("Student list is empty");
        } else {
            System.out.println("Student list:");
            for (int key: getStudentMap().keySet()){
                System.out.println("RollNo." + key + ":\t" + getStudentMap().get(key).toString());
            }
        }
    }

    public void searchStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter RollNo of Student: ");
        String input = scanner.nextLine();
        if (!isNumeric(input)){
            System.out.println("Invalid input, please try again");
            input = scanner.nextLine();
        }
        int rollNo = Integer.parseInt(input);
        boolean isFound = false;
        for (int key: getStudentMap().keySet()){
            if (rollNo == key){
                System.out.println("Student RollNo." + rollNo + " is " + getStudentMap().get(key).toString());
                isFound = true;
            }
        }
        if (!isFound){
            System.out.println("Student is not found.");
        }

    }
}

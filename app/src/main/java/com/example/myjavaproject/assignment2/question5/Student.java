package com.example.myjavaproject.assignment2.question5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Student {
    private String name;
    private int age;
    private String hometown;

    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Student() {
    }

    public Student(String name, int age, String hometown) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public void addStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students you want to add: ");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++){
            System.out.println("Enter name: ");
            setName(scanner.nextLine());
            System.out.println("Enter age: ");
            setAge(Integer.parseInt(scanner.nextLine()));
            System.out.println("Enter hometown: ");
            setHometown(scanner.nextLine());
            studentList.add(new Student(name, age, hometown));
        }
    }

    public void displayStudentOver20(){
        System.out.println("All students are 20 years old: ");
        for (int i = 0; i < studentList.size(); i++){
            if (studentList.get(i).getAge() == 20){
                System.out.println(studentList.get(i).toString());
            }
        }
    }

    public void displayStudentSpecial(){
        int count = 0;
        for (int i = 0; i < studentList.size(); i++){
            if (studentList.get(i).getAge() == 23 && studentList.get(i).getHometown().equals("Hanoi")){
                count++;
            }
        }
        System.out.println("Number of students are 23 years old and hometown is Hanoi: " + count);
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hometown='" + hometown + '\'' +
                '}';
    }
}

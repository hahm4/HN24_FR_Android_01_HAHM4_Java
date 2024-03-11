package com.example.myjavaproject.assignment2.question1;

public class OfficeStaff {
    private String name;
    private String dateOfBirth;
    private float salary;

    public OfficeStaff(String name, String dateOfBirth, float salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    public OfficeStaff() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

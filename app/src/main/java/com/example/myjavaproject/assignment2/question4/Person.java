package com.example.myjavaproject.assignment2.question4;

public class Person {
    private String name;
    private int age;
    private String job;
    private String personalID;




    public Person(String name, int age, String job, String personalID) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.personalID = personalID;
    }



    public Person() {
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPersonalID() {
        return personalID;
    }

    public void setPersonalID(String personalID) {
        this.personalID = personalID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", personalID='" + personalID + '\'' +
                '}';
    }
}

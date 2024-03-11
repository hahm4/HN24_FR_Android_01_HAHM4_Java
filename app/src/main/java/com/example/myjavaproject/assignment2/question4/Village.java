package com.example.myjavaproject.assignment2.question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Village extends Person{
    private int member;
    private String address;
    private List<Person> personList = new ArrayList<>();
    private List<Village> villageList = new ArrayList<>();


    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public List<Village> getVillageList() {
        return villageList;
    }

    public void setVillageList(List<Village> villageList) {
        this.villageList = villageList;
    }

    public Village(int member, String address, List<Person> personList) {
        this.member = member;
        this.address = address;
        this.personList = personList;
    }

    public Village() {
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Village{" +
                "member=" + member +
                ", address='" + address + '\'' +
                ", villageList=" + villageList +
                '}';
    }

    public void addHousehold(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of households: ");
        int household = Integer.parseInt(scanner.nextLine());
        Village village = new Village();
        List<Village> list = new ArrayList<>();
        for (int i = 1; i <= household; i++){
            System.out.println("Household " + i);
            System.out.println("Enter number of people: ");
            int numberOfPerson = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter address: ");
            village.setAddress(scanner.nextLine());
            for (int k = 1; k <= numberOfPerson; k ++){
                System.out.println("Person " + k);
                System.out.println("Enter name: ");
                village.setName(scanner.nextLine());
                System.out.println("Enter age: ");
                village.setAge(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter job: ");
                village.setJob(scanner.nextLine());
                System.out.println("Enter personal ID: ");
                village.setPersonalID(scanner.nextLine());
                personList.add(new Person(village.getName(), village.getAge(), village.getJob(), village.getPersonalID()));
                village.setPersonList(personList);
            }
            list.add(new Village(numberOfPerson, village.getAddress(), village.getPersonList()));
            village.setVillageList(list);
        }
        System.out.println("All villages: " + village.getVillageList());
        System.out.println(village.getPersonList());
    }
}

package com.example.hahm8_finaltest_hoangmanhha.question4;

import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    ArrayList<Contact> contactList = new ArrayList<>();

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }

    public boolean validatePhoneNumber(String number){
        int temp;
        try{
            temp = Integer.parseInt(number);
        }catch (Exception e){
            return false;
        }
        for (int i = 0; i < contactList.size(); i++){
            if (number == contactList.get(i).getPhoneNumber()){
                System.out.println("Contact already exists");
                return false;
            }
        }
        return true;
    }

    public boolean updatePhoneNumber(String number){
        Scanner scanner = new Scanner(System.in);
        int temp;
        try{
            temp = Integer.parseInt(number);
        }catch (Exception e){
            return false;
        }
        for (int i = 0; i < contactList.size(); i++){
            if (number == contactList.get(i).getPhoneNumber()){
                System.out.println("Found contact");
                System.out.println("Enter new phone number to update: ");
                String newPhoneNumber = scanner.nextLine();
                while (!validatePhoneNumber(newPhoneNumber)){
                    System.out.println("Enter phone number: ");
                    newPhoneNumber = scanner.nextLine();
                }
                contactList.get(i).setPhoneNumber(newPhoneNumber);
                return true;
            }
        }
        return true;

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
    public void addContact(){
        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();
        System.out.println("Add new contact: ");
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        while (!validatePhoneNumber(phoneNumber)){
            System.out.println("Enter phone number: ");
            phoneNumber = scanner.nextLine();
        }
        contact.setPhoneNumber(phoneNumber);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        contact.setName(name);
        contactList.add(contact);
        System.out.println("Contact add successfully");
    }

    public void updateContact(){
        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();
        System.out.println("Enter old phone number to update: ");
        String oldPhoneNumber = scanner.nextLine();
        while (!updatePhoneNumber(oldPhoneNumber)){
            System.out.println("Enter old phone number: ");
            oldPhoneNumber = scanner.nextLine();
        }
    }
}

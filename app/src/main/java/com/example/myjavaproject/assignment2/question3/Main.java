package com.example.myjavaproject.assignment2.question3;

public class Main {

    public static void main(String[] args) {
        Room room = new Room();
        room.addStats("Deluxe");
        room.addStats("Premium");
        room.addStats("Business");

        System.out.println("Outstanding revenue's room: " + room.getOutstandingRoom());





    }
}

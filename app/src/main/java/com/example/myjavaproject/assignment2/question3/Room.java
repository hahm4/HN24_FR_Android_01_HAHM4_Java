package com.example.myjavaproject.assignment2.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Room {
    private int numberOfNight;
    private int serviceCharge;

    private List<String> outstandingRoom = new ArrayList<>();

    public List<String> getOutstandingRoom() {
        return outstandingRoom;
    }

    public void setOutstandingRoom(List<String> outstandingRoom) {
        this.outstandingRoom = outstandingRoom;
    }

    public Room() {
    }

    public int getNumberOfNight() {
        return numberOfNight;
    }

    public void setNumberOfNight(int numberOfNight) {
        this.numberOfNight = numberOfNight;
    }

    public int getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public double calculateRevenue(String type){
        double revenue = 0;
        if (type.equals("Deluxe")){
            revenue = (numberOfNight * 750000 + serviceCharge) * 1.05;
        } else if (type.equals("Premium")) {
            revenue = (numberOfNight * 500000 + serviceCharge) * 1.05;
        } else if (type.equals("Business")) {
            revenue = numberOfNight * 300000;
        }
        return revenue;
    }

    public void addStats(String roomType){
        Scanner scanner = new Scanner(System.in);
        if (!roomType.equals("Business")){
            System.out.println("Enter service charge for " + roomType + " room: ");
            int serviceCharge = scanner.nextInt();
            setServiceCharge(serviceCharge);
        }
        System.out.println("Enter number of nights last month of " + roomType + " room: ");
        int numberOfNight = scanner.nextInt();
        setNumberOfNight(numberOfNight);
        double revenueLastMonth = calculateRevenue(roomType);
        System.out.printf("Revenue of " + roomType + " room last month: %.0f\n", revenueLastMonth);
        System.out.println("Enter number of nights this month of " + roomType + " room: ");
        numberOfNight = scanner.nextInt();
        setNumberOfNight(numberOfNight);
        double revenueThisMonth = calculateRevenue(roomType);
        System.out.printf("Revenue of " + roomType + "room this month: %.0f\n" , revenueThisMonth);
        if (compareRevenue(revenueLastMonth, revenueThisMonth)){
            outstandingRoom.add(roomType);
        }
    }

    public boolean compareRevenue(double lastMonth, double thisMonth){
        if (thisMonth >= (lastMonth * 1.25)){
            return true;
        }
        return false;
    }
}

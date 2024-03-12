package com.example.myjavaproject.assignment6.question2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\canhc\\OneDrive\\Desktop\\khachhang.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            StringBuilder content = new StringBuilder();

            // Đọc dữ liệu từ file và lưu vào StringBuilder
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();


            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter new customer information:");
            System.out.print("Customer ID: ");
            String customerID = inputReader.readLine();
            System.out.print("Name: ");
            String name = inputReader.readLine();
            System.out.print("Phone number: ");
            String phoneNumber = inputReader.readLine();

            content.append(customerID).append(" ").append(name).append(" ").append(phoneNumber).append("\n");

            //Override file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(content.toString());
            writer.close();

            System.out.println("Update successfully!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

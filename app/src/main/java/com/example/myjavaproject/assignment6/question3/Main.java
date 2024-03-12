package com.example.myjavaproject.assignment6.question3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\canhc\\OneDrive\\Desktop\\sinhvien.txt";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFound = false;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                if (data.length >= 3) {
                    String id = data[0];
                    if (id.equals(studentID)) {
                        double averageScore = Double.parseDouble(data[2]);
                        System.out.println("Average score of " + data[1] + " is: " + averageScore);
                        isFound = true;
                        break;
                    }
                }
            }
            if (!isFound) {
                System.out.println("Not found information");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

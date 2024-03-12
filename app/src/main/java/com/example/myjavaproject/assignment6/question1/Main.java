package com.example.myjavaproject.assignment6.question1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\canhc\\OneDrive\\Desktop\\sample.txt";

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            Map<String, Integer> wordCountMap = new HashMap<>();

            while ((line = bufferedReader.readLine()) != null) {
                //Remove extra spaces and divide lines into words
                String[] words = line.trim().toLowerCase().split("\\s+");

                for (String word : words) {
                    //Delete punctuation
                    word = word.replaceAll("[^a-zA-Z]", "");
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
            System.out.println("Total word in file is: " + wordCountMap.size());

            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

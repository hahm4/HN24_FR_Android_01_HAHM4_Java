package com.example.myjavaproject.assignment4.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String[] colors = { "Red", "Blue", "Yellow" };
        String[] colors2 = { "White", "Black", "Purple", "Green", "Grey", "Orange"};

        //Create list from array
        List<String> l1 = Arrays.asList(colors);
        List<String> list = new LinkedList<>(l1);
        List<String> l2 = Arrays.asList(colors2);
        List<String> list2 = new LinkedList<>(l2);

        //Add and clear element from list
        for (String element: list2){
            list.add(element);
        }
        list2.clear();
        System.out.println(list);

        //Display list uppercase
        List<String> tempList = new LinkedList<>();
        for (String element: list){
            tempList.add(element.toUpperCase());
        }
        list = tempList;
        System.out.println(list);

        //Remove element from list
        list.remove(3);
        list.remove(4);
        list.remove(5);
        System.out.println(list);

        //Reverse list
        List<String> copyList = list.subList(0, list.size());
        Collections.reverse(copyList);
        System.out.println(copyList);
    }
}

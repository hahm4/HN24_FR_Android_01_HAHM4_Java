package com.example.hahm8_finaltest_hoangmanhha.question3;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n element of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i+1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("Old array: " + Arrays.toString(arr));

        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.print("Enter number to insert: ");
        int x = scanner.nextInt();

        int insertIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                insertIndex = i + 1;
            } else {
                break;
            }
        }

        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, insertIndex);
        newArr[insertIndex] = x;
        System.arraycopy(arr, insertIndex, newArr, insertIndex + 1, arr.length - insertIndex);

        System.out.println("New array:");
        System.out.println(Arrays.toString(newArr));

    }
}


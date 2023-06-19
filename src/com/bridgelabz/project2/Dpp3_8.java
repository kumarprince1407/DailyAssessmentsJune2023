package com.bridgelabz.project2;

import java.util.Scanner;

//Java Program to print the duplicate elements of an array
public class Dpp3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n =sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Duplicate elements in the array are: ");
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != -1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[i]);
                        arr[j] = -1;  // Mark the element as visited
                    }
                }
            }
        }
    }
}

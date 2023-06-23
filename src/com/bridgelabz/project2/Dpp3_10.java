package com.bridgelabz.project2;

import java.util.Scanner;

//Find 2nd Largest Number in an Array
public class Dpp3_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //Sorting
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        System.out.println("Second largest element of the array is:");

            System.out.print(arr[n-2]+" ");

    }
}


package com.bridgelabz.project2;

import java.util.Scanner;

public class Dpp3_6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements present at odd position in the array are: ");
        for(int i=0; i<n;i=i+2){
            System.out.print(arr[i]+" ");
        }
    }
}

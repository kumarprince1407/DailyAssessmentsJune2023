package com.bridgelabz.project2;
// Java Program to print the elements of an array
import java.util.*;
public class Dpp3_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n =sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr1[] = new int[n];
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("The elements of the array are:");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+"  ");
        }
    }
}

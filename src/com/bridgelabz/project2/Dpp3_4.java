package com.bridgelabz.project2;
import java.util.*;
// Java Program to print the smallest element in an array
public class Dpp3_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int smallest = arr[0];
        for(int i=0; i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[j]<arr[i]){
                    smallest=arr[j];
                }
            }
        }
        System.out.println("Smallest element of the array: "+ smallest);

    }
}

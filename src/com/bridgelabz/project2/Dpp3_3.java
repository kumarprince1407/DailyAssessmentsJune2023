package com.bridgelabz.project2;
import java.util.*;
//Java Program to print the largest element in an array
public class Dpp3_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n =sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr1[] = new int[n];
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }
        int largest = arr1[0];
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n;j++){
                if(arr1[j]>arr1[i]){
                    largest =arr1[j];
                }
            }
        }
        System.out.println("The largest element of the array is: "+ largest);
    }
}

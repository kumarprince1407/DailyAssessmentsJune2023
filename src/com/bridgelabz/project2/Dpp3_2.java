package com.bridgelabz.project2;
//Java Program to find the frequency of each element in the array
import java.util.*;
public class Dpp3_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n =sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr1[] = new int[n];
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }
        int visitedArr[]=new int[n];
        int visited = -1;
        System.out.println("Count of each element of the array: ");
        for(int i=0; i<n;i++){
            int count = 1;
            for(int j=i+1;j<n;j++){

            if(arr1[i]==arr1[j]) {
                count++;
                visitedArr[j]=visited;
            }
            }
            if(visitedArr[i] != visited){
                visitedArr[i]=count;
            }

        }
        for(int i=0; i<n; i++){
        if(visitedArr[i]!=visited){
            System.out.println("Count of element "+ arr1[i] +" is: "+ visitedArr[i]);
        }}
    }
}

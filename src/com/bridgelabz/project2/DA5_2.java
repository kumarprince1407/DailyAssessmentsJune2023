package com.bridgelabz.project2;
//Leap year program
import java.util.*;
public class DA5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year number: ");
        int year = sc.nextInt();
        if(year%4==0 && year%100 !=0 || year%400==0 && year%100 !=0){
            System.out.println("Leap year.");
        }
        else{
            System.out.println("Not a Leap year.");
        }
    }
}

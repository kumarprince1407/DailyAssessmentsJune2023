package com.bridgelabz.project2;

import java.util.Scanner;

//Java Program to Check Whether a Number is Even or Odd
public class DA5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

            if(n%2==0){
                System.out.println("The entered number is even.");
            }
            else{
                System.out.println("The entered number is odd. ");
            }

    }
}

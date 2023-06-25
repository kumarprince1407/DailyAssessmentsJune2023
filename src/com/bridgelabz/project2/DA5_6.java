package com.bridgelabz.project2;

import java.util.Scanner;

//Java Program to Compute Quotient and Remainder
public class DA5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to divide: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int n2 = sc.nextInt();

        //Quotient
        int quotient = n1/n2;
        int remainder = n1%n2;
        System.out.println("Quotient: "+ quotient);
        System.out.println("Remainder: "+ remainder);
    }
}

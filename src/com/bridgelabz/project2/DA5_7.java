package com.bridgelabz.project2;

import java.util.Scanner;

//Java Program to Swap Two Numbers
public class DA5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the value of n2 : ");
        int n2 = sc.nextInt();
        int temp;
        temp=n2;
        n2=n1;
        n1=temp;
        System.out.println("Values after swapping: ");
        System.out.println("n1= "+n1+" "+" n2= "+n2);

    }
}

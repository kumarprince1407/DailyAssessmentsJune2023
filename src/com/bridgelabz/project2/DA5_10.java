package com.bridgelabz.project2;

import java.util.Scanner;

//Java Program to Find the Largest Among Three Numbers
public class DA5_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int n3 = sc.nextInt();

        int localmaximum=0;
        int globalMaximum=0;
        if(n1>n2){
            localmaximum=n1;
        }
        else{
            localmaximum=n2;
        }
        if(n3>localmaximum){
            globalMaximum=n3;
        }else{
            globalMaximum=localmaximum;
        }

        System.out.println("The largest number among the three is: "+ globalMaximum);
    }
}

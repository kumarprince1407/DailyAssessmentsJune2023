package com.bridgelabz.project2;

import java.util.Scanner;

public class DA6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to generate its Fibonacci series: ");
        int n = sc.nextInt();
        int sum =0;
        for(int i=0; i<=n;i++){
            sum +=i;
        }
        System.out.println("The fibonacci series of the number "+ n +" is: "+sum);
    }
}

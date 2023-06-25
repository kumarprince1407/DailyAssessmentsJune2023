package com.bridgelabz.project2;

import java.util.Scanner;

//Prime factors
public class DA5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to generate its factors: ");
        int n = sc.nextInt();

        System.out.println("Factors of "+n+" are as follows:");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}

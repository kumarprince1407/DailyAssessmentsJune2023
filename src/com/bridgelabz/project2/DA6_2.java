package com.bridgelabz.project2;


import java.util.Scanner;

//Perfect number
public class DA6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count=0;
        if(n==1){
            System.out.println("The number " + n + " is a perfect number");
        }
        if(n !=1) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    count += i;
                }
            }
            if (count == n) {
                System.out.println("The number " + n + " is a perfect number");

            } else {
                System.out.println("The number " + n + " is not a perfect number");
            }
        }


    }
}

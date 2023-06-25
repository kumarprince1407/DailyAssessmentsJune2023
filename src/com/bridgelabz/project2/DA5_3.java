package com.bridgelabz.project2;
//Power of 2
import java.util.*;
public class DA5_3 {
    public static void main(String[] args) {
        System.out.print("Enter the value of 'n': ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The value of power of 2 up-to "+n+" are as follows:");
        for(int i=0; i<=n;i++){
            double result = Math.pow(2,i);
            System.out.println("2^"+i +" = "+result);
        }
    }
}

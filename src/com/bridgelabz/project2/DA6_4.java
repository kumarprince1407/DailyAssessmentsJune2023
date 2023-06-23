package com.bridgelabz.project2;

import java.util.*;

//Reverse a number
public class DA6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int n = sc.nextInt();
        int reverse=0;
        for(int i=n;i>0; i=i/10){
            reverse = reverse*10+ i%10;
        }
        System.out.println("The reverse of the above number is: "+reverse);
    }
}

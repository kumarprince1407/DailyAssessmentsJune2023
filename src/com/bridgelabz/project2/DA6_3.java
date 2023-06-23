package com.bridgelabz.project2;

import java.util.*;

//Check Prime
public class DA6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean flag=false;
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag = true;
                break;
            }

        }
        if(flag){
            System.out.println("It is not a Prime number");
        }
        else{
            System.out.println("It is a Prime Number");
        }
    }
}

package com.bridgelabz.project2;

import java.util.Scanner;

//Java Program to Check Whether an Alphabet is Vowel or Consonant
public class DA5_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet : ");
        char ch = sc.next().charAt(0);

        if(ch =='a'||ch =='e'||ch =='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("The entered alphabet is a vowel.");
        }
        else{
            System.out.println("The entered alphabet is a consonant. ");
        }

    }
}

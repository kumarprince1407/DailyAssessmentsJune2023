package com.bridgelabz.project2;
//Flip Coin and print percentage of Heads and Tails

import java.util.Scanner;
import java.util.Random;
public class DA5_1 {
    public static void main(String[] args) {
        System.out.print("Enter the number of times to flip the coin: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        Random random=new Random();

        int headsCount=0;
        int tailsCount=0;

        for(int i=0; i<n; i++) {
            int result = random.nextInt(2);
            if (result == 1) {
                System.out.println("Heads");
                headsCount++;
            } else {
                System.out.println("Tails");
                tailsCount++;
            }
        }
        System.out.println("Heads Count: "+headsCount+" Tails count: "+tailsCount);
        double total = headsCount+tailsCount;
        double headsPercentage = (headsCount/total)*100;
        double tailsPercentage = (tailsCount/total)*100;
        System.out.println("Heads percentage: " + headsPercentage+"%");
        System.out.println("Tails percentage: " + tailsPercentage+"%");
    }
}

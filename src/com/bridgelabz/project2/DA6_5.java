package com.bridgelabz.project2;
//How to Compare Two Objects in Java
import java.util.*;
public class DA6_5 {
    // Function to generate a random number within a given range
    private static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private static int generateDistinctCoupons(int N) {
        Set<Integer> distinctCoupons = new HashSet<>();
        int count = 0;

        while (distinctCoupons.size() < N) {
            int randomNumber = generateRandomNumber(1, N);
            count++;

            if (!distinctCoupons.contains(randomNumber)) {
                distinctCoupons.add(randomNumber);
                System.out.println("Generated distinct coupon number: " + randomNumber);
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int N = 10; // Number of distinct coupon numbers


        int totalRandomNumbersNeeded = generateDistinctCoupons(N);
        System.out.println("\nTotal random numbers needed to have all distinct numbers: " + totalRandomNumbersNeeded);
    }
}

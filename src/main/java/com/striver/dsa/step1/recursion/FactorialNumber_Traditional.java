package com.striver.dsa.step1.recursion;

public class FactorialNumber_Traditional {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Sum of first N numbers : " + factorialOfTheNumber(3));
        System.out.println();
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static int factorialOfTheNumber(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

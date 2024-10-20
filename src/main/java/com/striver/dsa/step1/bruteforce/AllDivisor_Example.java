package com.striver.dsa.step1.bruteforce;

import java.util.Arrays;

public class AllDivisor_Example {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("All divisors are :");
        int[] divisors = printAllDivisors(12);
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
        System.out.println();
        System.out.println("Total time taken : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static int[] printAllDivisors(int number) {
        int[] divisors = new int[number];
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors[count] = i;
                count++;
            }
        }
        return Arrays.copyOf(divisors, count);
    }
}

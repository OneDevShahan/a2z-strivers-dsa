package com.striver.dsa.step1.basic.optimal;

import java.util.ArrayList;
import java.util.Collections;

public class AllDivisor_Example {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("All divisors are :");
        ArrayList<Integer> divisors = printAllDivisors(12);
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
        System.out.println();
        System.out.println("Total time taken : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static ArrayList<Integer> printAllDivisors(int number) {
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        for (int i = 1; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
            if (i != number % i) {
                divisors.add(number / i);
            }
        }
        Collections.sort(divisors);
        return divisors;
    }
}

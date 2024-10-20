package com.striver.dsa.step1.basic.optimal;

public class PrimeNumber_Example {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Is number prime :" + isNumberPrime(11));
        System.out.println("Total time taken : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static boolean isNumberPrime(long number) {
        int count = 0;
        for (int i = 1; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
                if (i != number / i) {
                    count++;
                }
            }

        }
        return count == 2;
    }
}

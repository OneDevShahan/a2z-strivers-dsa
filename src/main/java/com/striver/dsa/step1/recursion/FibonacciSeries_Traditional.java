package com.striver.dsa.step1.recursion;

public class FibonacciSeries_Traditional {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int n = 5;
        System.out.println("Fibonacci Series till : " + n);
        printFibonacciTillN(n);
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static void printFibonacciTillN(int n) {
        if (n == 0) System.out.println("0");
        else {
            int secondLast = 0;
            int last = 1;
            int current;
            System.out.print(secondLast + " " + last + " ");
            for (int i = 2; i <= n; i++) {
                current = secondLast + last;
                secondLast = last;
                last = current;
                System.out.print(current + " ");
            }
        }
    }
}

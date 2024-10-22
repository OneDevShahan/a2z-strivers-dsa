package com.striver.dsa.step1.recursion;

public class FibonacciSeries_Recursive {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int n = 5;
        System.out.println("Fibonacci Series till : " + n);
        for (int i = 0; i <= n; i++) {
            System.out.print(printFibonacciTillN(i) + " ");
        }
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static int printFibonacciTillN(int n) {
        if (n <= 1) return n;
        return printFibonacciTillN(n - 1) + printFibonacciTillN(n - 2);
    }
}

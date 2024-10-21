package com.striver.dsa.step1.recursion;

public class Recursion_Example {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        printNumberWithRecursion(12);
        System.out.println();
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static void printNumberWithRecursion(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printNumberWithRecursion(n - 1);
    }
}

package com.striver.dsa.step1.recursion;

public class NToOne_Traditional {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        printNToOne(12);
        System.out.println();
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static void printNToOne(int n) {
        System.out.print(n + " ");
        if (n > 1) {
            printNToOne(n - 1);
        }
    }
}

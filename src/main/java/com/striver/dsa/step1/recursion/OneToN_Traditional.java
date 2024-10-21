package com.striver.dsa.step1.recursion;

public class OneToN_Traditional {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        printOneToN(12);
        System.out.println();
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static void printOneToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

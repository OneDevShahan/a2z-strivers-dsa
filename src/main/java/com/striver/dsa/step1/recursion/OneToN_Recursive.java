package com.striver.dsa.step1.recursion;

public class OneToN_Recursive {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        printOneToN(12);
        System.out.println();
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static void printOneToN(int n) {
        if (n > 1) {
            printOneToN(n - 1);
        }
        System.out.print(n + " ");
    }
}

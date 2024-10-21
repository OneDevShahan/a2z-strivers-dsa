package com.striver.dsa.step1.recursion;

public class FactorialNumber_Recursive {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Sum of first N numbers : " + factorialOfTheNumber(3));
        System.out.println();
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static int factorialOfTheNumber(int n) {

        if (n == 1) {
            return 1;
        }
        return n * factorialOfTheNumber(n - 1);
    }
}

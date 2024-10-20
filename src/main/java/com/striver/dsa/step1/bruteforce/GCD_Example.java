package com.striver.dsa.step1.bruteforce;

public class GCD_Example {
    public static void main(String[] args) {
        System.out.println("GCD :" + findGCD(20, 15));
    }

    public static int findGCD(int start, int end) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(start, end); i++) {
            if (start % i == 0 && end % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}

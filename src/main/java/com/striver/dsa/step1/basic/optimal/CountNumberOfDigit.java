package com.striver.dsa.step1.basic.optimal;

public class CountNumberOfDigit {

    public static void main(String[] args) {
        System.out.println("Number of digits is " + countNumberOfDigit(1234));
    }

    public static int countNumberOfDigit(int number) {
        return (int) Math.log10(number) + 1;
    }
}

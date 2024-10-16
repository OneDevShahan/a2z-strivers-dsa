package com.striver.dsa.step1.bruteforce;

public class CountNumberOfDigit {

    public static void main(String[] args) {
        System.out.println("Number of digits is "+ countNumberOfDigit(1234));
    }

    public static int countNumberOfDigit(int number){
        int count = 0;
        while(number>0){
            count++;
            number /= 10;
        }
        return count;
    }
}

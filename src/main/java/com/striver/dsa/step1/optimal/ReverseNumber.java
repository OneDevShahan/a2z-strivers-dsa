package com.striver.dsa.step1.optimal;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Reversed Number "+ reverseNumber(123456));
    }

    public static int reverseNumber(int num){
        int reverse = 0;
        while(num>0){
            int n = num%10;

            reverse = reverse*10 + n;
            num /= 10;
        }
        return reverse;
    }
}

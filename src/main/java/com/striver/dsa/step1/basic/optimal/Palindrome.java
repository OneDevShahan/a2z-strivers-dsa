package com.striver.dsa.step1.basic.optimal;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("If number is Palimdrome number " + isPalindrome(1234));
        System.out.println("If number is Palimdrome number " + isPalindrome(121));
    }

    public static boolean isPalindrome(int n) {
        int rev = 0;
        int dup = n;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        return dup == rev;
    }
}

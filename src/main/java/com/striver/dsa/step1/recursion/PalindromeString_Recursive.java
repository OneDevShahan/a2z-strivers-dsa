package com.striver.dsa.step1.recursion;

public class PalindromeString_Recursive {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Madam");
        System.out.println("Is string palindrome : " + isPalindrome(0, "Madam"));
        System.out.println();
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static boolean isPalindrome(int start, String str) {
        if (start > str.length() / 2) return true;
        if (str.charAt(start) != str.charAt(str.length() - 1)) return false;
        return isPalindrome(start + 1, str);
    }
}

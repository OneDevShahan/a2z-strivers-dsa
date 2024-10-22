package com.striver.dsa.step1.recursion;

public class PalindromeString_Traditional {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Madam");
        System.out.println("Is string palindrome : " + isPalindrome("Madams"));
        System.out.println();
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char l = str.charAt(left);
            char r = str.charAt(right);
            if (!Character.isLetter(l) || !Character.isLetter(r)) {
                left++;
                right--;
            } else if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}

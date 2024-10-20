package com.striver.dsa.step1.basic.bruteforce;

public class ArmstringNumber_Example {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Is number armstrong :" + isNumberArmstrong(153));
        System.out.println("Total time taken : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static boolean isNumberArmstrong(int number) {
        int sum = 0;
        int originalNumber = number;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += Math.pow(lastDigit, 3);
            number /= 10;
        }
        return sum == originalNumber;
    }
}

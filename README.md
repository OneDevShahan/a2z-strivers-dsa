# Striver A2Z DSA - Daily DSA Practice - Interview Prep

This repository contains solutions to various data structures and algorithms (DSA) problems. Each problem includes a
detailed breakdown of steps, multiple solution approaches (if applicable), and the output of each code. The aim is to
help with daily revision and interview preparation, focusing on understanding and improving solution efficiency.

---

## Problem Format

Each problem follows the format below:

1. **Problem Statement**  
   Brief description of the problem.

2. **Steps to Solve**  
   Breakdown of thought process and steps to approach the problem.

3. **Solution Approaches**  
   Solutions are divided into Brute Force, Better, and Optimal categories. Not all categories are present for each
   problem if a simpler solution is unavailable.

4. **YouTube Video Link**  
   YouTube video link of Strivers.

5. **GitHub Code Link**  
   GitHub code link for my repo.

6. **Code**  
   Solution code snippets for each approach.

7. **Output**  
   Expected or sample output from the code.

---

## Table of Contents

### [Basic Mathematical Problems](#Basic-Mathematical-Problems)

- [Problem 1: Count digits in a number](#problem-1-count-digits-in-a-number)
- [Problem 2: Reverse a number](#problem-2-reverse-a-number)
- [Problem 3: Check Palindrome](#problem-3-check-palindrome)
- [Problem 4: GCD Or HCF](#problem-4-gcd-or-hcf)
- [Problem 5: Armstrong Numbers](#problem-5-armstrong-number)
- [Problem-6: Print all Divisors](#problem-6-print-all-divisors)
- [Problem-7: Check for Prime](#problem-7-check-for-prime)
- [Problem-8: Print 1 to N using recursion](#problem-8-print-1-to-n-using-recursion)
- [Problem-9: Print N to 1 using recursion](#problem-9-print-n-to-1-using-recursion)
- [Problem-10: Sum of first N numbers](#problem-10-sum-of-first-n-numbers)
- [Problem-11: Factorial of N numbers](#problem-11-factorial-of-n-numbers)
- [Problem-12: Reverse an array](#problem-12-reverse-an-array)
- [Problem-13: Check if a string is palindrome or not](#problem-13-check-if-a-string-is-palindrome-or-not)
- [Problem-14: Fibonacci Number](#problem-14-fibonacci-number)

---

### [Array Problems](#array-problems)

- [Problem 1: Find Maximum Subarray Sum](#problem-1-find-maximum-subarray-sum)
- [Problem 2: Merge Sorted Arrays](#problem-2-merge-sorted-arrays)

---

### Binary Search

- [Problem 1: Find Maximum Subarray Sum](#problem-1-find-maximum-subarray-sum)
- [Problem 2: Merge Sorted Arrays](#problem-2-merge-sorted-arrays)

---

### String

- [Problem 3: Check for Anagrams](#problem-3-check-for-anagrams)
- [Problem 4: Longest Palindromic Substring](#problem-4-longest-palindromic-substring)

---

### LinkedList

- [Problem 5: Reverse a Linked List](#problem-5-reverse-a-linked-list)
- [Problem 6: Detect Cycle in Linked List](#problem-6-detect-cycle-in-linked-list)

---

### Recursion

- [Problem 5: Reverse a Linked List](#problem-5-reverse-a-linked-list)
- [Problem 6: Detect Cycle in Linked List](#problem-6-detect-cycle-in-linked-list)

---

### Bit Manipulation

- [Problem 5: Reverse a Linked List](#problem-5-reverse-a-linked-list)
- [Problem 6: Detect Cycle in Linked List](#problem-6-detect-cycle-in-linked-list)

---

### Stack and Queue

- [Problem 5: Reverse a Linked List](#problem-5-reverse-a-linked-list)
- [Problem 6: Detect Cycle in Linked List](#problem-6-detect-cycle-in-linked-list)

---

### Sliding Window and Two Pointer Combined

- [Problem 5: Reverse a Linked List](#problem-5-reverse-a-linked-list)
- [Problem 6: Detect Cycle in Linked List](#problem-6-detect-cycle-in-linked-list)

---

### Heaps

- [Problem 5: Reverse a Linked List](#problem-5-reverse-a-linked-list)
- [Problem 6: Detect Cycle in Linked List](#problem-6-detect-cycle-in-linked-list)

---

### Greedy Algorithms

- [Problem 5: Reverse a Linked List](#problem-5-reverse-a-linked-list)
- [Problem 6: Detect Cycle in Linked List](#problem-6-detect-cycle-in-linked-list)

---

### Binary Trees

- [Problem 7: Binary Tree Inorder Traversal](#problem-7-binary-tree-inorder-traversal)
- [Problem 8: Lowest Common Ancestor](#problem-8-lowest-common-ancestor)

---

### Binary Search Trees

- [Problem 7: Binary Tree Inorder Traversal](#problem-7-binary-tree-inorder-traversal)
- [Problem 8: Lowest Common Ancestor](#problem-8-lowest-common-ancestor)

---

### Graph

- [Problem 11: Depth First Search (DFS)](#problem-11-depth-first-search-dfs)
- [Problem 12: Shortest Path in Unweighted Graph](#problem-12-shortest-path-in-unweighted-graph)

---

### Dynamic Programming

- [Problem 9: Fibonacci Sequence](#problem-9-fibonacci-sequence)
- [Problem 10: Coin Change Problem](#problem-10-coin-change-problem)

---

### Tries

- [Problem 13: Binary Search](#problem-13-binary-search)
- [Problem 14: Quick Sort Algorithm](#problem-14-quick-sort-algorithm)

---

- [More problems...](#)

---

## Basic Mathematical Problems

### Problem 1: Count digits in a number

#### Problem Statement

> **Description:** Given an integer N, return the number of digits in N.

#### Solution Approaches

#### 1. Brute Force Solution

- **Approach:** To count the number of digits in a number, we can use the algorithm created in Extract Digits as now
  instead of extracting digits we are simply creating a counter to count the number of digits in the number.
- **Steps to Solve:**
    - Step 1: `Initialise a counter to store the number of digits.`
    - Step 2: `While N is greater than 0, execute:`

      `A` Increment the counter by 1.

      `B` Update N by removing its last digit by performing a modulo 10 (%10) operation on it.

    - Step 3: `After exiting the while loop, we return the counter as the number of digits.`

- **Time Complexity:** `O(log10N + 1)` where N is the input number. The time complexity is determined by the number of
  digits in the input
  integer N. In the worst case when N is a multiple of 10 the number of digits in N is log10N + 1.
  In the while loop we divide N by 10 until it becomes 0 which takes log10N iterations.
  In each iteration of the while loop we perform constant time operations like division and increment the counter.

- **Space Complexity :** `O(1)` as only a constant amount of additional memory for the counter regardless of size of the
  input number.

> **YouTube Video Link:** [Count Number Of Digits](https://youtu.be/1xNbjMdbjug)

> **GitHub Code Link:**
> [Count Number Of Digits](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/step-1/src/main/java/com/striver/dsa/step1/basic/bruteforce/CountNumberOfDigit.java)

**Java Code:**

```java
public class CountDigits {
    // Function to count the number
    // of digits in an integer 'n'.
    public static int countDigits(int n) {
        // Initialize a counter variable
        // 'cnt' to store the count of digits.
        int cnt = 0;
        // While loop iterates until 'n'
        // becomes 0 (no more digits left).
        while (n > 0) {
            // Increment the counter
            // for each digit encountered.
            cnt = cnt + 1;
            // Divide 'n' by 10 to
            // remove the last digit.
            n = n / 10;
        }
        // Return the
        // count of digits.
        return cnt;
    }

    public static void main(String[] args) {
        int N = 329823;
        System.out.println("N: " + N);
        int digits = countDigits(N);
        System.out.println("Number of Digits in N: " + digits);
    }
}
```

**Input:**

```
 N: 329823
```

**Output:**

```
Number of Digits in N: 6.
```

---

#### 2. Better Solution

Go to the Optimal solution.

> **YouTube Video Link:** [Count Number Of Digits](https://youtu.be/1xNbjMdbjug)

> **GitHub Code Link:**
> [Count Number Of Digits](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/step-1/src/main/java/com/striver/dsa/step1/basic/optimal/CountNumberOfDigit.java)

---

#### 3. Optimal Solution

- **Approach:** The logarithmic base 10 of a positive integers gives the number of digits in n. We add 1 to the result
  to ensure that the count is correct even for numbers that are powers of 10.

  We cast the result to an integer to ensure that any fractional part is discarded giving the exact count of digits.

- **Steps to Solve:**
    - Step 1: `Initialise a variable to store the count of digits of the number.`
    - Step 2: `The count of digits can be calculated using log10 N + 1.`

      `A` log10 N operation gives the logarithmic base 10 of which returns the power to which 10 must be raised to, to
      be
      equal to N.

      `B` We add 1 to the result which accounts for the possibility that N itself is a power of 10.

      `C` Financially cast the result to an integer to ensure that it is rounded down to the nearest whole number.
    - Step 3: `Return the value of count which represents the count of digits in the input integer N.`


- **Time Complexity:** `O(1)` as simple arithmetic operations in constant time are computed on integers.

- **Space Complexity :** `O(1)` as only a constant amount of additional memory for the count variable regardless of size
  of the input number.

> **YouTube Video Link:** [Count Number Of Digits](https://youtu.be/1xNbjMdbjug)

> **GitHub Code Link:**
> [Count Number Of Digits](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/step-1/src/main/java/com/striver/dsa/step1/basic/optimal/CountNumberOfDigit.java)

**Java Code:**

```java
public class CountDigits {
    // Calculate the count of digits in 'n'
    // using logarithmic operation log10(n) + 1.
    static int countDigits(int n) {
        // Initialize a variable 'cnt' to
        // store the count of digits.
        int cnt = (int) (Math.log10(n) + 1);

        // The expression (int)(Math.log10(n) + 1)
        // calculates the number of digits in 'n'
        // and casts it to an integer.

        // Adding 1 to the result accounts
        // for the case when 'n' is a power of 10,
        // ensuring that the count is correct.

        // Finally, the result is cast
        // to an integer to ensure it is rounded
        // down to the nearest whole number.

        // Return the count of digits in 'n'.
        return cnt;
    }

    public static void main(String[] args) {
        int N = 329823;
        System.out.println("N: " + N);
        int digits = countDigits(N);
        System.out.println("Number of Digits in N: " + digits);
    }
}
```

**Input:**

```
 N: 329823
```

**Output:**

```
Number of Digits in N: 6.
```

---

### Problem 2: Reverse a number

#### Problem Statement

> **Description:**  
> Given an integer N return the reverse of the given number.

#### Solution Approaches

#### 1. Brute Force Solution

Go to the Optimal solution.

> **YouTube Video Link:** [Reverse a Number](https://youtu.be/1xNbjMdbjug)

> **GitHub Code Link:**
> [Reverse a Number](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/step-1/src/main/java/com/striver/dsa/step1/basic/optimal/ReverseNumber.java)

---

#### 2. Better Solution

Go to the Optimal solution.

> **YouTube Video Link:** [Reverse a Number](https://youtu.be/1xNbjMdbjug)

> **GitHub Code Link:**
> [Reverse a Number](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/step-1/src/main/java/com/striver/dsa/step1/basic/optimal/ReverseNumber.java)

---

#### 3. Optimal Solution

- **Approach:** To reverse the digits of a number, we can use the algorithm created in Extract Digits as now instead of
  extracting digits we are simply appending them to the reversed number.

- **Steps to Solve:**
    - Step 1: `Initialise an integer revNum to 0. This variable will store the reversed number..`
    - Step 2: `Using a while loop we iterate while n is greater than 0 and at each iteration:`

      `A` Calculate the last digit of the number using the modulus operator (N%10) and store it in a variable last
      digit.

      `B` Update the reversed number by multiplying it with 10 and adding the last digit. This effectively appends the
      last digit to the end of the reversed number.

      `C` Remove the last digit of the number by dividing it by 10.
    - Step 3: `After exiting the while loop, return the reversed number.`


- **Time Complexity:** `O(log10N + 1)` where N is the input number. The time complexity is determined by the number of
  digits in the input integer `N`. In the worst case when `N` is a multiple of `10` the number of digits in `N` is
  `log10 N + 1`.

  In the while loop we divide `N` by `10` until it becomes `0` which takes `log10N` iterations.

  In each iteration of the while loop we perform constant time operations like modulus and division and pushing elements
  into the vector.

- **Space Complexity :** `O(1)` as only a constant amount of additional memory for the reversed number regardless of
  size of the input number.

> **YouTube Video Link:** [Reverse a Number](https://youtu.be/1xNbjMdbjug)

> **GitHub Code Link:**
> [Reverse a Number](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/step-1/src/main/java/com/striver/dsa/step1/basic/optimal/ReverseNumber.java)

**Java Code:**

```java
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Reversed Number " + reverseNumber(123456));
    }

    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num > 0) {
            int n = num % 10;

            reverse = reverse * 10 + n;
            num /= 10;
        }
        return reverse;
    }
}
```

**Input:**

```
 Input Number: 7789
```

**Output:**

```
 Output Number: 9877
```

---

### Problem 3: Check Palindrome

#### Problem Statement

> **Description:**  
> Given an integer N, return true if it is a palindrome else return false.

#### Solution Approaches

#### 1. Brute Force Solution

Go to the Optimal solution.

> **YouTube Video Link:** [Check Palindrome](https://youtu.be/1xNbjMdbjug)

> **GitHub Code Link:**
> [Check Palindrome](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/master/src/main/java/com/striver/dsa/step1_basic/basic/optimal/Palindrome.java)

---

#### 2. Better Solution

Go to the Optimal solution.

> **YouTube Video Link:** [Check Palindrome](https://youtu.be/1xNbjMdbjug)

> **GitHub Code Link:**
> [Check Palindrome](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/master/src/main/java/com/striver/dsa/step1_basic/basic/optimal/Palindrome.java)

---

#### 3. Optimal Solution

- **Approach:** To check if a number is a palindrome, we can use the algorithm created in Extract Digits as now we
  extract the digits of the number to create a reversed number.

  We then compare the reversed number with the original number. If they are equal, the original number is a palindrome.
  If they are not equal the original number is not a palindrome.

- **Steps to Solve:**
    - Step 1: `Initialise an integer revNum to 0. This variable will store the reverse of the number.`
    - Step 2: `Make a duplicate of the original number and store it in an integer dup for later comparison.`

    - Step 3: `Run a while loop with the condition n>0 to reverse the number and at each iteration:`
      `A` Get the last digit of n by using the modulus operator % with 10 and store it in a temporary variable ld..

      `B` Update the revNum by multiplying it by 10 and adding the last digit ld.

      `C` Update n by integer division with 10 effectively removing the last digit.

    - Step 3: `After the loop, check if the original number dup is equal to the reversed number revNum.`
      `A` If they are equal, return true indicating the number is a palindrome.

      `B` If they are not equal, return false indicating that the number is not a palindrome.


- **Time Complexity:** `O(log10N + 1)` where N is the input number. The time complexity is determined by the number of
  digits in the input integer `N`. In the worst case when `N` is a multiple of `10` the number of digits in `N` is
  `log10 N + 1`.

  In the while loop we divide `N` by `10` until it becomes `0` which takes `log10N` iterations.

  In each iteration of the while loop we perform constant time operations like modulus and division and pushing elements
  into the array.

- **Space Complexity :** `O(1)` as only a constant amount of additional memory for the reversed number regardless of
  size of the input number.

> **YouTube Video Link:** [Check Palindrome](https://youtu.be/1xNbjMdbjug)

> **GitHub Code Link:**
> [Check Palindrome](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/master/src/main/java/com/striver/dsa/step1_basic/basic/optimal/Palindrome.java)

**Java Code:**

```java
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("If number is Palindrome number " + isPalindrome(1234));
        System.out.println("If number is Palindrome number " + isPalindrome(121));
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
```

**Input:**

```
 Input Number: 1234
 Input Number: 121
```

**Output:**

```
 If number is Palimdrome number false
 If number is Palimdrome number true
```

---

### Problem 4: GCD Or HCF

#### Problem Statement

> **Description:**  
> Given two integers N1 and N2, find their greatest common divisor. The Greatest Common Divisor of any two integers is
> the largest number that divides both integers.

#### Solution Approaches

#### 1. Brute Force Solution

- **Approach:** The GCD of two numbers is the largest number that divides both of them without leaving a remainder. We
  iterate through all numbers from 1 up to the minimum of the two input numbers, checking if each number is a common
  factor of both input numbers.

  If a number is a common factor, we update our gcd variable to that number. This process continues until we have
  iterated through all possible common factors. Finally, we return the gcd variable, which will hold the greatest common
  divisor of the two input numbers.
- **Steps to Solve:**
    - Step 1:
      `Initialise a variable gcd to 1. This variable will store the greatest common divisor of the input numbers n1 and n2.`
    - Step 2: `Iterate from 1 to the minimum of n1 and n2.`

      `A` We start from 1 because the GCD of any two numbers is at least 1, and it cannot be greater than the smaller of
      the two numbers.

    - Step 3:
      `At each iteration, if i is a common factor of both n1 and n2 update the gcd variable to i. We keep updating gcd as long as we find common factors.`
    - Step 4:
      `After the iteration, the gcd variable will store the greatest common divisor of n1 and n2. Return this value as the output of the function.`

- **Time Complexity:** `O(min(N1, N2))` where `N1` and `N2` is the input number. The algorithm iterates from `1` to the
  minimum of `N1` and `N2` and each iteration checks whether both the numbers are divisible by the current number (
  constant time operations).

- **Space Complexity :** `O(1)` as the space complexity remains constant and independent of the input size. Only a fixed
  amount of memory is required to store the integer variables.

> **YouTube Video Link:** [GCD Or HCF](https://youtu.be/1xNbjMdbjug)

> **GitHub Code Link:**
> [GCD Or HCF](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/master/src/main/java/com/striver/dsa/step1_basic/basic/bruteforce/GCD_Example.java)

**Java Code:**

```java
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
```

**Input:**

```
 N: 20, 15
```

**Output:**

```
GCD :5.
```

---

#### 2. Better Solution

- **Approach:** We can optimise the time complexity of the previous approach. In the worst case, the loop iterates from
  1 up to the minimum of N1 and N2. This could potentially result in a large number of iterations, especially when one
  input number is significantly larger than the other.

  If we iterate from the minimum of N1 and N2 down to 1, we reduce the number of iterations because we start from the
  potentially largest common factor and work downwards.
  The time complexity of this approach remains O(min(N1, N2)) but in practice, it will execute fewer iterations on
  average.

- **Steps to Solve:**
    - Step 1:
      `Iterate from the minimum of n1 and n2 because the greatest common divisor of two numbers cannot exceed the smaller number.`
    - Step 2: `For each i in the iteration, we check if it is a common factor of both n1 and n2.`

      `A` If a common factor i is found, we return it as the gcd as we are iterating from the largest potential gcd to
      1, the first common factor we encounter will be the greatest common divisor.

    - Step 3:
      `If the loop completes without finding any common factors we return 1. This is because 1 is always a divisor of any number any number hence is also the GCD of any pair of numbers where no other common factors exist.`

- **Time Complexity:** `O(min(N1, N2))` where `N1` and `N2` is the input number. The algorithm iterates from the minimum
  of `N1` and `N2` to `1` and each iteration checks whether both the numbers are divisible by the current number (
  constant time operations).

- **Space Complexity :** `O(1)` as the space complexity remains constant and independent of the input size. Only a fixed
  amount of memory is required to store the integer variables.

> **YouTube Video Link:** [GCD Or HCF](https://youtu.be/1xNbjMdbjug)

> **GitHub Code Link:**
> [GCD Or HCF](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/master/src/main/java/com/striver/dsa/step1_basic/basic/better/GCD_Example.java)

**Java Code:**

```java
public class GCD_Example {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("GCD :" + findGCD(20, 15));
        System.out.println("Total time taken : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static int findGCD(int start, int end) {
        for (int i = Math.min(start, end); i >= 0; i--) {
            if (start % i == 0 && end % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
```

**Input:**

```
 N: 20, 15
```

**Output:**

```
GCD :5.
```

---

#### 3. Optimal Solution

- **Approach:** The Euclidean Algorithm is a method for finding the greatest common divisor of two numbers. It operates
  on the principle that the GCD of two numbers remains the same even if the smaller number is subtracted from the larger
  number.

- **Steps to Solve:**
    - Step 1: `To find the GCD of n1 and n2 where n1 > n2:`
      `A` Repeatedly subtract the smaller number from the larger number until one of them becomes 0.

      `B` Once one of them becomes 0, the other number is the GCD of the original numbers.

- **Concept**

```Algorithms
Eg, n1 = 20, n2 = 15:

gcd(20, 15) = gcd(20-15, 15) = gcd(5, 15)

gcd(5, 15) = gcd(15-5, 5) = gcd(10, 5)

gcd(10, 5) = gcd(10-5, 5) = gcd(5, 5)

gcd(5, 5) = gcd(5-5, 5) = gcd(0, 5)

Hence, return 5 as the gcd.
```

- **Time Complexity:** `O(min(N1, N2))` where `N1` and `N2` is the input number. The algorithm iterates from the minimum
  of `N1` and `N2` to `1` and each iteration checks whether both the numbers are divisible by the current number (
  constant time operations).

- **Space Complexity :** `O(1)` as the space complexity remains constant and independent of the input size. Only a fixed
  amount of memory is required to store the integer variable.

> **YouTube Video Link:** [GCD Or HCF](https://youtu.be/1xNbjMdbjug)

> **GitHub Code Link:**
> [GCD Or HCF](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/master/src/main/java/com/striver/dsa/step1_basic/basic/optimal/Palindrome.java)

**Java Code:**

```java
public class GCD_Example {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("GCD :" + findGCD(20, 15));
        System.out.println("Total time taken : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static int findGCD(int start, int end) {
        while (start > 0 && end > 0) {
            if (start > end) {
                start = start % end;
            } else {
                end = end % start;
            }
        }
        if (start == 0) {
            return end;
        }
        return start;
    }
}
```

**Input:**

```
 N: 15, 20
```

**Output:**

```
 GCD :5
```

---

### Problem 5: Armstrong Numbers

#### Problem Statement

> **Description:**  
> Given an integer N, return true it is an Armstrong number otherwise return false.
> An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of
> digits.

#### Solution Approaches

#### 1. Brute Force Solution

Go to the Optimal Solution

> **YouTube Video Link:** [Armstrong Numbers](https://youtu.be/1xNbjMdbjug)

> **GitHub Code Link:**
> [Armstrong Numbers](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/master/src/main/java/com/striver/dsa/step1_basic/basic/optimal/ArmstringNumber_Example.java)


---

#### 2. Better Solution

Go to the Optimal Solution
> **YouTube Video Link:** [Armstrong Numbers](https://youtu.be/1xNbjMdbjug)

> **GitHub Code Link:**
> [Armstrong Numbers](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/master/src/main/java/com/striver/dsa/step1_basic/basic/optimal/ArmstringNumber_Example.java)

---

#### 3. Optimal Solution

- **Approach:** To check if a number is an armstrong number, we can use the algorithm created in Extract Digits.

  An Armstrong number, also known as a narcissistic number or plenary number, is a number that is equal to the sum of
  its own digits each raised to the power of the number of digits.

> Number of digits: 3, 153 = 13+53+33

We extract the digits of the number, raise each digit to the power of the total number of digits in the number. Sum up
all the results obtained and check if the sum equals to the original number.

- **Steps to Solve:**
    - Step 1:
      `Calculate the number of digits in the input number and store it in k. Read more about this Approach here: Count Digits`
    - Step 2:
      `Initialise a variable sum to 0. This variable will store the sum of each digit raised to the power of number of digits in number.`

      `A` Make a copy of the original number to store it in a temporary variable.
    - Step 3: `Run a while loop with the condition n>0 and at each iteration:`

      `A` Get the last digit of n by using the modulus operator % with 10 and store it in a temporary variable ld.

      `B` Add the digit ld raised to the power of k of the sum.

      `C` Update n by integer division with 10 effectively removing the last digit.
    - Step 4:
      `After the loop, check if the original input number is equal to the sum of the digits raised to the power of the number of digits in the number.`

      `A` If they are equal, return true indicating the number is an Armstrong number.

      `B` If they are not equal, return false indicating that the number is not an Armstrong number.


- **Time Complexity:** `O(log10N + 1)` where `N` is the input number. The time complexity is determined by the number of
  digits in the input integer `N`. In the worst case when `N` is a multiple of `10` the number of digits in `N` is
  `log10 N + 1`.

  In the while loop we divide `N` by `10` until it becomes `0` which takes `log10N` iterations.
  In each iteration of the while loop we perform constant time operations like modulus and division and pushing elements
  into the array.

- **Space Complexity :** `O(1)` as only a constant amount of additional memory for the reversed number regardless of
  size of the input number.

> **YouTube Video Link:** [Armstrong Numbers](https://youtu.be/1xNbjMdbjug)

> **GitHub Code Link:**
> [Armstrong Numbers](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/master/src/main/java/com/striver/dsa/step1_basic/basic/optimal/ArmstringNumber_Example.java)

**Java Code:**

```java
public class ArmstrongNumber_Example {
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
```

**Input:**

```
 N: 153
```

**Output:**

```
Is number armstrong :true
Total time taken : 8ms
```

---

### Problem 6: Print all Divisors

#### Problem Statement

> **Description:**  
> Given an integer N, return all divisors of N.

> A divisor of an integer N is a positive integer that divides N without leaving a remainder. In other words, if N is
> divisible by another integer without any remainder, then that integer is considered a divisor of N.

#### Solution Approaches

#### 1. Brute Force Solution

- **Approach:** A brute force approach would be to iterate from 1 to n checking each value if it divides n without
  leaving a remainder. For each divisor found, store it in an array and a count of divisors is maintained. After
  iterating through all possible values, the size of the array is updated with the count of divisors and the array is
  returned.

- **Steps to Solve:**
    - Step 1:
      `Initialise an array to store the divisors.`
    - Step 2: `Iterate from 1 to n using a loop variable ‘i’. For each value of ‘i’:`

      `A` Check if ‘i’ is a divisor of ‘n’ by checking if ‘n’ is divisible by ‘i’ without a remainder (‘n’%i == 0).

      `B` If i is a divisor, store it in the array of divisors and increment the count of divisors.

    - Step 3:
      `After the loop, return the array of divisors.`

- **Time Complexity:** `O(N)` where `N` is the input number. The algorithm iterates through each number from `1` to `n`
  once to check if it is a divisor.

- **Space Complexity :** `O(N)` where `N` is the input number. The algorithm iterates through each number from `1` to
  `n` once to check if it is a divisor.

> **YouTube Video Link:** [Print all Divisors](https://youtu.be/Ae_Ag_saG9s)

> **GitHub Code Link:**
> [Print all Divisors](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/master/src/main/java/com/striver/dsa/step1_basic/basic/bruteforce/AllDivisor_Example.java)

**Java Code:**

```java
public class AllDivisor_Example {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("All divisors are :");
        int[] divisors = printAllDivisors(12);
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
        System.out.println();
        System.out.println("Total time taken : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static int[] printAllDivisors(int number) {
        int[] divisors = new int[number];
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors[count] = i;
                count++;
            }
        }
        return Arrays.copyOf(divisors, count);
    }
}
```

**Input:**

```
 N: 12
```

**Output:**

```
All divisors are :
1 2 3 4 6 12 
Total time taken : 12ms
```

---

#### 2. Better Solution

Go to the Optimal Solution

> **YouTube Video Link:** [Print all Divisors](https://youtu.be/Ae_Ag_saG9s)

> **GitHub Code Link:**
> [Print all Divisors](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/master/src/main/java/com/striver/dsa/step1_basic/basic/optimal/AllDivisor_Example.java)

---

#### 3. Optimal Solution

- **Approach:** We can optimise the previous approach by using the property that for any non-negative integer n, if d is
  a divisor of n then n/d is also a divisor of n.

  This property is symmetric about the square root of n by traversing just the first half we can avoid redundant
  iteration and computations improving the efficiency of the algorithm.

- **Steps to Solve:**
    - Step 1: `Initialise an array to store the divisors.`
    - Step 2: `Iterate from 1 to square root of n using a loop variable ‘i’. For each value of ‘i’:`

      `A` Check if ‘i’ is a divisor of ‘n’ by checking if ‘n’ is divisible by ‘i’ without a remainder (‘n’%i == 0).

      `B` If i is a divisor, add it to the vectors of divisors.

      `C` If i is different from n/i add the counterpart divisor n/i to the vector of divisors.
    - Step 3: `After the loop, return the array of divisors.`


- **Time Complexity:** `O(sqrt(N))` where `N` is the input number. The algorithm iterates through each number from `1`
  to the square root of `N` once to check if it is a divisor.

- **Space Complexity :** `O(2*sqrt(N))` where `N` is the input number. This approach allocates memory for an array to
  hold all the divisors. The size of this array could go to be `2*(sqrt(N))`.

> **YouTube Video Link:** [Print all Divisors](https://youtu.be/Ae_Ag_saG9s)

> **GitHub Code Link:**
> [Print all Divisors](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/master/src/main/java/com/striver/dsa/step1_basic/basic/optimal/AllDivisor_Example.java)

**Java Code:**

```java
public class AllDivisor_Example {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("All divisors are :");
        ArrayList<Integer> divisors = printAllDivisors(12);
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
        System.out.println();
        System.out.println("Total time taken : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static ArrayList<Integer> printAllDivisors(int number) {
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        for (int i = 1; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
            if (i != number % i) {
                divisors.add(number / i);
            }
        }
        Collections.sort(divisors);
        return divisors;
    }
}
```

**Input:**

```
 N: 12
```

**Output:**

```
 All divisors are :
 1 2 3 4 6 12 
 Total time taken : 11ms
```

---

### Problem 7: Check for Prime

#### Problem Statement

> **Description:**  
> Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and
> itself and the total number of divisors is 2.

#### Solution Approaches

#### 1. Brute Force Solution

- **Approach:** We can iterate through numbers from 1 to n, counting how many of these numbers divide n without a
  remainder. If exactly two numbers do, so n is prime otherwise it is not prime.

- **Steps to Solve:**
    - Step 1: `Initialise a variable cnt to count the number of factors and set it to 0.`
    - Step 2: `Start a loop from 1 to n, iterating through each number i. Inside the loop:`

      `A` Check if n is divisible by i without any remainder.

      `B` If it is, increment the counter variable by 1.

    - Step 3: `After the loop if the number of divisors is equal to 2, return true indicating the number is prime.`

      `A` If the number of divisors is not equal to 2 (but greater), return false indicating that the number is not
      prime.

- **Time Complexity:** `O(N)` where `N` is the input number. The algorithm iterates through each number from `1` to `n`
  performing constant-time operation for each iteration.

- **Space Complexity :** `O(1)` as the space used by the algorithm does not increase with the size of the input.

> **YouTube Video Link:** [Check for Prime](https://youtu.be/MJcckSfoYdI)

> **GitHub Code Link:**
> [Check for Prime](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/master/src/main/java/com/striver/dsa/step1_basic/basic/bruteforce/PrimeNumber_Example.java)

**Java Code:**

```java
public class PrimeNumber_Example {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Is number prime :" + isNumberPrime(11));
        System.out.println("Total time taken : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static boolean isNumberPrime(long number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
```

**Input:**

```
 N: 11
```

**Output:**

```
Is number prime :true
Total time taken : 16ms
```

---

#### 2. Better Solution

Go to the Optimal Solution

> **YouTube Video Link:** [Check for Prime](https://youtu.be/MJcckSfoYdI)

> **GitHub Code Link:**
> [Check for Prime](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/master/src/main/java/com/striver/dsa/step1_basic/basic/optimal/PrimeNumber_Example.java)

---

#### 3. Optimal Solution

- **Approach:** We can optimise the algorithm by only iterating up to the square root of n when checking for factors.
  This is because if n has a factor greater than its square root, it must also have a factor smaller than its square
  root.

  This property is symmetric about the square root of n by traversing just the first half we can avoid redundant
  iteration and computations improving the efficiency of the algorithm. Discusses in detail here:Print All Divisiors.

- **Steps to Solve:**
    - Step 1: `Initialise a counter variable cnt to count the number of factors to 0.`
    - Step 2:
      `Begin a loop from 1 to the square root of n. This loop iterates through possible factors of n. For each value of i within the loop:`

      `A` Check if n is divisible by i without any remainder.

      `B` If n is divisible by i, it means i is a factor of n, so increment the counter variable cnt by 1.

      `C` Check if the reciprocal factor of i ie. n/i is not equal to i. If they are not equal, it means there is a
      distinct factor so increment cnt by 1 again.
    - Step 3: `After the loop, cnt will contain the total numbers of factors of n.`

    - Step 4:
      `Check if the value of cnt is exactly 2, it means that n has exactly two distinct factors (1 and itself), indicating that it is a prime number.`

      `A` If the number of factors is greater than 2 then it is a composite number, return false.

- **Time Complexity:** `O(sqrt(N))` where `N` is the input number. The loop iterates up to the square root of `n`
  performing constant time operations at each step.

- **Space Complexity :** `O(1)` as the space complexity remains constant and independent of the input size. Only a fixed
  amount of memory is required to store the integer variables.

> **YouTube Video Link:** [Check for Prime](https://youtu.be/MJcckSfoYdI)

> **GitHub Code Link:**
> [Check for Prime](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/master/src/main/java/com/striver/dsa/step1_basic/basic/optimal/PrimeNumber_Example.java)

**Java Code:**

```java
public class PrimeNumber_Example {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Is number prime :" + isNumberPrime(11));
        System.out.println("Total time taken : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static boolean isNumberPrime(long number) {
        int count = 0;
        for (int i = 1; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
                if (i != number / i) {
                    count++;
                }
            }
        }
        return count == 2;
    }
}
```

**Input:**

```
 N: 11
```

**Output:**

```
Is number prime :true
Total time taken : 9ms
```

---

## Array Problems

### Problem 1: Find Maximum Sub array Sum

... (Problem content)

### Problem 2: Merge Sorted Arrays

... (Problem content)

---
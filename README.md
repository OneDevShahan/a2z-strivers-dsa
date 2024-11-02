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

4. **Code**  
   Solution code snippets for each approach.

5. **Output**  
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

> **GitHub Code Link:
** [Count Number Of Digits](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/step-1/src/main/java/com/striver/dsa/step1/basic/bruteforce/CountNumberOfDigit.java)

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

> **GitHub Code Link:
** [Count Number Of Digits](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/step-1/src/main/java/com/striver/dsa/step1/basic/optimal/CountNumberOfDigit.java)

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

> **GitHub Code Link:
** [Count Number Of Digits](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/step-1/src/main/java/com/striver/dsa/step1/basic/optimal/CountNumberOfDigit.java)

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

> **GitHub Code Link:
** [Reverse a Number](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/step-1/src/main/java/com/striver/dsa/step1/basic/optimal/ReverseNumber.java)

---

#### 2. Better Solution

Go to the Optimal solution.

> **YouTube Video Link:** [Reverse a Number](https://youtu.be/1xNbjMdbjug)

> **GitHub Code Link:
** [Reverse a Number](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/step-1/src/main/java/com/striver/dsa/step1/basic/optimal/ReverseNumber.java)

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

> **GitHub Code Link:
** [Reverse a Number](https://github.com/OneDevShahan/a2z-strivers-dsa/blob/step-1/src/main/java/com/striver/dsa/step1/basic/optimal/ReverseNumber.java)

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

## Array Problems

### Problem 1: Find Maximum Sub array Sum

... (Problem content)

### Problem 2: Merge Sorted Arrays

... (Problem content)

---
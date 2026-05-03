# Chapter 2 – Control Flow Practice Problems

## Problem 1 – Multiplication Table
**Statement**: Given an integer `n (1 ≤ n ≤ 20)`, print the multiplication table of `n` from `1×n` to `10×n`.
**Input**: Single integer `n`.
**Output**: Ten lines, each line in the format `i * n = result`.

### Solution (`MultiplicationTable.java`)
```java
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // read n
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + n + " = " + (i * n));
        }
        sc.close();
    }
}
```
---
## Problem 2 – Prime Checker
**Statement**: Determine whether a given integer `p` (> 1) is a prime number.
**Input**: One integer `p`.
**Output**: `Prime` if `p` is prime, otherwise `Not Prime`.

### Solution (`PrimeChecker.java`)
```java
import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(); // read p
        if (p <= 1) {
            System.out.println("Not Prime");
            sc.close();
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i * i <= p; i++) {
            if (p % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
        sc.close();
    }
}
```
---
## Problem 3 – Reverse Digits
**Statement**: Read an integer (may be negative) and output its digits in reverse order, preserving the sign.
**Input**: One integer `x`.
**Output**: The reversed integer (e.g., `-123` → `-321`).

### Solution (`ReverseDigits.java`)
```java
import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // read x
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);
        int reversed = 0;
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        System.out.println(sign * reversed);
        sc.close();
    }
}
```
---
### How to Test
1. Save each snippet in a file with the exact class name (`MultiplicationTable.java`, `PrimeChecker.java`, `ReverseDigits.java`).
2. Compile: `javac <FileName>.java`
3. Run: `java <ClassName>` and provide the required input.
4. Verify the console output matches the expected format shown above.

Feel free to experiment with additional test cases or modify the code to explore other control‑flow constructs!
# Chapter 2 – Additional Solutions (Control Flow)

Here are the Java solutions for the additional practice problems.

---

## Solution 4: Fibonacci Series (`Fibonacci.java`)
```java
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int first = 0, second = 1;
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            
            // Calculate next term
            int next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }
}
```
**Logic**: We maintain two variables `first` and `second`. In each step, we print `first`, then update them so `first` becomes `second` and `second` becomes their sum.

---

## Solution 5: Leap Year Checker (`LeapYear.java`)
```java
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }
}
```
**Logic**: A leap year is divisible by 4. However, if it's a century year (divisible by 100), it must also be divisible by 400.

---

## Solution 6: Palindrome Number (`Palindrome.java`)
```java
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int reversed = 0;
        
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        
        if (original == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
```
**Logic**: We reverse the number using a `while` loop (same logic as Problem 3) and then compare the `reversed` value with the `original` value.

---

## Solution 7: Sum of Digits (`SumDigits.java`)
```java
import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        
        while (n > 0) {
            sum += (n % 10); // Add the last digit
            n /= 10;         // Remove the last digit
        }
        
        System.out.println(sum);
        sc.close();
    }
}
```
**Logic**: We use `% 10` to get the last digit and `/ 10` to discard it, accumulating the sum in each iteration.

---

## Solution 8: Star Pattern (`StarPattern.java`)
```java
import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        
        // Outer loop for rows
        for (int i = 1; i <= h; i++) {
            // Inner loop for stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // New line after each row
            System.out.println();
        }
        sc.close();
    }
}
```
**Logic**: The outer loop controls the number of rows (`i`). The inner loop prints stars (`j`) from 1 up to the current row number `i`.

---

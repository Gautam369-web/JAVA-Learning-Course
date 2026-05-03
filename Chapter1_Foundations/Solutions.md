# Chapter 1 – Practice Problem Solutions

## Problem 1 – Sum of Two Numbers
```java
import java.util.Scanner;

public class SumTwo {
    public static void main(String[] args) {
        // Scanner is used to take input from the user (like a microphone listening to the keyboard)
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        sc.close();
    }
}
```
**Explanation**
- Reads two integers using `Scanner.nextInt()`.
- Prints their sum directly.
- Closes the scanner to free the underlying `System.in` stream.

---

## Problem 2 – Even or Odd
```java
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Scanner is used to take input from the user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }
}
```
**Explanation**
- `%` is the remainder operator. If `n % 2` equals `0`, the number is even.

---

## Problem 3 – Temperature Converter (Celsius → Fahrenheit)
```java
import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        // Scanner is used to take input (decimal values) from the user
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = c * 9.0 / 5.0 + 32.0;
        // Print with up to two decimal places
        System.out.printf("%.2f\n", f);
        sc.close();
    }
}
```
**Explanation**
- Uses the formula `F = C * 9/5 + 32`.
- `System.out.printf` formats the output to two decimal places (you can adjust the format as needed).

---

## How to Test Each Solution
1. Create a file with the exact class name (`SumTwo.java`, `EvenOdd.java`, `CtoF.java`).
2. Compile: `javac <FileName>.java`
3. Run: `java <ClassName>` and provide input as described in the problem statements.
4. Verify the output matches the expected result.

Feel free to modify the code, experiment with additional test cases, or ask for deeper explanations on any concept.

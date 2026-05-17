# 🟣 Self-Test Questions — Chapter 1: Java Foundations

> **Rules for Maximum Benefit:**
> 1. Do NOT look at your notes first. Try each question from memory.
> 2. Write your answers down (even rough notes) before checking.
> 3. For code questions — actually **type** the code in your IDE.
> 4. Struggling is normal. It means you're learning.

---

## 🟢 BASIC Level (Recall & Recognition)

**Q1.** What does JVM stand for? What is its main job?

**Q2.** What is the exact command to compile a Java file named `Calculator.java`?

**Q3.** What is wrong with this code?
```java
public class MyProgram {
    public static void main(String[] args) {
        System.out.println("Hello")
    }
}
```

**Q4.** Fill in the blank: The filename must match the ________ name.

**Q5.** Which data type would you use to store:
- (a) A person's age (whole number)
- (b) A product's price (e.g., ₹99.99)
- (c) Whether a student passed or failed
- (d) A person's full name

**Q6.** What is the output of this code?
```java
System.out.println(10 / 3);
System.out.println(10 % 3);
System.out.println(10.0 / 3);
```

**Q7.** What is the difference between `System.out.println()` and `System.out.print()`?

**Q8.** What import statement do you need to use `Scanner`?

---

## 🟡 INTERMEDIATE Level (Application & Understanding)

**Q9.** Write a complete Java program that:
- Asks the user to enter two numbers
- Prints their sum, difference, product, and remainder

**Q10.** Explain in simple terms why this code prints `3` and not `3.5`:
```java
int result = 7 / 2;
System.out.println(result);
```
How would you fix it to print `3.5`?

**Q11.** What is the output of this program? Trace through it step by step:
```java
int x = 5;
int y = x + 3;
x = x * 2;
System.out.println("x = " + x);
System.out.println("y = " + y);
System.out.println("x + y = " + (x + y));
```

**Q12.** A student wrote this code to read a name after reading an age. The name always comes out blank. What is the bug and how do you fix it?
```java
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
String name = sc.nextLine();
System.out.println("Name: " + name);
```

**Q13.** What is the difference between `final int MAX = 100;` and `int max = 100;`? When would you use `final`?

**Q14.** True or False (explain why):
- (a) `'A'` and `"A"` are the same thing in Java.
- (b) You can store a `double` value in an `int` variable without any issue.
- (c) The `main` method can be named anything as long as it's inside a class.

---

## 🔴 ADVANCED Level (Analysis & Critical Thinking)

**Q15.** Predict the output of each line. Explain the reasoning:
```java
System.out.println(5 + 3 + "Java");  // Output: ?
System.out.println("Java" + 5 + 3);  // Output: ?
System.out.println("Java" + (5 + 3));// Output: ?
```
*(Hint: Think about how Java evaluates left-to-right)*

**Q16.** Write a program that:
- Reads a temperature in Celsius from the user
- Converts it to Fahrenheit using the formula: `F = (C × 9/5) + 32`
- Prints the result formatted to 2 decimal places using `printf`

**Q17.** Examine this code and answer:
```java
int a = 100;
int b = 200;
a = b;
b = a;
System.out.println("a = " + a + ", b = " + b);
```
- (a) What does it print?
- (b) The programmer wanted to **swap** a and b (make a=200, b=100). Did they succeed?
- (c) How would you correctly swap two variables?

**Q18.** Write a program that checks if a year entered by the user is a leap year.
- A leap year is divisible by 4
- EXCEPT: centuries (divisible by 100) are NOT leap years
- UNLESS: they are also divisible by 400
- Test with: 2000 (leap), 1900 (not leap), 2024 (leap), 2023 (not leap)

**Q19.** [Design Thinking] If Java's "Write Once, Run Anywhere" didn't exist and instead Java compiled directly to machine code like C/C++, what problems would developers face? List at least 3 consequences.

**Q20.** [Bug Hunt] This program should calculate the area of a circle (A = π × r²). Find ALL bugs:
```java
import java.util.Scanner

public class CircleArea
    public static void main(String[] args) {
        Scanner sc = Scanner(System.in);
        System.out.print("Enter radius: ")
        int radius = sc.nextInt();
        double area = 3.14159 * radius * radius;
        System.out.println("Area = " + area)
    }
}
```
*(There are at least 5 bugs. Find them all.)*

---

## 📊 Scoring Guide

| Score | What It Means |
|-------|--------------|
| Q1–Q8 ✅ | You've got the basics down |
| Q9–Q14 ✅ | You can apply the concepts |
| Q15–Q20 ✅ | You think like a programmer |
| All 20 ✅ | Ready to move to Chapter 2! |

---

## 💡 Answer Key Hints (Check Only After Trying!)

<details>
<summary>Click to reveal hints (not full answers)</summary>

- **Q3 Hint:** Look at the end of the `println` line.
- **Q6 Hint:** Integer division drops the decimal. Modulus gives the remainder.
- **Q11 Hint:** Trace the value of `x` after each assignment. `y` doesn't change when `x` changes later.
- **Q15 Hint:** When Java sees `+` with a String, it concatenates. Left to right!
- **Q17 Hint:** When you do `a = b`, what happens to the old value of `a`?
- **Q20 Hint:** Check: missing `;`, missing `new`, missing class `{`, missing `}`.

</details>

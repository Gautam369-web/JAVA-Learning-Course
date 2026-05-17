# 🟡 Pareto 80/20 — Chapter 1: Java Foundations

> **The Pareto Principle:** 20% of the concepts in this chapter will be used in 80% of your Java programs, forever. Focus on these first.

---

## ⭐ The Critical 20% — Master These First

### 1. 🏛️ The Class Structure (Used in 100% of Java programs)

Every Java program lives inside a **class**. This is the single most important structural fact in Java.

```java
public class MyProgram {           // ← 1. Class declaration
    public static void main(String[] args) {  // ← 2. Entry point
        // Your code goes here    // ← 3. Your logic
    }
}
```

**Why it's critical:** You cannot write a single line of Java without a class. This structure is in every program you will ever write.

**Remember just 3 things:**
- Class name = File name (always!)
- `main` method = where Java starts
- Everything is inside `{ }`

---

### 2. 📦 Primitive Data Types (The Building Blocks)

You only need to know **4 types** for 95% of beginner programs:

| Type | Stores | Example |
|------|--------|---------|
| `int` | Whole numbers | `int age = 16;` |
| `double` | Decimal numbers | `double gpa = 8.5;` |
| `boolean` | true/false | `boolean passed = true;` |
| `String` | Text (not primitive, but essential) | `String name = "Gautam";` |

> The other types (`byte`, `short`, `long`, `float`, `char`) exist but are rarely your first choice.

---

### 3. 🖨️ System.out.println() — The Voice of Java

This single line is the most written line in beginner Java:

```java
System.out.println("Hello!");        // Prints and moves to next line
System.out.print("No new line");     // Prints without moving to next line
System.out.printf("Score: %d", 95);  // Formatted print
```

**Why it's critical:** It's how you see what your program is doing. Every debug session starts here.

---

### 4. 🎤 Scanner — Getting User Input

```java
import java.util.Scanner;             // Step 1: Import

Scanner sc = new Scanner(System.in); // Step 2: Create
String name = sc.nextLine();         // Step 3: Read text
int age = sc.nextInt();              // Step 3: Read number
sc.close();                          // Step 4: Close
```

**Why it's critical:** Interactive programs need input. This is the standard way to get it.

---

### 5. ➕ Arithmetic Operators

```java
int a = 10, b = 3;
System.out.println(a + b);   // 13  (Addition)
System.out.println(a - b);   // 7   (Subtraction)
System.out.println(a * b);   // 30  (Multiplication)
System.out.println(a / b);   // 3   (Division — integer division drops decimal!)
System.out.println(a % b);   // 1   (Modulus — the REMAINDER — very important!)
```

**The hidden star:** `%` (modulus) is used everywhere for:
- Checking even/odd: `n % 2 == 0`
- Cycling through values: `index % array.length`
- Extracting digits: `n % 10`

---

## 📉 The Other 80% — Understand Later

These exist in Chapter 1 but are less urgent:

| Concept | Why It's Lower Priority |
|---------|------------------------|
| `byte`, `short`, `long`, `float` | `int` and `double` cover most cases |
| Bitwise operators (`&`, `\|`, `^`, `~`) | Rare in everyday code |
| Javadoc comments (`/** */`) | Important for teams, not day 1 |
| Type casting | Needed when mixing types, but not immediately |
| `final` keyword | Good habit, not mandatory to start |
| Multi-line comments | Useful for documentation, not logic |

---

## 🎯 Your Chapter 1 Focus Checklist

- [ ] I can write a class with a `main` method from memory
- [ ] I know the 4 main data types: `int`, `double`, `boolean`, `String`
- [ ] I can print output using `System.out.println()`
- [ ] I can read input using `Scanner`
- [ ] I understand what `%` (modulus) does
- [ ] I know: file name **must** match class name

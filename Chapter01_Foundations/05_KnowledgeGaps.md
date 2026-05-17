# 🟠 Knowledge Gaps — Chapter 1: Java Foundations

> **Purpose:** This file identifies the most common places where beginners *think* they understand but secretly don't. Read this after your first pass through the Notes.

---

## Gap 1: "Why can't I just call it `MyCode.java` if the class is `HelloWorld`?"

### ❌ The Misconception
Many beginners think the filename is just a label, like naming a Word document. "I'll call it whatever I want!"

### ✅ The Reality
Java's compiler is strict: **the public class name must exactly match the filename** (including capitalization).

```java
// File: Calculator.java
public class Calculator {   // ✅ Matches filename
    ...
}

// File: calc.java
public class Calculator {   // ❌ COMPILE ERROR!
    ...
}
```

### 🔧 Fix
Always name your file the same as your class. If your class is `BankAccount`, your file is `BankAccount.java`.

---

## Gap 2: "What does `public static void main(String[] args)` actually mean?"

### ❌ The Misconception
"It's just a magic line I have to type. I don't need to understand it."

### ✅ The Reality — Word by Word

| Word | What It Means (Simply) |
|------|----------------------|
| `public` | Anyone can access this method |
| `static` | Belongs to the class, not an object — so Java can call it without creating an object first |
| `void` | This method does NOT return a value |
| `main` | This is THE special name Java looks for to start the program |
| `String[] args` | A list of text values you can pass when running the program from terminal (usually ignored as a beginner) |

**Short version:** This exact line tells Java: *"Start the program here."*

---

## Gap 3: Integer Division — The Sneaky Bug

### ❌ The Misconception
```java
int result = 7 / 2;
System.out.println(result); // Beginner expects: 3.5
```

### ✅ The Reality
```
Output: 3   ← Not 3.5! The decimal is chopped off silently!
```

### 🔧 Fix
If you want decimals, at least ONE number must be a `double`:
```java
double result1 = 7.0 / 2;    // → 3.5 ✅
double result2 = (double)7 / 2; // → 3.5 ✅
double result3 = 7 / 2;      // → 3.0 ❌ (both are int, then cast)
```

**Remember:** `int / int` always gives `int` in Java. The decimal is thrown away, not rounded.

---

## Gap 4: String vs. `char` — The Quote Confusion

### ❌ The Misconception
"Single quotes and double quotes are basically the same thing."

### ✅ The Reality
```java
char letter = 'A';      // ✅ Single quotes = ONE character
String word = "Hello";  // ✅ Double quotes = text (zero or more chars)

char wrong = "A";       // ❌ COMPILE ERROR — "A" is a String, not char
String also_wrong = 'H';// ❌ COMPILE ERROR — 'H' is a char, not String
```

---

## Gap 5: `println` vs `print` — The Cursor Position

### ❌ The Misconception
"They're the same, just different names."

### ✅ The Reality
```java
System.out.println("Line 1"); // Prints "Line 1" then moves cursor to NEXT line
System.out.println("Line 2"); // Prints "Line 2" on a new line
//Output: Line 1
          Line 2

System.out.print("A");        // Prints "A" — cursor stays right after A
System.out.print("B");        // Prints "B" — same line!
// Output: AB
```

---

## Gap 6: Scanner — The `nextLine()` After `nextInt()` Trap

### ❌ The Misconception
```java
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();         // User types: 16 [Enter]
String name = sc.nextLine();    // Beginner expects to get a name here
System.out.println(name);       // But it prints NOTHING!
```

### ✅ The Reality
`nextInt()` reads `16` but **leaves the Enter key `\n` in the buffer**. When `nextLine()` runs, it immediately reads that leftover `\n` and returns an empty string.

### 🔧 Fix
Add an extra `sc.nextLine()` to flush the buffer:
```java
int age = sc.nextInt();
sc.nextLine();           // ← Flush the leftover newline!
String name = sc.nextLine(); // Now this works correctly
```

---

## 🔍 Common Errors Quick Reference

| Error Message | What It Means | How to Fix |
|---------------|--------------|-----------|
| `error: class X is public, should be declared in a file named X.java` | Filename ≠ class name | Rename the file |
| `error: ';' expected` | Missing semicolon | Add `;` at end of that line |
| `error: cannot find symbol` | Typo in variable/method name | Check spelling |
| `error: reached end of file while parsing` | Missing `}` | Count your `{` and `}` — they must be equal |
| `Exception in thread "main" java.util.NoSuchElementException` | Scanner has no more input | Check you're reading the right type |

---

## 📚 Suggested Resources to Fill These Gaps

| Gap | Best Resource |
|-----|--------------|
| Java basics & setup | [W3Schools Java Tutorial](https://www.w3schools.com/java/java_intro.asp) |
| Understanding JVM | [Baeldung: JVM Architecture](https://www.baeldung.com/jvm-vs-jre-vs-jdk) |
| Scanner gotchas | [GeeksForGeeks Scanner class](https://www.geeksforgeeks.org/scanner-class-in-java/) |
| Integer division | [Oracle Java tutorial: Operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html) |
| Hands-on practice | [HackerRank Java Intro](https://www.hackerrank.com/domains/java) |

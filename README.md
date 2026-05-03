# Java Teaching Plan

## Overview
This document outlines a **step‑by‑step learning roadmap** for mastering Java from the very basics to advanced concepts. Each chapter focuses on a core area, provides concise explanations, illustrative code snippets, and ends with **practice problems** that include clear problem statements, input and output specifications.

---

## Chapter 1 – Java Foundations
### Goals
- Understand the Java ecosystem and the **JDK/JRE**.
- Write, compile, and run a simple **Hello World** program.
- Grasp fundamental syntax rules.
### Sub‑topics
| Sub‑topic | What you’ll learn |
|---|---|
| **Program Structure** | `class`, `main` method, file naming conventions |
| **Data Types** | Primitive types (`int`, `double`, `char`, `boolean`, etc.) |
| **Variables & Constants** | Declaration, initialization, `final` keyword |
| **Operators** | Arithmetic, relational, logical, assignment, ternary |
| **Input/Output** | `Scanner` for console input, `System.out.println` for output |
| **Comments** | Single‑line `//`, multi‑line `/* … */`, Javadoc `/** … */` |
### Code Snippet
```java
public class HelloWorld {
    /**
     * Entry point of the program.
     */
    public static void main(String[] args) {
        // Print a greeting
        System.out.println("Hello, Java!");
    }
}
```
### Practice Questions
1. **Sum of Two Numbers**
   - **Problem**: Read two integers and print their sum.
   - **Input**: Two space‑separated integers `a b`.
   - **Output**: Single integer `a+b`.
2. **Even or Odd**
   - **Problem**: Determine whether a given integer is even or odd.
   - **Input**: An integer `n`.
   - **Output**: `Even` or `Odd`.
3. **Temperature Converter**
   - **Problem**: Convert Celsius to Fahrenheit.
   - **Input**: A floating‑point number `c` (°C).
   - **Output**: Fahrenheit value computed as `f = c * 9/5 + 32`.
---

## Chapter 2 – Control Flow
### Goals
- Direct program execution using **conditionals** and **loops**.
### Sub‑topics
| Sub‑topic | Description |
|---|---|
| `if‑else` & `switch` | Branching logic |
| `for`, `while`, `do‑while` | Repetition constructs |
| `break` & `continue` | Controlling loop execution |
| Nested structures | Loops inside loops, conditions inside loops |
### Code Snippet (Factorial)
```java
int n = 5;
int fact = 1;
for (int i = 2; i <= n; i++) {
    fact *= i;
}
System.out.println("Factorial: " + fact);
```
### Practice Questions
1. **Print Multiplication Table** – Given `n`, print `1×n` to `10×n`.
2. **Prime Checker** – Determine if a number is prime.
3. **Reverse Digits** – Read an integer and output its digits in reverse order.
---

## Chapter 3 – Object‑Oriented Programming (OOP)
### Goals
- Model real‑world entities using **classes** and **objects**.
- Master **encapsulation**, **inheritance**, **polymorphism**, and **abstraction**.
### Sub‑topics
| Sub‑topic | Key Points |
|---|---|
| **Classes & Objects** | Fields, methods, constructors |
| **Access Modifiers** | `public`, `private`, `protected`, default |
| **`this` Keyword** | Referring to current object |
| **Static Members** | Class‑level fields/methods |
| **Inheritance** | `extends`, `super`, method overriding |
| **Abstract Classes** | Declaring abstract methods |
| **Interfaces** | Multiple inheritance of type, default methods |
| **Polymorphism** | Upcasting, dynamic method dispatch |
### Code Snippet (Inheritance)
```java
class Animal {
    void speak() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Woof!");
    }
}

public class Demo {
    public static void main(String[] args) {
        Animal a = new Dog(); // Polymorphic reference
        a.speak(); // Calls Dog's speak()
    }
}
```
### Practice Questions
1. **Bank Account Simulator** – Implement a `BankAccount` class with deposit, withdraw, and balance inquiry methods, handling insufficient‑funds via custom exceptions.
2. **Shape Area Calculator** – Create an abstract `Shape` class and concrete subclasses `Circle`, `Rectangle`, `Triangle`. Compute area based on user‑provided dimensions.
3. **Employee Hierarchy** – Model `Employee`, `Manager`, `Developer` with salary calculation rules.
---

## Chapter 4 – Collections Framework
### Goals
- Work with dynamic data structures: **List**, **Set**, **Map**, and their common implementations.
### Sub‑topics
| Collection | Typical Implementation |
|---|---|
| `List` | `ArrayList`, `LinkedList` |
| `Set` | `HashSet`, `TreeSet` |
| `Map` | `HashMap`, `TreeMap` |
| **Iterators** | `Iterator`, enhanced `for` loop |
| **Generics** | Type‑safe collections |
### Code Snippet (Map Frequency)
```java
Map<String, Integer> freq = new HashMap<>();
Scanner sc = new Scanner(System.in);
String line = sc.nextLine();
for (String w : line.split("\\s+")) {
    freq.put(w, freq.getOrDefault(w, 0) + 1);
}
System.out.println(freq);
```
### Practice Questions
1. **Duplicate Remover** – Read `n` integers and output them without duplicates, preserving order.
2. **Word Counter** – Count occurrences of each word in a paragraph.
3. **LRU Cache** – Implement a simple least‑recently‑used cache using `LinkedHashMap`.
---

## Chapter 5 – Exception Handling
### Goals
- Write robust programs that gracefully handle error conditions.
### Sub‑topics
| Sub‑topic | Description |
|---|---|
| `try‑catch‑finally` | Structure for handling exceptions |
| Checked vs Unchecked | `Exception` vs `RuntimeException` |
| Custom Exceptions | Extending `Exception` or `RuntimeException` |
| Propagation | `throws` clause |
| Multi‑catch & Resources | `catch (A | B e)` and try‑with‑resources |
### Code Snippet (Custom Exception)
```java
class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) { super(msg); }
}

public static int validateAge(int age) throws InvalidAgeException {
    if (age < 0 || age > 150) throw new InvalidAgeException("Age out of range");
    return age;
}
```
### Practice Questions
1. **Currency Exchange validator** – (Same as the assignment you already have) implement validation with custom exceptions.
2. **Division Safe** – Read two integers and output the quotient; handle division by zero using `ArithmeticException`.
3. **File Reader** – Prompt for a filename, read its contents, handle `FileNotFoundException` and `IOException`.
---

## Chapter 6 – Streams, Lambdas & Functional Interfaces
### Goals
- Utilize **Java 8+** functional programming constructs.
### Sub‑topics
| Topic | Highlights |
|---|---|
| **Functional Interface** | `@FunctionalInterface`, custom interfaces |
| **Lambda Expressions** | Syntax, captures, scope |
| **Stream API** | `filter`, `map`, `reduce`, `collect` |
| **Method References** | `Class::method`, `instance::method` |
| **Optional** | Null‑safe handling |
### Code Snippet (Square Numbers with Stream)
```java
int[] arr = {1,2,3,4,5};
int[] squares = Arrays.stream(arr)
                     .map(x -> x * x)
                     .toArray();
System.out.println(Arrays.toString(squares));
```
### Practice Questions
1. **Prime Filter** – Given a list of integers, output only the primes using streams.
2. **Word Length Sort** – Sort words by length descending leveraging method references.
3. **Salary Bonus** – Apply a 10% bonus to salaries stored in a `List<Double>` using `map`.
---

## Chapter 7 – File I/O & Serialization
### Goals
- Read from and write to files, work with **binary data**, and serialize objects.
### Sub‑topics
| Sub‑topic | Details |
|---|---|
| `FileReader` / `BufferedReader` | Text input |
| `FileWriter` / `BufferedWriter` | Text output |
| `ObjectOutputStream` / `ObjectInputStream` | Object serialization |
| NIO (`Path`, `Files`) | Modern I/O utilities |
| Exception handling for I/O |
### Code Snippet (Read Lines)
```java
Path path = Paths.get("input.txt");
try (Stream<String> lines = Files.lines(path)) {
    lines.forEach(System.out::println);
} catch (IOException e) {
    e.printStackTrace();
}
```
### Practice Questions
1. **CSV Parser** – Read a CSV file of student marks and compute average per student.
2. **Binary File Copy** – Copy a binary file (e.g., an image) using `FileInputStream`/`FileOutputStream`.
3. **Object Persistence** – Serialize a list of `Employee` objects to disk and retrieve them.
---

## Chapter 8 – Concurrency Basics
### Goals
- Write multi‑threaded programs safely.
### Sub‑topics
| Concept | Explanation |
|---|---|
| `Thread` class & `Runnable` interface |
| `ExecutorService` & thread pools |
| Synchronization (`synchronized`, `Lock`) |
| Volatile variables |
| Concurrency utilities (`CountDownLatch`, `Semaphore`) |
### Code Snippet (Simple Thread)
```java
class Counter implements Runnable {
    private int count = 0;
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Counter(), "T1");
        Thread t2 = new Thread(new Counter(), "T2");
        t1.start();
        t2.start();
    }
}
```
### Practice Questions
1. **Producer‑Consumer** – Implement using a blocking queue.
2. **Parallel Sum** – Compute sum of an array using multiple threads.
3. **Deadlock Demo** – Write two threads that cause a deadlock, then fix it with proper ordering.
---

## Chapter 9 – Advanced Topics (Optional)
- **Generics Deep Dive** – Wildcards, bounded types.
- **Reflection API** – Inspect classes at runtime.
- **Annotations & Annotation Processing**.
- **JVM Internals** – Memory model, GC basics.
- **Building & Packaging** – `javac`, `jar`, Maven/Gradle basics.

---

## How to Use This Plan
1. **Read each chapter** – Focus on the explanations and code snippets.
2. **Code along** – Type the examples in your IDE (`/mnt/Volume/leo/sem4/cse310Java/...`).
3. **Solve the practice problems** – They reinforce concepts and mimic typical interview/assignment questions.
4. **Review & Iterate** – After completing a chapter, revisit any sub‑topic that felt unclear.

Happy coding! 🚀

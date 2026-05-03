# Chapter 7 – Generics & Functional Programming

As your Java skills grow, you want your code to be more **flexible** and **concise**. **Generics** allow you to write code that works with any data type, and **Functional Programming** (Lambdas & Streams) allows you to write powerful logic in just one or two lines.

---

## Goals of Chapter 7
- **Write Type-Safe Code**: Use Generics to avoid casting and runtime errors.
- **Master Lambda Expressions**: Learn the shortcut syntax for implementing interfaces.
- **Explore Functional Interfaces**: Understand built-in tools like `Predicate` and `Consumer`.
- **Harness the Streams API**: Learn to process collections of data like an assembly line.

## Sub-topics
| Section | Topic | Description |
| :--- | :--- | :--- |
| **7.1** | **Introduction to Generics** | The "Universal Remote" of Java |
| **7.2** | **Generic Classes** | Creating containers for any type |
| **7.3** | **Lambda Expressions** | Short, "anonymous" functions |
| **7.4** | **Functional Interfaces** | The background of Lambdas |
| **7.5** | **The Streams API** | The data "Assembly Line" |

---

## 7.1 Introduction to Generics: The "Universal Remote"

### 📺 Real-Life Analogy
Imagine you have a different remote for every device in your house (TV, AC, Fan). It's confusing! 
A **Universal Remote** is designed to work with *any* device. You just tell it which one you're using.
**Generics** are like a Universal Remote—you write the code once, and it can handle `Strings`, `Integers`, or any custom object.

### 💡 Human Understanding
Generics (using `<T>`) allow you to specify the data type *at the time of use*, not when you write the code. This prevents "Type Mismatch" errors.

---

## 7.2 Generic Classes: The "Labelled Box"

### 📦 Real-Life Analogy
Think of a **Storage Box**. 
- Without a label, you can put anything in it, but you might forget what's inside and try to pull out a "Hammer" when you expected "Glass". This leads to crashes!
- A **Generic Box** has a label like `Box<Glass>`. Java now *guarantees* that you only put glass in it.

### 💻 Code Implementation
```java
// T is a placeholder for any Type
class Box<T> {
    private T content;

    public void set(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }
}

public class Main {
    public static void main(String[] args) {
        // We decide the type here: <String>
        Box<String> nameBox = new Box<>();
        nameBox.set("Java");
        System.out.println("Box contains: " + nameBox.get());

        // We can reuse the same class for <Integer>
        Box<Integer> numberBox = new Box<>();
        numberBox.set(100);
        System.out.println("Box contains: " + numberBox.get());
    }
}
```

---

## 7.3 Lambda Expressions: The "Shortcut"

### 🏎️ Real-Life Analogy
Imagine you are giving someone directions to the grocery store.
- **Old Way**: "Open the door, walk 50 steps, turn left, wait for the light, cross the street..."
- **Lambda Way**: "Go to the store."
Lambdas are a way to write a block of code (a function) without creating a whole class or a whole method name.

### 💡 Human Understanding
Lambdas use the `(parameters) -> expression` syntax. They are primarily used with **Functional Interfaces** (interfaces with only one method).

### 💻 Code Implementation
```java
interface Greeting {
    void sayHello(String name);
}

public class Main {
    public static void main(String[] args) {
        // The old way (Anonymous Class)
        Greeting oldWay = new Greeting() {
            public void sayHello(String name) {
                System.out.println("Hello, " + name);
            }
        };

        // The Lambda way (Shortcut)
        Greeting lambdaWay = (name) -> System.out.println("Hi, " + name);

        lambdaWay.sayHello("Gautam");
    }
}
```

---

## 7.4 Functional Interfaces: The Foundation

### 🛠️ Real-Life Analogy
Think of a **Standardized Tool Socket**. If the socket has exactly one shape (one method), you can plug in any tool (any lambda) that fits that shape.
Java provides several built-in sockets:
- **Predicate**: A filter (e.g., "Is this number even?").
- **Consumer**: A receiver (e.g., "Print this string").
- **Function**: A transformer (e.g., "Convert this string to uppercase").

### 💻 Code Implementation (Predicate)
```java
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // A predicate that checks if a number is greater than 10
        Predicate<Integer> isLarge = (n) -> n > 10;

        System.out.println("Is 5 large? " + isLarge.test(5));
        System.out.println("Is 15 large? " + isLarge.test(15));
    }
}
```

---

## 7.5 The Streams API: The "Assembly Line"

### 🏭 Real-Life Analogy
Imagine a **Factory Assembly Line**.
1. **Source**: Raw materials come in (A List of numbers).
2. **Intermediate Steps**: 
   - Filter out the broken pieces (`filter`).
   - Paint each piece red (`map`).
3. **Terminal Step**: Put the finished pieces into a box (`collect` or `forEach`).
The **Streams API** lets you process data in a pipeline like this.

### 💡 Human Understanding
Streams don't change the original data; they create a new "flow" of data that you can filter and transform easily.

### 💻 Code Implementation
```java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        // The Magic Pipeline:
        List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("A")) // Step 1: Keep only 'A' names
            .map(String::toUpperCase)             // Step 2: Make them Uppercase
            .collect(Collectors.toList());        // Step 3: Put them back into a List

        System.out.println("Result: " + filteredNames);
    }
}
```

---

## 7.6 Practice Questions (Chapter 7)

*Ready to modernize your code? Check the Practice_Questions.md file for 8 challenges on Generics, Lambdas, and Streams!*

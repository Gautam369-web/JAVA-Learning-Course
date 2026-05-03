# Chapter 1 – Java Foundations

## 1.1 What is Java?
- A **high‑level**, **object‑oriented** programming language.
- Write once, run anywhere (thanks to the **JVM** – Java Virtual Machine).
- Two main components:
  - **JDK** (Java Development Kit) – compilers, tools, libraries.
  - **JRE** (Java Runtime Environment) – runs compiled `.class` files.

## 1.2 Your First Program – `HelloWorld.java`
```java
public class HelloWorld {
    public static void main(String[] args) {
        // This is your first line of code!
        // System.out represents the standard output stream (the screen)
        // println is a method that prints text and moves to a new line
        System.out.println("Hello, World! I am learning Java.");
    }
}
```
**Explanation**
- `public class HelloWorld` – defines a class named **HelloWorld**. The file name must match the class name (`HelloWorld.java`).
- `public static void main(String[] args)` – the **entry point** of every Java application. The JVM looks for this exact signature to start execution.
- `System.out.println(...)` – prints a line to the console.

## 1.3 How to Compile & Run
Open a terminal inside the `Basics` folder and execute:
```bash
# Compile (creates HelloWorld.class)
javac HelloWorld.java
# Run the program
java HelloWorld
```
You should see:
```
Hello, World! I am learning Java.
```
If you get `javac: command not found`, ensure the JDK is installed and `JAVA_HOME` is added to your `PATH`.


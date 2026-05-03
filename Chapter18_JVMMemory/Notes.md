# Chapter 18 - JVM, Memory, and Garbage Collection

Good Java developers know more than syntax. They understand what happens when code runs.

---

## Goals of Chapter 18
- Understand the JVM execution model.
- Learn stack and heap memory.
- Understand garbage collection.
- Recognize common memory problems.

## Sub-topics
| Section | Topic | Description |
| :--- | :--- | :--- |
| **18.1** | **JVM Flow** | Source code to running program |
| **18.2** | **Stack** | Method calls and local variables |
| **18.3** | **Heap** | Objects live here |
| **18.4** | **Garbage Collection** | Automatic memory cleanup |
| **18.5** | **Memory Leaks** | Objects accidentally kept alive |

---

## 18.1 JVM Flow

```text
Main.java -> javac -> Main.class -> JVM -> Program runs
```

Java source code becomes bytecode. The JVM runs bytecode on your machine.

---

## 18.2 Stack: The "Method Notebook"

Each method call gets a small memory area called a stack frame.

```java
static void greet() {
    String name = "Asha";
    System.out.println(name);
}
```

Local variables like `name` are part of method execution. When the method ends, its stack frame is removed.

---

## 18.3 Heap: The "Object Storage"

Objects created with `new` live in heap memory.

```java
Student s = new Student("Asha");
```

The variable `s` is a reference. The actual `Student` object lives on the heap.

---

## 18.4 Garbage Collection

If no active reference points to an object, the object becomes eligible for garbage collection.

```java
Student s = new Student("Asha");
s = null;
```

Now the object can be cleaned later by the JVM.

Important: garbage collection is automatic, but not instant.

---

## 18.5 Memory Leaks

A memory leak happens when your program keeps references it no longer needs.

Example:
```java
static List<String> logs = new ArrayList<>();

static void addLog(String message) {
    logs.add(message);
}
```

If logs grow forever, memory usage grows forever.

---

## Chapter Summary
Stack stores method execution. Heap stores objects. Garbage collection cleans unused objects. Strong Java developers write code that does not keep unnecessary references alive.


# Chapter 18 - Solutions

## Solution 1
```text
Main.java -> javac -> Main.class bytecode -> JVM -> running program
```

## Solution 2
Local primitives and references are commonly discussed as stack data. Objects live on the heap.

## Solution 3
```java
Student a = new Student("Asha");
Student b = a;
b.setName("Ravi");
System.out.println(a.getName()); // Ravi
```

## Solution 4
```java
Student s = new Student("Asha");
s = null; // original object can be garbage collected later
```

## Solution 5
```java
static void broken() {
    broken();
}

static void fixed(int n) {
    if (n == 0) return;
    fixed(n - 1);
}
```

## Solution 6
```java
static List<String> cache = new ArrayList<>();
```

If this grows forever and old data is never removed, memory usage keeps increasing.

## Solution 7
```java
String a = "java";
String b = "java";
System.out.println(a == b);      // true for same pool literal
System.out.println(a.equals(b)); // true by value
```

## Solution 8
Creating many objects increases heap pressure. If references are kept, GC cannot clean them.

## Solution 9
Likely causes: growing caches, unclosed resources, too many objects, slow database calls, or thread leaks. Investigate logs, heap usage, thread dumps, and recent code changes.

## Solution 10
Immutable objects cannot be changed after creation, so shared access is safer and easier to reason about.


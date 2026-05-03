# Chapter 7 – Generics & Functional Practice Questions

These 8 questions are designed to test your ability to write flexible code using Generics and concise logic using Lambdas and Streams.

---

## Problem 1 – The Dynamic Pair (Generics)
**Problem Statement**: Create a generic class `Pair<K, V>` that can store two objects of different types.
- **Task**: Create a `Pair` that stores a String (Name) and an Integer (Age). Print both values.
- **Sample Output**:
```text
Key: Gautam, Value: 21
```

---

## Problem 2 – The Lambda Math (Lambdas)
**Problem Statement**: Create a functional interface `MathOperation` with a method `int operate(int a, int b)`.
- **Task**: Use a Lambda expression to implement **Multiplication** and use it to multiply 5 and 4.
- **Sample Output**:
```text
Result: 20
```

---

## Problem 3 – Filter the Crowd (Streams)
**Problem Statement**: Create a list of integers: `[10, 25, 15, 40, 5, 30]`.
- **Task**: Use a Stream to filter out numbers less than 20 and print the remaining ones.
- **Sample Output**:
```text
Filtered: [25, 40, 30]
```

---

## Problem 4 – The Uppercase Map (Streams)
**Problem Statement**: Create a list of names: `["java", "python", "cpp", "javascript"]`.
- **Task**: Use a Stream to convert every name to uppercase and print them.
- **Sample Output**:
```text
Result: [JAVA, PYTHON, CPP, JAVASCRIPT]
```

---

## Problem 5 – String Length Checker (Predicate)
**Problem Statement**: Use the built-in `Predicate<String>` interface.
- **Task**: Write a lambda that checks if a string's length is greater than 5. Test it with "Antigravity".
- **Sample Output**:
```text
Is 'Antigravity' long? true
```

---

## Problem 6 – The Logger (Consumer)
**Problem Statement**: Use the built-in `Consumer<String>` interface.
- **Task**: Write a lambda that prints any string with the prefix "SYSTEM_LOG: ".
- **Sample Output**:
```text
SYSTEM_LOG: Update started...
```

---

## Problem 7 – Sum of Even Numbers (Streams)
**Problem Statement**: Create a list of numbers: `[1, 2, 3, 4, 5, 6]`.
- **Task**: Use a Stream to filter even numbers, then find their sum.
- **Sample Output**:
```text
Sum of evens: 12 (2 + 4 + 6)
```

---

## Problem 8 – Generic Method (Generics)
**Problem Statement**: Create a static method `printArray(T[] array)`.
- **Task**: This single method should be able to print arrays of Strings and arrays of Integers.
- **Sample Output**:
```text
Array: [1, 2, 3]
Array: [A, B, C]
```

---

### Instructions:
1. For Stream problems, remember to use `.stream()` to start and `.collect()` or `.forEach()` to finish.
2. For Generics, use `<T>` as your placeholder.
3. Import `java.util.*` and `java.util.stream.*`.

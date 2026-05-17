# 🟡 Pareto 80/20 — Chapter 3: Methods, Arrays & Strings

---

## ⭐ Critical 20% — Master These

### 1. Defining and Calling Methods

```java
// Pattern: [access] [static] [returnType] [name]([params])
public static int add(int a, int b) {
    return a + b;
}

// Call it:
int result = add(3, 5);  // result = 8
```

**The 3 decisions when writing a method:**
1. Does it return something? → Use the type (`int`, `String`, `double`) or `void`
2. Does it need input? → List parameters
3. Where does it live? → In a class (static for now, non-static in Ch 4)

---

### 2. Arrays — Declaration & Traversal

```java
// Declare and initialize
int[] scores = {90, 85, 77};

// Access: 0-indexed
System.out.println(scores[0]);  // 90 (first)
System.out.println(scores[2]);  // 77 (last)
System.out.println(scores.length); // 3

// Traverse with for loop
for (int i = 0; i < scores.length; i++) {
    System.out.println(scores[i]);
}

// Or with for-each (cleaner, read-only)
for (int score : scores) {
    System.out.println(score);
}
```

---

### 3. The 6 Most Used String Methods

```java
String s = "  Hello, World!  ";

s.length()              // 18 (including spaces)
s.trim()                // "Hello, World!" (removes leading/trailing spaces)
s.toLowerCase()         // "  hello, world!  "
s.toUpperCase()         // "  HELLO, WORLD!  "
s.substring(2, 7)       // "Hello" (from index 2, up to but not including 7)
s.contains("World")     // true
s.replace("World", "Java") // "  Hello, Java!  "
s.equals("Hello")       // false (different content)
s.trim().split(", ")    // ["Hello", "World!"] — splits by delimiter
```

**Most commonly tested in interviews:** `length()`, `substring()`, `indexOf()`, `charAt()`, `equals()`

---

### 4. String `.equals()` — Never Use `==`

```java
String a = new String("hello");
String b = new String("hello");

System.out.println(a == b);       // ❌ false — different objects
System.out.println(a.equals(b));  // ✅ true — same content
```

**Rule:** For all content comparison of Strings → use `.equals()`. No exceptions.

---

### 5. Method Overloading

```java
// Same name, different parameter types or count
public static double area(double radius) { return 3.14 * radius * radius; }
public static double area(double length, double width) { return length * width; }

// Java picks the right one based on arguments:
area(5.0)       // calls first  → circle area
area(4.0, 3.0)  // calls second → rectangle area
```

---

## 📉 Lower Priority (Learn Later)

| Concept | Why Lower Priority |
|---------|-------------------|
| `StringBuilder` vs `String` | Performance optimization — important in Ch 16+ |
| `Arrays.sort()`, `Arrays.fill()` | Utility methods — learn after basics |
| 2D array operations | Comes up in matrix math, Ch 16 DSA |
| `String.format()` | Nice to have, not essential |
| `varargs` (variable arguments) | Rare for beginners |

---

## 🎯 Chapter 3 Focus Checklist

- [ ] I can write a method that takes parameters and returns a value
- [ ] I can declare and initialize an array in two ways (literal and `new`)
- [ ] I know array indexing starts at 0
- [ ] I can loop through an array with both `for` and for-each
- [ ] I know 5+ String methods by memory
- [ ] I ALWAYS use `.equals()` to compare Strings, never `==`
- [ ] I can write overloaded methods for the same operation

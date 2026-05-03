# Chapter 17 - Modern Java Features

Java keeps improving. Modern Java helps you write cleaner, safer, and shorter code while still keeping Java's strong structure.

---

## Goals of Chapter 17
- Learn modern syntax used in current Java projects.
- Understand records, sealed classes, switch expressions, text blocks, and pattern matching.
- Know when modern features make code better.

## Sub-topics
| Section | Topic | Description |
| :--- | :--- | :--- |
| **17.1** | **var** | Local variable type inference |
| **17.2** | **Records** | Compact data classes |
| **17.3** | **Switch Expressions** | Cleaner branching |
| **17.4** | **Text Blocks** | Multi-line strings |
| **17.5** | **Sealed Classes** | Restrict inheritance |
| **17.6** | **Pattern Matching** | Safer type checks |

---

## 17.1 var

`var` lets Java infer a local variable type.

```java
var name = "Asha";      // String
var age = 21;           // int
var prices = new int[] {10, 20, 30};
```

Use `var` when the type is obvious. Avoid it when it hides meaning.

---

## 17.2 Records: The "Data Form"

Before records:
```java
class Student {
    private final String name;
    private final int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() { return name; }
    public int age() { return age; }
}
```

With records:
```java
record Student(String name, int age) {}
```

Records automatically provide constructor, getters, `toString`, `equals`, and `hashCode`.

---

## 17.3 Switch Expressions

```java
String result = switch (day) {
    case "SATURDAY", "SUNDAY" -> "Weekend";
    default -> "Weekday";
};
```

This is cleaner than a long switch with many `break` statements.

---

## 17.4 Text Blocks

```java
String json = """
        {
          "name": "Asha",
          "role": "Java Developer"
        }
        """;
```

Text blocks are useful for JSON, SQL, and HTML examples.

---

## 17.5 Sealed Classes

Sealed classes control who can extend a class.

```java
sealed interface Payment permits CardPayment, UpiPayment {}

final class CardPayment implements Payment {}
final class UpiPayment implements Payment {}
```

Use this when only a fixed set of types should exist.

---

## 17.6 Pattern Matching

Old style:
```java
if (obj instanceof String) {
    String text = (String) obj;
    System.out.println(text.length());
}
```

Modern style:
```java
if (obj instanceof String text) {
    System.out.println(text.length());
}
```

---

## Chapter Summary
Modern Java reduces boilerplate. Use these features when they make your code clearer, not just because they are new.


# Chapter 17 - Solutions

## Solution 1
```java
var name = "Asha";
var age = 20;
var marks = List.of(90, 85, 92);
```

## Solution 2
```java
record Book(String title, String author, double price) {}
```

## Solution 3
```java
String dayName = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    case 4 -> "Thursday";
    case 5 -> "Friday";
    case 6 -> "Saturday";
    case 7 -> "Sunday";
    default -> "Invalid";
};
```

## Solution 4
```java
String json = """
        {
          "name": "Asha",
          "age": 20
        }
        """;
```

## Solution 5
```java
static void printLength(Object value) {
    if (value instanceof String text) {
        System.out.println(text.length());
    }
}
```

## Solution 6
```java
record Student(String name, int age) {
    Student {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is required");
        }
    }
}
```

## Solution 7
```java
sealed interface Shape permits Circle, Rectangle {}
final class Circle implements Shape {}
final class Rectangle implements Shape {}
```

## Solution 8
```java
sealed interface Payment permits CardPayment, UpiPayment {}
record CardPayment(double amount) implements Payment {}
record UpiPayment(double amount) implements Payment {}
```

## Solution 9
Replace immutable data-only classes with records when they mainly store values and do not require complex inheritance.

## Solution 10
Avoid `var` when the right side does not reveal the type, when reading API results, or when the variable name is vague.


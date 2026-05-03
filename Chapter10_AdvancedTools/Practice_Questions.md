# Chapter 10 – Advanced Java Tools Practice Questions

Test your knowledge on Enums, Dates, and Annotations to make your code safer and more professional.

---

## Problem 1 – Days of the Week (Enums)
**Problem Statement**: Create an `enum` called `Day` containing all 7 days of the week.
- **Task**: Write a method that takes a `Day` and prints whether it is a "Weekday" or "Weekend".
- **Sample Input**: `Day.SATURDAY`
- **Sample Output**:
```text
SATURDAY is a Weekend.
```

---

## Problem 2 – Traffic Light (Enums with Values)
**Problem Statement**: Create an `enum` called `TrafficLight` with values RED, YELLOW, and GREEN.
- **Task**: Associate a duration (in seconds) with each color (e.g., RED=30, GREEN=45). Print the color and its duration.
- **Sample Output**:
```text
RED light duration: 30 seconds
```

---

## Problem 3 – Birthday Calculator (LocalDate)
**Problem Statement**: Ask the user for their birth year, month, and day.
- **Task**: Use `LocalDate` to represent their birthday and calculate how many days old they are using `ChronoUnit.DAYS`.
- **Sample Output**:
```text
You are 7500 days old.
```

---

## Problem 4 – The Future Date (LocalDateTime)
**Problem Statement**: Get the current date and time.
- **Task**: Add 2 weeks and 3 hours to the current time and print it in the format: `dd/MM/yyyy HH:mm`.
- **Sample Output**:
```text
Future Date: 17/05/2026 14:30
```

---

## Problem 5 – Overriding Check (Annotations)
**Problem Statement**: Create a parent class `Animal` with a method `makeSound()`.
- **Task**: Create a child class `Dog` and override the method. Use the `@Override` annotation and intentionally make a typo in the method name to see how the compiler helps you.
- **Sample Output**:
```text
(Compiler Error if typo exists)
```

---

## Problem 6 – Autoboxing List (Wrappers)
**Problem Statement**: Create an `ArrayList` of `Double`.
- **Task**: Add 5 primitive `double` values to it. Explain why this works (Autoboxing). Calculate the sum of the list.
- **Sample Output**:
```text
Sum: 150.5
```

---

## Problem 7 – Deprecated Warning (Annotations)
**Problem Statement**: Create a method `oldMethod()` and mark it as `@Deprecated`.
- **Task**: Call this method from `main` and notice how the IDE or Compiler warns you. Print "This is an old method." inside it.
- **Sample Output**:
```text
This is an old method. (Warning shown in IDE)
```

---

## Problem 8 – Enum Iteration
**Problem Statement**: Create an `enum` for `Season` (WINTER, SPRING, SUMMER, FALL).
- **Task**: Use a loop to print all values of the Enum.
- **Sample Output**:
```text
WINTER
SPRING
SUMMER
FALL
```

---

### Instructions:
1. For Date problems, use `java.time.*`.
2. For Enum methods, use `values()` to iterate.
3. For Annotations, observe compiler behavior.

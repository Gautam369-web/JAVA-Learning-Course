# 🟡 Pareto 80/20 — Chapter 2: Control Flow

> These concepts cover 80% of real-world logic in Java programs. Master these first.

---

## ⭐ Critical 20% — Master These

### 1. 🔀 if-else Chain (The Core of All Decision Logic)

```java
if (score >= 90) {
    System.out.println("A grade");
} else if (score >= 75) {
    System.out.println("B grade");
} else if (score >= 60) {
    System.out.println("C grade");
} else {
    System.out.println("F grade");
}
```

**Why it's #1:** Every program makes decisions. Job interviews will test this on Day 1. It appears in every single chapter after this one.

**The 2 Rules:**
- Conditions are checked **top to bottom**. The first `true` one wins.
- `else` catches everything that didn't match above.

---

### 2. 🔁 The `for` Loop (Fixed Iteration)

```java
// Count from 1 to 5
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

The anatomy of a `for` loop — memorize these 3 parts:
```
for ( INIT ; CONDITION ; UPDATE )
      ↓          ↓          ↓
  int i = 1   i <= 5     i++
  (run once)  (check)   (each iteration)
```

**Why it's #2:** 70% of loops in beginner-to-intermediate Java are `for` loops. Arrays, printing tables, counting — all use `for`.

---

### 3. 🔁 The `while` Loop (Condition-Based)

```java
// Keep asking for valid input
Scanner sc = new Scanner(System.in);
int age = -1;
while (age < 0) {
    System.out.print("Enter a positive age: ");
    age = sc.nextInt();
}
System.out.println("Your age is: " + age);
```

**When to use it:** When you DON'T know how many times to repeat. File reading, user input validation, game loops — all `while`.

---

### 4. ✂️ `break` and `continue`

```java
// break: exit the loop entirely
for (int i = 1; i <= 10; i++) {
    if (i == 5) break; // Stops at 4
    System.out.println(i);
}

// continue: skip THIS iteration, keep going
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue; // Skips 3, prints 1,2,4,5
    System.out.println(i);
}
```

**Why it matters:** These appear in search algorithms (break when found) and filtering logic (continue to skip unwanted items).

---

### 5. 🔢 Modulus `%` in Conditions (Most Used Trick)

```java
// Even/Odd check
if (n % 2 == 0) System.out.println("Even");
else System.out.println("Odd");

// Every 3rd item
for (int i = 1; i <= 9; i++) {
    if (i % 3 == 0) System.out.println(i + " is divisible by 3");
}
```

**Why it's critical:** Modulus + if-else is used in almost every algorithm problem. FizzBuzz, finding primes, leap years, cycling through colors — all use `%`.

---

## 📉 Lower Priority (Learn After Mastering Above)

| Concept | Why Lower Priority |
|---------|-------------------|
| `do-while` | Rarely needed; `while` covers most cases |
| `switch` statement (classic) | Only for multi-case equality checks; `if-else` is more flexible |
| Nested loops (3+ deep) | Advanced DSA — comes in Chapter 16 |
| Labeled `break` / `continue` | Rare in production code |
| Ternary operator `? :` | Useful shorthand but not essential |

---

## 🎯 Chapter 2 Focus Checklist

- [ ] I can write an `if-else if-else` chain for a grading system
- [ ] I can write a `for` loop from 1 to N and from N to 1
- [ ] I can write a `while` loop that keeps going until a condition is false
- [ ] I understand the difference between `break` (exit) and `continue` (skip)
- [ ] I can use `%` to check divisibility inside an `if` statement
- [ ] I can predict what a loop will print by tracing it manually

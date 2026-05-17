# 🟠 Knowledge Gaps — Chapter 2: Control Flow

---

## Gap 1: "Why does my `if` check fail even though I think it should be true?"

### ❌ Common Mistake — Using `=` instead of `==`

```java
int x = 5;
if (x = 10) {  // ❌ COMPILE ERROR (or worse: logical bug in some contexts)
    System.out.println("Ten!");
}
```

### ✅ Fix
```java
if (x == 10) {  // ✅ == is comparison; = is assignment
    System.out.println("Ten!");
}
```

**Rule:** `=` means **"set this value"**. `==` means **"are these equal?"**. They are completely different!

---

## Gap 2: Off-By-One Errors — The Most Common Loop Bug

### ❌ Scenario
You want to print numbers 1 through 10:
```java
for (int i = 1; i < 10; i++) {  // ❌ Prints 1 to 9 only!
    System.out.println(i);
}
```

### ✅ Fix
```java
for (int i = 1; i <= 10; i++) {  // ✅ <= includes 10
    System.out.println(i);
}
```

**The mental trick:** Read `i < 10` as "stop BEFORE 10." Read `i <= 10` as "stop AT 10."

---

## Gap 3: The Infinite Loop — When Your Program Never Stops

### ❌ Scenario
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    // Forgot to increment i!
}
```
This runs **forever**. The condition `i <= 5` is always true because `i` never changes.

### ✅ Fix
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;  // ← Update the variable!
}
```

**How to debug:** If your program freezes, press `Ctrl+C` to stop it. Then look for: does your loop variable ever get updated?

---

## Gap 4: switch Fall-Through — The Invisible Bug

### ❌ Scenario
```java
int day = 2;
switch (day) {
    case 1: System.out.println("Monday");
    case 2: System.out.println("Tuesday");  // ← Expected this only
    case 3: System.out.println("Wednesday");
}
```
**Output (WRONG!):**
```
Tuesday
Wednesday    ← Why did this print?!
```

### ✅ Explanation
Without `break`, Java **falls through** to the next case and keeps executing!

### ✅ Fix
```java
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
}
```

---

## Gap 5: Boolean Conditions — The Redundant Comparison

### ❌ Verbose (but works)
```java
boolean isRaining = true;
if (isRaining == true) {  // This is redundant!
    System.out.println("Take an umbrella");
}
```

### ✅ Cleaner
```java
if (isRaining) {  // A boolean IS already true or false — no need to compare it!
    System.out.println("Take an umbrella");
}

if (!isRaining) { // !isRaining means "NOT raining"
    System.out.println("No umbrella needed");
}
```

---

## Gap 6: The "do-while" vs "while" Confusion

**The key difference:**
- `while` checks the condition **before** running the body → might never run
- `do-while` runs the body **first**, then checks → always runs at least once

```java
// while — may not run at all
int n = 10;
while (n < 5) {
    System.out.println("This never prints!");
}

// do-while — runs at least once
do {
    System.out.println("This ALWAYS prints once!");
} while (n < 5);
```

**When to use `do-while`:** Menu systems where you always want to show options at least once before checking if the user wants to continue.

---

## 🔍 Common Error Quick Reference

| Symptom | Likely Cause | Fix |
|---------|-------------|-----|
| Program loops forever | Missing update in while loop | Add `i++` or update the condition variable |
| `if` block skipped unexpectedly | Using `=` instead of `==` | Change to `==` for comparison |
| switch runs multiple cases | Missing `break` | Add `break` after each case |
| Loop runs one too few times | Using `<` instead of `<=` | Change to `<=` if you want to include the last value |
| Loop runs one too many times | Using `<=` instead of `<` | Change based on your intention |

---

## 📚 Resources to Fill These Gaps

| Gap | Resource |
|-----|---------|
| Off-by-one errors | [GeeksForGeeks: Off By One Error](https://www.geeksforgeeks.org/off-by-one-error/) |
| Infinite loops | [W3Schools Java While Loop](https://www.w3schools.com/java/java_while_loop.asp) |
| Switch fall-through | [Baeldung: Java Switch Statement](https://www.baeldung.com/java-switch) |
| Practice problems | [HackerRank: Java Control Structures](https://www.hackerrank.com/domains/java) |

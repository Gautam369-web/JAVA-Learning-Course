# Chapter 2 – Control Flow

## 2.1 Conditional Statements
### `if‑else`
```java
int n = 7;
if (n % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```
- The condition inside `()` must evaluate to a **boolean**.
- Only one `else` block can exist; multiple conditions use `else if`.

### `switch`
```java
char grade = 'B';
switch (grade) {
    case 'A':
        System.out.println("Excellent");
        break;
    case 'B':
    case 'C':
        System.out.println("Good");
        break;
    default:
        System.out.println("Needs improvement");
}
```
- Works with `byte`, `short`, `int`, `char`, `String`, and enum types.
- `break` prevents fall‑through.

---
## 2.2 Loops
### `for` loop (classic)
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```
- Ideal when the number of iterations is known.

### Enhanced `for` (foreach) – works on arrays and `Iterable` collections
```java
int[] arr = {2, 4, 6};
for (int val : arr) {
    System.out.println(val);
}
```

### `while` loop
```java
int i = 0;
while (i < 3) {
    System.out.println(i);
    i++;
}
```
- Checks the condition **before** each iteration.

### `do‑while` loop
```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 3);
```
- Executes the body **at least once** before testing the condition.

---
## 2.3 Controlling Loop Execution
- `break` – exits the nearest enclosing loop.
- `continue` – skips the rest of the current iteration and proceeds to the next.
```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) continue; // print only odd numbers
    System.out.println(i);
}
```

---
## 2.4 Nested Control Structures
```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print(i * j + " ");
    }
    System.out.println();
}
```
Produces a 3×3 multiplication table.

---
## 2.5 Practice Problems (Chapter 2)
### Problem 1 – Multiplication Table
**Statement**: Given an integer `n (1 ≤ n ≤ 20)`, print the multiplication table of `n` from `1×n` to `10×n`.
**Input**: Single integer `n`.
**Output**: Ten lines, each line `i * n = result` (e.g., `3 * 4 = 12`).

### Problem 2 – Prime Checker
**Statement**: Determine whether a given integer `p` (> 1) is a **prime** number.
**Input**: One integer `p`.
**Output**: `Prime` if `p` is prime, otherwise `Not Prime`.
*(Hint: loop from `2` to `sqrt(p)` and break early when a divisor is found.)*

### Problem 3 – Reverse Digits
**Statement**: Read an integer `x` (may be negative) and output its digits in reverse order, preserving the sign.
**Input**: One integer `x`.
**Output**: The reversed integer (e.g., input `-123` → output `-321`).

---
## 2.6 How to Test Your Solutions
1. Create a separate `.java` file for each problem, e.g., `MultiplicationTable.java`, `PrimeChecker.java`, `ReverseDigits.java`.
2. Inside `main`, use `Scanner scanner = new Scanner(System.in);` to read input.
3. Compile with `javac <FileName>.java` and run with `java <ClassName>`.
4. Compare the console output with the expected format shown above.

---
Feel free to request a **solution template** for any of the three practice problems, or let me know when you have successfully compiled and run one of them!

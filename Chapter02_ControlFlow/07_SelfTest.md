# 🟣 Self-Test Questions — Chapter 2: Control Flow

> Attempt ALL questions before checking any hints. Write/type your answers first.

---

## 🟢 BASIC Level

**Q1.** What is the difference between `=` and `==` in Java?

**Q2.** What does this code print?
```java
int x = 7;
if (x > 10) {
    System.out.println("Big");
} else if (x > 5) {
    System.out.println("Medium");
} else {
    System.out.println("Small");
}
```

**Q3.** What are the 3 parts of a `for` loop? Label each one:
```java
for ( ___ ; ___ ; ___ ) { }
```

**Q4.** What is the output?
```java
for (int i = 1; i <= 5; i++) {
    System.out.print(i + " ");
}
```

**Q5.** True or False:
- (a) A `while` loop always runs at least once.
- (b) A `do-while` loop always runs at least once.
- (c) `break` exits only the current `if` block.
- (d) `continue` skips the rest of the current loop iteration.

**Q6.** What is wrong here and what does it actually print?
```java
int day = 2;
switch (day) {
    case 1: System.out.println("Monday");
    case 2: System.out.println("Tuesday");
    case 3: System.out.println("Wednesday");
}
```

---

## 🟡 INTERMEDIATE Level

**Q7.** Write a `for` loop that prints all even numbers from 2 to 20.

**Q8.** Write a `while` loop that keeps reading numbers from the user until they enter `0`, then prints the sum of all entered numbers.

**Q9.** Trace through this code and write the exact output:
```java
for (int i = 1; i <= 6; i++) {
    if (i % 2 == 0) continue;
    if (i == 5) break;
    System.out.println(i);
}
```

**Q10.** Write a program that reads a number from the user and prints:
- "FizzBuzz" if divisible by both 3 and 5
- "Fizz" if only divisible by 3
- "Buzz" if only divisible by 5
- The number itself otherwise

**Q11.** Write a nested loop that prints this pattern:
```
*
* *
* * *
* * * *
* * * * *
```

**Q12.** A `for` loop runs from `i = 0` to `i < array.length`. What is the index of the FIRST and LAST element if the array has 7 elements?

---

## 🔴 ADVANCED Level

**Q13.** What is the output of this code? Trace it carefully:
```java
outer:
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (j == 2) continue outer;
        System.out.println(i + "," + j);
    }
}
```

**Q14.** Write a complete program that:
- Reads numbers from the user in a loop
- Stops when the user enters a negative number
- Prints: the count of numbers entered, their sum, and their average
- If no valid numbers entered, print "No data entered"

**Q15.** This code is supposed to find the first prime number greater than 100. Find and fix the logical errors:
```java
int num = 101;
boolean found = false;
while (!found) {
    boolean isPrime = true;
    for (int i = 2; i < num; i++) {
        if (num % i == 0) {
            isPrime = true;  // Bug here!
        }
    }
    if (isPrime) {
        System.out.println(num + " is prime");
        found = false;  // Bug here!
    }
    num++;
}
```

**Q16.** Explain the difference between these two code snippets. Which is more efficient and why?
```java
// Version A
for (int i = 2; i < num; i++) {
    if (num % i == 0) { isPrime = false; break; }
}

// Version B
for (int i = 2; i <= Math.sqrt(num); i++) {
    if (num % i == 0) { isPrime = false; break; }
}
```

**Q17.** [Design Challenge] Write a Java program that simulates a simple ATM menu using a `do-while` loop:
- Show options: 1. Check Balance, 2. Deposit, 3. Withdraw, 4. Exit
- Start with balance = ₹5000
- Keep showing the menu until the user chooses 4
- Prevent withdrawal if balance is insufficient

**Q18.** What is the output of this nested loop? Show your step-by-step trace:
```java
for (int i = 0; i < 3; i++) {
    for (int j = i; j < 3; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
```

---

## 📊 Scoring Guide

| Correct | Level Achieved |
|---------|---------------|
| Q1–Q6 | Basic understanding of control flow |
| Q7–Q12 | Can write loops and conditions independently |
| Q13–Q18 | Advanced — ready for Ch 3 and beyond |

---

<details>
<summary>💡 Hints (reveal only after trying!)</summary>

- **Q6:** Remember fall-through. Without `break`, execution continues into the next case.
- **Q9:** `continue` skips the rest of the loop body. `break` exits entirely. Only ODD numbers that are ≠ 5 get printed.
- **Q13:** `continue outer` goes to the next iteration of the OUTER loop, not the inner one.
- **Q15:** The bugs: `isPrime = true` should be `isPrime = false`, and `found = false` should be `found = true`.
- **Q16:** Version B is faster — you only need to check up to the square root to determine primeness.

</details>

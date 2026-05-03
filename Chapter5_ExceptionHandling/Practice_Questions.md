# Chapter 5 – Exception Handling Practice Questions

These 8 questions are designed to test your ability to write robust, crash-proof code using Java's Exception Handling mechanisms.

---

## Problem 1 – The Safe Calculator (ArithmeticException)
**Problem Statement**: Write a program that takes two integers as input and divides the first by the second.
- **Task**: Use a `try-catch` block to handle the case where the user enters `0` as the second number.
- **Sample Input**: `10`, `0`
- **Sample Output**:
```text
Error: You cannot divide by zero!
```

---

## Problem 2 – The Array Guard (ArrayIndexOutOfBoundsException)
**Problem Statement**: Create an array of 3 names.
- **Task**: Prompt the user to enter an index to see a name. If they enter `5` or any index outside `0-2`, catch the exception and print a friendly message.
- **Sample Input**: `5`
- **Sample Output**:
```text
Error: That seat doesn't exist! Please choose index 0, 1, or 2.
```

---

## Problem 3 – Only Numbers Please (NumberFormatException)
**Problem Statement**: Write a program that asks for the user's age as a String.
- **Task**: Try to convert that string to an integer using `Integer.parseInt()`. If the user enters "Ten" instead of "10", catch the error.
- **Sample Input**: `Ten`
- **Sample Output**:
```text
Error: Please enter a valid numeric age!
```

---

## Problem 4 – The Final Goodbye (Finally)
**Problem Statement**: Write any code that causes an exception (like division by zero).
- **Task**: Use a `finally` block to print "Program execution completed." regardless of whether an error occurred.
- **Sample Input**: `5 / 0`
- **Sample Output**:
```text
Error: / by zero
Program execution completed.
```

---

## Problem 5 – Voter Eligibility (Throw)
**Problem Statement**: Create a method `checkEligibility(int age)`.
- **Task**: If the age is less than 18, use the `throw` keyword to manually trigger an `ArithmeticException` with the message "Not eligible to vote".
- **Sample Input**: `16`
- **Sample Output**:
```text
Caught: Not eligible to vote
```

---

## Problem 6 – The Bank Rule (Custom Exception)
**Problem Statement**: Create a custom exception called `InsufficientFundsException`.
- **Task**: Create a method `withdraw(double amount)` that throws this custom exception if the amount is greater than the balance ($500).
- **Sample Input**: `600`
- **Sample Output**:
```text
Error: InsufficientFundsException: You don't have enough money!
```

---

## Problem 7 – Warning the Caller (Throws)
**Problem Statement**: Create a method `readFile()` that contains code which might fail (like `Thread.sleep()`).
- **Task**: Use the `throws` keyword in the method header. In the `main` method, call `readFile()` and handle the exception using `try-catch`.
- **Sample Input**: None
- **Sample Output**:
```text
Method executed successfully or Exception caught.
```

---

## Problem 8 – The Clean Scanner (Try-with-resources)
**Problem Statement**: Write a program that reads a string from the user.
- **Task**: Use `try-with-resources` to create the `Scanner` object so that it closes automatically without a `finally` block.
- **Sample Input**: `Hello`
- **Sample Output**:
```text
You entered: Hello
(Scanner closed automatically)
```

---

### Instructions:
1. Focus on the **Hierarchy**: Try to catch specific exceptions before general ones.
2. Remember that **Custom Exceptions** must extend the `Exception` class.
3. Use `e.getMessage()` or `e.toString()` to print the error details.

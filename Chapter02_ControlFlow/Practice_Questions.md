# Chapter 2 – Practice Questions (Control Flow)

This file contains challenges to test your understanding of branching and loops in Java.

---

## Part 1: General Logic

### Problem 1 – Fibonacci Series
**Statement**: Write a program to print the first `N` terms of the Fibonacci series.
**Input**: A single integer `N`.
**Output**: `N` space-separated integers.
**Sample**: `Input: 5` -> `Output: 0 1 1 2 3`

---

## Part 2: forEach Loop Challenges
*All problems in this section MUST be solved using the `for (type item : collection)` syntax.*

---

### Problem 4 – City Tour
**Problem Statement**: You are given an array of 5 city names. Write a program to print each city name prefixed with "Visiting: ".

**Input Format**: No user input required (Define the array in your code).
**Output Format**: 5 lines of text.

**Sample Output**:
```text
Visiting: Mumbai
Visiting: Delhi
Visiting: Bangalore
Visiting: Hyderabad
Visiting: Chennai
```

---

### Problem 5 – Total Score
**Problem Statement**: A student has scores in 5 subjects stored in an array. Use a forEach loop to calculate the total marks obtained.

**Input Format**: An array of 5 integers.
**Output Format**: A single integer representing the sum.

**Sample Test Case**:
- **Array**: `{80, 90, 70, 85, 95}`
- **Output**: `420`

---

### Problem 6 – The Highest Peak
**Problem Statement**: Given an array of mountain heights (integers), find and print the height of the tallest mountain using a forEach loop.

**Input Format**: An array of integers.
**Output Format**: A single integer.

**Sample Test Case**:
- **Array**: `{1200, 4500, 8848, 3200}`
- **Output**: `8848`

---

### Problem 7 – Counting Evens
**Problem Statement**: You have an array of 10 random numbers. Count how many of these numbers are even.

**Input Format**: An array of 10 integers.
**Output Format**: A single integer.

**Sample Test Case**:
- **Array**: `{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}`
- **Output**: `5`

---

### Problem 8 – Security Check (Name Search)
**Problem Statement**: Create an array of "Allowed Guests". Ask the user for their name. Use a forEach loop to check if the user is in the list.

**Input Format**: A String input from the user.
**Output Format**: "Access Granted" or "Access Denied".

**Sample Test Case**:
- **List**: `{"Alice", "Bob", "Charlie"}`
- **Input**: `Bob`
- **Output**: `Access Granted`

---

### Problem 9 – Healthy Fruit Filter
**Problem Statement**: You have an array of fruit names. Use a forEach loop to print only the fruits that have more than 5 characters in their name.

**Input Format**: An array of Strings.
**Output Format**: Fruit names that meet the condition.

**Sample Test Case**:
- **Array**: `{"Apple", "Banana", "Kiwi", "Orange", "Grape"}`
- **Output**:
```text
Banana
Orange
```

---

### Problem 10 – Weather Station (C to F)
**Problem Statement**: You are given an array of temperatures in Celsius. Convert each temperature to Fahrenheit using the formula `(C * 9/5) + 32` and print the results.

**Input Format**: An array of double values.
**Output Format**: The converted Fahrenheit values.

**Sample Test Case**:
- **Array**: `{0.0, 25.0, 100.0}`
- **Output**:
```text
32.0
77.0
212.0
```

---

### Problem 11 – Billing System (GST Calculator)
**Problem Statement**: You have an array of product prices. Use a forEach loop to calculate the final price for each product after adding 18% GST.

**Input Format**: An array of double values.
**Output Format**: Final prices rounded to two decimal places.

**Sample Test Case**:
- **Array**: `{100.0, 200.0, 50.0}`
- **Output**:
```text
118.0
236.0
59.0
```

---

### Instructions for Solving:
1. Use `Scanner` for any user interaction.
2. For all "Part 2" problems, you **must** use the `for (type item : collection)` syntax.
3. Compare your results with the sample outputs provided!

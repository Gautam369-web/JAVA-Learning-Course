# Chapter 11 – Unit Testing Practice Questions

Practice writing tests to ensure your code is "Production Ready".

---

## Problem 1 – String Length Test (Basic Assertion)
**Problem Statement**: Write a test for a method that returns the length of a string.
- **Task**: Use `assertEquals` to verify that the length of "Java" is 4.
- **Sample Output**:
```text
Test Passed (Green)
```

---

## Problem 2 – User Authentication (assertTrue)
**Problem Statement**: You have a method `login(user, pass)`.
- **Task**: Use `assertTrue` to verify that `login("admin", "1234")` returns `true`. Use `assertFalse` to verify that `login("admin", "wrong")` returns `false`.

---

## Problem 3 – Calculator Subtract (assertEquals)
**Problem Statement**: Write a test for a `subtract(a, b)` method.
- **Task**: Verify that `subtract(10, 4)` equals 6. Add a custom error message to the assertion: "Subtraction logic failed!".

---

## Problem 4 – The Empty List (Lifecycle)
**Problem Statement**: Create an `ArrayList` in a test class.
- **Task**: Use `@BeforeEach` to clear the list before every test. Write two tests: one to check if adding an item increases size, and another to check if the list starts empty.

---

## Problem 5 – Negative Price Error (assertThrows)
**Problem Statement**: You have a `setPrice(double p)` method that throws `IllegalArgumentException` if `p < 0`.
- **Task**: Write a test using `assertThrows` to ensure the exception is thrown when setting price to `-50`.

---

## Problem 6 – Null Object Check (assertNull)
**Problem Statement**: A method `findUser(id)` returns `null` if the user is not found.
- **Task**: Use `assertNull` to verify that searching for an ID that doesn't exist returns null.

---

## Problem 7 – Array Equality (assertArrayEquals)
**Problem Statement**: You have a method that sorts an array.
- **Task**: Use `assertArrayEquals` to verify that sorting `[3, 1, 2]` results in `[1, 2, 3]`.

---

## Problem 8 – Timeout Test (Performance)
**Problem Statement**: Some code should not take too long to run.
- **Task**: Use `assertTimeout` to ensure a piece of code finishes within 500 milliseconds.

---

### Instructions:
1. Use `@Test` for every test method.
2. Remember that test methods must be `public` or `package-private` and return `void`.
3. Import `org.junit.jupiter.api.Assertions.*`.

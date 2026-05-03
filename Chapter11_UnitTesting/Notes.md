# Chapter 11 – Unit Testing (JUnit 5)

Professional software is too big to test by hand every time you change something. **Unit Testing** is the practice of writing code to verify that your actual code works correctly.

---

## Goals of Chapter 11
- **Automate Quality**: Learn to verify your logic without running the app manually.
- **Master Assertions**: Learn how to "claim" what a result should be.
- **Understand the Lifecycle**: Learn how to set up and tear down test environments.
- **Fix Bugs Early**: Understand how testing prevents old bugs from coming back (Regression).

## Sub-topics
| Section | Topic | Description |
| :--- | :--- | :--- |
| **11.1** | **Intro to Unit Testing** | The "Quality Control" concept |
| **11.2** | **Basic Assertions** | Using `assertEquals`, `assertTrue`, etc. |
| **11.3** | **JUnit Lifecycle** | `@BeforeEach`, `@AfterEach`, and `@Test` |
| **11.4** | **Testing Exceptions** | Verifying that code fails when it should |

---

## 11.1 Intro to Unit Testing: The "Quality Control"

### 🏭 Real-Life Analogy
Imagine a **Car Factory**. 
- You don't build the whole car and then drive it into a wall to see if the brakes work. 
- Instead, you test the **Brake Pad** alone (Unit Test), then the **Engine** alone, then the **Tires**.
In Java, a "Unit" is usually a single method.

### 💡 Human Understanding
A Unit Test is a small method that calls your actual method and checks if the output matches your expectations. If it does, the test **Passes** (Green). If not, it **Fails** (Red).

---

## 11.2 Basic Assertions: The "Checklist"

### 📋 Real-Life Analogy
When you buy a phone, you have a **Checklist**:
- Does the screen turn on? (Expected: Yes)
- Is the camera clear? (Expected: Yes)
If the actual result matches the expected result, you are happy.

### 💡 Human Understanding
Assertions are the heart of JUnit. 
- `assertEquals(expected, actual)`: Checks if values are equal.
- `assertTrue(condition)`: Checks if something is true.
- `assertNull(object)`: Checks if something is null.

### 💻 Code Implementation
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void testAddition() {
        int result = 5 + 5;
        // We 'assert' that the result SHOULD be 10
        assertEquals(10, result, "5 + 5 should be 10");
    }
}
```

---

## 11.3 JUnit Lifecycle: The "Chef's Preparation"

### 👨‍🍳 Real-Life Analogy
Imagine a **Chef** cooking multiple dishes.
- **`@BeforeEach`**: Cleaning the knife and cutting board *before every single dish*.
- **`@AfterEach`**: Washing the dishes *after every single dish*.
- **`@BeforeAll`**: Opening the restaurant *once* before any cooking starts.

### 💡 Human Understanding
These annotations help you set up fresh data before each test so that one test doesn't interfere with another.

### 💻 Code Implementation
```java
import org.junit.jupiter.api.*;

class DatabaseTest {
    @BeforeEach
    void init() {
        System.out.println("Connecting to Database...");
    }

    @Test
    void testDataInsert() {
        System.out.println("Testing Insert Logic...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Disconnecting...");
    }
}
```

---

## 11.4 Testing Exceptions: The "Crash Test"

### 🚗 Real-Life Analogy
In a **Crash Test**, you *want* the airbag to deploy. If it doesn't deploy during a crash, the test fails.
In Java, if you have a method that should throw an error (like dividing by zero), you write a test to make sure that error **actually happens**.

### 💻 Code Implementation
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ExceptionTest {
    @Test
    void testDivideByZero() {
        // We assert that this code SHOULD throw an ArithmeticException
        assertThrows(ArithmeticException.class, () -> {
            int x = 10 / 0;
        });
    }
}
```

---

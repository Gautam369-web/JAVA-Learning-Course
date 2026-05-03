# Chapter 11 – Unit Testing (JUnit 5)

## 11.2 Basic Assertions
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void testAddition() {
        int result = 5 + 5;
        assertEquals(10, result, "5 + 5 should be 10");
        System.out.println("Test Passed!");
    }
}
```
**Output (JUnit Console)**:
```text
✔ testAddition() PASSED
Test Passed!
```

---

## 11.3 JUnit Lifecycle
```java
import org.junit.jupiter.api.*;

class DatabaseTest {
    @BeforeEach
    void init() { System.out.println("Connecting..."); }

    @Test
    void testLogic() { System.out.println("Testing..."); }

    @AfterEach
    void tearDown() { System.out.println("Disconnecting..."); }
}
```
**Output**:
```text
Connecting...
Testing...
Disconnecting...
✔ testLogic() PASSED
```

---

## 11.4 Testing Exceptions
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ExceptionTest {
    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            int x = 10 / 0;
        });
        System.out.println("Exception caught correctly!");
    }
}
```
**Output**:
```text
Exception caught correctly!
✔ testDivideByZero() PASSED
```

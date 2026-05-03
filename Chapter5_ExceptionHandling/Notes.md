# Chapter 5 – Exception Handling

## 5.2 Try-Catch-Finally
```java
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide by zero!");
        } finally {
            System.out.println("The calculation attempt is finished.");
        }
    }
}
```
**Output**:
```text
Error: You cannot divide by zero!
The calculation attempt is finished.
```

---

## 5.4 Throw and Throws
```java
public class Main {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - Under 18!");
        } else {
            System.out.println("Access granted!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
```
**Output**:
```text
Caught: Access denied - Under 18!
```

---

## 5.5 Custom Exceptions
```java
class InvalidTieException extends Exception {
    public InvalidTieException(String message) { super(message); }
}

public class Club {
    public static void main(String[] args) {
        String tieColor = "Blue";
        try {
            if (!tieColor.equals("Red")) {
                throw new InvalidTieException("Only Red Ties allowed!");
            }
        } catch (InvalidTieException e) {
            System.out.println("Security: " + e.getMessage());
        }
    }
}
```
**Output**:
```text
Security: Only Red Ties allowed!
```

---

## 5.6 Try-with-resources
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner("Gautam")) {
            System.out.println("Hello " + sc.next());
        } catch (Exception e) {
            System.out.println("Error.");
        }
    }
}
```
**Output**:
```text
Hello Gautam
```

# Chapter 5 – Exception Handling Solutions

These solutions demonstrate how to handle errors gracefully using try-catch, throw, throws, and custom exceptions.

---

## Solution 1: The Safe Calculator (ArithmeticException)
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide by zero!");
        }
    }
}
```
**Output** (for input `10 0`):
```text
Error: You cannot divide by zero!
```

---

## Solution 2: The Array Guard (ArrayIndexOutOfBoundsException)
```java
public class Main {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        try {
            int index = 5; // Trying to access index 5
            System.out.println("Name: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: That seat doesn't exist! Please choose index 0, 1, or 2.");
        }
    }
}
```
**Output**:
```text
Error: That seat doesn't exist! Please choose index 0, 1, or 2.
```

---

## Solution 3: Only Numbers Please (NumberFormatException)
```java
public class Main {
    public static void main(String[] args) {
        String ageInput = "Ten";
        try {
            int age = Integer.parseInt(ageInput);
            System.out.println("Age is: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid numeric age!");
        }
    }
}
```
**Output**:
```text
Error: Please enter a valid numeric age!
```

---

## Solution 4: The Final Goodbye (Finally)
```java
public class Main {
    public static void main(String[] args) {
        try {
            int x = 5 / 0;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}
```
**Output**:
```text
Error: / by zero
Program execution completed.
```

---

## Solution 5: Voter Eligibility (Throw)
```java
public class Main {
    static void checkEligibility(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Welcome to the booth!");
        }
    }

    public static void main(String[] args) {
        try {
            checkEligibility(16);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
```
**Output**:
```text
Caught: Not eligible to vote
```

---

## Solution 6: The Bank Rule (Custom Exception)
```java
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class Main {
    static void withdraw(double amount, double balance) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("You don't have enough money!");
        }
        System.out.println("Withdrawal successful.");
    }

    public static void main(String[] args) {
        try {
            withdraw(600, 500);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```
**Output**:
```text
Error: You don't have enough money!
```

---

## Solution 7: Warning the Caller (Throws)
```java
public class Main {
    // This method warns that it might cause an InterruptedException
    static void waitMoment() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Wait over.");
    }

    public static void main(String[] args) {
        try {
            waitMoment();
        } catch (InterruptedException e) {
            System.out.println("Caught: " + e);
        }
    }
}
```
**Output**:
```text
Wait over.
```

---

## Solution 8: The Clean Scanner (Try-with-resources)
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner will close automatically at the end of the block
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String input = sc.nextLine();
            System.out.println("You entered: " + input);
        }
    }
}
```
**Output**:
```text
Enter text: Hello
You entered: Hello
```

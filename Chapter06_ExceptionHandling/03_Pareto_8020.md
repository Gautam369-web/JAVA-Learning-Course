# 🟡 Pareto 80/20 — Chapter 6: Exception Handling

## ⭐ Critical 20%

### 1. Basic try-catch-finally
```java
try {
    int result = 10 / 0;  // ArithmeticException!
    System.out.println(result);
} catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage());  // / by zero
} finally {
    System.out.println("This always runs!");
}
```

### 2. Multiple catch Blocks
```java
try {
    int[] arr = new int[3];
    arr[5] = 10;  // ArrayIndexOutOfBoundsException
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index error: " + e.getMessage());
} catch (Exception e) {
    System.out.println("General error: " + e.getMessage());
}
// More specific catch goes FIRST, more general LAST
```

### 3. Custom Exception
```java
class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Usage:
public void withdraw(double amount) {
    if (amount > balance) {
        throw new InsufficientFundsException("Need ₹" + amount + " but only ₹" + balance);
    }
    balance -= amount;
}
```

### 4. Try-with-Resources (Java 7+)
```java
try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
    String line = br.readLine();
    System.out.println(line);
} catch (IOException e) {
    System.out.println("File error: " + e.getMessage());
}
// br is automatically closed — no finally needed!
```

## 🎯 Checklist
- [ ] I can write try-catch-finally from memory
- [ ] I know the difference between checked and unchecked exceptions
- [ ] I can create a custom exception class
- [ ] I use try-with-resources for file/connection handling
- [ ] I NEVER write empty catch blocks

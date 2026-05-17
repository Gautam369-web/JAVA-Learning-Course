# 🟣 Self-Test Questions — Chapter 6: Exception Handling

## 🟢 BASIC
**Q1.** What is the purpose of the `finally` block?
**Q2.** What is the difference between checked and unchecked exceptions?
**Q3.** True/False: You can have multiple `catch` blocks for one `try`.
**Q4.** What exception is thrown by `int x = 5 / 0`?

## 🟡 INTERMEDIATE
**Q5.** Write a method `readFirstLine(String filename)` that reads the first line of a file and handles `IOException`. Return an empty string if the file can't be read.
**Q6.** Create a custom exception `InvalidAgeException` and use it in a `setAge(int age)` method that rejects negative ages.
**Q7.** What is the output?
```java
try {
    System.out.println("A");
    throw new RuntimeException("error");
} catch (RuntimeException e) {
    System.out.println("B: " + e.getMessage());
} finally {
    System.out.println("C");
}
```

## 🔴 ADVANCED
**Q8.** Explain exception propagation. Write an example where `methodA()` calls `methodB()` calls `methodC()`, and `methodC()` throws an exception caught in `methodA()`.
**Q9.** What is the difference between `throw` and `throws`?
**Q10.** [Bug Hunt] What is wrong with this code?
```java
try {
    connectToDatabase();
} catch (Exception e) {
} catch (SQLException e) {
    System.out.println("DB Error: " + e.getMessage());
}
```

<details>
<summary>💡 Hints</summary>
- Q7: Prints A, then B: error, then C (finally always runs)
- Q10: Exception is too broad and comes before SQLException — unreachable catch block!
</details>

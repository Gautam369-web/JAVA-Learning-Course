# 🟠 Knowledge Gaps — Chapter 6: Exception Handling

## Gap 1: The Silent Catch — The Worst Bug Pattern
```java
// ❌ NEVER DO THIS
try {
    riskyOperation();
} catch (Exception e) {
    // Do nothing — error is silently swallowed!
}
// The program continues as if nothing happened, but data may be corrupted!
```
**Fix:** At minimum, log the error: `System.err.println("Error: " + e.getMessage());`

## Gap 2: catch Order Matters — More Specific First
```java
// ❌ WRONG — unreachable code!
try { ... }
catch (Exception e) { ... }          // Catches EVERYTHING — too broad!
catch (IOException e) { ... }        // Never reached — compile error!

// ✅ CORRECT — specific first
try { ... }
catch (IOException e) { ... }        // Specific
catch (Exception e) { ... }          // General fallback
```

## Gap 3: finally Runs Even After return
```java
public static int test() {
    try {
        return 1;
    } finally {
        System.out.println("finally runs!");  // This STILL prints before returning!
    }
}
```

## Gap 4: Checked vs Unchecked — Practical Rule
- **Unchecked (extend RuntimeException):** For programmer errors — wrong index, null pointer. NOT expected to be caught.
- **Checked (extend Exception):** For environmental problems — file not found, network timeout. EXPECTED to be caught.

## 📚 Resources
| Topic | Link |
|-------|------|
| Exception basics | [Oracle Exception Tutorial](https://docs.oracle.com/javase/tutorial/essential/exceptions/) |
| Custom exceptions | [Baeldung: Custom Exceptions](https://www.baeldung.com/java-new-custom-exception) |

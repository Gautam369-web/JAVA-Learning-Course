# 🟢 Chapter Summary — Chapter 6: Exception Handling

## 📋 What This Chapter Covers
Exception handling makes your programs **crash-proof**. Instead of dying with an ugly error, your program can detect problems, handle them gracefully, and keep running (or shut down cleanly with a helpful message).

## 🗺️ Topic Map
```
CHAPTER 6: EXCEPTION HANDLING
│
├── 1. try-catch-finally
│   ├── try     → Code that might fail
│   ├── catch   → What to do if it fails
│   └── finally → Always runs (cleanup)
│
├── 2. Exception Types
│   ├── Checked   → Must be handled (IOException, SQLException)
│   └── Unchecked → Optional to handle (NullPointerException, ArithmeticException)
│
├── 3. throws Clause
│   └── Declare that a method might throw an exception
│
├── 4. Custom Exceptions
│   └── Extend Exception or RuntimeException
│
└── 5. Try-with-Resources
    └── Auto-close resources (files, connections)
```

## 💡 5 Key Takeaways
1. **try-catch is the core pattern** — surround risky code in try, handle failure in catch.
2. **finally ALWAYS runs** — use it for cleanup (closing files, releasing connections).
3. **Checked exceptions must be declared** — `throws IOException` in method signature.
4. **Custom exceptions make code readable** — `InsufficientFundsException` is clearer than a generic RuntimeException.
5. **Never swallow exceptions silently** — `catch(Exception e) {}` is a bug waiting to happen.

## 🌡️ Difficulty Rating
| Aspect | Rating |
|--------|--------|
| Concept difficulty | 🟡 Medium |
| Importance for production code | 🔴 Critical |

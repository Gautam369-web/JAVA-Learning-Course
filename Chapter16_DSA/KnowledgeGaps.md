# 🟠 Knowledge Gaps — Chapter 16: DSA

## Gap 1: Off-by-One in Binary Search
```java
// ❌ Common mistake: right = arr.length (should be arr.length - 1)
int right = arr.length;  // arr[right] doesn't exist!

// ✅ Correct:
int right = arr.length - 1;

// Also: mid = (left + right) / 2 can OVERFLOW for large arrays!
// ✅ Safe: mid = left + (right - left) / 2;
```

## Gap 2: Recursion Without Base Case = StackOverflowError
```java
// ❌ Missing base case
public static int bad(int n) {
    return bad(n - 1);  // Never stops! Stack overflow!
}

// ✅ Always define the base case FIRST
public static int good(int n) {
    if (n <= 0) return 0;  // Base case stops the recursion
    return n + good(n - 1);
}
```

## Gap 3: Sorting Terminology
- **Stable sort:** Equal elements maintain their relative order (TimSort — Java's default)
- **In-place sort:** No extra array needed (Bubble, Selection, Insertion)
- **Comparison sort:** Cannot be faster than O(n log n) by theorem
- **Counting sort:** O(n+k) — faster than O(n log n) for small integer ranges

## Gap 4: When NOT to Use Recursion
```java
// Fibonacci with plain recursion: O(2^n) — exponential! Terrible!
// fib(40) makes 2^40 ≈ 1 BILLION calls!

// Use memoization or iteration instead:
public static int fib(int n) {
    int a = 0, b = 1;
    for (int i = 2; i <= n; i++) {
        int temp = a + b;
        a = b;
        b = temp;
    }
    return b;
}  // O(n) — much better!
```

## 📚 Resources
| Resource | Best For |
|---------|---------|
| [LeetCode](https://leetcode.com) | Interview practice (start with Easy) |
| [NeetCode.io](https://neetcode.io) | Structured DSA roadmap |
| [GeeksForGeeks DSA](https://www.geeksforgeeks.org/data-structures/) | Theory + examples |
| *Cracking the Coding Interview* | Book for interview prep |

# 🟡 Pareto 80/20 — Chapter 16: DSA

## ⭐ Critical 20% — Master These First

### 1. HashMap for Frequency Counting (Solves ~25% of array problems)
```java
String s = "hello world";
HashMap<Character, Integer> freq = new HashMap<>();
for (char c : s.toCharArray()) {
    freq.put(c, freq.getOrDefault(c, 0) + 1);
}
// freq: {h=1, e=1, l=3, o=2, ' '=1, w=1, r=1, d=1}
```

### 2. Two Pointers (Pair sum, palindrome check, reverse)
```java
// Check if array has pair that sums to target (sorted array)
int[] nums = {1, 2, 3, 4, 6};
int target = 6;
int left = 0, right = nums.length - 1;
while (left < right) {
    int sum = nums[left] + nums[right];
    if (sum == target) { System.out.println(left + ", " + right); break; }
    else if (sum < target) left++;
    else right--;
}
```

### 3. Binary Search (Must know by heart)
```java
public static int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;  // Avoids overflow vs (left+right)/2
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}
```

### 4. Recursion — Base Case FIRST
```java
// Factorial
public static int factorial(int n) {
    if (n <= 1) return 1;          // BASE CASE — always first!
    return n * factorial(n - 1);   // Recursive case
}

// Fibonacci (inefficient but shows pattern)
public static int fib(int n) {
    if (n <= 1) return n;          // Base case
    return fib(n-1) + fib(n-2);   // Recursive case
}
```

### 5. Stack & Queue
```java
import java.util.*;

// Stack
Stack<Integer> stack = new Stack<>();
stack.push(1); stack.push(2); stack.push(3);
System.out.println(stack.pop());  // 3 (LIFO)

// Queue (use ArrayDeque, not Queue interface directly)
Queue<Integer> queue = new ArrayDeque<>();
queue.offer(1); queue.offer(2); queue.offer(3);
System.out.println(queue.poll());  // 1 (FIFO)
```

## Big-O Cheat Sheet
| Data Structure | Access | Search | Insert | Delete |
|---------------|--------|--------|--------|--------|
| Array | O(1) | O(n) | O(n) | O(n) |
| ArrayList | O(1) | O(n) | O(n) | O(n) |
| LinkedList | O(n) | O(n) | O(1) | O(1) |
| HashMap | O(1) | O(1) | O(1) | O(1) |
| Binary Search Tree | O(log n) | O(log n) | O(log n) | O(log n) |

## 🎯 Checklist
- [ ] I can explain O(1), O(n), O(log n), O(n²)
- [ ] I can implement binary search from memory
- [ ] I can use HashMap for frequency counting
- [ ] I can use the two-pointer technique
- [ ] I can write a recursive function with a base case
- [ ] I know when to use Stack vs Queue

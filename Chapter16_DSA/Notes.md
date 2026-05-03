# Chapter 16 - Data Structures and Algorithms in Java

Data Structures and Algorithms, usually called DSA, teach you how to choose the right way to store and process data. This is important for interviews and for writing efficient programs.

---

## Goals of Chapter 16
- Understand Big-O notation.
- Learn core data structures.
- Practice searching, sorting, and recursion.
- Build problem-solving confidence from beginner to advanced.

## Sub-topics
| Section | Topic | Description |
| :--- | :--- | :--- |
| **16.1** | **Big-O** | Measure growth of time and memory |
| **16.2** | **Arrays and Strings** | Common interview foundation |
| **16.3** | **Stack and Queue** | Last-in-first-out and first-in-first-out |
| **16.4** | **Searching and Sorting** | Find and arrange data |
| **16.5** | **Recursion** | Solve a problem using smaller versions |
| **16.6** | **Trees and Graphs** | Model hierarchy and networks |

---

## 16.1 Big-O: The "Growth Meter"

Big-O describes how an algorithm grows as input grows.

Examples:
| Big-O | Meaning | Example |
| :--- | :--- | :--- |
| `O(1)` | Constant | Access array index |
| `O(n)` | Linear | Loop through array |
| `O(n^2)` | Quadratic | Nested loops |
| `O(log n)` | Logarithmic | Binary search |

Beginner rule: one loop is usually `O(n)`, nested loops are often `O(n^2)`.

---

## 16.2 Arrays and Strings

Example: find maximum number.
```java
int[] numbers = {4, 9, 2, 7};
int max = numbers[0];

for (int n : numbers) {
    if (n > max) {
        max = n;
    }
}

System.out.println(max);
```

This is `O(n)` because we inspect every number once.

---

## 16.3 Stack and Queue

Stack: last item added is removed first.
```java
import java.util.Stack;

Stack<String> stack = new Stack<>();
stack.push("A");
stack.push("B");
System.out.println(stack.pop()); // B
```

Queue: first item added is removed first.
```java
import java.util.LinkedList;
import java.util.Queue;

Queue<String> queue = new LinkedList<>();
queue.add("A");
queue.add("B");
System.out.println(queue.poll()); // A
```

---

## 16.4 Searching and Sorting

Linear search checks one by one.
```java
static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    return -1;
}
```

Binary search works only on sorted data.
```java
static int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}
```

---

## 16.5 Recursion

Recursion means a method calls itself.

```java
static int factorial(int n) {
    if (n == 0) {
        return 1;
    }
    return n * factorial(n - 1);
}
```

Every recursion needs:
- A base case.
- A smaller problem.

---

## 16.6 Trees and Graphs

Tree: data with parent-child relationships.
Graph: data with connected nodes.

Examples:
- File folders form a tree.
- Social networks form a graph.
- Website links form a graph.

At beginner level, learn traversal:
- Tree: preorder, inorder, postorder.
- Graph: BFS and DFS.

---

## Chapter Summary
DSA is not about memorizing code. It is about recognizing patterns: count, search, sort, store, traverse, and optimize.


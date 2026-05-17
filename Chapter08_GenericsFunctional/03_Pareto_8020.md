# 🟡 Pareto 80/20 — Chapter 8: Generics & Functional

## ⭐ Critical 20%

### 1. Generic Class
```java
public class Box<T> {
    private T value;
    public Box(T value) { this.value = value; }
    public T getValue() { return value; }
}
// Usage:
Box<String> stringBox = new Box<>("Hello");
Box<Integer> intBox = new Box<>(42);
```

### 2. Lambda Expressions
```java
// Old way (anonymous class)
Runnable r = new Runnable() {
    public void run() { System.out.println("Running"); }
};
// Lambda way (Java 8+)
Runnable r = () -> System.out.println("Running");

// With parameters
Comparator<String> comp = (a, b) -> a.compareTo(b);
```

### 3. Stream Pipeline — The Power Pattern
```java
import java.util.*;
import java.util.stream.*;

List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Get sum of even numbers > 4, doubled
int result = nums.stream()
    .filter(n -> n % 2 == 0)   // [2, 4, 6, 8, 10]
    .filter(n -> n > 4)         // [6, 8, 10]
    .map(n -> n * 2)            // [12, 16, 20]
    .reduce(0, Integer::sum);   // 48

System.out.println(result);  // 48
```

### 4. Common Stream Operations
```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

// Filter
names.stream().filter(n -> n.length() > 3).collect(Collectors.toList());
// ["Alice", "Charlie", "Dave"]

// Map
names.stream().map(String::toUpperCase).collect(Collectors.toList());
// ["ALICE", "BOB", "CHARLIE", "DAVE"]

// Count
long count = names.stream().filter(n -> n.startsWith("A")).count();
// 1

// Sort and collect
names.stream().sorted().collect(Collectors.toList());
// ["Alice", "Bob", "Charlie", "Dave"]
```

## 🎯 Checklist
- [ ] I can write a generic class with type parameter T
- [ ] I understand lambda syntax: (params) -> body
- [ ] I can chain stream operations: filter → map → collect
- [ ] I know the difference between intermediate and terminal operations

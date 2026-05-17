# 🟡 Pareto 80/20 — Chapter 5: Collections

## ⭐ Critical 20% — Master These

### 1. ArrayList — The Most Used Collection
```java
import java.util.ArrayList;

ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Charlie");

System.out.println(names.get(1));    // Bob
System.out.println(names.size());    // 3
names.remove("Bob");
System.out.println(names.contains("Alice")); // true

for (String name : names) {
    System.out.println(name);
}
```

### 2. HashMap — Key-Value Storage
```java
import java.util.HashMap;

HashMap<String, Integer> scores = new HashMap<>();
scores.put("Alice", 95);
scores.put("Bob", 87);
scores.put("Charlie", 92);

System.out.println(scores.get("Bob"));           // 87
System.out.println(scores.containsKey("Alice")); // true
System.out.println(scores.size());               // 3

// Iterate
for (String name : scores.keySet()) {
    System.out.println(name + ": " + scores.get(name));
}
```

### 3. HashSet — Unique Elements
```java
import java.util.HashSet;

HashSet<String> fruits = new HashSet<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Apple");  // Duplicate — silently ignored!

System.out.println(fruits.size());          // 2, not 3!
System.out.println(fruits.contains("Apple")); // true
```

### 4. Collections Utility Methods
```java
import java.util.Collections;

ArrayList<Integer> nums = new ArrayList<>(List.of(3, 1, 4, 1, 5));
Collections.sort(nums);      // [1, 1, 3, 4, 5]
Collections.reverse(nums);   // [5, 4, 3, 1, 1]
Collections.max(nums);       // 5
Collections.min(nums);       // 1
```

## 🎯 Focus Checklist
- [ ] I can create ArrayList, HashMap, HashSet with generics
- [ ] I know: add(), get(), remove(), size(), contains() for ArrayList
- [ ] I know: put(), get(), containsKey(), keySet() for HashMap
- [ ] I can iterate any collection with for-each
- [ ] I know when to use List vs Set vs Map

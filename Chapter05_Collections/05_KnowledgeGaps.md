# 🟠 Knowledge Gaps — Chapter 5: Collections

## Gap 1: Raw Types — The Compiler Warning You Ignore at Your Peril
```java
ArrayList list = new ArrayList();  // ❌ Raw type — no type safety!
list.add("Hello");
list.add(42);       // Mixes types — disaster waiting!
String s = (String) list.get(1); // ❌ ClassCastException at runtime!

ArrayList<String> safeList = new ArrayList<>();  // ✅ Generic type
safeList.add("Hello");
// safeList.add(42);  // ✅ Compile error — caught early!
```

## Gap 2: HashMap Returns null for Missing Keys
```java
HashMap<String, Integer> map = new HashMap<>();
map.put("Alice", 95);
System.out.println(map.get("Bob")); // ← prints null, not 0!
// Fix:
int score = map.getOrDefault("Bob", 0); // Returns 0 if key missing
```

## Gap 3: Iteration Order
- `ArrayList` — maintains insertion order ✅
- `HashSet` — NO guaranteed order ❌
- `TreeSet` — sorted ascending ✅
- `HashMap` — NO guaranteed order ❌
- `LinkedHashMap` — maintains insertion order ✅ (use this if you need ordered map)

## Gap 4: ConcurrentModificationException
```java
// ❌ Never modify a list while iterating over it!
for (String s : list) {
    if (s.equals("Bob")) list.remove(s); // EXCEPTION!
}
// ✅ Use Iterator.remove() or collect to a separate list
list.removeIf(s -> s.equals("Bob")); // Java 8+ clean way
```

## 📚 Resources
| Resource | Link |
|---------|------|
| Collections overview | [Oracle Java Tutorial: Collections](https://docs.oracle.com/javase/tutorial/collections/) |
| ArrayList vs LinkedList | [Baeldung comparison](https://www.baeldung.com/java-arraylist-linkedlist) |

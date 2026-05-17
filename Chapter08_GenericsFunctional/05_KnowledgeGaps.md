# 🟠 Knowledge Gaps — Chapter 8: Generics & Functional

## Gap 1: Streams Don't Modify the Original
```java
List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
nums.stream().filter(n -> n > 2).collect(Collectors.toList());
System.out.println(nums); // [1, 2, 3, 4, 5] ← UNCHANGED!
// You must assign the result:
List<Integer> filtered = nums.stream().filter(n -> n > 2).collect(Collectors.toList());
```

## Gap 2: Streams Can Only Be Used Once
```java
Stream<Integer> stream = nums.stream().filter(n -> n > 2);
stream.collect(Collectors.toList());  // OK
stream.collect(Collectors.toList());  // ❌ IllegalStateException — stream already consumed!
```

## Gap 3: Type Erasure — Generics at Runtime
```java
List<String> strings = new ArrayList<>();
List<Integer> ints = new ArrayList<>();
System.out.println(strings.getClass() == ints.getClass());  // true!
// At runtime, both are just ArrayList — generic type info is erased
```

## 📚 Resources
| Topic | Resource |
|-------|---------|
| Streams | [Baeldung: Java 8 Streams](https://www.baeldung.com/java-8-streams) |
| Lambdas | [Oracle Lambda Tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html) |

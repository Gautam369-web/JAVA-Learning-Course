# 🟣 Self-Test Questions — Chapter 8: Generics & Functional

## 🟢 BASIC
**Q1.** What is the purpose of generics in Java?
**Q2.** What is a lambda expression? Write one that squares a number.
**Q3.** True/False: Streams modify the original collection.
**Q4.** What is the difference between intermediate and terminal stream operations?

## 🟡 INTERMEDIATE
**Q5.** Given `List<String> words = Arrays.asList("hello", "world", "java", "stream")`, use streams to:
- Find all words with length > 4
- Convert them to uppercase
- Collect to a new List and print

**Q6.** Write a generic method `<T extends Comparable<T>> T findMax(List<T> list)` that returns the maximum element.

**Q7.** Rewrite this loop as a Stream operation:
```java
List<String> result = new ArrayList<>();
for (String s : names) {
    if (s.startsWith("A")) result.add(s.toUpperCase());
}
```

## 🔴 ADVANCED
**Q8.** Explain `map()` vs `flatMap()` with an example.
**Q9.** Using Collectors.groupingBy(), group a list of students by their grade (A, B, C).
**Q10.** What is a method reference? Rewrite `name -> System.out.println(name)` using one.

<details>
<summary>💡 Hints</summary>
- Q7: `.stream().filter(s -> s.startsWith("A")).map(String::toUpperCase).collect(Collectors.toList())`
- Q10: `System.out::println`
</details>

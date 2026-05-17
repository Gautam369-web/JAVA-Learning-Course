# 🟣 Self-Test Questions — Chapter 5: Collections

## 🟢 BASIC
**Q1.** What is the difference between `ArrayList` and an array?
**Q2.** What does `HashMap.get("key")` return if the key doesn't exist?
**Q3.** True/False: HashSet maintains insertion order.
**Q4.** Which collection would you use to store unique email addresses?

## 🟡 INTERMEDIATE
**Q5.** Write code to count the frequency of each word in a sentence using HashMap.
**Q6.** Write code that removes all duplicate numbers from an ArrayList using a HashSet.
**Q7.** What is the output?
```java
HashMap<String, Integer> map = new HashMap<>();
map.put("a", 1); map.put("b", 2); map.put("a", 3);
System.out.println(map.size());
System.out.println(map.get("a"));
```

## 🔴 ADVANCED
**Q8.** Sort an ArrayList of custom `Student` objects by GPA using `Collections.sort()` and `Comparable`.
**Q9.** Explain the time complexity of: ArrayList.get(i), ArrayList.add(e), HashMap.get(k), HashSet.contains(e).
**Q10.** When would you choose `LinkedList` over `ArrayList`? Give a specific use case.

<details>
<summary>💡 Hints</summary>
- Q2: Returns null (not 0 or exception)
- Q7: size=2 (key "a" was overwritten), get("a")=3
- Q9: ArrayList.get=O(1), ArrayList.add=O(1) amortized, HashMap.get=O(1) avg, HashSet.contains=O(1) avg
</details>

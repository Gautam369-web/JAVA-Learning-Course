# Chapter 18 - Full Practice Questions

## Problem 1 - Beginner: Stack and Heap Identification

**Problem Statement**  
Read a variable type and identify whether it mainly represents stack data, heap data, or a reference.

Allowed input values:
- `local-int`
- `object`
- `reference`

**Input Format**
```text
type
```

**Output Format**
```text
Memory Area: <area>
```

**Sample Input**
```text
object
```

**Sample Output**
```text
Memory Area: Heap
```

---

## Problem 2 - Intermediate: Same Object Reference

**Problem Statement**  
Create one `Student` object and assign it to two references. Change the name using the second reference and print the name using the first reference.

**Input Format**
```text
originalName
newName
```

**Output Format**
```text
Name from first reference: <newName>
```

**Sample Input**
```text
Asha
Ravi
```

**Sample Output**
```text
Name from first reference: Ravi
```

---

## Problem 3 - Advanced: Detect Growing Memory Usage

**Problem Statement**  
Simulate a memory growth problem by repeatedly adding log messages into a static list. Read the number of messages and print the final list size. Then explain why this can become a memory leak if the list is never cleared.

**Input Format**
```text
messageCount
```

**Output Format**
```text
Stored messages: <messageCount>
Potential memory leak: true
```

**Sample Input**
```text
1000
```

**Sample Output**
```text
Stored messages: 1000
Potential memory leak: true
```


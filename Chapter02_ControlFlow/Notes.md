# Chapter 2 – Control Flow

## 2.1 Conditional Statements
### `if‑else`
```java
int n = 7;
if (n % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```
**Output**:
```text
Odd
```

### `switch`
```java
char grade = 'B';
switch (grade) {
    case 'A':
        System.out.println("Excellent");
        break;
    case 'B':
    case 'C':
        System.out.println("Good");
        break;
    default:
        System.out.println("Needs improvement");
}
```
**Output**:
```text
Good
```

---
## 2.2 Loops
### `for` loop (classic)
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```
**Output**:
```text
1
2
3
4
5
```

### Enhanced `for` (foreach)
```java
int[] arr = {2, 4, 6};
for (int val : arr) {
    System.out.println(val);
}
```
**Output**:
```text
2
4
6
```

### `while` loop
```java
int i = 0;
while (i < 3) {
    System.out.println(i);
    i++;
}
```
**Output**:
```text
0
1
2
```

### `do‑while` loop
```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 3);
```
**Output**:
```text
0
1
2
```

---
## 2.3 Controlling Loop Execution
```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) continue; // print only odd numbers
    System.out.println(i);
}
```
**Output**:
```text
1
3
5
7
9
```

---
## 2.4 Nested Control Structures
```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print(i * j + " ");
    }
    System.out.println();
}
```
**Output**:
```text
1 2 3 
2 4 6 
3 6 9 
```

---
## 2.5 Practice Problems
*Ready for a challenge? Check the Practice_Questions.md file for Chapter 2 tasks!*

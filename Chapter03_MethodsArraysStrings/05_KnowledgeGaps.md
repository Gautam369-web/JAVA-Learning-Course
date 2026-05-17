# 🟠 Knowledge Gaps — Chapter 3: Methods, Arrays & Strings

---

## Gap 1: "Strings are immutable — what does that even mean?"

### ❌ The Misconception
```java
String name = "Gautam";
name.toUpperCase();
System.out.println(name); // Beginner expects: GAUTAM
```
### ✅ The Reality
```
Output: Gautam    ← unchanged!
```
`toUpperCase()` doesn't change `name`. It **creates and returns a NEW String**. The original `name` is unchanged because Strings are **immutable** (cannot be modified in place).

### 🔧 Fix
```java
String name = "Gautam";
name = name.toUpperCase();  // Reassign!
System.out.println(name);   // GAUTAM ✅
```
**Rule:** Every String method that "changes" the string actually returns a new one. Always **reassign** if you want to keep the result.

---

## Gap 2: Array Index Out of Bounds — The Most Common Runtime Error

### ❌ The Bug
```java
int[] arr = {10, 20, 30};  // Valid indices: 0, 1, 2
System.out.println(arr[3]); // ❌ ArrayIndexOutOfBoundsException!
```
Arrays go from index `0` to `length - 1`. Accessing `arr[3]` on a 3-element array is like asking for seat #4 on a 3-seat bench — it doesn't exist.

### ✅ Safe Pattern
```java
if (index >= 0 && index < arr.length) {
    System.out.println(arr[index]);
} else {
    System.out.println("Invalid index!");
}
```

---

## Gap 3: `String ==` Comparison — The Classic Trap

### ❌ The Bug
```java
String a = new String("hello");
String b = new String("hello");
if (a == b) System.out.println("Same!"); // Never prints!
```
`==` compares **memory addresses** (are they the exact same object?), not content.

### ✅ Fix
```java
if (a.equals(b)) System.out.println("Same!"); // ✅ Compares content
```
**The golden rule:** `==` for primitives (`int`, `double`). `.equals()` for objects (`String`, and everything else).

---

## Gap 4: Arrays Are Fixed Size

### ❌ The Misconception
"I'll add more elements to the array later."

### ✅ The Reality
```java
int[] arr = new int[3]; // Fixed at 3 elements — you CANNOT resize!
arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
arr[3] = 40; // ❌ ArrayIndexOutOfBoundsException
```
If you need a resizable collection, use `ArrayList` (Chapter 5).

---

## Gap 5: Methods Don't Modify Primitive Parameters (Pass-by-Value)

### ❌ The Misconception
```java
public static void doubleIt(int x) {
    x = x * 2;  // Beginner thinks this changes the original
}

int num = 5;
doubleIt(num);
System.out.println(num);  // Beginner expects: 10
```
### ✅ The Reality
```
Output: 5    ← unchanged!
```
Java passes a **copy** of `num` to the method. The original `num` is untouched.

### 🔧 Fix
```java
public static int doubleIt(int x) {
    return x * 2;  // Return the new value
}
int num = 5;
num = doubleIt(num);  // Capture the return value!
System.out.println(num); // 10 ✅
```

---

## 📚 Suggested Resources

| Gap | Resource |
|-----|---------|
| String immutability | [Baeldung: String Immutability in Java](https://www.baeldung.com/java-string-immutability) |
| Array bounds | [GeeksForGeeks: Arrays in Java](https://www.geeksforgeeks.org/arrays-in-java/) |
| Pass by value | [Oracle Java Tutorial: Passing Primitive Data Types](https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html) |
| String methods cheatsheet | [W3Schools: Java String Methods](https://www.w3schools.com/java/java_ref_string.asp) |

# 🟣 Self-Test Questions — Chapter 3: Methods, Arrays & Strings

---

## 🟢 BASIC Level

**Q1.** What keyword is used when a method does NOT return a value?

**Q2.** What is the index of the FIRST element and the LAST element of: `int[] arr = {5, 10, 15, 20}`?

**Q3.** What does this return?
```java
String s = "Hello, World!";
System.out.println(s.length());
System.out.println(s.substring(7, 12));
System.out.println(s.toUpperCase());
```

**Q4.** True or False:
- (a) You can add more elements to an array after it's created.
- (b) `"abc".equals("abc")` returns true.
- (c) `"abc" == "abc"` always returns true.
- (d) Arrays are 0-indexed in Java.

**Q5.** What is wrong with this method?
```java
public static int multiply(int a, int b) {
    int result = a * b;
    // missing something!
}
```

---

## 🟡 INTERMEDIATE Level

**Q6.** Write a method `findMax(int[] arr)` that returns the largest number in the array.

**Q7.** Write a method `reverseString(String s)` that returns the string reversed. (e.g., "Java" → "avaJ")

**Q8.** What is the output? Trace step by step:
```java
public static void changeIt(int x) {
    x = x * 10;
}
public static void main(String[] args) {
    int num = 5;
    changeIt(num);
    System.out.println(num);
}
```

**Q9.** Write overloaded methods:
- `double area(double radius)` — computes circle area (π × r²)
- `double area(double base, double height)` — computes triangle area (½ × b × h)

**Q10.** Given `String s = "   Java Programming   "`, write code to:
- Remove leading/trailing spaces
- Convert to uppercase
- Check if it contains "JAVA" (after uppercasing)
- Print the result

**Q11.** Write a method `countVowels(String s)` that returns the number of vowels (a,e,i,o,u) in the string (case-insensitive).

---

## 🔴 ADVANCED Level

**Q12.** What is the output?
```java
String a = "hello";
String b = a;
b = b.toUpperCase();
System.out.println(a);
System.out.println(b);
```
Explain WHY each variable has its value.

**Q13.** Write a method `isSorted(int[] arr)` that returns `true` if the array is sorted in ascending order, `false` otherwise.

**Q14.** Write a method `rotateLeft(int[] arr, int k)` that rotates an array to the left by `k` positions.
- Input: `[1, 2, 3, 4, 5]`, k=2
- Output: `[3, 4, 5, 1, 2]`

**Q15.** Explain the difference between:
```java
String s1 = "hello";          // Approach A
String s2 = new String("hello"); // Approach B
```
Which approach is preferred and why?

**Q16.** [Bug Hunt] Find all bugs:
```java
public static int sumArray(int[] arr) {
    int sum;
    for (int i = 1; i <= arr.length; i++) {
        sum = sum + arr[i];
    }
}
```
*(There are at least 4 bugs)*

**Q17.** Write a 2D array program that:
- Creates a 3×3 matrix with user input
- Computes the sum of each row and prints it
- Finds and prints the largest element in the matrix

**Q18.** [Performance] You need to concatenate 10,000 strings in a loop. Explain why this is bad:
```java
String result = "";
for (int i = 0; i < 10000; i++) {
    result = result + "X";
}
```
What should you use instead and why?

---

<details>
<summary>💡 Hints (check only after trying!)</summary>

- **Q5:** Missing `return result;`
- **Q8:** Java passes a **copy** of `num`. The method changes its local copy only.
- **Q12:** `b = b.toUpperCase()` creates a new String object. `a` still points to the original "hello".
- **Q16 bugs:** `int sum;` (uninitialized), `i = 1` should be `i = 0`, `i <= arr.length` should be `i < arr.length`, missing `return sum;`
- **Q18:** Each `+` creates a new String object. Use `StringBuilder` instead — it modifies in-place and is O(n) vs O(n²).

</details>

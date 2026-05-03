# Chapter 7 – Generics & Functional Solutions

These solutions demonstrate how to use Generics for flexibility and Lambdas/Streams for modern, concise code.

---

## Solution 1: The Dynamic Pair (Generics)
```java
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void display() {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("Gautam", 21);
        p.display();
    }
}
```
**Output**:
```text
Key: Gautam, Value: 21
```

---

## Solution 2: The Lambda Math (Lambdas)
```java
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        MathOperation multi = (a, b) -> a * b;
        System.out.println("Result: " + multi.operate(5, 4));
    }
}
```
**Output**:
```text
Result: 20
```

---

## Solution 3: Filter the Crowd (Streams)
```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 25, 15, 40, 5, 30);
        
        List<Integer> filtered = nums.stream()
            .filter(n -> n > 20)
            .collect(Collectors.toList());

        System.out.println("Filtered: " + filtered);
    }
}
```
**Output**:
```text
Filtered: [25, 40, 30]
```

---

## Solution 4: The Uppercase Map (Streams)
```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("java", "python", "cpp", "javascript");
        
        List<String> upper = langs.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        System.out.println("Result: " + upper);
    }
}
```
**Output**:
```text
Result: [JAVA, PYTHON, CPP, JAVASCRIPT]
```

---

## Solution 5: String Length Checker (Predicate)
```java
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> isLong = (s) -> s.length() > 5;
        
        String test = "Antigravity";
        System.out.println("Is '" + test + "' long? " + isLong.test(test));
    }
}
```
**Output**:
```text
Is 'Antigravity' long? true
```

---

## Solution 6: The Logger (Consumer)
```java
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> logger = (msg) -> System.out.println("SYSTEM_LOG: " + msg);
        
        logger.accept("Update started...");
    }
}
```
**Output**:
```text
SYSTEM_LOG: Update started...
```

---

## Solution 7: Sum of Even Numbers (Streams)
```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        
        int sum = nums.stream()
            .filter(n -> n % 2 == 0)
            .mapToInt(Integer::intValue)
            .sum();

        System.out.println("Sum of evens: " + sum);
    }
}
```
**Output**:
```text
Sum of evens: 12
```

---

## Solution 8: Generic Method (Generics)
```java
import java.util.Arrays;

public class Main {
    public static <T> void printArray(T[] array) {
        System.out.println("Array: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3};
        String[] strArr = {"A", "B", "C"};

        printArray(intArr);
        printArray(strArr);
    }
}
```
**Output**:
```text
Array: [1, 2, 3]
Array: [A, B, C]
```

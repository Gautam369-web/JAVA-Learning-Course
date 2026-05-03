# Chapter 7 – Generics & Functional Programming

## 7.2 Generic Classes
```java
class Box<T> {
    private T content;
    public void set(T content) { this.content = content; }
    public T get() { return content; }
}

public class Main {
    public static void main(String[] args) {
        Box<String> nameBox = new Box<>();
        nameBox.set("Java");
        System.out.println("Box contains: " + nameBox.get());

        Box<Integer> numberBox = new Box<>();
        numberBox.set(100);
        System.out.println("Box contains: " + numberBox.get());
    }
}
```
**Output**:
```text
Box contains: Java
Box contains: 100
```

---

## 7.3 Lambda Expressions
```java
interface Greeting {
    void sayHello(String name);
}

public class Main {
    public static void main(String[] args) {
        Greeting lambdaWay = (name) -> System.out.println("Hi, " + name);
        lambdaWay.sayHello("Gautam");
    }
}
```
**Output**:
```text
Hi, Gautam
```

---

## 7.4 Functional Interfaces (Predicate)
```java
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isLarge = (n) -> n > 10;
        System.out.println("Is 5 large? " + isLarge.test(5));
        System.out.println("Is 15 large? " + isLarge.test(15));
    }
}
```
**Output**:
```text
Is 5 large? false
Is 15 large? true
```

---

## 7.5 The Streams API
```java
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");
        List<String> result = names.stream()
            .filter(name -> name.startsWith("A"))
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        System.out.println("Result: " + result);
    }
}
```
**Output**:
```text
Result: [ALICE]
```

# Chapter 4 – Collections Framework

## 4.2 ArrayList
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("First fruit: " + fruits.get(0));
        fruits.remove("Banana");
        System.out.println("List: " + fruits);
    }
}
```
**Output**:
```text
First fruit: Apple
List: [Apple, Mango]
```

---

## 4.3 LinkedList
```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> train = new LinkedList<>();
        train.add("Passenger Car");
        train.addFirst("Engine");
        train.addLast("Caboose");

        System.out.println("Train: " + train);
    }
}
```
**Output**:
```text
Train: [Engine, Passenger Car, Caboose]
```

---

## 4.4 HashSet
```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> ticketNumbers = new HashSet<>();
        ticketNumbers.add(101);
        ticketNumbers.add(102);
        ticketNumbers.add(101); // DUPLICATE!

        System.out.println("Tickets: " + ticketNumbers);
    }
}
```
**Output**:
```text
Tickets: [101, 102]
```

---

## 4.5 HashMap
```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Alice");
        students.put(2, "Bob");

        System.out.println("Student with ID 2: " + students.get(2));
        System.out.println("All students: " + students);
    }
}
```
**Output**:
```text
Student with ID 2: Bob
All students: {1=Alice, 2=Bob}
```

---

## 4.6 Iterating & Sorting
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);

        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            System.out.println("Number: " + it.next());
        }
    }
}
```
**Output**:
```text
Sorted: [10, 30, 50]
Number: 10
Number: 30
Number: 50
```

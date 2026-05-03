# Chapter 4 – Collections Solutions

These solutions demonstrate the practical usage of ArrayList, LinkedList, HashSet, and HashMap.

---

## Solution 1: The Grocery List (ArrayList)
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Apples");
        groceryList.add("Milk");
        groceryList.add("Bread");

        groceryList.remove("Milk");
        groceryList.add(1, "Eggs"); // Adds at index 1

        System.out.println("Final List: " + groceryList);
    }
}
```
**Output**:
```text
Final List: [Apples, Eggs, Bread]
```

---

## Solution 2: The Train Link (LinkedList)
```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> train = new LinkedList<>();
        train.add("Car 1");
        train.add("Car 2");

        train.addFirst("Engine");
        train.addLast("Caboose");

        System.out.println("Train: " + train);
    }
}
```
**Output**:
```text
Train: [Engine, Car 1, Car 2, Caboose]
```

---

## Solution 3: The Exclusive Club (HashSet)
```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> guests = new HashSet<>();
        guests.add("Alice");
        guests.add("Bob");
        guests.add("Charlie");
        guests.add("Alice"); // Duplicate

        System.out.println("Unique Guests: " + guests);
        System.out.println("Total Count: " + guests.size());
    }
}
```
**Output**:
```text
Unique Guests: [Alice, Bob, Charlie]
Total Count: 3
```

---

## Solution 4: The Mini Phonebook (HashMap)
```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> phonebook = new HashMap<>();
        phonebook.put("Alice", "9876543210");
        phonebook.put("Bob", "8888888888");
        phonebook.put("Charlie", "7777777777");

        System.out.println("Alice's Phone: " + phonebook.get("Alice"));
    }
}
```
**Output**:
```text
Alice's Phone: 9876543210
```

---

## Solution 5: Sorting High Scores (ArrayList + Sort)
```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(88);
        scores.add(95);

        Collections.sort(scores);
        System.out.println("Sorted Scores: " + scores);
    }
}
```
**Output**:
```text
Sorted Scores: [78, 85, 88, 92, 95]
```

---

## Solution 6: The Task Iterator (Iterator)
```java
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Homework");
        tasks.add("Cleaning");
        tasks.add("Cooking");
        tasks.add("Coding");

        Iterator<String> it = tasks.iterator();
        while(it.hasNext()) {
            System.out.println("Task: " + it.next());
        }
    }
}
```
**Output**:
```text
Task: Homework
Task: Cleaning
Task: Cooking
Task: Coding
```

---

## Solution 7: Key Search (HashMap)
```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Apple", 50);
        inventory.put("Banana", 30);

        if (inventory.containsKey("Apple")) {
            System.out.println("Apple found! Quantity: " + inventory.get("Apple"));
        }
    }
}
```
**Output**:
```text
Apple found! Quantity: 50
```

---

## Solution 8: Color Palette (ArrayList to HashSet)
```java
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        HashSet<String> uniqueColors = new HashSet<>(colors);

        System.out.println("Unique Colors: " + uniqueColors);
    }
}
```
**Output**:
```text
Unique Colors: [Red, Blue, Green]
```

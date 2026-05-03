# Chapter 4 – Collections Practice Questions

These 8 questions are designed to test your ability to store, organize, and manipulate dynamic data in Java.

---

## Problem 1 – The Grocery List (ArrayList)
**Problem Statement**: Create an `ArrayList` of Strings called `groceryList`.
- **Task**: Add "Apples", "Milk", and "Bread". Remove "Milk". Add "Eggs" to the second position (index 1).
- **Sample Input**: None
- **Sample Output**:
```text
Final List: [Apples, Eggs, Bread]
```

---

## Problem 2 – The Train Link (LinkedList)
**Problem Statement**: Create a `LinkedList` of Strings called `train`.
- **Task**: Add "Car 1", "Car 2". Use `addFirst()` to add "Engine" and `addLast()` to add "Caboose".
- **Sample Input**: None
- **Sample Output**:
```text
Train: [Engine, Car 1, Car 2, Caboose]
```

---

## Problem 3 – The Exclusive Club (HashSet)
**Problem Statement**: Use a `HashSet` to manage a guest list where no one can enter twice.
- **Task**: Add "Alice", "Bob", "Charlie", and then "Alice" again.
- **Sample Input**: None
- **Sample Output**:
```text
Unique Guests: [Alice, Bob, Charlie] (Order may vary)
Total Count: 3
```

---

## Problem 4 – The Mini Phonebook (HashMap)
**Problem Statement**: Create a `HashMap` where the **Key** is a Name (String) and the **Value** is a Phone Number (String).
- **Task**: Store 3 contacts. Retrieve and print the phone number for "Alice".
- **Sample Input**: None
- **Sample Output**:
```text
Alice's Phone: 9876543210
```

---

## Problem 5 – Sorting High Scores (ArrayList + Sort)
**Problem Statement**: Create an `ArrayList` of Integers.
- **Task**: Add the scores `85, 92, 78, 88, 95`. Sort them in ascending order and print the result.
- **Sample Input**: None
- **Sample Output**:
```text
Sorted Scores: [78, 85, 88, 92, 95]
```

---

## Problem 6 – The Task Iterator (Iterator)
**Problem Statement**: Create a list of 4 tasks.
- **Task**: Use an `Iterator` to loop through the list and print each task starting with "Task: ".
- **Sample Input**: None
- **Sample Output**:
```text
Task: Homework
Task: Cleaning
Task: Cooking
Task: Coding
```

---

## Problem 7 – Key Search (HashMap)
**Problem Statement**: Create a `HashMap` of items and their quantities.
- **Task**: Check if "Apple" exists in the map using `containsKey()`. If it does, print its quantity.
- **Sample Input**: `Apple` -> `50`, `Banana` -> `30`
- **Sample Output**:
```text
Apple found! Quantity: 50
```

---

## Problem 8 – Color Palette (ArrayList to HashSet)
**Problem Statement**: Create an `ArrayList` with duplicate colors: `["Red", "Blue", "Red", "Green", "Blue"]`.
- **Task**: Convert this list into a `HashSet` to remove all duplicates and print the result.
- **Sample Input**: None
- **Sample Output**:
```text
Unique Colors: [Red, Blue, Green]
```

---

### Instructions:
1. Create a separate `.java` file for each problem.
2. Use `System.out.println()` to verify your output matches the samples.
3. Pay close attention to **Generics** like `<String>` or `<Integer>`.

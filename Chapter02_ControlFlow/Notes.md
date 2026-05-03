# Chapter 2 – Control Flow

Programs don't just run in a straight line. They make decisions, repeat tasks, and skip steps based on conditions. This is called **Control Flow**.

---

## Goals of Chapter 2
- **Decision Making**: Use `if-else` and `switch` to make your program "smart."
- **Master Iteration**: Learn to use `for`, `while`, and `do-while` loops to repeat code.
- **Control Execution**: Use `break` and `continue` to fine-tune your loops.
- **Nested Logic**: Understand how to combine multiple control structures.

## Sub-topics
| Section | Topic | Description |
| :--- | :--- | :--- |
| **2.1** | **Conditionals** | The "Traffic Light" concept (`if`, `else`, `switch`) |
| **2.2** | **Loops** | The "Running Laps" concept (`for`, `while`, `do-while`) |
| **2.3** | **Enhanced for Loop** | Iterating through collections |
| **2.4** | **Loop Control** | Using `break` and `continue` |
| **2.5** | **Nested Loops** | Building grids and tables |

---

## 2.1 Conditional Statements: The "Traffic Light"

### 🚦 Real-Life Analogy
Imagine you are driving a car.
- **`if`**: If the light is Green, you GO.
- **`else if`**: If the light is Yellow, you SLOW DOWN.
- **`else`**: In any other case (Red), you STOP.
Conditionals let your program choose which path to take based on the "light" (The Condition).

### 💡 Human Understanding
The most important part of a conditional is the **Boolean Expression**. It must be either `true` or `false`.

### 💻 Code Implementation (if-else)
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

### 💻 Code Implementation (switch)
```java
char grade = 'B';
switch (grade) {
    case 'A': System.out.println("Excellent"); break;
    case 'B': System.out.println("Good"); break;
    case 'C': System.out.println("Average"); break;
    default: System.out.println("Needs improvement");
}
```
**Output**:
```text
Good
```

---

## 2.2 Loops: The "Running Laps"

### 🏃 Real-Life Analogy
Imagine a coach tells you to run laps around a track.

### 1. `for` Loop: The "Fixed Laps"
Use this when you know **exactly** how many times to repeat.
```java
for (int i = 1; i <= 3; i++) {
    System.out.println("Running lap " + i);
}
```
**Output**:
```text
Running lap 1
Running lap 2
Running lap 3
```

### 2. `while` Loop: The "Condition Laps"
Use this when you want to repeat **as long as** something is true (but you don't know when it will stop).
```java
int energy = 3;
while (energy > 0) {
    System.out.println("Running... Energy left: " + energy);
    energy--;
}
```
**Output**:
```text
Running... Energy left: 3
Running... Energy left: 2
Running... Energy left: 1
```

### 3. `do-while` Loop: The "At Least Once"
This loop executes the code **first**, and then checks the condition. It is guaranteed to run at least once.
```java
int count = 5;
do {
    System.out.println("This will print even if the condition is false!");
} while (count < 1);
```
**Output**:
```text
This will print even if the condition is false!
```

---

## 2.3 Enhanced for Loop: The "Scanner"
This is a modern, easier way to look at every item in a list or array.
```java
int[] scores = {90, 85, 77};
for (int s : scores) {
    System.out.println("Score: " + s);
}
```
**Output**:
```text
Score: 90
Score: 85
Score: 77
```

---

## 2.4 Loop Control: "The Shortcut"

### 🛑 Real-Life Analogy
- **`break`**: You stop the entire workout immediately.
- **`continue`**: You skip the rest of the current lap and start the next one.

### 💻 Code Implementation
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue; // Skip lap 3
    if (i == 5) break;    // Stop at 5
    System.out.println("Running lap " + i);
}
```
**Output**:
```text
Running lap 1
Running lap 2
Running lap 4
```

---

## 2.5 Nested Loops: The "Calendar"

### 💻 Code Implementation (3x3 Table)
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

## 2.6 Practice Questions (Chapter 2)

*Ready to control the flow? Check the Practice_Questions.md file for 8 logic challenges!*

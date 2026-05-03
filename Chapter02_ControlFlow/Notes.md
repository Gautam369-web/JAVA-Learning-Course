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
| **2.3** | **Loop Control** | Using `break` and `continue` |
| **2.4** | **Nested Loops** | Building grids and tables |

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
Imagine a coach tells you to run **5 Laps** around a track.
- **`for` loop**: You know exactly how many laps to run (5). You count them as you go.
- **`while` loop**: You run "while" your coach is still watching. You don't know how many laps that will be!
- **`do-while` loop**: You run at least one lap, and then check if the coach is still there.

### 💡 Human Understanding
- Use a **`for` loop** when you know the end point.
- Use a **`while` loop** when the end point depends on something else.

### 💻 Code Implementation (for)
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Lap " + i);
}
```
**Output**:
```text
Lap 1
Lap 2
Lap 3
Lap 4
Lap 5
```

---

## 2.3 Loop Control: "The Shortcut"

### 🛑 Real-Life Analogy
- **`break`**: You are running your laps, but you twist your ankle. You **stop immediately** and go home.
- **`continue`**: You are running, and you see a puddle. you **skip that one spot** and keep running the rest of the lap.

### 💻 Code Implementation
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue; // Skip lap 3
    System.out.println("Running lap " + i);
}
```
**Output**:
```text
Running lap 1
Running lap 2
Running lap 4
Running lap 5
```

---

## 2.4 Nested Loops: The "Calendar"

### 📅 Real-Life Analogy
Think of a **Calendar**.
- The "Outer Loop" moves through the **Months**.
- For every month, the "Inner Loop" moves through the **Days**.
This creates a grid of data.

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

## 2.5 Practice Problems (Chapter 2)

*Ready to control the flow? Check the Practice_Questions.md file for 8 logic challenges!*

# Chapter 10 – Advanced Java Tools

## 10.1 Enumerations (Enums)
```java
enum Level { LOW, MEDIUM, HIGH }

public class Main {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        switch(myVar) {
            case LOW: System.out.println("Low Level"); break;
            case MEDIUM: System.out.println("Medium Level"); break;
            case HIGH: System.out.println("High Level"); break;
        }
    }
}
```
**Output**:
```text
Medium Level
```

---

## 10.2 Date and Time API
```java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today); // Example: 2026-05-03

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println("Formatted: " + now.format(myFormat));
    }
}
```
**Output**:
```text
Today's Date: 2026-05-03
Formatted: 03-05-2026 17:02
```

---

## 10.4 Wrappers & Autoboxing
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // Autoboxing: int to Integer
        int n = list.get(0); // Unboxing: Integer to int
        System.out.println("Number: " + n);
    }
}
```
**Output**:
```text
Number: 10
```

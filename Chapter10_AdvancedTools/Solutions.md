# Chapter 10 – Advanced Java Tools Solutions

These solutions demonstrate the usage of Enums, the modern Date/Time API, and common Annotations.

---

## Solution 1: Days of the Week (Enums)
```java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void checkDay(Day d) {
        if (d == Day.SATURDAY || d == Day.SUNDAY) {
            System.out.println(d + " is a Weekend.");
        } else {
            System.out.println(d + " is a Weekday.");
        }
    }

    public static void main(String[] args) {
        checkDay(Day.SATURDAY);
    }
}
```
**Output**:
```text
SATURDAY is a Weekend.
```

---

## Solution 2: Traffic Light (Enums with Values)
```java
enum TrafficLight {
    RED(30), YELLOW(5), GREEN(45);

    private int duration;
    
    // Enum Constructor
    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() { return duration; }
}

public class Main {
    public static void main(String[] args) {
        for (TrafficLight t : TrafficLight.values()) {
            System.out.println(t + " light duration: " + t.getDuration() + " seconds");
        }
    }
}
```
**Output**:
```text
RED light duration: 30 seconds
YELLOW light duration: 5 seconds
GREEN light duration: 45 seconds
```

---

## Solution 3: Birthday Calculator (LocalDate)
```java
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2000, 1, 1);
        LocalDate today = LocalDate.now();

        long days = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("You are " + days + " days old.");
    }
}
```
**Output**:
```text
You are 9619 days old. (Example)
```

---

## Solution 4: The Future Date (LocalDateTime)
```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime future = now.plusWeeks(2).plusHours(3);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Future Date: " + future.format(format));
    }
}
```
**Output**:
```text
Future Date: 17/05/2026 14:30
```

---

## Solution 5: Overriding Check (Annotations)
```java
class Animal {
    void makeSound() { System.out.println("Generic Sound"); }
}

class Dog extends Animal {
    @Override
    void makeSound() { // If you named this 'makeSond', the @Override would cause an error!
        System.out.println("Bark!");
    }
}

public class Main {
    public static void main(String[] args) {
        new Dog().makeSound();
    }
}
```
**Output**:
```text
Bark!
```

---

## Solution 6: Autoboxing List (Wrappers)
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        
        // Autoboxing: primitive double becomes Double object
        list.add(10.5); 
        list.add(20.0);
        list.add(30.0);

        double sum = 0;
        for (Double d : list) {
            sum += d; // Unboxing: Double object becomes primitive double
        }
        System.out.println("Sum: " + sum);
    }
}
```
**Output**:
```text
Sum: 60.5
```

---

## Solution 7: Deprecated Warning (Annotations)
```java
public class Main {
    @Deprecated
    static void oldMethod() {
        System.out.println("This is an old method.");
    }

    public static void main(String[] args) {
        oldMethod(); // IDE will strike-through this method
    }
}
```
**Output**:
```text
This is an old method.
```

---

## Solution 8: Enum Iteration
```java
enum Season { WINTER, SPRING, SUMMER, FALL }

public class Main {
    public static void main(String[] args) {
        Season[] seasons = Season.values();
        for (Season s : seasons) {
            System.out.println(s);
        }
    }
}
```
**Output**:
```text
WINTER
SPRING
SUMMER
FALL
```

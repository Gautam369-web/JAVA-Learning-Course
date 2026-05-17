# Chapter 2 – Practice Problem Solutions

This file contains the annotated solutions for all Chapter 2 challenges.

---

## Part 1: General Logic

### Solution 1 – Fibonacci Series (`Fibonacci.java`)
```java
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        sc.close();
    }
}
```
**Output**:
```text
Input: 5
0 1 1 2 3 
```

---

## Part 2: forEach Loop Solutions

### Solution 4 – City Tour (`CityTour.java`)
```java
public class CityTour {
    public static void main(String[] args) {
        String[] cities = {"Mumbai", "Delhi", "Bangalore", "Hyderabad", "Chennai"};
        for (String city : cities) {
            System.out.println("Visiting: " + city);
        }
    }
}
```
**Output**:
```text
Visiting: Mumbai
Visiting: Delhi
Visiting: Bangalore
Visiting: Hyderabad
Visiting: Chennai
```

---

### Solution 5 – Total Score (`TotalScore.java`)
```java
public class TotalScore {
    public static void main(String[] args) {
        int[] scores = {80, 90, 70, 85, 95};
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        System.out.println(total);
    }
}
```
**Output**:
```text
420
```

---

### Solution 6 – The Highest Peak (`HighestPeak.java`)
```java
public class HighestPeak {
    public static void main(String[] args) {
        int[] heights = {1200, 4500, 8848, 3200};
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        System.out.println(max);
    }
}
```
**Output**:
```text
8848
```

---

### Solution 7 – Counting Evens (`EvenCounter.java`)
```java
public class EvenCounter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
**Output**:
```text
5
```

---

### Solution 8 – Security Check (`SecurityCheck.java`)
```java
import java.util.Scanner;

public class SecurityCheck {
    public static void main(String[] args) {
        String[] allowed = {"Alice", "Bob", "Charlie"};
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        boolean found = false;
        for (String guest : allowed) {
            if (guest.equalsIgnoreCase(input)) {
                found = true;
                break;
            }
        }
        
        System.out.println(found ? "Access Granted" : "Access Denied");
        sc.close();
    }
}
```
**Output**:
```text
Input: Bob
Access Granted
```

---

### Solution 9 – Fruit Filter (`FruitFilter.java`)
```java
public class FruitFilter {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Kiwi", "Orange", "Grape"};
        for (String f : fruits) {
            if (f.length() > 5) {
                System.out.println(f);
            }
        }
    }
}
```
**Output**:
```text
Banana
Orange
```

---

### Solution 10 – Weather Station (`TempConverter.java`)
```java
public class TempConverter {
    public static void main(String[] args) {
        double[] celsius = {0.0, 25.0, 100.0};
        for (double c : celsius) {
            double f = (c * 9/5) + 32;
            System.out.println(f);
        }
    }
}
```
**Output**:
```text
32.0
77.0
212.0
```

---

### Solution 11 – Billing System (`GSTCalculator.java`)
```java
public class GSTCalculator {
    public static void main(String[] args) {
        double[] prices = {100.0, 200.0, 50.0};
        for (double p : prices) {
            double finalPrice = p + (p * 0.18);
            System.out.println(finalPrice);
        }
    }
}
```
**Output**:
```text
118.0
236.0
59.0
```

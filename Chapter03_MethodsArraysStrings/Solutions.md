# Chapter 3 – Practice Problem Solutions

Annotated solutions for the challenges in Methods, Arrays & Strings.

---

## Solution 1 – Area of a Circle
```java
import java.util.Scanner;

public class CircleArea {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(calculateArea(r));
        sc.close();
    }
}
```

---

## Solution 2 – Maximum of Three
```java
public class MaxFinder {
    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMax(12, 45, 23));
    }
}
```

---

## Solution 3 – Reverse a String
```java
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println(reversed);
        sc.close();
    }
}
```

---

## Solution 4 – Vowel Counter
```java
import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        System.out.println("Vowels: " + count);
        sc.close();
    }
}
```

---

## Solution 5 – Sum of Array
```java
public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.println("Sum: " + sum);
    }
}
```

---

## Solution 6 – Search in Array
```java
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        String[] names = {"Amit", "Rahul", "Priya", "Sneha", "Kunal"};
        Scanner sc = new Scanner(System.in);
        String target = sc.next();
        boolean found = false;

        for (String name : names) {
            if (name.equalsIgnoreCase(target)) {
                found = true;
                break;
            }
        }

        if (found) System.out.println(target + " found in the list!");
        else System.out.println(target + " not found.");
        sc.close();
    }
}
```

---

## Solution 7 – Row Sum
```java
public class MatrixRowSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + i + " Sum: " + rowSum);
        }
    }
}
```

---

## Solution 8 – Matrix Diagonal
```java
public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.print("Diagonal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][i] + " ");
        }
    }
}
```

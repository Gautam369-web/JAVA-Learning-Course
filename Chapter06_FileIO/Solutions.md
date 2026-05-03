# Chapter 6 – File I/O Solutions

These solutions demonstrate the core operations of creating, writing, reading, and managing files in Java.

---

## Solution 1: The Birth of a File (File Creation)
```java
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("my_first_file.txt");
        try {
            if (file.exists()) {
                System.out.println("File already exists");
            } else {
                if (file.createNewFile()) {
                    System.out.println("File created successfully");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
```
**Output**:
```text
File created successfully
```

---

## Solution 2: Simple Writer (FileWriter)
```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter("diary.txt"))) {
            
            System.out.println("Enter a sentence: ");
            String input = sc.nextLine();
            writer.write(input);
            System.out.println("Data saved to diary.txt");
            
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
```
**Output**:
```text
Data saved to diary.txt
```

---

## Solution 3: The Reader (BufferedReader)
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("diary.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Line Content: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
```
**Output**:
```text
Line Content: Today was a great day of learning Java!
```

---

## Solution 4: Secret Message (Appending)
```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // 'true' means append mode is ON
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("secrets.txt", true))) {
            writer.newLine();
            writer.write("This is a new secret.");
            System.out.println("New secret added to the file.");
        } catch (IOException e) {
            System.out.println("Error appending to file.");
        }
    }
}
```
**Output**:
```text
New secret added to the file.
```

---

## Solution 5: Line Counter (File Analysis)
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("diary.txt"))) {
            while (reader.readLine() != null) {
                count++;
            }
            System.out.println("Total lines in file: " + count);
        } catch (IOException e) {
            System.out.println("Error counting lines.");
        }
    }
}
```
**Output**:
```text
Total lines in file: 1
```

---

## Solution 6: Java Searcher (Filtering)
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("codes.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Java")) {
                    System.out.println("Found: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error searching file.");
        }
    }
}
```
**Output**:
```text
Found: Java is powerful.
```

---

## Solution 7: Rename & Delete (File Management)
```java
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f1 = new File("temp.txt");
        File f2 = new File("final.txt");

        try {
            f1.createNewFile(); // Create first
            if (f1.renameTo(f2)) {
                System.out.println("File renamed to final.txt");
            }
            if (f2.delete()) {
                System.out.println("File deleted.");
            }
        } catch (Exception e) {
            System.out.println("Error managing file.");
        }
    }
}
```
**Output**:
```text
File renamed to final.txt
File deleted.
```

---

## Solution 8: Directory List (Folder Exploration)
```java
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File folder = new File("."); // Current directory
        String[] files = folder.list();

        if (files != null) {
            for (String f : files) {
                System.out.println("Found: " + f);
            }
        }
    }
}
```
**Output**:
```text
Found: Chapter1_Foundations
Found: README.md
...
```

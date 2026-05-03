# Chapter 6 – File I/O (Input/Output)

## 6.2 The File Class
```java
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File myFile = new File("example.txt");
        if (!myFile.exists()) {
            System.out.println("The file does not exist yet.");
        }
    }
}
```
**Output**:
```text
The file does not exist yet.
```

---

## 6.3 Writing Files
```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello World!");
            System.out.println("Successfully written!");
        } catch (IOException e) {
            System.out.println("Error.");
        }
    }
}
```
**Output**:
```text
Successfully written!
```

---

## 6.4 Reading Files
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Assuming output.txt has "Hello World!"
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            System.out.println("Reading line: " + reader.readLine());
        } catch (IOException e) {
            System.out.println("Error.");
        }
    }
}
```
**Output**:
```text
Reading line: Hello World!
```

---

## 6.6 File Manipulation
```java
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File myFile = new File("output.txt");
        File newFile = new File("backup.txt");
        
        if (myFile.renameTo(newFile)) {
            System.out.println("File renamed!");
            newFile.delete();
            System.out.println("File deleted!");
        }
    }
}
```
**Output**:
```text
File renamed!
File deleted!
```

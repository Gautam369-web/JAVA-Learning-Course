# 🟡 Pareto 80/20 — Chapter 7: File I/O

## ⭐ Critical 20%

### 1. Read All Lines (Modern Way)
```java
import java.nio.file.*;
import java.util.List;

List<String> lines = Files.readAllLines(Path.of("data.txt"));
for (String line : lines) {
    System.out.println(line);
}
```

### 2. Read Line by Line (Traditional, Memory-Efficient)
```java
import java.io.*;

try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
```

### 3. Write to File
```java
try (PrintWriter pw = new PrintWriter(new FileWriter("output.txt"))) {
    pw.println("Line 1");
    pw.println("Line 2");
} catch (IOException e) {
    System.out.println("Write error: " + e.getMessage());
}
```

### 4. Append to File
```java
try (FileWriter fw = new FileWriter("log.txt", true)) {  // true = append
    fw.write("New log entry\n");
} catch (IOException e) {
    e.printStackTrace();
}
```

## 🎯 Checklist
- [ ] I can read a file line by line using BufferedReader
- [ ] I can write to a file using PrintWriter or FileWriter
- [ ] I know the difference between overwrite and append mode
- [ ] I always use try-with-resources for file operations
- [ ] I handle IOException appropriately

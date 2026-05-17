# 🟠 Knowledge Gaps — Chapter 7: File I/O

## Gap 1: File Path — Relative vs Absolute
```java
// Relative — relative to where you RUN the program (not where the .java file is!)
new FileReader("data.txt");       // Looks in current working directory

// Absolute — full path
new FileReader("/home/user/data.txt");  // Linux/Mac
new FileReader("C:\\Users\\data.txt");  // Windows (double backslash!)
```

## Gap 2: Not Closing Streams = Resource Leaks
```java
// ❌ If exception occurs before close(), stream leaks!
BufferedReader br = new BufferedReader(new FileReader("file.txt"));
String line = br.readLine();
br.close();  // Never reached if exception above!

// ✅ try-with-resources closes AUTOMATICALLY even on exception
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    String line = br.readLine();
}  // br.close() called here automatically
```

## Gap 3: FileWriter Overwrites by Default
```java
// ❌ This ERASES existing content and writes fresh!
new FileWriter("log.txt")         // Overwrite mode (default)

// ✅ Append mode — adds to existing content
new FileWriter("log.txt", true)   // Append mode
```

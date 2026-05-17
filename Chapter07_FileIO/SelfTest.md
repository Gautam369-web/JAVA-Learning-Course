# 🟣 Self-Test Questions — Chapter 7: File I/O

## 🟢 BASIC
**Q1.** What does `FileWriter(filename, true)` do differently from `FileWriter(filename)`?
**Q2.** What does `br.readLine()` return at the end of a file?
**Q3.** Why should you always close file streams?
**Q4.** Which exception must you handle when reading files?

## 🟡 INTERMEDIATE
**Q5.** Write a program that reads `students.txt` (one name per line) and prints how many students are in the file.
**Q6.** Write a program that writes 5 random numbers to `numbers.txt`, then reads them back and prints their sum.
**Q7.** What is the difference between `FileReader` and `BufferedReader`?

## 🔴 ADVANCED
**Q8.** Write a program that reads a CSV file (comma-separated values) and stores each row as an object in an ArrayList.
**Q9.** Implement a simple logging system where `logMessage(String msg)` appends a timestamped message to `app.log`.
**Q10.** What are the advantages of using `java.nio.file.Files` over the traditional `java.io` approach?

<details>
<summary>💡 Hints</summary>
- Q2: Returns null (not empty string, not exception)
- Q7: FileReader reads character by character (slow). BufferedReader wraps it and buffers large chunks (fast).
</details>

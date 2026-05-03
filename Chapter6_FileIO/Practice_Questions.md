# Chapter 6 – File I/O Practice Questions

These 8 questions are designed to test your ability to interact with the file system, save data, and retrieve it.

---

## Problem 1 – The Birth of a File (File Creation)
**Problem Statement**: Write a program that checks if a file named `my_first_file.txt` exists in the current directory.
- **Task**: If it exists, print "File already exists". If not, create the file and print "File created successfully".
- **Sample Output**:
```text
File created successfully
```

---

## Problem 2 – Simple Writer (FileWriter)
**Problem Statement**: Write a program that takes a sentence from the user and saves it into a file called `diary.txt`.
- **Task**: Ensure the program uses `try-with-resources` to close the file properly.
- **Sample Input**: "Today was a great day of learning Java!"
- **Sample Output**:
```text
Data saved to diary.txt
```

---

## Problem 3 – The Reader (BufferedReader)
**Problem Statement**: Read the content of the `diary.txt` file created in Problem 2.
- **Task**: Print each line to the console with the prefix "Line Content: ".
- **Sample Output**:
```text
Line Content: Today was a great day of learning Java!
```

---

## Problem 4 – Secret Message (Appending)
**Problem Statement**: Open an existing file `secrets.txt` and add a new line of text to the end.
- **Task**: Use `new FileWriter("secrets.txt", true)` to enable **Append Mode** so you don't delete existing data.
- **Sample Input**: "This is a new secret."
- **Sample Output**:
```text
New secret added to the file.
```

---

## Problem 5 – Line Counter (File Analysis)
**Problem Statement**: Create a file with 5 lines of text.
- **Task**: Write a program that reads the file and prints the total number of lines found.
- **Sample Output**:
```text
Total lines in file: 5
```

---

## Problem 6 – Java Searcher (Filtering)
**Problem Statement**: Create a file `codes.txt` with several lines of text.
- **Task**: Read the file and print ONLY the lines that contain the word "Java".
- **Sample Output**:
```text
Found: Java is powerful.
Found: Learning Java is fun.
```

---

## Problem 7 – Rename & Delete (File Management)
**Problem Statement**: Create a dummy file `temp.txt`.
- **Task**: Rename it to `final.txt`, then immediately delete it. Print a message for each step.
- **Sample Output**:
```text
File renamed to final.txt
File deleted.
```

---

## Problem 8 – Directory List (Folder Exploration)
**Problem Statement**: Use the `File` class to look at the current folder.
- **Task**: List all the names of files and folders present in the current directory.
- **Sample Output**:
```text
Found: Chapter1_Foundations
Found: Chapter2_ControlFlow
Found: README.md
```

---

### Instructions:
1. Use `import java.io.*;` to include all necessary classes.
2. Always handle `IOException` using `try-catch`.
3. Use `BufferedWriter` and `BufferedReader` for better performance.

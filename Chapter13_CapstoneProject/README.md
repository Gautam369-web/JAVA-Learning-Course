# Chapter 13 – Final Capstone Project (Smart Library)

This is the final milestone of your Java journey. This project demonstrates how a professional Java application is structured.

## 🚀 How to Run the Project
1.  Navigate to this folder in your terminal.
2.  Compile the program: `javac SmartLibrarySystem.java`
3.  Run the program: `java SmartLibrarySystem`

## 🧩 What's Under the Hood?
- **Data Persistence**: It creates a `library_data.txt` to keep your books safe even after you close the program.
- **Modern Logic**: Searching is handled using Java Streams for maximum speed and readability.
- **Robustness**: The menu uses try-catch blocks, so it won't crash if you type "hello" instead of "1".
- **Background Operations**: A "Daemon Thread" runs in the background to save your data every 30 seconds automatically.

## 🖥️ Sample Run (Output)
```text
--- Welcome to the Smart Library System ---

1. Add Book | 2. View All | 3. Search Author | 4. Exit
Choice: 1
Enter Title: Java Mastery
Enter Author: Gautam
Enter Price: 49.99
Book added successfully!

1. Add Book | 2. View All | 3. Search Author | 4. Exit
Choice: 2
Title: Java Mastery    | Author: Gautam     | Price: $49.99

[SYSTEM]: Background Auto-Save completed.

1. Add Book | 2. View All | 3. Search Author | 4. Exit
Choice: 4
Data saved. Goodbye!
```

## 🎓 Final Conclusion
By completing this project, you have proved your mastery over:
- Basic Syntax & Logic
- Object-Oriented Principles
- Dynamic Collections
- Error Handling
- Permanent Storage (File I/O)
- Functional Programming
- Concurrency (Multithreading)

**Well done, Gautam! You are now ready to tackle real-world Java development.** 🌟

# Chapter 6 – File I/O (Input/Output)

Up until now, all the data your program handled was lost the moment you closed the application. **File I/O** allows you to save data to a permanent file on your hard drive and read it back later.

---

## Goals of Chapter 6
- **Persistent Data**: Learn how to save information permanently.
- **Master Streams**: Understand how data flows in and out of your program.
- **Efficient Reading/Writing**: Learn to use buffers to handle large files quickly.
- **File Management**: Learn to create, delete, and check properties of files.

## Sub-topics
| Section | Topic | Description |
| :--- | :--- | :--- |
| **6.1** | **Intro to File I/O** | The concept of Input and Output |
| **6.2** | **The File Class** | Managing file metadata (Path, Exists, Delete) |
| **6.3** | **Writing Files** | Using `FileWriter` and `BufferedWriter` |
| **6.4** | **Reading Files** | Using `FileReader` and `BufferedReader` |
| **6.5** | **Binary vs Text** | Understanding different types of files |
| **6.6** | **Try-with-resources** | Reviewing safe file closing |

---

## 6.1 Intro to File I/O: The "Post Office"

### 📮 Real-Life Analogy
Imagine you are writing a **Letter** to a friend.
- **Output**: You write your thoughts on paper (Memory) and put it into an envelope to send to their house (Hard Drive).
- **Input**: Your friend sends you a letter. you take it out of the envelope and read it into your brain (Memory).
**File I/O** is the postal system that moves data between your program's "brain" and the computer's "mailbox" (storage).

### 💡 Human Understanding
- **Input**: Data flowing **into** the program (Reading).
- **Output**: Data flowing **out** of the program (Writing).
In Java, we use "Streams" to move this data byte-by-byte or character-by-character.

---

## 6.2 The File Class: The "Folder Map"

### 🗺️ Real-Life Analogy
Before you can read a book, you first have to **find it** on the shelf. You check:
- Is it there? (`exists()`)
- What is its name? (`getName()`)
- How big is it? (`length()`)
The `File` class in Java is used to get information *about* a file, but it doesn't actually read the content inside.

### 💡 Human Understanding
The `File` object is like a **pointer** to a path on your computer.

### 💻 Code Implementation
```java
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File myFile = new File("example.txt");

        if (myFile.exists()) {
            System.out.println("File Name: " + myFile.getName());
            System.out.println("Size: " + myFile.length() + " bytes");
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
```
**Output**:
```text
The file does not exist.
```

---

## 6.3 Writing Files: "Pen to Paper"

### ✍️ Real-Life Analogy
Think of writing in a **Notebook**.
- **FileWriter**: Like a pen. It writes one letter at a time.
- **BufferedWriter**: Like a person who remembers a whole sentence before writing it down. It's much faster because it reduces the number of times you have to touch the paper.

### 💡 Human Understanding
We usually wrap a `FileWriter` inside a `BufferedWriter` for better performance.

### 💻 Code Implementation
```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello World!");
            System.out.println("Successfully written to file!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing.");
        }
    }
}
```
**Output**:
```text
Successfully written to file!
```

---

## 6.4 Reading Files: "Opening the Letter"

### 👓 Real-Life Analogy
Imagine you are reading a **Long Novel**.
- **FileReader**: Like looking at one single character at a time. It's slow and exhausting.
- **BufferedReader**: Like reading a whole sentence or a whole paragraph at once. It stores a "buffer" of text in memory so you don't have to keep looking back at the page every second.

### 💡 Human Understanding
We use `BufferedReader` and the `readLine()` method to read text files line-by-line until the end of the file (which is `null`).

### 💻 Code Implementation
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Assuming output.txt has "Hello World!"
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Reading line: " + line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading.");
        }
    }
}
```
**Output**:
```text
Reading line: Hello World!
```

---

## 6.5 Binary vs Text: "Newspaper vs. Secret Code"

### 🗞️ Real-Life Analogy
- **Text Files (.txt, .java)**: Like a **Newspaper**. Anyone who can read English can understand it. We use `Readers` and `Writers` for these.
- **Binary Files (.jpg, .mp3, .exe)**: Like a **Secret Code**. If you open an image in Notepad, it looks like gibberish. We use `InputStreams` and `OutputStreams` to handle these raw bytes.

### 💡 Human Understanding
- Use **Character Streams** (`FileReader`/`FileWriter`) for human-readable text.
- Use **Byte Streams** (`FileInputStream`/`FileOutputStream`) for images, videos, or encrypted data.

---

## 6.6 File Manipulation: "Organizing the Shelf"

### 🧹 Real-Life Analogy
Sometimes you don't want to read or write; you just want to **organize**. 
- Deleting an old book (`delete()`).
- Changing the title on a folder (`renameTo()`).
- Checking how many books are on the shelf (`list()`).

### 💡 Human Understanding
The `File` class has methods that interact directly with the Operating System to manage files.

### 💻 Code Implementation
```java
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File myFile = new File("output.txt");

        // 1. Rename
        File newFile = new File("backup_output.txt");
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

---

## 6.7 Practice Questions (Chapter 6)

*Ready to become a File Master? Check the Practice_Questions.md file for 8 challenges on reading, writing, and managing files!*

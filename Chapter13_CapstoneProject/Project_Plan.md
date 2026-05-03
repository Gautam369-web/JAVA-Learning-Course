# Chapter 13 – Final Capstone Project

Congratulations on reaching the final chapter! It's time to combine everything you've learned—from basic syntax to multithreading—into a single, real-world application.

## Project: The Smart Library System

### 🎯 The Mission
Build a system that allows users to manage a collection of books, save them to a file, search using modern streams, and handle multiple user requests safely.

### 🧩 Concepts to Include:
1.  **OOP (Chapter 4)**: Use classes like `Book` and `Member` with Encapsulation.
2.  **Collections (Chapter 5)**: Use an `ArrayList` to store the library's books.
3.  **Exception Handling (Chapter 6)**: Use try-catch to handle invalid user inputs or file errors.
4.  **File I/O (Chapter 7)**: Save and Load the library data to/from a `library.txt` file.
5.  **Functional Programming (Chapter 8)**: Use Streams and Lambdas to search for books by author or price.
6.  **Multithreading (Chapter 9)**: Simulate a background "Auto-Save" feature using a separate thread.

---

## 13.1 Project Requirements

### 1. Functional Requirements:
- **Add Book**: User can enter title, author, and price.
- **View All Books**: List every book in the system.
- **Search Books**: Use Streams to find books by a specific author.
- **Save & Exit**: Automatically save the current list to a file before closing.
- **Auto-Save**: A background thread that saves the data every 30 seconds.

### 2. Class Design:
- `Book`: Fields for `title`, `author`, `price`.
- `Library`: Methods for `addBook()`, `displayAll()`, `search()`, `saveToFile()`, `loadFromFile()`.
- `Main`: The menu-driven interface for the user.

---

## 13.2 Step-by-Step Roadmap

1.  **Phase 1**: Define the `Book` class and the `Library` structure.
2.  **Phase 2**: Implement the Menu using a `while` loop and `Scanner`.
3.  **Phase 3**: Add File I/O to make the data permanent.
4.  **Phase 4**: Add a background thread for Auto-Saving.
5.  **Phase 5**: Polish the code with Lambdas and robust Exception Handling.

---

*Ready to start coding the ultimate Java project? Let's proceed to Phase 1!*

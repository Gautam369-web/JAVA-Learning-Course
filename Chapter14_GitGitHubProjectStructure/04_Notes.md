# Chapter 14 - Git, GitHub, Packages, and Project Structure

Until now, many programs could live in one file. Real Java projects need organization, history, and collaboration. This chapter teaches how professional Java code is arranged and protected.

---

## Goals of Chapter 14
- Understand why Git is used in every serious software project.
- Learn the difference between Git and GitHub.
- Organize Java code using packages and imports.
- Create a clean project structure that can grow.

## Sub-topics
| Section | Topic | Description |
| :--- | :--- | :--- |
| **14.1** | **Git Basics** | Track code history |
| **14.2** | **GitHub Basics** | Store and share repositories online |
| **14.3** | **Packages** | Group related Java classes |
| **14.4** | **Imports** | Use classes from other packages |
| **14.5** | **Project Layout** | Structure source, tests, and docs |

---

## 14.1 Git Basics: The "Save History"

### Real-Life Analogy
Imagine writing an assignment. Instead of keeping only the latest copy, Git keeps checkpoints:
- First draft
- Improved draft
- Final draft

If something breaks, you can go back.

### Human Understanding
Git is a version control tool. It helps you track what changed, when it changed, and why.

### Core Commands
```bash
git init
git status
git add .
git commit -m "Add student class"
git log
```

### Beginner Rule
Commit after one meaningful change. Do not wait until the whole project is finished.

---

## 14.2 GitHub Basics: The "Online Project Home"

Git is the tool. GitHub is a website where Git repositories can be stored, reviewed, and shared.

Common workflow:
```bash
git remote add origin https://github.com/username/project.git
git push -u origin main
git pull
```

Important GitHub concepts:
- **Repository**: Project folder with Git history.
- **Branch**: Separate line of work.
- **Pull Request**: Request to merge changes.
- **Issue**: Task, bug, or idea.

---

## 14.3 Packages: The "School Departments"

A school has departments: science, math, sports. A Java project has packages.

Example:
```text
src/
  com/course/library/
    Book.java
    Library.java
  com/course/app/
    Main.java
```

`Book.java`:
```java
package com.course.library;

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
```

---

## 14.4 Imports: Using Classes from Other Packages

`Main.java`:
```java
package com.course.app;

import com.course.library.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Clean Java");
        System.out.println(book.getTitle());
    }
}
```

Without `import`, Java does not know where `Book` lives.

---

## 14.5 Professional Project Layout

Simple layout:
```text
project-name/
  README.md
  .gitignore
  src/
    main/
      java/
    test/
      java/
```

Useful `.gitignore` for Java:
```text
*.class
target/
build/
.idea/
.vscode/
```

Do not commit generated `.class` files. Commit source code and documentation.

---

## Chapter Summary
Git gives history. GitHub gives collaboration. Packages keep Java code organized. A clean project structure makes advanced tools like Maven, Gradle, Spring Boot, and testing much easier.


# Chapter 14 - Solutions

## Solution 1 - Git Vocabulary
- Repository: a project tracked by Git.
- Commit: a saved checkpoint.
- Branch: a separate line of work.
- Remote: online copy of the repository.
- Pull request: request to review and merge changes.

## Solution 2 - First Repository
```bash
mkdir student-demo
cd student-demo
git init
echo "# Student Demo" > README.md
git add README.md
git commit -m "Add README"
```

## Solution 3 - Git Status Reading
`git status` shows untracked files, modified files, staged files, and deleted files. Use it before every commit.

## Solution 4 and 5 - Package and Import
```java
package com.course.student;

public class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

```java
package com.course.app;

import com.course.student.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Asha");
        System.out.println(student.getName());
    }
}
```

## Solution 6 - .gitignore
```text
*.class
target/
build/
.idea/
.vscode/
```

## Solution 7 - Branch Workflow
```bash
git switch -c feature/student-class
git add .
git commit -m "Add student class"
git switch main
git merge feature/student-class
```

## Solution 8 - Mini Project Structure
```text
src/main/java/com/course/library/
  app/Main.java
  book/Book.java
  book/BookService.java
  user/User.java
  user/UserService.java
```

## Solution 9 - Pull Request Description
```text
Summary:
- Added Student model with name and email fields.
- Added package structure for student code.

Tests:
- Compiled locally.
- Ran basic main method.

Risk:
- Low. New class only.
```

## Solution 10 - Refactor Flat Files
Move related classes into packages, update `package` declarations, then update imports wherever those classes are used.


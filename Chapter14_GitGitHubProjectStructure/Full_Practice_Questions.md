# Chapter 14 - Full Practice Questions

## Problem 1 - Beginner: Create Your First Git Repository

**Problem Statement**  
Create a new Java project folder and initialize it as a Git repository. Add a `README.md` file with the project name, create a `.gitignore` file for Java projects, and make your first commit.

**Input Format**
```text
projectName
```

**Output Format**
```text
Repository created for <projectName>
README.md added
.gitignore added
First commit completed
```

**Sample Input**
```text
StudentManager
```

**Sample Output**
```text
Repository created for StudentManager
README.md added
.gitignore added
First commit completed
```

---

## Problem 2 - Intermediate: Organize Java Classes into Packages

**Problem Statement**  
Create a Java project with two packages: `com.course.student` and `com.course.app`. The `Student` class should be inside `com.course.student`. The `Main` class should be inside `com.course.app` and should import and use `Student`.

**Input Format**
```text
studentName
studentAge
```

**Output Format**
```text
Student Name: <studentName>
Student Age: <studentAge>
```

**Sample Input**
```text
Asha
20
```

**Sample Output**
```text
Student Name: Asha
Student Age: 20
```

---

## Problem 3 - Advanced: Branch-Based Feature Workflow

**Problem Statement**  
You are working on a project. Create a new branch named `feature/student-model`, add a `Student` class, commit the change, switch back to `main`, and merge the feature branch.

**Input Format**
```text
branchName
className
```

**Output Format**
```text
Branch created: <branchName>
Class added: <className>
Feature committed
Feature merged into main
```

**Sample Input**
```text
feature/student-model
Student
```

**Sample Output**
```text
Branch created: feature/student-model
Class added: Student
Feature committed
Feature merged into main
```


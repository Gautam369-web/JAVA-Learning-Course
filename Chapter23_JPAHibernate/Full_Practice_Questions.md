# Chapter 23 - Full Practice Questions

## Problem 1 - Beginner: Create Student Entity

**Problem Statement**  
Create a JPA entity named `Student` with fields `id`, `name`, and `email`. The `id` should be auto-generated.

**Input Format**
```text
No console input
```

**Output Format**
```text
Student entity created with id, name, email
```

**Sample Output**
```text
Student entity created with id, name, email
```

---

## Problem 2 - Intermediate: Repository Finder Method

**Problem Statement**  
Create a Spring Data JPA repository for `Student` and add a method to find a student by email.

**Input Format**
```text
email
```

**Output Format**
```text
Student found: <name>
```

or

```text
Student not found
```

**Sample Input**
```text
asha@example.com
```

**Sample Output**
```text
Student found: Asha
```

---

## Problem 3 - Advanced: Course Enrollment Relationship

**Problem Statement**  
Create JPA entities for `Student`, `Course`, and `Enrollment`. One student can have many enrollments, and one course can have many enrollments.

**Input Format**
```text
studentId
courseId
```

**Output Format**
```text
Enrollment created for student <studentId> in course <courseId>
```

**Sample Input**
```text
1
10
```

**Sample Output**
```text
Enrollment created for student 1 in course 10
```


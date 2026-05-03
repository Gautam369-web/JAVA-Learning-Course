# Chapter 25 - Full Practice Questions

## Problem 1 - Beginner: Design Student Course Requirements

**Problem Statement**  
Write the functional requirements for a Student Course Management API. The system should support students, courses, and enrollments.

**Input Format**
```text
projectName
```

**Output Format**
```text
Project: <projectName>
Feature 1: Student CRUD
Feature 2: Course CRUD
Feature 3: Enrollment
```

**Sample Input**
```text
Student Course Management API
```

**Sample Output**
```text
Project: Student Course Management API
Feature 1: Student CRUD
Feature 2: Course CRUD
Feature 3: Enrollment
```

---

## Problem 2 - Intermediate: Create Enrollment API

**Problem Statement**  
Create an endpoint `POST /enrollments` that accepts `studentId` and `courseId`. If both exist, create an enrollment and return status `201`.

**Input Format**
```json
{"studentId":<studentId>,"courseId":<courseId>}
```

**Output Format**
```json
{"studentId":<studentId>,"courseId":<courseId>,"status":"ENROLLED"}
```

**Sample Input**
```json
{"studentId":1,"courseId":10}
```

**Sample Output**
```json
{"studentId":1,"courseId":10,"status":"ENROLLED"}
```

---

## Problem 3 - Advanced: Duplicate Enrollment Handling

**Problem Statement**  
Add business logic to prevent a student from enrolling in the same course twice. If a duplicate enrollment is requested, return a clear error response.

**Input Format**
```json
{"studentId":<studentId>,"courseId":<courseId>}
```

**Output Format**
```json
{"message":"Student already enrolled in this course","status":400}
```

**Sample Input**
```json
{"studentId":1,"courseId":10}
```

**Sample Output**
```json
{"message":"Student already enrolled in this course","status":400}
```


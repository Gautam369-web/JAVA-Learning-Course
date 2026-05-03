# Chapter 25 - Final Backend Capstone

This final project combines everything: Java, Git, Maven, Spring Boot, REST APIs, JPA, validation, logging, testing, and clean architecture.

---

## Project: Student Course Management API

Build a backend API where students can enroll in courses.

---

## Goals of Chapter 25
- Design a real backend project.
- Build layered Spring Boot code.
- Persist data with JPA.
- Add validation and error handling.
- Write unit and integration tests.
- Prepare the project for GitHub and deployment.

## Required Features
| Feature | Description |
| :--- | :--- |
| **Students** | Create, list, update, delete students |
| **Courses** | Create, list, update, delete courses |
| **Enrollment** | Enroll a student in a course |
| **Search** | Find students by email and courses by title |
| **Validation** | Reject invalid requests |
| **Tests** | Service and controller tests |

---

## Suggested Project Structure

```text
student-course-api/
  pom.xml
  README.md
  src/main/java/com/example/studentcourse/
    StudentCourseApplication.java
    student/
      Student.java
      StudentController.java
      StudentService.java
      StudentRepository.java
      StudentDto.java
    course/
      Course.java
      CourseController.java
      CourseService.java
      CourseRepository.java
      CourseDto.java
    enrollment/
      Enrollment.java
      EnrollmentController.java
      EnrollmentService.java
      EnrollmentRepository.java
    common/
      ApiError.java
      GlobalExceptionHandler.java
  src/test/java/com/example/studentcourse/
```

---

## API Endpoints

```text
POST   /students
GET    /students
GET    /students/{id}
PUT    /students/{id}
DELETE /students/{id}

POST   /courses
GET    /courses
GET    /courses/{id}
PUT    /courses/{id}
DELETE /courses/{id}

POST   /enrollments
GET    /students/{id}/courses
```

---

## Build Order

1. Create Maven Spring Boot project.
2. Add entities.
3. Add repositories.
4. Add services.
5. Add controllers.
6. Add DTOs.
7. Add validation.
8. Add global exception handling.
9. Add tests.
10. Write README and push to GitHub.

---

## Professional Requirements

- No business logic inside controllers.
- No direct entity exposure in API responses.
- Use constructor injection.
- Use meaningful package names.
- Add tests for success and failure cases.
- Use logs for important application events.
- Do not commit `.class`, `target`, or IDE files.

---

## Chapter Summary
This capstone is your transition from learner projects to portfolio-level backend development. When finished, it should look like a project you can show in interviews.


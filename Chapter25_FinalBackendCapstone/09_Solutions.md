# Chapter 25 - Solutions

This chapter is a project guide. The "solution" is a correct implementation plan and representative code structure.

---

## Solution 1 - Requirements
- Students can be created, listed, updated, deleted, and searched by email.
- Courses can be created, listed, updated, deleted, and searched by title.
- A student can enroll in a course once.
- Invalid data returns clear validation errors.

## Solution 2 - Database Design
```text
students(id, name, email, created_at)
courses(id, title, description, created_at)
enrollments(id, student_id, course_id, enrolled_at)
```

Add a unique constraint on `(student_id, course_id)`.

## Solution 3 - Project Setup
Use Spring Boot with:
- Spring Web
- Spring Validation
- Spring Data JPA
- H2 for learning or PostgreSQL/MySQL for production-style practice
- Spring Boot Test

## Solution 4 and 5 - CRUD Shape
Every resource should have:
```text
Entity
Repository
Request DTO
Response DTO
Service
Controller
Tests
```

## Solution 6 - Enrollment Logic
```java
@Transactional
public EnrollmentResponse enroll(Long studentId, Long courseId) {
    Student student = studentRepository.findById(studentId)
            .orElseThrow(() -> new StudentNotFoundException(studentId));
    Course course = courseRepository.findById(courseId)
            .orElseThrow(() -> new CourseNotFoundException(courseId));

    if (enrollmentRepository.existsByStudentIdAndCourseId(studentId, courseId)) {
        throw new DuplicateEnrollmentException(studentId, courseId);
    }

    Enrollment enrollment = new Enrollment(student, course);
    return EnrollmentResponse.from(enrollmentRepository.save(enrollment));
}
```

## Solution 7 - Validation
```java
record CreateStudentRequest(
        @NotBlank String name,
        @Email @NotBlank String email
) {}
```

## Solution 8 - Error Handling
```java
record ApiError(String message, int status) {}

@ControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    ResponseEntity<ApiError> notFound(RuntimeException ex) {
        return ResponseEntity.status(404).body(new ApiError(ex.getMessage(), 404));
    }
}
```

## Solution 9 - Testing
Minimum tests:
- Service create success.
- Service missing resource failure.
- Duplicate enrollment failure.
- Controller validation failure.
- Repository finder methods.

## Solution 10 - README
Include:
```text
Project name
Features
Tech stack
How to run
API endpoints
Sample JSON requests
How to test
```

## Solution 11 - Pagination
Use Spring Data `Pageable`:
```java
@GetMapping
Page<StudentResponse> findAll(Pageable pageable) {
    return service.findAll(pageable);
}
```

## Solution 12 - Deployment Prep
Use environment variables for database config:
```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

Package:
```bash
mvn clean package
java -jar target/student-course-api.jar
```


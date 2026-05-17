# Chapter 22 - Solutions

## Solution 1
```text
GET    /students
POST   /students
DELETE /students/{id}
```

## Solution 2 and 3
```java
@RestController
@RequestMapping("/students")
class StudentController {
    private final StudentService service;

    StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    List<StudentResponse> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    StudentResponse findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
```

## Solution 4
```java
@PostMapping
ResponseEntity<StudentResponse> create(@RequestBody CreateStudentRequest request) {
    return ResponseEntity.status(HttpStatus.CREATED).body(service.create(request));
}
```

## Solution 5
```java
@PutMapping("/{id}")
StudentResponse update(@PathVariable Long id, @RequestBody UpdateStudentRequest request) {
    return service.update(id, request);
}
```

## Solution 6
```java
@DeleteMapping("/{id}")
ResponseEntity<Void> delete(@PathVariable Long id) {
    service.delete(id);
    return ResponseEntity.noContent().build();
}
```

## Solution 7
```java
record CreateStudentRequest(String name, String email) {}
record StudentResponse(Long id, String name, String email) {}
```

## Solution 8
Create: `201`, read: `200`, validation error: `400`, missing student: `404`.

## Solution 9
```java
@ControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(StudentNotFoundException.class)
    ResponseEntity<String> handle(StudentNotFoundException ex) {
        return ResponseEntity.status(404).body(ex.getMessage());
    }
}
```

## Solution 10
```java
record CreateStudentRequest(
        @NotBlank String name,
        @Email String email
) {}
```

Use `@Valid` on the controller request body.


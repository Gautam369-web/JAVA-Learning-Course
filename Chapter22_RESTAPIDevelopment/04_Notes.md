# Chapter 22 - REST API Development

REST APIs allow applications to communicate over HTTP. A frontend, mobile app, or another backend can call your Java API.

---

## Goals of Chapter 22
- Understand REST resources.
- Build GET, POST, PUT, and DELETE endpoints.
- Use DTOs for clean input and output.
- Return proper HTTP status codes.
- Handle validation and errors.

## Sub-topics
| Section | Topic | Description |
| :--- | :--- | :--- |
| **22.1** | **REST Resources** | Model APIs around nouns |
| **22.2** | **Controllers** | Map HTTP endpoints |
| **22.3** | **DTOs** | Request and response objects |
| **22.4** | **Status Codes** | Communicate result clearly |
| **22.5** | **Exception Handling** | Return useful errors |

---

## 22.1 REST Resources

Good REST endpoints use nouns:
```text
GET    /students
GET    /students/10
POST   /students
PUT    /students/10
DELETE /students/10
```

Avoid action-style URLs like `/getStudent` or `/deleteStudent`.

---

## 22.2 Basic Controller

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

---

## 22.3 POST with DTO

```java
record CreateStudentRequest(String name, String email) {}
record StudentResponse(Long id, String name, String email) {}
```

```java
@PostMapping
ResponseEntity<StudentResponse> create(@RequestBody CreateStudentRequest request) {
    StudentResponse created = service.create(request);
    return ResponseEntity.status(201).body(created);
}
```

DTOs protect your internal model from direct exposure.

---

## 22.4 Status Codes

| Status | Meaning |
| :--- | :--- |
| `200 OK` | Successful read/update |
| `201 Created` | New resource created |
| `204 No Content` | Delete successful |
| `400 Bad Request` | Invalid input |
| `404 Not Found` | Resource missing |

---

## 22.5 Error Handling

```java
@ResponseStatus(HttpStatus.NOT_FOUND)
class StudentNotFoundException extends RuntimeException {
    StudentNotFoundException(Long id) {
        super("Student not found: " + id);
    }
}
```

For larger apps, use `@ControllerAdvice` to centralize errors.

---

## Chapter Summary
A clean REST API has clear resources, correct status codes, DTOs, validation, and predictable errors.


# 🔵 Flowchart — Spring Boot Request Flow (Chapter 21)

## Flowchart 1: HTTP Request Flow in Spring Boot

```mermaid
flowchart TD
    A([Client Browser/Postman\nHTTP GET /api/students]) --> B

    B[Spring's DispatcherServlet\nroutes the request]

    B --> C[@RestController\nStudentController\nGET /api/students]

    C --> D[Calls @Service\nStudentService.getAllStudents]

    D --> E[Calls @Repository\nStudentRepository.findAll]

    E --> F[Database Query\nSELECT * FROM students]

    F --> E
    E --> D
    D --> C

    C --> G[Returns List<Student> as JSON]

    G --> A2[Client receives JSON response\n200 OK]
```

## Flowchart 2: Dependency Injection

```mermaid
flowchart TD
    A[Spring Boot Starts] --> B
    B[Scans for @Component, @Service,\n@Repository, @Controller] --> C
    C[Creates instances of all found classes\nApplication Context / IoC Container] --> D
    D{Who needs what?}
    D --> E[StudentController needs StudentService\n→ Inject it via constructor]
    D --> F[StudentService needs StudentRepository\n→ Inject it via constructor]
    E & F --> G[All dependencies wired automatically!]
    G --> H([Application ready to serve requests])
```

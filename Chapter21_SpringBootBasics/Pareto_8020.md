# 🟡 Pareto 80/20 — Chapter 21: Spring Boot

## ⭐ Critical 20%

### 1. The Minimal Spring Boot App
```java
@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}
```

### 2. A REST Endpoint (Controller)
```java
@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {  // Constructor injection
        this.service = service;
    }

    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return service.create(student);
    }
}
```

### 3. Service Layer
```java
@Service
public class StudentService {
    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getAll() { return repo.findAll(); }
    public Student getById(Long id) { return repo.findById(id).orElseThrow(); }
    public Student create(Student s) { return repo.save(s); }
}
```

### 4. application.properties Essentials
```properties
# Server
server.port=8080

# Database (H2 in-memory for testing)
spring.datasource.url=jdbc:h2:mem:testdb
spring.h2.console.enabled=true

# JPA
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
```

## 🎯 Checklist
- [ ] I can create a Spring Boot project from start.spring.io
- [ ] I understand @SpringBootApplication, @RestController, @Service, @Repository
- [ ] I use constructor injection, not @Autowired field injection
- [ ] I understand the 3-layer architecture
- [ ] I can run the app and test it with Postman or curl

# 🟠 Knowledge Gaps — Chapter 21: Spring Boot

## Gap 1: IoC and DI — The Mental Model
**Inversion of Control (IoC):** Normally YOU create objects. With Spring, you give control to the FRAMEWORK to create and manage objects. "Don't call us, we'll call you."

**Dependency Injection:** Instead of your class creating its dependencies (`new ServiceImpl()`), Spring INJECTS them from outside. Your class just declares what it NEEDS.

```java
// ❌ Without DI — tightly coupled, hard to test
public class OrderController {
    private OrderService service = new OrderServiceImpl();  // Hard-coded!
}

// ✅ With DI — loosely coupled, easy to test
public class OrderController {
    private final OrderService service;
    public OrderController(OrderService service) {  // Spring injects!
        this.service = service;
    }
}
```

## Gap 2: @Autowired Field Injection is Discouraged
```java
// ❌ Field injection — Spring docs say: avoid this
@Autowired private StudentService service;

// ✅ Constructor injection — preferred
public StudentController(StudentService service) { this.service = service; }
// Why? Immutable, testable without Spring, explicit dependencies
```

## Gap 3: @Component vs @Service vs @Repository vs @Controller
All four are specializations of @Component. They're functionally equivalent but:
- `@Controller/@RestController` — for web layer
- `@Service` — for business logic
- `@Repository` — for data access (also adds exception translation)
- `@Component` — generic Spring bean

## 📚 Resources
| Resource | Link |
|---------|------|
| Official Guide | [start.spring.io](https://start.spring.io) |
| Spring Guides | [spring.io/guides](https://spring.io/guides) |
| Baeldung Spring | [baeldung.com/spring-boot](https://www.baeldung.com/spring-boot) |

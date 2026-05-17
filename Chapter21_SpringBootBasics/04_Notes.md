# Chapter 21 - Spring Boot Basics

Spring Boot is one of the most important tools for Java backend development. It helps you build web applications and APIs faster with less setup.

---

## Goals of Chapter 21
- Understand why Spring Boot exists.
- Learn dependency injection.
- Create services and controllers.
- Understand application configuration.

## Sub-topics
| Section | Topic | Description |
| :--- | :--- | :--- |
| **21.1** | **Spring Boot** | Fast Java application setup |
| **21.2** | **Dependency Injection** | Let Spring create and connect objects |
| **21.3** | **Components** | `@Component`, `@Service`, `@Controller` |
| **21.4** | **Configuration** | `application.properties` |
| **21.5** | **Layers** | Controller, service, repository |

---

## 21.1 Why Spring Boot?

Without Spring Boot, Java web apps need a lot of manual setup. Spring Boot gives:
- Embedded server.
- Auto configuration.
- Easy dependency management.
- Production-friendly defaults.

Minimal application:
```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
```

---

## 21.2 Dependency Injection

Instead of creating objects manually:
```java
UserService service = new UserService();
```

Spring can create and inject them:
```java
@Service
class UserService {
    String welcome(String name) {
        return "Welcome, " + name;
    }
}
```

```java
@RestController
class UserController {
    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }
}
```

Constructor injection is preferred because dependencies are clear and testable.

---

## 21.3 Common Spring Annotations

| Annotation | Use |
| :--- | :--- |
| `@SpringBootApplication` | Main Spring Boot app |
| `@Component` | General Spring-managed class |
| `@Service` | Business logic class |
| `@Repository` | Database access class |
| `@RestController` | REST API controller |
| `@Autowired` | Inject dependency, usually avoid on fields |

---

## 21.4 application.properties

```properties
server.port=8080
spring.application.name=student-api
```

Configuration should not be hardcoded in Java classes.

---

## 21.5 Layered Architecture

```text
Controller -> Service -> Repository -> Database
```

Controller handles HTTP. Service handles business rules. Repository handles data.

---

## Chapter Summary
Spring Boot is the bridge from core Java to real backend development. Learn dependency injection and layers carefully; they appear in almost every Spring project.


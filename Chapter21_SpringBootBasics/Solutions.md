# Chapter 21 - Solutions

## Solution 1
Spring Boot reduces setup by providing auto-configuration, embedded server support, dependency management, and production-ready defaults.

## Solution 2
```java
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
```

## Solution 3
```java
@Service
class GreetingService {
    String greet(String name) {
        return "Welcome, " + name;
    }
}
```

## Solution 4 and 5
```java
@RestController
class GreetingController {
    private final GreetingService greetingService;

    GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    String hello() {
        return greetingService.greet("Java learner");
    }
}
```

## Solution 6
```properties
server.port=9090
```

## Solution 7
Controller handles HTTP. Service handles business rules. Repository handles database access.

## Solution 8
Replace `new UserService()` inside the controller with constructor injection so Spring manages the dependency.

## Solution 9
If two beans of the same type exist, Spring may fail with an ambiguity error unless one is marked `@Primary` or selected with `@Qualifier`.

## Solution 10
```text
com.course.library
  book
  user
  loan
  common
```


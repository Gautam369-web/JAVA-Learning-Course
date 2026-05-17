# Chapter 24 - Mockito and Advanced Testing

JUnit tests real code. Mockito helps you test one class while replacing its dependencies with controlled fake objects.

---

## Goals of Chapter 24
- Understand mocks and stubs.
- Test service classes in isolation.
- Verify interactions.
- Write Spring Boot tests.
- Understand unit vs integration tests.

## Sub-topics
| Section | Topic | Description |
| :--- | :--- | :--- |
| **24.1** | **Unit vs Integration** | Different test scopes |
| **24.2** | **Mockito Basics** | Mock dependencies |
| **24.3** | **Stubbing** | Define fake behavior |
| **24.4** | **Verification** | Check method calls |
| **24.5** | **Spring Tests** | Test controllers and repositories |

---

## 24.1 Unit vs Integration Tests

Unit test:
- Tests one class.
- Fast.
- Uses mocks for dependencies.

Integration test:
- Tests multiple parts together.
- Slower.
- May use Spring context or database.

---

## 24.2 Mockito Basics

```java
@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
    @Mock
    StudentRepository repository;

    @InjectMocks
    StudentService service;
}
```

`@Mock` creates a fake dependency. `@InjectMocks` creates the class being tested and injects mocks into it.

---

## 24.3 Stubbing

```java
when(repository.findById(1L))
        .thenReturn(Optional.of(new Student("Asha", "a@example.com")));
```

This means: when the service asks repository for ID 1, return this fake student.

---

## 24.4 Verification

```java
verify(repository).save(any(Student.class));
verify(repository, never()).deleteById(99L);
```

Use verification when the behavior matters, not for every single line.

---

## 24.5 Spring Boot Testing

Controller slice test:
```java
@WebMvcTest(StudentController.class)
class StudentControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    StudentService service;
}
```

Repository test:
```java
@DataJpaTest
class StudentRepositoryTest {
    @Autowired
    StudentRepository repository;
}
```

---

## Chapter Summary
Mockito makes tests focused. JUnit checks results. Spring test tools check framework integration. A professional backend project needs all three levels.


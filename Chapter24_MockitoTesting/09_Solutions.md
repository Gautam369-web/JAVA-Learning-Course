# Chapter 24 - Solutions

## Solution 1
Unit tests check one class in isolation. Integration tests check multiple parts together.

## Solution 2
```java
@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
    @Mock
    StudentRepository repository;

    @InjectMocks
    StudentService service;
}
```

## Solution 3
```java
when(repository.findById(1L))
        .thenReturn(Optional.of(new Student("Asha", "a@example.com")));
```

## Solution 4
```java
@Test
void findsStudentById() {
    when(repository.findById(1L)).thenReturn(Optional.of(new Student("Asha", "a@example.com")));

    StudentResponse result = service.findById(1L);

    assertEquals("Asha", result.name());
}
```

## Solution 5
```java
@Test
void throwsWhenStudentMissing() {
    when(repository.findById(99L)).thenReturn(Optional.empty());

    assertThrows(StudentNotFoundException.class, () -> service.findById(99L));
}
```

## Solution 6
```java
verify(repository).save(any(Student.class));
```

## Solution 7
```java
@WebMvcTest(StudentController.class)
class StudentControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    StudentService service;

    @Test
    void returnsStudent() throws Exception {
        when(service.findById(1L)).thenReturn(new StudentResponse(1L, "Asha", "a@example.com"));

        mockMvc.perform(get("/students/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Asha"));
    }
}
```

## Solution 8
```java
@DataJpaTest
class StudentRepositoryTest {
    @Autowired
    StudentRepository repository;

    @Test
    void findsByEmail() {
        repository.save(new Student("Asha", "a@example.com"));
        assertTrue(repository.findByEmail("a@example.com").isPresent());
    }
}
```

## Solution 9
Private methods are implementation details. Test behavior through public methods.

## Solution 10
Too many mocks can make a test only prove that mocks were called, not that useful behavior works.


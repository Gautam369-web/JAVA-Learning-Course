# Chapter 23 - Solutions

## Solution 1
ORM maps Java objects to database rows so you can work with classes instead of writing all SQL manually.

## Solution 2
```java
@Entity
class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;

    protected Student() {}
}
```

## Solution 3
```java
interface StudentRepository extends JpaRepository<Student, Long> {}
```

## Solution 4
```java
Optional<Student> findByEmail(String email);
```

## Solution 5
```java
@Service
class StudentService {
    private final StudentRepository repository;

    StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    Student create(String name, String email) {
        return repository.save(new Student(name, email));
    }
}
```

## Solution 6
```java
@Entity
class Author {
    @Id @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "author")
    private List<Book> books = new ArrayList<>();
}

@Entity
class Book {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Author author;
}
```

## Solution 7
Use `@Transactional` when one service method performs multiple database changes that must succeed or fail together.

## Solution 8
N+1 happens when one query loads parent records and then one extra query runs for each child relationship.

## Solution 9
```java
record StudentResponse(Long id, String name, String email) {
    static StudentResponse from(Student student) {
        return new StudentResponse(student.getId(), student.getName(), student.getEmail());
    }
}
```

## Solution 10
If a course has enrollments, either block deletion, remove enrollments first inside a transaction, or use soft delete. Choose based on business rules.


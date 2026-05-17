# Chapter 23 - JPA and Hibernate

JDBC gives control, but it can become repetitive. JPA and Hibernate help map Java objects to database tables.

---

## Goals of Chapter 23
- Understand ORM.
- Create JPA entities.
- Use Spring Data repositories.
- Model relationships.
- Understand transactions.

## Sub-topics
| Section | Topic | Description |
| :--- | :--- | :--- |
| **23.1** | **ORM** | Object-relational mapping |
| **23.2** | **Entities** | Java class mapped to table |
| **23.3** | **Repositories** | Database access with interfaces |
| **23.4** | **Relationships** | One-to-many and many-to-one |
| **23.5** | **Transactions** | Keep database changes consistent |

---

## 23.1 ORM

ORM means Object Relational Mapping.

Instead of writing every SQL query manually, you work with Java objects and repositories.

---

## 23.2 Entity

```java
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
class Student {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;

    protected Student() {
    }

    Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
```

JPA needs a no-argument constructor.

---

## 23.3 Repository

```java
interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByEmail(String email);
}
```

Spring Data JPA creates the implementation automatically.

---

## 23.4 Relationships

Many books can belong to one author:
```java
@Entity
class Book {
    @ManyToOne
    private Author author;
}
```

One author can have many books:
```java
@Entity
class Author {
    @OneToMany(mappedBy = "author")
    private List<Book> books = new ArrayList<>();
}
```

Relationships are powerful, but they must be designed carefully to avoid slow queries.

---

## 23.5 Transactions

```java
@Transactional
public void transferBook(Long fromUserId, Long toUserId, Long bookId) {
    // all database changes succeed together or fail together
}
```

Transactions protect consistency.

---

## Chapter Summary
JPA lets Java objects represent database rows. Hibernate is the common JPA implementation. Use repositories for simple data access, and use transactions when multiple database changes must succeed together.


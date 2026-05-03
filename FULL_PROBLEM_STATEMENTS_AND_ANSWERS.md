# Full Problem Statements and Answers

This file upgrades the course with complete problem format for every chapter:

- Full problem statement
- Input format
- Output format
- Sample input
- Sample output
- Explanation
- Full Java answer

---

## Chapter 1 - Java Foundations

### Problem - Student Percentage Calculator

**Problem Statement**  
Write a Java program that takes a student's name and marks in three subjects. Calculate the total marks and percentage. Assume each subject is out of 100.

**Input Format**
```text
name
mark1
mark2
mark3
```

**Output Format**
```text
Name: <name>
Total: <total>
Percentage: <percentage>
```

**Sample Input**
```text
Asha
80
90
85
```

**Sample Output**
```text
Name: Asha
Total: 255
Percentage: 85.0
```

**Explanation**  
The total is `80 + 90 + 85 = 255`. Percentage is `255 / 300 * 100 = 85.0`.

**Full Answer**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int mark1 = scanner.nextInt();
        int mark2 = scanner.nextInt();
        int mark3 = scanner.nextInt();

        int total = mark1 + mark2 + mark3;
        double percentage = total / 300.0 * 100;

        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
    }
}
```

---

## Chapter 2 - Control Flow

### Problem - Electricity Bill Slab Calculator

**Problem Statement**  
Write a program that reads electricity units and calculates the bill:

- First 100 units: Rs. 5 per unit
- Next 100 units: Rs. 7 per unit
- Above 200 units: Rs. 10 per unit

**Input Format**
```text
units
```

**Output Format**
```text
Bill: <amount>
```

**Sample Input**
```text
250
```

**Sample Output**
```text
Bill: 1850
```

**Explanation**  
First 100 units cost `500`, next 100 cost `700`, remaining 50 cost `500`. Total is `1700`. If you want a fixed meter charge, add it separately; this problem has no fixed charge.

**Full Answer**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();
        int bill;

        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = 100 * 5 + (units - 100) * 7;
        } else {
            bill = 100 * 5 + 100 * 7 + (units - 200) * 10;
        }

        System.out.println("Bill: " + bill);
    }
}
```

---

## Chapter 3 - Methods, Arrays, and Strings

### Problem - Find Longest Word

**Problem Statement**  
Read a sentence and print the longest word in it. If two words have the same longest length, print the first one.

**Input Format**
```text
sentence
```

**Output Format**
```text
Longest word: <word>
```

**Sample Input**
```text
java makes programming powerful
```

**Sample Output**
```text
Longest word: programming
```

**Explanation**  
The words are `java`, `makes`, `programming`, `powerful`. The longest is `programming`.

**Full Answer**
```java
import java.util.Scanner;

public class Main {
    static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println("Longest word: " + findLongestWord(sentence));
    }
}
```

---

## Chapter 4 - Object-Oriented Programming

### Problem - Bank Account Class

**Problem Statement**  
Create a `BankAccount` class with account holder name and balance. Add methods to deposit, withdraw, and display balance. Withdrawal should fail if the amount is greater than the balance.

**Input Format**
```text
holderName
initialBalance
depositAmount
withdrawAmount
```

**Output Format**
```text
Balance: <balance after deposit>
Withdrawal successful
Balance: <final balance>
```

or

```text
Balance: <balance after deposit>
Insufficient balance
Balance: <final balance>
```

**Sample Input**
```text
Asha
1000
500
300
```

**Sample Output**
```text
Balance: 1500.0
Withdrawal successful
Balance: 1200.0
```

**Full Answer**
```java
import java.util.Scanner;

class BankAccount {
    private String holderName;
    private double balance;

    BankAccount(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double initialBalance = scanner.nextDouble();
        double depositAmount = scanner.nextDouble();
        double withdrawAmount = scanner.nextDouble();

        BankAccount account = new BankAccount(name, initialBalance);
        account.deposit(depositAmount);
        account.displayBalance();
        account.withdraw(withdrawAmount);
        account.displayBalance();
    }
}
```

---

## Chapter 5 - Collections Framework

### Problem - Count Student Name Frequency

**Problem Statement**  
Read `n` student names and count how many times each name appears.

**Input Format**
```text
n
name1
name2
...
nameN
```

**Output Format**
```text
name: count
```

**Sample Input**
```text
5
Asha
Ravi
Asha
Meera
Ravi
```

**Sample Output**
```text
Asha: 2
Ravi: 2
Meera: 1
```

**Full Answer**
```java
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> frequency = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            frequency.put(name, frequency.getOrDefault(name, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
```

---

## Chapter 6 - Exception Handling

### Problem - Safe Division

**Problem Statement**  
Read two integers and divide the first by the second. If the second number is zero, print a clear error message instead of crashing.

**Input Format**
```text
a
b
```

**Output Format**
```text
Result: <value>
```

or

```text
Cannot divide by zero
```

**Sample Input**
```text
10
0
```

**Sample Output**
```text
Cannot divide by zero
```

**Full Answer**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Cannot divide by zero");
        }
    }
}
```

---

## Chapter 7 - File I/O

### Problem - Save Student Names to File

**Problem Statement**  
Read `n` student names from input and save them into a file named `students.txt`, one name per line. Then read the file and print its content.

**Input Format**
```text
n
name1
name2
...
nameN
```

**Output Format**
```text
Saved students:
name1
name2
...
```

**Sample Input**
```text
3
Asha
Ravi
Meera
```

**Sample Output**
```text
Saved students:
Asha
Ravi
Meera
```

**Full Answer**
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))) {
            for (int i = 0; i < n; i++) {
                writer.write(scanner.nextLine());
                writer.newLine();
            }
        } catch (IOException ex) {
            System.out.println("Write failed: " + ex.getMessage());
            return;
        }

        System.out.println("Saved students:");
        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Read failed: " + ex.getMessage());
        }
    }
}
```

---

## Chapter 8 - Generics and Functional Programming

### Problem - Filter Passing Marks with Streams

**Problem Statement**  
Read `n` marks and print only the marks greater than or equal to 40 using Java Streams.

**Input Format**
```text
n
mark1 mark2 ... markN
```

**Output Format**
```text
Passing marks: [marks]
```

**Sample Input**
```text
6
20 45 90 33 40 75
```

**Sample Output**
```text
Passing marks: [45, 90, 40, 75]
```

**Full Answer**
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> marks = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            marks.add(scanner.nextInt());
        }

        List<Integer> passingMarks = marks.stream()
                .filter(mark -> mark >= 40)
                .collect(Collectors.toList());

        System.out.println("Passing marks: " + passingMarks);
    }
}
```

---

## Chapter 9 - Multithreading and Concurrency

### Problem - Background Countdown

**Problem Statement**  
Create a thread that prints a countdown from `n` to `1`. The main thread should wait until the countdown finishes, then print `Done`.

**Input Format**
```text
n
```

**Output Format**
```text
n
n-1
...
1
Done
```

**Sample Input**
```text
3
```

**Sample Output**
```text
3
2
1
Done
```

**Full Answer**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Thread countdown = new Thread(() -> {
            for (int i = n; i >= 1; i--) {
                System.out.println(i);
            }
        });

        countdown.start();
        countdown.join();
        System.out.println("Done");
    }
}
```

---

## Chapter 10 - Advanced Java Tools

### Problem - Order Status with Enum

**Problem Statement**  
Create an enum `OrderStatus` with values `PLACED`, `SHIPPED`, and `DELIVERED`. Read a status and print a user-friendly message.

**Input Format**
```text
status
```

**Output Format**
```text
<message>
```

**Sample Input**
```text
SHIPPED
```

**Sample Output**
```text
Your order is on the way.
```

**Full Answer**
```java
import java.util.Scanner;

enum OrderStatus {
    PLACED, SHIPPED, DELIVERED
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderStatus status = OrderStatus.valueOf(scanner.nextLine().toUpperCase());

        switch (status) {
            case PLACED:
                System.out.println("Your order has been placed.");
                break;
            case SHIPPED:
                System.out.println("Your order is on the way.");
                break;
            case DELIVERED:
                System.out.println("Your order has been delivered.");
                break;
        }
    }
}
```

---

## Chapter 11 - Unit Testing

### Problem - Test a Calculator

**Problem Statement**  
Create a `Calculator` class with an `add` method. Write a JUnit 5 test to verify that `add(10, 20)` returns `30`.

**Input Format**
```text
No console input
```

**Output Format**
```text
JUnit test passes
```

**Sample Input**
```text
No input
```

**Sample Output**
```text
Test passed
```

**Full Answer**
```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}
```

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(30, calculator.add(10, 20));
    }
}
```

---

## Chapter 12 - Database JDBC

### Problem - Insert Student with PreparedStatement

**Problem Statement**  
Write JDBC code that inserts a student name and email into a `students` table using `PreparedStatement`.

**Input Format**
```text
name
email
```

**Output Format**
```text
Student inserted
```

**Sample Input**
```text
Asha
asha@example.com
```

**Sample Output**
```text
Student inserted
```

**Full Answer**
```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String email = scanner.nextLine();

        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "password";

        String sql = "INSERT INTO students(name, email) VALUES (?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, name);
            statement.setString(2, email);
            statement.executeUpdate();
            System.out.println("Student inserted");
        }
    }
}
```

---

## Chapter 13 - Capstone Project

### Problem - Library Book Search

**Problem Statement**  
Create a small library program. Read `n` books, then read an author name and print all books written by that author.

**Input Format**
```text
n
title1
author1
title2
author2
...
searchAuthor
```

**Output Format**
```text
Books by <author>:
<title>
```

**Sample Input**
```text
3
Java Basics
Asha
Spring Guide
Ravi
Advanced Java
Asha
Asha
```

**Sample Output**
```text
Books by Asha:
Java Basics
Advanced Java
```

**Full Answer**
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Book> books = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            books.add(new Book(title, author));
        }

        String searchAuthor = scanner.nextLine();
        System.out.println("Books by " + searchAuthor + ":");

        books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(searchAuthor))
                .forEach(book -> System.out.println(book.getTitle()));
    }
}
```

---

## Chapter 14 - Git, GitHub, and Project Structure

### Problem - Organize Student Project

**Problem Statement**  
Create a Java project with two packages: `com.course.student` and `com.course.app`. The student package should contain a `Student` class. The app package should contain `Main`, which creates and prints a student.

**Input Format**
```text
No console input
```

**Output Format**
```text
Student: <name>
```

**Sample Output**
```text
Student: Asha
```

**Full Answer**
```java
package com.course.student;

public class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

```java
package com.course.app;

import com.course.student.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Asha");
        System.out.println("Student: " + student.getName());
    }
}
```

---

## Chapter 15 - Maven and Gradle

### Problem - Create Maven Project Configuration

**Problem Statement**  
Write a minimal Maven `pom.xml` for a Java 21 project named `student-app` with JUnit 5 as a test dependency.

**Input Format**
```text
No console input
```

**Output Format**
```text
Valid pom.xml
```

**Full Answer**
```xml
<project>
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.course</groupId>
    <artifactId>student-app</artifactId>
    <version>1.0.0</version>

    <properties>
        <maven.compiler.source>21</maven.compiler.source>
        <maven.compiler.target>21</maven.compiler.target>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.10.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>
```

---

## Chapter 16 - Data Structures and Algorithms

### Problem - Valid Parentheses

**Problem Statement**  
Given a string containing only `(` and `)`, check whether every opening bracket has a matching closing bracket in the correct order.

**Input Format**
```text
bracketString
```

**Output Format**
```text
Valid
```

or

```text
Invalid
```

**Sample Input**
```text
(()())
```

**Sample Output**
```text
Valid
```

**Full Answer**
```java
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static boolean isValid(String text) {
        Stack<Character> stack = new Stack<>();

        for (char ch : text.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(isValid(text) ? "Valid" : "Invalid");
    }
}
```

---

## Chapter 17 - Modern Java

### Problem - Student Record Validation

**Problem Statement**  
Create a Java record named `Student` with `name` and `age`. The name must not be blank and age must be greater than zero.

**Input Format**
```text
name
age
```

**Output Format**
```text
Student[name=<name>, age=<age>]
```

or

```text
Invalid student data
```

**Sample Input**
```text
Asha
20
```

**Sample Output**
```text
Student[name=Asha, age=20]
```

**Full Answer**
```java
import java.util.Scanner;

record Student(String name, int age) {
    Student {
        if (name == null || name.isBlank() || age <= 0) {
            throw new IllegalArgumentException("Invalid student data");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        try {
            Student student = new Student(name, age);
            System.out.println(student);
        } catch (IllegalArgumentException ex) {
            System.out.println("Invalid student data");
        }
    }
}
```

---

## Chapter 18 - JVM and Memory

### Problem - Same Object Reference

**Problem Statement**  
Create one `Student` object and assign it to two references. Change the name using the second reference and print the name using the first reference.

**Input Format**
```text
originalName
newName
```

**Output Format**
```text
<newName>
```

**Sample Input**
```text
Asha
Ravi
```

**Sample Output**
```text
Ravi
```

**Explanation**  
Both references point to the same object in heap memory.

**Full Answer**
```java
import java.util.Scanner;

class Student {
    private String name;

    Student(String name) {
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalName = scanner.nextLine();
        String newName = scanner.nextLine();

        Student first = new Student(originalName);
        Student second = first;
        second.setName(newName);

        System.out.println(first.getName());
    }
}
```

---

## Chapter 19 - Logging, JSON, and HTTP

### Problem - Product JSON

**Problem Statement**  
Create a `Product` object and convert it into JSON using Jackson.

**Input Format**
```text
id
name
price
```

**Output Format**
```text
{"id":<id>,"name":"<name>","price":<price>}
```

**Sample Input**
```text
1
Keyboard
1200.0
```

**Sample Output**
```text
{"id":1,"name":"Keyboard","price":1200.0}
```

**Full Answer**
```java
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Scanner;

class Product {
    public int id;
    public String name;
    public double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(id, name, price);
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(product));
    }
}
```

---

## Chapter 20 - Design Patterns and Clean Code

### Problem - Discount Strategy

**Problem Statement**  
Use the Strategy pattern to calculate final price. If type is `STUDENT`, apply 10 percent discount. If type is `FESTIVAL`, apply 20 percent discount. If type is `NONE`, no discount.

**Input Format**
```text
amount
discountType
```

**Output Format**
```text
Final amount: <amount>
```

**Sample Input**
```text
1000
STUDENT
```

**Sample Output**
```text
Final amount: 900.0
```

**Full Answer**
```java
import java.util.Scanner;

interface DiscountStrategy {
    double apply(double amount);
}

class NoDiscount implements DiscountStrategy {
    public double apply(double amount) {
        return amount;
    }
}

class StudentDiscount implements DiscountStrategy {
    public double apply(double amount) {
        return amount * 0.90;
    }
}

class FestivalDiscount implements DiscountStrategy {
    public double apply(double amount) {
        return amount * 0.80;
    }
}

public class Main {
    static DiscountStrategy getStrategy(String type) {
        if (type.equalsIgnoreCase("STUDENT")) return new StudentDiscount();
        if (type.equalsIgnoreCase("FESTIVAL")) return new FestivalDiscount();
        return new NoDiscount();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();

        DiscountStrategy strategy = getStrategy(type);
        System.out.println("Final amount: " + strategy.apply(amount));
    }
}
```

---

## Chapter 21 - Spring Boot Basics

### Problem - Greeting API

**Problem Statement**  
Create a Spring Boot REST endpoint `GET /hello/{name}` that returns `Welcome, <name>`.

**Input Format**
```text
HTTP GET /hello/Asha
```

**Output Format**
```text
Welcome, Asha
```

**Full Answer**
```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

@Service
class GreetingService {
    String greet(String name) {
        return "Welcome, " + name;
    }
}

@RestController
class GreetingController {
    private final GreetingService service;

    GreetingController(GreetingService service) {
        this.service = service;
    }

    @GetMapping("/hello/{name}")
    String hello(@PathVariable String name) {
        return service.greet(name);
    }
}
```

---

## Chapter 22 - REST API Development

### Problem - Create Student Endpoint

**Problem Statement**  
Create a REST endpoint `POST /students` that accepts student name and email, then returns the created student with status `201 Created`.

**Sample Request**
```json
{
  "name": "Asha",
  "email": "asha@example.com"
}
```

**Sample Response**
```json
{
  "id": 1,
  "name": "Asha",
  "email": "asha@example.com"
}
```

**Full Answer**
```java
record CreateStudentRequest(String name, String email) {}
record StudentResponse(Long id, String name, String email) {}
```

```java
@RestController
@RequestMapping("/students")
class StudentController {
    private final StudentService service;

    StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    ResponseEntity<StudentResponse> create(@RequestBody CreateStudentRequest request) {
        StudentResponse response = service.create(request);
        return ResponseEntity.status(201).body(response);
    }
}
```

---

## Chapter 23 - JPA and Hibernate

### Problem - Student Entity and Repository

**Problem Statement**  
Create a JPA entity named `Student` with id, name, and email. Create a repository that can find a student by email.

**Input Format**
```text
No console input
```

**Output Format**
```text
Repository method is available: findByEmail
```

**Full Answer**
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

```java
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByEmail(String email);
}
```

---

## Chapter 24 - Mockito and Advanced Testing

### Problem - Test Student Service Not Found

**Problem Statement**  
Write a Mockito unit test that verifies `StudentService.findById(99L)` throws `StudentNotFoundException` when the repository returns empty.

**Input Format**
```text
No console input
```

**Output Format**
```text
JUnit test passes
```

**Full Answer**
```java
@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
    @Mock
    StudentRepository repository;

    @InjectMocks
    StudentService service;

    @Test
    void throwsWhenStudentIsMissing() {
        when(repository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(StudentNotFoundException.class, () -> service.findById(99L));
    }
}
```

---

## Chapter 25 - Final Backend Capstone

### Problem - Enroll Student in Course

**Problem Statement**  
In the Student Course Management API, implement service logic to enroll a student in a course. If the student does not exist, throw `StudentNotFoundException`. If the course does not exist, throw `CourseNotFoundException`. If the student is already enrolled, throw `DuplicateEnrollmentException`.

**Input Format**
```text
studentId
courseId
```

**Output Format**
```json
{
  "studentId": 1,
  "courseId": 10,
  "status": "ENROLLED"
}
```

**Full Answer**
```java
@Transactional
public EnrollmentResponse enroll(Long studentId, Long courseId) {
    Student student = studentRepository.findById(studentId)
            .orElseThrow(() -> new StudentNotFoundException(studentId));

    Course course = courseRepository.findById(courseId)
            .orElseThrow(() -> new CourseNotFoundException(courseId));

    boolean alreadyEnrolled = enrollmentRepository
            .existsByStudentIdAndCourseId(studentId, courseId);

    if (alreadyEnrolled) {
        throw new DuplicateEnrollmentException(studentId, courseId);
    }

    Enrollment enrollment = new Enrollment(student, course);
    Enrollment saved = enrollmentRepository.save(enrollment);

    return new EnrollmentResponse(
            saved.getStudent().getId(),
            saved.getCourse().getId(),
            "ENROLLED"
    );
}
```


# Chapter 21 - Full Practice Questions

## Problem 1 - Beginner: Hello Spring Boot

**Problem Statement**  
Create a Spring Boot application with one endpoint `GET /hello` that returns `Hello Spring Boot`.

**Input Format**
```text
HTTP GET /hello
```

**Output Format**
```text
Hello Spring Boot
```

**Sample Input**
```text
GET /hello
```

**Sample Output**
```text
Hello Spring Boot
```

---

## Problem 2 - Intermediate: Greeting Service with Dependency Injection

**Problem Statement**  
Create a `GreetingService` and inject it into a REST controller. The endpoint `GET /hello/{name}` should return a personalized welcome message.

**Input Format**
```text
HTTP GET /hello/{name}
```

**Output Format**
```text
Welcome, <name>
```

**Sample Input**
```text
GET /hello/Asha
```

**Sample Output**
```text
Welcome, Asha
```

---

## Problem 3 - Advanced: Layered Student Lookup

**Problem Statement**  
Create a layered Spring Boot flow with controller, service, and repository. The endpoint `GET /students/{id}` should return student details if found.

**Input Format**
```text
HTTP GET /students/{id}
```

**Output Format**
```json
{"id":<id>,"name":"<name>","email":"<email>"}
```

**Sample Input**
```text
GET /students/1
```

**Sample Output**
```json
{"id":1,"name":"Asha","email":"asha@example.com"}
```


# Chapter 22 - Full Practice Questions

## Problem 1 - Beginner: REST Endpoint Naming

**Problem Statement**  
Convert action-style API names into REST-style resource endpoints.

**Input Format**
```text
actionName
resourceName
```

**Output Format**
```text
REST Endpoint: <method> <path>
```

**Sample Input**
```text
getAll
students
```

**Sample Output**
```text
REST Endpoint: GET /students
```

---

## Problem 2 - Intermediate: Create Student API

**Problem Statement**  
Create a `POST /students` endpoint that accepts name and email and returns a created student response with HTTP status `201`.

**Input Format**
```json
{"name":"<name>","email":"<email>"}
```

**Output Format**
```json
{"id":<id>,"name":"<name>","email":"<email>"}
```

**Sample Input**
```json
{"name":"Asha","email":"asha@example.com"}
```

**Sample Output**
```json
{"id":1,"name":"Asha","email":"asha@example.com"}
```

---

## Problem 3 - Advanced: Global Error Response

**Problem Statement**  
Create global exception handling for a missing student. When `StudentNotFoundException` is thrown, return status `404` with a JSON error body.

**Input Format**
```text
HTTP GET /students/{missingId}
```

**Output Format**
```json
{"message":"Student not found: <id>","status":404}
```

**Sample Input**
```text
GET /students/99
```

**Sample Output**
```json
{"message":"Student not found: 99","status":404}
```


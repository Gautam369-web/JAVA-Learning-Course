# Chapter 24 - Full Practice Questions

## Problem 1 - Beginner: Test Calculator Add Method

**Problem Statement**  
Create a JUnit test for a calculator method `add(a, b)`. The test should pass when `add(10, 20)` returns `30`.

**Input Format**
```text
a
b
expected
```

**Output Format**
```text
Test passed
```

**Sample Input**
```text
10
20
30
```

**Sample Output**
```text
Test passed
```

---

## Problem 2 - Intermediate: Mock Repository Find By ID

**Problem Statement**  
Write a Mockito test where `StudentRepository.findById(1L)` returns a fake student. Verify that the service returns the same student name.

**Input Format**
```text
studentId
studentName
```

**Output Format**
```text
Service returned: <studentName>
```

**Sample Input**
```text
1
Asha
```

**Sample Output**
```text
Service returned: Asha
```

---

## Problem 3 - Advanced: MockMvc Controller Test

**Problem Statement**  
Write a `@WebMvcTest` for `GET /students/1`. Mock the service response and verify that the API returns HTTP `200` and the expected JSON body.

**Input Format**
```text
HTTP GET /students/1
```

**Output Format**
```json
{"id":1,"name":"Asha","email":"asha@example.com"}
```

**Sample Input**
```text
GET /students/1
```

**Sample Output**
```json
{"id":1,"name":"Asha","email":"asha@example.com"}
```


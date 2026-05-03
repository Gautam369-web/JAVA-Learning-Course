# Chapter 19 - Full Practice Questions

## Problem 1 - Beginner: Choose Logging Level

**Problem Statement**  
Read an event type and print the correct logging level.

Rules:
- `started`: INFO
- `invalid-input`: WARN
- `crashed`: ERROR

**Input Format**
```text
eventType
```

**Output Format**
```text
Log Level: <level>
```

**Sample Input**
```text
invalid-input
```

**Sample Output**
```text
Log Level: WARN
```

---

## Problem 2 - Intermediate: Product JSON

**Problem Statement**  
Read product details and produce a JSON object containing `id`, `name`, `price`, and `available`.

**Input Format**
```text
id
name
price
available
```

**Output Format**
```json
{"id":<id>,"name":"<name>","price":<price>,"available":<available>}
```

**Sample Input**
```text
1
Keyboard
1200.0
true
```

**Sample Output**
```json
{"id":1,"name":"Keyboard","price":1200.0,"available":true}
```

---

## Problem 3 - Advanced: HTTP Status Category

**Problem Statement**  
Read an HTTP status code and classify it as success, client error, server error, or unknown.

**Input Format**
```text
statusCode
```

**Output Format**
```text
Category: <category>
```

**Sample Input**
```text
404
```

**Sample Output**
```text
Category: Client Error
```


# Chapter 19 - Logging, JSON, and HTTP

Most real Java applications communicate with users, files, APIs, and other services. This chapter teaches practical tools used in backend work.

---

## Goals of Chapter 19
- Replace random print statements with logging.
- Understand JSON data.
- Read and write JSON with Java libraries.
- Call HTTP APIs from Java.

## Sub-topics
| Section | Topic | Description |
| :--- | :--- | :--- |
| **19.1** | **Logging** | Record application events |
| **19.2** | **JSON** | Common data format for APIs |
| **19.3** | **Jackson/Gson** | Convert Java objects to JSON |
| **19.4** | **HTTP Basics** | Request and response model |
| **19.5** | **Java HTTP Client** | Call APIs from Java |

---

## 19.1 Logging

`System.out.println` is fine for learning. Real projects use logs.

Logging levels:
- `ERROR`: Something failed.
- `WARN`: Something unusual happened.
- `INFO`: Normal important event.
- `DEBUG`: Detailed developer information.

Simple Java logging:
```java
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.info("Application started");
    }
}
```

---

## 19.2 JSON

JSON is a text format used by APIs.

```json
{
  "id": 1,
  "name": "Asha",
  "active": true
}
```

Java object:
```java
class User {
    public int id;
    public String name;
    public boolean active;
}
```

---

## 19.3 Jackson Example

Maven dependency:
```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.17.1</version>
</dependency>
```

Usage:
```java
ObjectMapper mapper = new ObjectMapper();
User user = new User(1, "Asha", true);
String json = mapper.writeValueAsString(user);
User copy = mapper.readValue(json, User.class);
```

---

## 19.4 HTTP Basics

An HTTP request asks for something.

Common methods:
- `GET`: Read data.
- `POST`: Create data.
- `PUT`: Replace data.
- `DELETE`: Remove data.

Common status codes:
- `200`: OK.
- `201`: Created.
- `400`: Bad request.
- `404`: Not found.
- `500`: Server error.

---

## 19.5 Java HTTP Client

```java
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://example.com"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
```

---

## Chapter Summary
Logging helps you understand running applications. JSON is the language of APIs. HTTP lets Java communicate with the outside world.


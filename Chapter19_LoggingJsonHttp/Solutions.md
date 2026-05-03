# Chapter 19 - Solutions

## Solution 1
- `INFO`: application started.
- `WARN`: retrying failed request.
- `ERROR`: payment failed after all retries.

## Solution 2
```java
private static final Logger logger = Logger.getLogger(Main.class.getName());
logger.info("Application started");
```

## Solution 3
```json
{
  "id": 1,
  "name": "Keyboard",
  "price": 1200.0,
  "available": true
}
```

## Solution 4
```java
class Product {
    public int id;
    public String name;
    public double price;
    public boolean available;
}
```

## Solution 5
```java
ObjectMapper mapper = new ObjectMapper();
String json = mapper.writeValueAsString(product);
```

## Solution 6
```java
Product product = mapper.readValue(json, Product.class);
```

## Solution 7
`200` means success, `201` means created, `400` means invalid request, `404` means missing resource, and `500` means server error.

## Solution 8
```java
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://example.com"))
        .GET()
        .build();
HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
System.out.println(response.statusCode());
```

## Solution 9
```java
HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://example.com/products"))
        .header("Content-Type", "application/json")
        .POST(HttpRequest.BodyPublishers.ofString(json))
        .build();
```

## Solution 10
```java
int code = response.statusCode();
if (code >= 200 && code < 300) {
    System.out.println("Success");
} else if (code >= 400 && code < 500) {
    System.out.println("Client error");
} else if (code >= 500) {
    System.out.println("Server error");
}
```


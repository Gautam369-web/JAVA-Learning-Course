# Chapter 12 – Database Connectivity (JDBC)

## 12.2 The Connection Flow
```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/my_database";
        try (Connection conn = DriverManager.getConnection(url, "root", "pass")) {
            System.out.println("Connected successfully!");
        } catch (SQLException e) {
            System.out.println("Connection failed.");
        }
    }
}
```
**Output**:
```text
Connected successfully! (Or 'Connection failed.' if DB is offline)
```

---

## 12.3 PreparedStatement
```java
// Logic inside a method with a Connection 'conn'
String sql = "INSERT INTO students (name, age) VALUES (?, ?)";
try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
    pstmt.setString(1, "Gautam");
    pstmt.setInt(2, 21);
    int rows = pstmt.executeUpdate();
    System.out.println(rows + " row(s) inserted.");
}
```
**Output**:
```text
1 row(s) inserted.
```

---

## 12.4 ResultSets
```java
// Logic inside a method with a Statement 'stmt'
String sql = "SELECT * FROM students";
ResultSet rs = stmt.executeQuery(sql);

while (rs.next()) {
    System.out.println(rs.getString("name") + " | " + rs.getInt("age"));
}
```
**Output**:
```text
Gautam | 21
Alice | 22
```

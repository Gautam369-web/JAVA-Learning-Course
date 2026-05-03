# Chapter 12 – JDBC Solutions

These solutions provide the boilerplate code needed for database operations. Note: You must have a database server running and the JDBC driver installed to run these.

---

## Solution 1: The Handshake (Connection)
```java
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        try (Connection conn = DriverManager.getConnection(url, "root", "pass")) {
            System.out.println("Connected!");
        } catch (SQLException e) {
            System.out.println("Error: Server not found");
        }
    }
}
```

---

## Solution 2: The Student Inserter (CRUD: Create)
```java
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String sql = "INSERT INTO students (name, grade) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection("url", "user", "pass");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, "Rahul");
            pstmt.setString(2, "A");
            pstmt.executeUpdate();
            System.out.println("Student inserted.");
        }
    }
}
```

---

## Solution 3: Price Updater (CRUD: Update)
```java
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String sql = "UPDATE products SET price = price * 1.10";
        try (Connection conn = DriverManager.getConnection("url", "user", "pass");
             Statement stmt = conn.createStatement()) {
            
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected + " products updated.");
        }
    }
}
```

---

## Solution 4: The Searcher (CRUD: Read)
```java
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String sql = "SELECT email FROM users";
        try (Connection conn = DriverManager.getConnection("url", "user", "pass");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                System.out.println("User Email: " + rs.getString("email"));
            }
        }
    }
}
```

---

## Solution 5: Delete Inactive (CRUD: Delete)
```java
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String sql = "DELETE FROM users WHERE status = 'inactive'";
        try (Connection conn = DriverManager.getConnection("url", "user", "pass");
             Statement stmt = conn.createStatement()) {
            
            stmt.executeUpdate(sql);
            System.out.println("Inactive users removed.");
        }
    }
}
```

---

## Solution 6: Safe Search (SQL Injection)
```java
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String searchTitle = "Java Programming";
        String sql = "SELECT * FROM books WHERE title = ?";
        
        try (Connection conn = DriverManager.getConnection("url", "user", "pass");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, searchTitle);
            ResultSet rs = pstmt.executeQuery();
            // ... process results
        }
    }
}
```

---

## Solution 7: Record Count (Aggregate)
```java
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String sql = "SELECT COUNT(*) FROM inventory";
        try (Connection conn = DriverManager.getConnection("url", "user", "pass");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            if (rs.next()) {
                System.out.println("Total items: " + rs.getInt(1));
            }
        }
    }
}
```

---

## Solution 8: Transaction Safety (Commit/Rollback)
```java
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("url", "user", "pass");
            conn.setAutoCommit(false); // Start Transaction

            // Step 1: Subtract from A
            // Step 2: Add to B
            
            conn.commit(); // Success!
            System.out.println("Transfer complete.");
        } catch (SQLException e) {
            try { if (conn != null) conn.rollback(); } catch(Exception ex){} // Failure!
            System.out.println("Transfer failed. Reverting changes.");
        }
    }
}
```

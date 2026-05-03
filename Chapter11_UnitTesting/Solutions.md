# Chapter 11 – Unit Testing Solutions

These solutions demonstrate the proper syntax for JUnit 5 tests, including assertions and lifecycle hooks.

---

## Solution 1: String Length Test (Basic Assertion)
```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class StringTest {
    @Test
    void testLength() {
        String str = "Java";
        assertEquals(4, str.length());
    }
}
```

---

## Solution 2: User Authentication (assertTrue)
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AuthTest {
    boolean login(String u, String p) {
        return u.equals("admin") && p.equals("1234");
    }

    @Test
    void testLogin() {
        assertTrue(login("admin", "1234"));
        assertFalse(login("admin", "wrong"));
    }
}
```

---

## Solution 3: Calculator Subtract (assertEquals)
```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalcTest {
    @Test
    void testSub() {
        int result = 10 - 4;
        assertEquals(6, result, "Subtraction logic failed!");
    }
}
```

---

## Solution 4: The Empty List (Lifecycle)
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class ListTest {
    ArrayList<String> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>(); // Fresh list for every test
    }

    @Test
    void testSize() {
        list.add("Item");
        assertEquals(1, list.size());
    }

    @Test
    void testEmpty() {
        assertTrue(list.isEmpty());
    }
}
```

---

## Solution 5: Negative Price Error (assertThrows)
```java
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class Product {
    void setPrice(double p) {
        if (p < 0) throw new IllegalArgumentException("Negative price");
    }
}

class PriceTest {
    @Test
    void testException() {
        Product p = new Product();
        assertThrows(IllegalArgumentException.class, () -> p.setPrice(-50));
    }
}
```

---

## Solution 6: Null Object Check (assertNull)
```java
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class UserDB {
    String find(int id) { return null; } // Simulate user not found
}

class DBTest {
    @Test
    void testNotFound() {
        UserDB db = new UserDB();
        assertNull(db.find(999));
    }
}
```

---

## Solution 7: Array Equality (assertArrayEquals)
```java
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class SortTest {
    @Test
    void testSort() {
        int[] actual = {3, 1, 2};
        int[] expected = {1, 2, 3};
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}
```

---

## Solution 8: Timeout Test (Performance)
```java
import static org.junit.jupiter.api.Assertions.assertTimeout;
import org.junit.jupiter.api.Test;
import java.time.Duration;

class SpeedTest {
    @Test
    void testPerformance() {
        assertTimeout(Duration.ofMillis(500), () -> {
            // Some fast operation
            Thread.sleep(100);
        });
    }
}
```

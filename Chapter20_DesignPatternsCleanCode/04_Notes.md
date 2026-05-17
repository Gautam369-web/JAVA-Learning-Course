# Chapter 20 - Design Patterns and Clean Code

Writing code that works is step one. Writing code that stays understandable as it grows is the next level.

---

## Goals of Chapter 20
- Understand common design patterns.
- Learn clean code habits.
- Recognize code smells.
- Refactor without changing behavior.

## Sub-topics
| Section | Topic | Description |
| :--- | :--- | :--- |
| **20.1** | **Clean Code** | Naming, small methods, clear responsibility |
| **20.2** | **SOLID Basics** | Five design principles |
| **20.3** | **Factory Pattern** | Create objects cleanly |
| **20.4** | **Builder Pattern** | Build complex objects |
| **20.5** | **Strategy Pattern** | Swap behavior |
| **20.6** | **MVC** | Separate model, view, controller |

---

## 20.1 Clean Code

Bad:
```java
int d;
```

Better:
```java
int discountPercentage;
```

Clean code rules:
- Use meaningful names.
- Keep methods focused.
- Avoid duplicated logic.
- Prefer readable code over clever code.

---

## 20.2 SOLID Basics

Simple meaning:
- **S**: One class should have one main responsibility.
- **O**: Add new behavior without breaking old code.
- **L**: Child classes should safely replace parent classes.
- **I**: Small interfaces are better than huge interfaces.
- **D**: Depend on abstractions, not concrete details.

---

## 20.3 Factory Pattern

Factory creates objects based on input.

```java
interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}

class SmsNotification implements Notification {
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}

class NotificationFactory {
    static Notification create(String type) {
        if (type.equalsIgnoreCase("email")) return new EmailNotification();
        if (type.equalsIgnoreCase("sms")) return new SmsNotification();
        throw new IllegalArgumentException("Unknown type");
    }
}
```

---

## 20.4 Builder Pattern

Useful when an object has many optional fields.

```java
class User {
    private String name;
    private String email;

    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
    }

    static class Builder {
        private String name;
        private String email;

        Builder name(String name) {
            this.name = name;
            return this;
        }

        Builder email(String email) {
            this.email = email;
            return this;
        }

        User build() {
            return new User(this);
        }
    }
}
```

---

## 20.5 Strategy Pattern

Strategy lets you change behavior without rewriting the main class.

```java
interface PaymentStrategy {
    void pay(double amount);
}

class CardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid by card: " + amount);
    }
}

class Checkout {
    private PaymentStrategy strategy;

    Checkout(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    void complete(double amount) {
        strategy.pay(amount);
    }
}
```

---

## Chapter Summary
Patterns are reusable solutions. Clean code is about making future change easier. A strong developer writes code that another developer can understand quickly.


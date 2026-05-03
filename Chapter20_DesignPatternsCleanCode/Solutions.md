# Chapter 20 - Solutions

## Solution 1
Examples: `x` -> `studentCount`, `d` -> `discount`, `a1` -> `firstAttempt`, `temp` -> `temporaryTotal` or a more specific name.

## Solution 2
Split into `validateUser`, `createUser`, and `saveUser` methods.

## Solution 3
The class has multiple reasons to change: file format, salary rule, and email provider. Split those responsibilities.

## Solution 4
```java
interface Notification { void send(String message); }
class EmailNotification implements Notification {
    public void send(String message) { System.out.println("Email: " + message); }
}
class SmsNotification implements Notification {
    public void send(String message) { System.out.println("SMS: " + message); }
}
class NotificationFactory {
    static Notification create(String type) {
        return switch (type) {
            case "email" -> new EmailNotification();
            case "sms" -> new SmsNotification();
            default -> throw new IllegalArgumentException("Unknown type");
        };
    }
}
```

## Solution 5
Use a static nested `Builder` class with chainable setter methods and a `build()` method.

## Solution 6
```java
interface DiscountStrategy {
    double apply(double amount);
}
class StudentDiscount implements DiscountStrategy {
    public double apply(double amount) {
        return amount * 0.90;
    }
}
```

## Solution 7
Model stores data, view displays output, controller receives user/API actions and coordinates work.

## Solution 8
Duplicated if-else blocks are hard to update. Long methods mix responsibilities and are difficult to test.

## Solution 9
Create a `PaymentStrategy` interface and one implementation per payment type.

## Solution 10
Look for classes doing too much, depending on concrete implementations, or forcing unused interface methods.


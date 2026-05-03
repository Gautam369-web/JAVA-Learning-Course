# Chapter 3 – OOP Practice Solutions

These solutions demonstrate the core pillars of Object-Oriented Programming: Class/Object design, Encapsulation, and Polymorphism.

---

## Solution 9: Library System (`Library.java`)
**Topic**: Classes, Objects, and Methods

```java
class Book {
    String title;
    String author;
    double price;

    // Method to display details
    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class Library {
    public static void main(String[] args) {
        // Creating an object
        Book myBook = new Book();
        
        // Setting fields
        myBook.title = "Java Basics";
        myBook.author = "John Doe";
        myBook.price = 500;
        
        // Calling method
        myBook.displayDetails();
    }
}
```
**💡 Human Understanding**: 
We define what a `Book` is (the class) and then create an actual instance of it in memory (`myBook`). This is the most basic building block of Java.

---

## Solution 10: Bank Account (`BankSystem.java`)
**Topic**: Encapsulation (Private Fields & Getters/Setters)

```java
class BankAccount {
    // Private field - cannot be accessed directly from outside
    private double balance;

    // Public method to modify balance safely (Setter-like)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to read balance (Getter)
    public double getBalance() {
        return balance;
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        account.deposit(100.50);
        
        System.out.println("Balance: " + account.getBalance());
        
        // account.balance = -500; // This would cause a compile error (Private!)
    }
}
```
**💡 Human Understanding**: 
By making `balance` private, we protect it from being changed to something silly (like a negative value). We only allow changes through the `deposit` method which has a security check.

---

## Solution 11: Shape Area (`Geometry.java`)
**Topic**: Inheritance & Polymorphism (Method Overriding)

```java
class Shape {
    // Generic method (to be overridden)
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;
    Circle(double r) { this.radius = r; }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

class Square extends Shape {
    double side;
    Square(double s) { this.side = s; }

    @Override
    double area() {
        return side * side;
    }
}

public class Geometry {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape s = new Square(4);

        System.out.println("Circle Area: " + c.area());
        System.out.println("Square Area: " + s.area());
    }
}
```
**💡 Human Understanding**: 
`Circle` and `Square` are both `Shapes` (Inheritance). Even though they are both "Shapes", they calculate area differently. When we call `area()`, Java automatically picks the correct version based on the actual object (Polymorphism).

---

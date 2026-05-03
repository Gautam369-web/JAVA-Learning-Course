# Chapter 3 – OOP Solutions (Problems 1-8)

These solutions correspond to the 8 practice problems in the `Practice_Questions.md` file.

---

## Solution 1: The Smartphone (Classes & Objects)
```java
class Smartphone {
    String brand;
    String model;
    double price;

    void displayInfo() {
        System.out.println("This is a " + brand + " " + model + " costing $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Smartphone p1 = new Smartphone();
        p1.brand = "Apple";
        p1.model = "iPhone 15";
        p1.price = 999;

        Smartphone p2 = new Smartphone();
        p2.brand = "Samsung";
        p2.model = "Galaxy S23";
        p2.price = 899;

        p1.displayInfo();
        p2.displayInfo();
    }
}
```

**Output**:
```text
This is a Apple iPhone 15 costing $999.0
This is a Samsung Galaxy S23 costing $899.0
```

---

## Solution 2: The New Student (Constructors & `this`)
```java
class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    void show() {
        System.out.println("Student " + name + " is in grade " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Rahul", "A");
        s.show();
    }
}
```

**Output**:
```text
Student Rahul is in grade A
```

---

## Solution 3: The Secret Vault (Encapsulation)
```java
class User {
    private String password;

    public void setPassword(String pass) {
        if (pass.length() > 6) {
            this.password = pass;
            System.out.println("Password set successfully.");
        } else {
            System.out.println("Error: Password too short!");
        }
    }

    public String getPassword() {
        return password;
    }
}

public class Main {
    public static void main(String[] args) {
        User u = new User();
        u.setPassword("123");      // Too short
        u.setPassword("secret123"); // Accepted
        System.out.println("Password: " + u.getPassword());
    }
}
```

**Output**:
```text
Error: Password too short!
Password set successfully.
Password: secret123
```

---

## Solution 4: The Shared Library (Static Members)
```java
class Book {
    String title;
    static int totalBooks = 0;

    Book(String title) {
        this.title = title;
        totalBooks++; // Increment shared variable
    }
}

public class Main {
    public static void main(String[] args) {
        new Book("Java");
        new Book("Python");
        new Book("C++");

        System.out.println("Total books in library: " + Book.totalBooks);
    }
}
```

**Output**:
```text
Total books in library: 3
```

---

## Solution 5: Family DNA (Inheritance)
```java
class Human {
    void walk() {
        System.out.println("Walking...");
    }
}

class Programmer extends Human {
    void code() {
        System.out.println("Coding...");
    }
}

public class Main {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.walk(); // Inherited
        p.code(); // Own method
    }
}
```

**Output**:
```text
Walking...
Coding...
```

---

## Solution 6: Animal Voices (Polymorphism/Overriding)
```java
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}

class Lion extends Animal {
    @Override
    void makeSound() {
        System.out.println("Roar!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Lion();

        a1.makeSound();
        a2.makeSound();
    }
}
```

**Output**:
```text
Bark!
Roar!
```

---

## Solution 7: The Drawing Tool (Abstract Classes)
```java
abstract class Tool {
    abstract void use();
}

class Pen extends Tool {
    void use() {
        System.out.println("Writing...");
    }
}

class Brush extends Tool {
    void use() {
        System.out.println("Painting...");
    }
}

public class Main {
    public static void main(String[] args) {
        Tool p = new Pen();
        Tool b = new Brush();
        p.use();
        b.use();
    }
}
```

**Output**:
```text
Writing...
Painting...
```

---

## Solution 8: The Smart Home (Interfaces)
```java
interface Switchable {
    void turnOn();
}

class Light implements Switchable {
    public void turnOn() {
        System.out.println("Light is glowing.");
    }
}

class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan is spinning.");
    }
}

public class Main {
    public static void main(String[] args) {
        Switchable l = new Light();
        Switchable f = new Fan();
        l.turnOn();
        f.turnOn();
    }
}
```

**Output**:
```text
Light is glowing.
Fan is spinning.
```

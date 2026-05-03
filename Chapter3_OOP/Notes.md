# Chapter 3 – Object-Oriented Programming (OOP)

## 3.1 Classes & Objects
```java
class Smartphone {
    String model;
    int batteryLevel;

    void makeCall(String personName) {
        System.out.println("Calling " + personName + " from my " + model + "...");
    }

    void checkBattery() {
        System.out.println("Battery is at: " + batteryLevel + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone(); 
        myPhone.model = "iPhone 15";
        myPhone.batteryLevel = 85;

        myPhone.makeCall("Dad");
        myPhone.checkBattery();
    }
}
```
**Output**:
```text
Calling Dad from my iPhone 15...
Battery is at: 85%
```

---

## 3.2 Constructors & `this`
```java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name; 
        this.age = age;
        System.out.println("A new student object is born!");
    }

    void introduce() {
        System.out.println("Hi, I am " + this.name + " and I am " + this.age + " years old.");
    }
}

public class School {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20); 
        s1.introduce();
    }
}
```
**Output**:
```text
A new student object is born!
Hi, I am Alice and I am 20 years old.
```

---

## 3.3 Access Modifiers (Encapsulation)
```java
class BankAccount {
    private double balance;

    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public double getBalance() { return balance; }
}

public class ATM {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount(500);
        myAcc.deposit(200);
        System.out.println("Current Balance: $" + myAcc.getBalance());
    }
}
```
**Output**:
```text
Deposited: $200.0
Current Balance: $700.0
```

---

## 3.4 Static Members
```java
class Student {
    String name;
    static String schoolName = "Global High School";

    Student(String name) { this.name = name; }

    void showDetails() {
        System.out.println("Student: " + name + ", School: " + schoolName);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Student.schoolName = "Elite Academy";
        s1.showDetails();
        s2.showDetails();
    }
}
```
**Output**:
```text
Student: Alice, School: Elite Academy
Student: Bob, School: Elite Academy
```

---

## 3.5 Inheritance
```java
class Vehicle {
    void honk() { System.out.println("Beep Beep!"); }
}

class Car extends Vehicle {
    void drive() { System.out.println("Driving car..."); }
}

public class Test {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        myCar.drive();
    }
}
```
**Output**:
```text
Beep Beep!
Driving car...
```

---

## 3.6 Polymorphism
```java
class Animal {
    void sound() { System.out.println("Some sound"); }
}

class Dog extends Animal {
    @Override
    void sound() { System.out.println("Dog says: Woof!"); }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}
```
**Output**:
```text
Dog says: Woof!
```

---

## 3.7 Abstraction (Interfaces)
```java
interface Camera {
    void takePhoto();
}

class Smartphone implements Camera {
    public void takePhoto() {
        System.out.println("Click! Photo taken.");
    }
}

public class Main {
    public static void main(String[] args) {
        Camera cam = new Smartphone();
        cam.takePhoto();
    }
}
```
**Output**:
```text
Click! Photo taken.
```

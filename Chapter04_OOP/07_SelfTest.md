# 🟣 Self-Test Questions — Chapter 4: OOP

---

## 🟢 BASIC Level

**Q1.** What is the difference between a class and an object? Use an analogy.

**Q2.** What does the `private` keyword do? Why is it useful?

**Q3.** What is a constructor? How is it different from a regular method?

**Q4.** What does `this` refer to inside a class method?

**Q5.** True or False:
- (a) A class can extend multiple classes in Java.
- (b) A class can implement multiple interfaces.
- (c) An interface can have constructors.
- (d) `@Override` is optional but recommended.
- (e) An abstract class can be instantiated directly.

**Q6.** What is the output?
```java
class Animal {
    String name = "Animal";
    void speak() { System.out.println("..."); }
}
class Dog extends Animal {
    String name = "Dog";
    @Override
    void speak() { System.out.println("Woof!"); }
}
public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.speak();
        System.out.println(a.name);
    }
}
```

---

## 🟡 INTERMEDIATE Level

**Q7.** Design a `BankAccount` class with:
- Private fields: `accountNumber` (String), `balance` (double)
- Constructor with accountNumber and initial balance
- `deposit(double amount)` — only add if amount > 0
- `withdraw(double amount)` — only subtract if amount > 0 AND sufficient funds
- `getBalance()` getter
- `toString()` that shows account info

**Q8.** Create an inheritance hierarchy:
- `Shape` parent with `abstract double area()`
- `Circle` child with radius field
- `Rectangle` child with length and width fields
Both must implement `area()`.

**Q9.** What is the difference between method overriding and method overloading? Provide code examples of each.

**Q10.** When would you use an `abstract class` instead of an `interface`? Give a real-world example.

**Q11.** Fix the bugs in this code:
```java
class Vehicle {
    private String brand;
    Vehicle(String brand) { this.brand = brand; }
}
class Car extends Vehicle {
    private int year;
    Car(String brand, int year) {
        this.year = year;
        super(brand);  // Bug!
    }
    public String toString() {
        return brand + " (" + year + ")";  // Bug!
    }
}
```

---

## 🔴 ADVANCED Level

**Q12.** Explain the output of this polymorphism example in detail:
```java
class A {
    void method() { System.out.println("A"); }
}
class B extends A {
    @Override
    void method() { System.out.println("B"); }
}
class C extends B {
    @Override
    void method() { System.out.println("C"); }
}
public class Test {
    public static void main(String[] args) {
        A obj1 = new C();
        B obj2 = new C();
        obj1.method();
        obj2.method();
    }
}
```

**Q13.** Design a complete OOP system for a Library:
- `LibraryItem` (abstract): `title`, `id`, `abstract String getType()`
- `Book` extends `LibraryItem`: `author`, `pages`, implements `getType()` → "Book"
- `DVD` extends `LibraryItem`: `director`, `duration`, implements `getType()` → "DVD"
- `Borrowable` interface: `borrow()`, `returnItem()`
- `Book` should also implement `Borrowable`
Write all classes and a `main` that demonstrates the system.

**Q14.** [Design Challenge] A payment system needs to support: CreditCard, DebitCard, UPI. Each has a different `processPayment(double amount)` logic. Design this using an interface. Then write a `checkout(Payment method, double amount)` method that works with ANY payment type via polymorphism.

**Q15.** [Critical Thinking] What is the difference between these two approaches? When should each be used?
```java
// Approach A: IS-A relationship
class ElectricCar extends Car { ... }

// Approach B: HAS-A relationship (Composition)
class ElectricCar {
    private Car car;  // Contains a Car, not extends it
    private Battery battery;
    ...
}
```

---

<details>
<summary>💡 Hints</summary>

- **Q6:** Method calls use the ACTUAL object type (Dog) → "Woof!". Field access uses the REFERENCE type (Animal) → "Animal". Fields are NOT polymorphic.
- **Q11:** `super(brand)` must be FIRST. `brand` is private in Vehicle — use getter or make it `protected`.
- **Q12:** Polymorphism always calls the MOST specific (lowest) override. Both obj1 and obj2 actually hold a `C` object, so both print "C".
- **Q15:** Prefer composition ("HAS-A") over inheritance when the relationship isn't truly IS-A. A Car is NOT a Battery, so CarWithBattery should have a Battery, not extend it.

</details>

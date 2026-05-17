# 🟡 Pareto 80/20 — Chapter 4: Object-Oriented Programming

---

## ⭐ Critical 20% — Master These

### 1. Class + Constructor + Object Creation (The Foundation)

```java
// The Blueprint
public class Student {
    private String name;   // field
    private int age;       // field

    // Constructor — runs when 'new Student(...)' is called
    public Student(String name, int age) {
        this.name = name;  // 'this' = current object
        this.age = age;
    }

    // Getter (Encapsulation: controlled access)
    public String getName() { return name; }
    public int getAge() { return age; }

    // Setter
    public void setAge(int age) {
        if (age > 0) this.age = age; // Validation!
    }

    // Behavior
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " years old.");
    }
}

// Creating Objects (Instances)
Student s1 = new Student("Gautam", 20);
Student s2 = new Student("Priya", 22);
s1.introduce();  // Hi, I'm Gautam, 20 years old.
```

---

### 2. Encapsulation — Private + Getters/Setters

**Why it matters:** If `age` were public, anyone could set `student.age = -999`. Private fields + setters with validation prevent corruption.

```java
// ❌ No encapsulation — anyone can corrupt data
class BadStudent {
    public int age;
}
BadStudent b = new BadStudent();
b.age = -999;  // Valid but wrong!

// ✅ With encapsulation
Student s = new Student("Priya", 22);
s.setAge(-999);  // Rejected by validation in setter!
```

---

### 3. Inheritance — extends and super

```java
// Parent class
public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

// Child class — inherits everything from Animal
public class Dog extends Animal {
    public Dog(String name) {
        super(name);  // Calls Animal's constructor
    }

    @Override  // Override the parent's method
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }

    public void fetch() {  // New method only Dog has
        System.out.println(name + " fetches the ball!");
    }
}

// Usage
Dog d = new Dog("Buddy");
d.makeSound();  // Buddy says: Woof!  ← Overridden version
d.fetch();      // Buddy fetches the ball!
```

---

### 4. Polymorphism — One Reference, Many Forms

```java
Animal a1 = new Dog("Rex");    // Animal reference, Dog object
Animal a2 = new Cat("Whiskers"); // Animal reference, Cat object

a1.makeSound();  // "Rex says: Woof!"    ← calls Dog's version
a2.makeSound();  // "Whiskers says: Meow!" ← calls Cat's version
```

**The magic:** The same line of code `a.makeSound()` produces different output depending on what TYPE of object `a` actually is at runtime. This is **runtime polymorphism** (dynamic dispatch).

---

### 5. Interface — The Contract

```java
public interface Drawable {
    void draw();  // No implementation — just the contract
    void resize(int factor); // All implementing classes MUST provide this
}

public class Circle implements Drawable {
    @Override
    public void draw() { System.out.println("Drawing a circle"); }
    @Override
    public void resize(int factor) { System.out.println("Resizing circle by " + factor); }
}

public class Rectangle implements Drawable {
    @Override
    public void draw() { System.out.println("Drawing a rectangle"); }
    @Override
    public void resize(int factor) { System.out.println("Resizing rectangle by " + factor); }
}
```

---

## 📉 Lower Priority (Learn After Mastering Above)

| Concept | Why Lower Priority |
|---------|-------------------|
| `final` class/method | Prevents extension/override — niche use case |
| `instanceof` | Useful but not core to understanding OOP |
| Inner classes | Advanced, mainly in GUI/Android |
| Default methods in interfaces | Java 8+ — comes up in Ch 8 and later |
| `Object` class methods (`toString`, `equals`, `hashCode`) | Important but can wait until Ch 5 |

---

## 🎯 Chapter 4 Focus Checklist

- [ ] I can define a class with private fields, a constructor, getters, and setters
- [ ] I understand why fields should be `private`
- [ ] I can create a child class using `extends` and call `super()` in the constructor
- [ ] I can `@Override` a parent method in a child class
- [ ] I understand that a parent reference can hold a child object (polymorphism)
- [ ] I can define an `interface` and write a class that `implements` it
- [ ] I can explain the difference between an abstract class and an interface

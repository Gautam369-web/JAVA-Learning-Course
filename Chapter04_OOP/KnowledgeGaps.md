# 🟠 Knowledge Gaps — Chapter 4: OOP

---

## Gap 1: "What's the difference between a class and an object?"

### ❌ The Confusion
Many beginners use these words interchangeably. They're NOT the same.

### ✅ The Clarity

| | Class | Object |
|-|-------|--------|
| What is it? | The BLUEPRINT | The actual THING |
| Analogy | Cookie cutter | The cookie |
| Another analogy | Floor plan of a house | The actual house |
| In memory? | Not in RAM (just a definition) | YES — lives in the heap |
| How many? | Defined once | Can create unlimited instances |

```java
// Class = blueprint (defined once)
class Car { String color; int speed; }

// Objects = actual instances (create as many as you want)
Car car1 = new Car();  // A red Ferrari
Car car2 = new Car();  // A blue Toyota
Car car3 = new Car();  // A green Kia
```

---

## Gap 2: `this` Keyword — When the Variable Names Clash

### ❌ The Confusion
```java
public class Person {
    String name;
    public Person(String name) {
        name = name;  // ❌ Bug! This sets the LOCAL parameter to itself!
    }
}
```

### ✅ The Fix
```java
public class Person {
    String name;
    public Person(String name) {
        this.name = name;  // ✅ 'this.name' = field; 'name' = parameter
    }
}
```
**Rule:** When a constructor parameter has the same name as a field, use `this.fieldName` to refer to the field.

---

## Gap 3: Method Overriding vs Method Overloading

### They sound similar but are completely different:

| | Overloading | Overriding |
|-|-------------|------------|
| **Where** | Same class | Child class vs Parent class |
| **Parameters** | DIFFERENT signatures | SAME signature |
| **When resolved** | Compile time | Runtime |
| **Keyword** | None needed | `@Override` |

```java
// Overloading — same class, different parameters
class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }  // Different params
}

// Overriding — child redefines parent's method
class Animal { void speak() { System.out.println("..."); } }
class Dog extends Animal {
    @Override
    void speak() { System.out.println("Woof!"); }  // Same signature
}
```

---

## Gap 4: Abstract Class vs Interface — When to Use Which

### ❌ The Confusion
"They both define methods I have to implement. What's the difference?"

### ✅ The Clarity

| | Abstract Class | Interface |
|-|---------------|-----------|
| **Can have** | Fields, constructors, concrete methods | Only abstract methods (+ default/static in Java 8+) |
| **Extends** | Only ONE (single inheritance) | Multiple interfaces allowed |
| **Use when** | Sharing code among related classes | Defining a contract/capability |
| **Relationship** | "IS-A" (a Dog IS-A Animal) | "CAN-DO" (a Dog CAN-DO swim) |

---

## Gap 5: `super()` Must Be First in the Constructor

### ❌ The Bug
```java
public class Dog extends Animal {
    public Dog(String name) {
        System.out.println("Creating dog...");  // ❌ Compile error!
        super(name);  // super() must be first!
    }
}
```

### ✅ The Fix
```java
public class Dog extends Animal {
    public Dog(String name) {
        super(name);  // ✅ Always first!
        System.out.println("Creating dog...");
    }
}
```

---

## 📚 Resources

| Gap | Resource |
|-----|---------|
| OOP basics | [Oracle Java Tutorial: OOP Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/) |
| Encapsulation | [Baeldung: Encapsulation in Java](https://www.baeldung.com/java-oop) |
| Abstract vs Interface | [GeeksForGeeks: Abstract Class vs Interface](https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/) |
| Polymorphism | [W3Schools: Java Polymorphism](https://www.w3schools.com/java/java_polymorphism.asp) |

# Chapter 4 – OOP Practice Questions

These 8 questions are designed to test your understanding of each sub-topic covered in the Chapter 4 notes.

---

## Problem 1 – The Smartphone (Classes & Objects)
**Topic**: Section 4.1
**Problem Statement**: Create a `Smartphone` class.
- **Fields**: `brand`, `model`, `price`.
- **Method**: `displayInfo()` that prints "This is a [brand] [model] costing $[price]".

**Sample Input**:
```text
None (Values set in code)
```
**Sample Output**: 
```text
This is a Apple iPhone 15 costing $999.0
This is a Samsung Galaxy S23 costing $899.0
```

---

## Problem 2 – The New Student (Constructors & `this`)
**Topic**: Section 4.2
**Problem Statement**: Create a `Student` class that uses a constructor.
- **Fields**: `name`, `grade`.
- **Constructor**: Use `this` to initialize `name` and `grade` when a student is created.
- **Task**: Create a student object by passing "Rahul" and "A" to the constructor, then print the result.

**Sample Input**:
```text
None (Passed to constructor)
```
**Sample Output**: 
```text
Student Rahul is in grade A
```

---

## Problem 3 – The Secret Vault (Encapsulation)
**Topic**: Section 4.3
**Problem Statement**: Create a `User` class to protect a `password`.
- **Fields**: `private String password`.
- **Methods**: 
    - `setPassword(String pass)`: Only sets the password if it's longer than 6 characters.
    - `getPassword()`: Returns the password.
- **Task**: Try setting a 4-character password and then an 8-character one. 

**Sample Input**:
```text
None (Hardcoded tests)
```
**Sample Output**: 
```text
Error: Password too short!
Password set successfully.
Password: secret123
```

---

## Problem 4 – The Shared Library (Static Members)
**Topic**: Section 4.4
**Problem Statement**: Create a `Book` class that tracks how many books exist.
- **Fields**: `title` (Instance), `static int totalBooks` (Static).
- **Constructor**: Every time a `Book` is created, increment `totalBooks`.
- **Task**: Create 3 different books and print the total count.

**Sample Input**:
```text
None
```
**Sample Output**: 
```text
Total books in library: 3
```

---

## Problem 5 – Family DNA (Inheritance)
**Topic**: Section 4.5
**Problem Statement**: Create a Parent class `Human` and a Child class `Programmer`.
- **Human**: Has a method `walk()` that prints "Walking...".
- **Programmer**: Inherits from `Human` and adds a method `code()` that prints "Coding...".
- **Task**: Create a `Programmer` object and show its capabilities.

**Sample Input**:
```text
None
```
**Sample Output**: 
```text
Walking...
Coding...
```

---

## Problem 6 – Animal Voices (Polymorphism/Overriding)
**Topic**: Section 4.6
**Problem Statement**: Create a base class `Animal` and subclasses `Dog` and `Lion`.
- **Animal**: Method `makeSound()` prints "Some sound".
- **Dog**: Overrides `makeSound()` to print "Bark!".
- **Lion**: Overrides `makeSound()` to print "Roar!".
- **Task**: Demonstrate how the same method acts differently.

**Sample Input**:
```text
None
```
**Sample Output**: 
```text
Bark!
Roar!
```

---

## Problem 7 – The Drawing Tool (Abstract Classes)
**Topic**: Section 4.7
**Problem Statement**: Create an abstract class `Tool`.
- **Abstract Method**: `abstract void use()`.
- **Subclass `Pen`**: Implements `use()` to print "Writing...".
- **Subclass `Brush`**: Implements `use()` to print "Painting...".
- **Task**: Create a `Pen` and a `Brush` and call their `use()` methods.

**Sample Input**:
```text
None
```
**Sample Output**: 
```text
Writing...
Painting...
```

---

## Problem 8 – The Smart Home (Interfaces)
**Topic**: Section 4.7
**Problem Statement**: Create an interface `Switchable`.
- **Method**: `void turnOn()`.
- **Implementations**:
    - `Light`: Prints "Light is glowing."
    - `Fan`: Prints "Fan is spinning."
- **Task**: Use the `Switchable` interface to control devices.

**Sample Input**:
```text
None
```
**Sample Output**: 
```text
Light is glowing.
Fan is spinning.
```

---

### Instructions:
1. Create a separate `.java` file for each problem to keep it clean.
2. Refer back to your **Notes.md** if you forget the syntax for things like `extends`, `implements`, or `static`.

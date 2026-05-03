# Chapter 3 – OOP Practice Questions

These 8 questions are designed to test your understanding of each sub-topic covered in the Chapter 3 notes.

---

## Problem 1 – The Smartphone (Classes & Objects)
**Topic**: Section 3.1
**Problem Statement**: Create a `Smartphone` class.
- **Fields**: `brand`, `model`, `price`.
- **Method**: `displayInfo()` that prints "This is a [brand] [model] costing $[price]".
- **Task**: In `main`, create two different phone objects (e.g., iPhone and Samsung), set their details, and display their info.

---

## Problem 2 – The New Student (Constructors & `this`)
**Topic**: Section 3.2
**Problem Statement**: Create a `Student` class that uses a constructor.
- **Fields**: `name`, `grade`.
- **Constructor**: Use `this` to initialize `name` and `grade` when a student is created.
- **Task**: Create a student object by passing "Rahul" and "A" to the constructor, then print "Student Rahul is in grade A".

---

## Problem 3 – The Secret Vault (Encapsulation)
**Topic**: Section 3.3
**Problem Statement**: Create a `User` class to protect a `password`.
- **Fields**: `private String password`.
- **Methods**: 
    - `setPassword(String pass)`: Only sets the password if it's longer than 6 characters.
    - `getPassword()`: Returns the password.
- **Task**: Try setting a 4-character password and then an 8-character one. Check if the protection works.

---

## Problem 4 – The Shared Library (Static Members)
**Topic**: Section 3.4
**Problem Statement**: Create a `Book` class that tracks how many books exist.
- **Fields**: `title` (Instance), `static int totalBooks` (Static).
- **Constructor**: Every time a `Book` is created, increment `totalBooks`.
- **Task**: Create 3 different books and print "Total books in library: 3" using the class name `Book.totalBooks`.

---

## Problem 5 – Family DNA (Inheritance)
**Topic**: Section 3.5
**Problem Statement**: Create a Parent class `Human` and a Child class `Programmer`.
- **Human**: Has a method `walk()` that prints "Walking...".
- **Programmer**: Inherits from `Human` and adds a method `code()` that prints "Coding...".
- **Task**: Create a `Programmer` object and show that they can both `walk()` and `code()`.

---

## Problem 6 – Animal Voices (Polymorphism/Overriding)
**Topic**: Section 3.6
**Problem Statement**: Create a base class `Animal` and subclasses `Dog` and `Lion`.
- **Animal**: Method `makeSound()` prints "Some sound".
- **Dog**: Overrides `makeSound()` to print "Bark!".
- **Lion**: Overrides `makeSound()` to print "Roar!".
- **Task**: Use a loop or individual calls to show that the same method `makeSound()` acts differently for each animal.

---

## Problem 7 – The Drawing Tool (Abstract Classes)
**Topic**: Section 3.7
**Problem Statement**: Create an abstract class `Tool`.
- **Abstract Method**: `abstract void use()`.
- **Subclass `Pen`**: Implements `use()` to print "Writing...".
- **Subclass `Brush`**: Implements `use()` to print "Painting...".
- **Task**: You cannot create a `new Tool()`, so create a `Pen` and a `Brush` and call their `use()` methods.

---

## Problem 8 – The Smart Home (Interfaces)
**Topic**: Section 3.7
**Problem Statement**: Create an interface `Switchable`.
- **Method**: `void turnOn()`.
- **Implementations**:
    - `Light`: Prints "Light is glowing."
    - `Fan`: Prints "Fan is spinning."
- **Task**: Use the `Switchable` interface to control both a Light and a Fan.

---

### Instructions:
1. Create a separate `.java` file for each problem to keep it clean.
2. Refer back to your **Notes.md** if you forget the syntax for things like `extends`, `implements`, or `static`.

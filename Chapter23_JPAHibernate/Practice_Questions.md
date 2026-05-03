# Chapter 23 - Practice Questions

These questions move from entity basics to relationships and transactions.

---

## Problem 1 - ORM Explanation
Explain ORM in simple words.

## Problem 2 - Entity
Create a `Student` entity with id, name, and email.

## Problem 3 - Repository
Create `StudentRepository extends JpaRepository<Student, Long>`.

## Problem 4 - Finder Method
Add `Optional<Student> findByEmail(String email)`.

## Problem 5 - Save Student
Write a service method that saves a new student.

## Problem 6 - One-to-Many
Create `Author` and `Book` entities where one author has many books.

## Problem 7 - Transaction
Explain when `@Transactional` should be used.

## Problem 8 - Advanced: N+1 Problem
Explain what the N+1 query problem means.

## Problem 9 - Advanced: DTO Mapping
Convert a `Student` entity into a `StudentResponse` DTO.

## Problem 10 - Advanced: Safe Delete
Design rules for deleting a course that already has enrolled students.


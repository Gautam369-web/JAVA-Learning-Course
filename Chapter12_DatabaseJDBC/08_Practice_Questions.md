# Chapter 12 – JDBC Practice Questions

Master the art of connecting Java to the world of data.

---

## Problem 1 – The Handshake (Connection)
**Problem Statement**: Write a Java program that attempts to connect to a MySQL database at `localhost:3306`.
- **Task**: Use a `try-catch` block to handle the case where the database is not running and print "Error: Server not found".

---

## Problem 2 – The Student Inserter (CRUD: Create)
**Problem Statement**: You have a table `students` with columns `id`, `name`, and `grade`.
- **Task**: Use a `PreparedStatement` to insert a new student: "Rahul" with grade "A".

---

## Problem 3 – Price Updater (CRUD: Update)
**Problem Statement**: A shop needs to increase all prices by 10%.
- **Task**: Write a program that executes an `UPDATE` query to increase the `price` column in the `products` table. Print how many rows were updated.

---

## Problem 4 – The Searcher (CRUD: Read)
**Problem Statement**: Use a `ResultSet` to fetch all users from the `users` table.
- **Task**: Print each user's email address to the console.

---

## Problem 5 – Delete Inactive (CRUD: Delete)
**Problem Statement**: Clean up your database by removing users who haven't logged in for 1 year.
- **Task**: Write a `DELETE` query with a `WHERE` clause to remove users with `status = 'inactive'`.

---

## Problem 6 – Safe Search (SQL Injection)
**Problem Statement**: A user wants to search for a book by its title.
- **Task**: Use a `PreparedStatement` with a `?` placeholder to search for the title provided by the user. Explain why this is safer than using a regular string.

---

## Problem 7 – Record Count (Aggregate)
**Problem Statement**: How many items are in your inventory?
- **Task**: Use the `COUNT(*)` SQL function and read the result using `rs.getInt(1)`.

---

## Problem 8 – Transaction Safety (Commit/Rollback)
**Problem Statement**: Simulate a money transfer between two accounts.
- **Task**: Set `setAutoCommit(false)`. Execute two updates. If both succeed, call `commit()`. If an exception occurs, call `rollback()`.

---

### Instructions:
1. Make sure you have the MySQL JDBC Driver added to your project.
2. Always close your `Connection`, `Statement`, and `ResultSet` objects (use try-with-resources!).
3. Use `executeUpdate()` for INSERT, UPDATE, DELETE and `executeQuery()` for SELECT.

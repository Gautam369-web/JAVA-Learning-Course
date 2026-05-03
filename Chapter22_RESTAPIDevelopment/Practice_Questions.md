# Chapter 22 - Practice Questions

These questions build REST API thinking from endpoints to validation and error handling.

---

## Problem 1 - REST Endpoint Naming
Rewrite `/getStudent`, `/saveStudent`, and `/deleteStudent` into REST-style endpoints.

## Problem 2 - GET All
Create `GET /students` that returns a list.

## Problem 3 - GET by ID
Create `GET /students/{id}` using `@PathVariable`.

## Problem 4 - POST
Create `POST /students` using `@RequestBody`.

## Problem 5 - PUT
Create `PUT /students/{id}` to update a student.

## Problem 6 - DELETE
Create `DELETE /students/{id}` returning `204 No Content`.

## Problem 7 - DTO
Create request and response DTOs for student creation.

## Problem 8 - Status Codes
Choose proper status codes for create, read, validation error, and missing student.

## Problem 9 - Advanced: Global Error Handler
Create `@ControllerAdvice` that handles `StudentNotFoundException`.

## Problem 10 - Advanced: Validation
Add validation rules for nonblank name and valid email.


# Chapter 24 - Practice Questions

These questions grow from simple mocks to Spring test slices.

---

## Problem 1 - Unit vs Integration
Explain the difference between unit and integration tests.

## Problem 2 - Mock Repository
Create a mock `StudentRepository` in a service test.

## Problem 3 - Stub findById
Make `repository.findById(1L)` return a fake student.

## Problem 4 - Test Success Case
Test that `StudentService.findById(1L)` returns the correct student.

## Problem 5 - Test Failure Case
Test that missing student throws `StudentNotFoundException`.

## Problem 6 - Verify Save
Verify that repository `save` was called when creating a student.

## Problem 7 - MockMvc
Write a `@WebMvcTest` for `GET /students/1`.

## Problem 8 - DataJpaTest
Write a repository test that saves and finds a student by email.

## Problem 9 - Advanced: Test Design
Explain why testing private methods directly is usually a bad idea.

## Problem 10 - Advanced: Avoid Over-Mocking
Give an example where a test uses too many mocks and becomes weak.


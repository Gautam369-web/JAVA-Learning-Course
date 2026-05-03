# Chapter 9 – Multithreading & Concurrency Practice Questions

These 8 questions are designed to test your ability to run tasks in parallel and manage shared data safely.

---

## Problem 1 – The Specialist Waiter (Thread Class)
**Problem Statement**: Create a class `MyThread` that extends the `Thread` class.
- **Task**: Override the `run()` method to print "Hello from the Thread!" 5 times. Start the thread from `main`.
- **Sample Output**:
```text
Hello from the Thread!
Hello from the Thread!
... (5 times)
```

---

## Problem 2 – The General Worker (Runnable Interface)
**Problem Statement**: Create a class `MyTask` that implements the `Runnable` interface.
- **Task**: In the `run()` method, print the name of the current thread using `Thread.currentThread().getName()`. Start two threads with different names using this task.
- **Sample Output**:
```text
Running: Thread-A
Running: Thread-B
```

---

## Problem 3 – The Time Delayer (Thread.sleep)
**Problem Statement**: Write a program that prints numbers from 1 to 5.
- **Task**: Use `Thread.sleep(1000)` to make the thread wait for 1 second between each number.
- **Sample Output**:
```text
1
(1 second pause)
2
...
```

---

## Problem 4 – Waiting for Results (Thread.join)
**Problem Statement**: Create two threads that perform some work (e.g., printing 1-100).
- **Task**: In the `main` method, use the `join()` method to ensure the main thread waits until both threads are completely finished before it prints "All tasks completed!".
- **Sample Output**:
```text
... (Thread work)
All tasks completed!
```

---

## Problem 5 – The Safe Bank (Synchronization)
**Problem Statement**: Create a shared `BankAccount` object with a balance of 1000.
- **Task**: Create two threads that both try to withdraw 700. Use the `synchronized` keyword on the withdraw method to prevent the balance from going negative.
- **Sample Output**:
```text
Withdrawal successful! Remaining: 300
Error: Insufficient balance!
```

---

## Problem 6 – Thread Priorities
**Problem Statement**: Create two threads.
- **Task**: Set one thread to `Thread.MAX_PRIORITY` and the other to `Thread.MIN_PRIORITY`. Observe how the OS schedules them (Note: Output might vary by OS).
- **Sample Output**:
```text
High Priority Thread is running...
Low Priority Thread is running...
```

---

## Problem 7 – The Task Manager (ExecutorService)
**Problem Statement**: Imagine you have 10 small tasks to perform.
- **Task**: Use `Executors.newFixedThreadPool(3)` to create a pool of 3 threads. Submit all 10 tasks to this pool and observe how the 3 threads share the work.
- **Sample Output**:
```text
Task 1 handled by pool-1-thread-1
Task 2 handled by pool-1-thread-2
Task 3 handled by pool-1-thread-3
Task 4 handled by pool-1-thread-1 (Reused!)
```

---

## Problem 8 – Inter-Thread Wait
**Problem Statement**: Create two threads: one for "Loading" and one for "Processing".
- **Task**: Ensure the "Processing" thread only starts after the "Loading" thread is finished using the `join()` method.
- **Sample Output**:
```text
Loading data...
Data Loaded.
Processing data...
```

---

### Instructions:
1. Use `try-catch` when using `Thread.sleep()` or `join()` as they throw `InterruptedException`.
2. Remember that `start()` starts a new thread, but `run()` just executes code in the current thread.
3. For Synchronization, ensure the threads are sharing the **same object**.

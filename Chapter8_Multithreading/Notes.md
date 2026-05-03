# Chapter 8 – Multithreading & Concurrency

Normally, a Java program runs line-by-line in a single sequence. **Multithreading** allows you to break your program into multiple "threads" that run at the same time, making your applications faster and more responsive.

---

## Goals of Chapter 8
- **Understand Parallelism**: Learn how to do multiple tasks simultaneously.
- **Master Thread Creation**: Learn the two ways to create threads in Java.
- **Control Thread Flow**: Use `sleep()`, `join()`, and `yield()` to manage timing.
- **Handle Data Safety**: Use `synchronized` to prevent multiple threads from corrupting data.
- **Modern Concurrency**: Use `ExecutorService` for professional thread management.

## Sub-topics
| Section | Topic | Description |
| :--- | :--- | :--- |
| **8.1** | **Intro to Multithreading** | The "Restaurant" concept |
| **8.2** | **Creating Threads** | Thread class vs. Runnable interface |
| **8.3** | **Thread Lifecycle** | The stages of a thread's life |
| **8.4** | **Synchronization** | Preventing "Race Conditions" |
| **8.5** | **Executor Service** | Managing a pool of threads |

---

## 8.1 Intro to Multithreading: The "Restaurant"

### 🍽️ Real-Life Analogy
Imagine a **Restaurant** with only **one waiter**.
- If that waiter is busy cooking, they can't take orders. 
- If they are taking an order, they can't clean tables. 
- The customers have to wait a long time!
Now imagine a restaurant with **multiple waiters** (Threads). One can cook, one can take orders, and one can clean—all at the same time. The restaurant (Program) is much more efficient!

### 💡 Human Understanding
A **Process** is the restaurant itself. A **Thread** is a waiter inside the restaurant. Multithreading is having multiple waiters sharing the same kitchen (Memory) to get work done faster.

---

## 8.2 Creating Threads: Two Ways

### 🎭 Real-Life Analogy
1.  **Extending Thread**: Like hiring a specialist waiter who only knows how to wait tables. 
2.  **Implementing Runnable**: Like hiring a person (The Task) and giving them a waiter's uniform (The Thread). This is usually better because the person can do other jobs too!

### 💻 Code Implementation (Runnable - Recommended)
```java
class MyTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is working: " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        
        // Creating the 'Waiters'
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        // Starting the work
        t1.start();
        t2.start();
    }
}
```

---

## 8.3 Synchronization: The "Bathroom"

### 🚽 Real-Life Analogy
Imagine a **Single Bathroom** in a house.
- If two people try to enter at the exact same time, there will be chaos!
- To prevent this, we use a **Lock**. When one person is inside, they lock the door (`synchronized`). Everyone else must wait until the door is unlocked.

### 💡 Human Understanding
When two threads try to update the same variable (like a Bank Balance) at the same time, the data can get corrupted. This is called a **Race Condition**. We use the `synchronized` keyword to ensure only one thread can access a piece of code at a time.

### 💻 Code Implementation
```java
class Counter {
    int count = 0;

    // 'synchronized' ensures only one thread increments at a time
    public synchronized void increment() {
        count++;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) c.increment();
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
        
        t1.join(); // Wait for t1 to finish
        t2.join(); // Wait for t2 to finish

        System.out.println("Final Count: " + c.count); // Should be 2000
    }
}
```

---
 
## 8.4 Thread Sleep & Join: "The Waiting Game"
 
### 💤 Real-Life Analogy
- **Sleep**: Like taking a **Power Nap**. You set an alarm for 5 minutes (`Thread.sleep(5000)`) and stop working until the alarm goes off.
- **Join**: Like **Waiting for a Friend**. You are ready to go to the movies, but you wait outside their house until they come out (`t1.join()`). You don't proceed until they are finished.
 
### 💡 Human Understanding
- `sleep(ms)`: Pauses the current thread for a specific time.
- `join()`: Makes the current thread wait until another thread completes its execution.
 
---
 
## 8.5 Executor Service: The "Manager"
 
### 👔 Real-Life Analogy
Instead of you personally hiring and firing every waiter (creating and destroying threads), you hire a **Manager** (Executor Service).
- You give the Manager a list of tasks.
- The Manager has a **fixed team of waiters** (Thread Pool).
- As soon as a waiter is free, the Manager gives them the next task.
This is much more efficient than creating a new thread for every tiny job!
 
### 💻 Code Implementation
```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
public class Main {
    public static void main(String[] args) {
        // Create a pool of 2 threads
        ExecutorService manager = Executors.newFixedThreadPool(2);
 
        // Submit 4 tasks
        for (int i = 1; i <= 4; i++) {
            int taskID = i;
            manager.submit(() -> {
                System.out.println("Task " + taskID + " handled by " + Thread.currentThread().getName());
            });
        }
 
        manager.shutdown(); // Stop accepting new tasks
    }
}
```
 
---
 
## 8.6 Practice Questions (Chapter 8)
 
*Ready to run tasks in parallel? Check the Practice_Questions.md file for 8 challenges on Multithreading and Concurrency!*

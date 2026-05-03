# Chapter 8 – Multithreading & Concurrency Solutions

These solutions demonstrate how to create threads, manage their timing, and protect shared data.

---

## Solution 1: The Specialist Waiter (Thread Class)
```java
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from the Thread!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
```
**Output**:
```text
Hello from the Thread!
Hello from the Thread!
Hello from the Thread!
Hello from the Thread!
Hello from the Thread!
```

---

## Solution 2: The General Worker (Runnable Interface)
```java
class MyTask implements Runnable {
    public void run() {
        System.out.println("Running: " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");
        
        t1.start();
        t2.start();
    }
}
```
**Output**:
```text
Running: Thread-A
Running: Thread-B
```

---

## Solution 3: The Time Delayer (Thread.sleep)
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(i);
                Thread.sleep(1000); // Wait 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
```
**Output**:
```text
1
(1s pause)
2
(1s pause)
3
(1s pause)
4
(1s pause)
5
```

---

## Solution 4: Waiting for Results (Thread.join)
```java
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for(int i=0; i<100; i++); // Simulated work
            System.out.println("T1 Finished.");
        });
        
        Thread t2 = new Thread(() -> {
            for(int i=0; i<100; i++); // Simulated work
            System.out.println("T2 Finished.");
        });

        t1.start();
        t2.start();

        t1.join(); // Main thread waits for t1
        t2.join(); // Main thread waits for t2

        System.out.println("All tasks completed!");
    }
}
```
**Output**:
```text
T1 Finished.
T2 Finished.
All tasks completed!
```

---

## Solution 5: The Safe Bank (Synchronization)
```java
class BankAccount {
    int balance = 1000;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing...");
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " Error: Insufficient balance!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        Runnable r = () -> account.withdraw(700);

        Thread t1 = new Thread(r, "User-1");
        Thread t2 = new Thread(r, "User-2");

        t1.start();
        t2.start();
    }
}
```
**Output**:
```text
User-1 is withdrawing...
Withdrawal successful! Remaining: 300
User-2 Error: Insufficient balance!
```

---

## Solution 6: Thread Priorities
```java
public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Low Priority running..."));
        Thread t2 = new Thread(() -> System.out.println("High Priority running..."));

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
    }
}
```
**Output** (Order may vary but High usually finishes early):
```text
High Priority running...
Low Priority running...
```

---

## Solution 7: The Task Manager (ExecutorService)
```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 6; i++) {
            int taskID = i;
            pool.submit(() -> {
                System.out.println("Task " + taskID + " by " + Thread.currentThread().getName());
            });
        }

        pool.shutdown();
    }
}
```
**Output**:
```text
Task 1 by pool-1-thread-1
Task 2 by pool-1-thread-2
Task 3 by pool-1-thread-3
Task 4 by pool-1-thread-1
Task 5 by pool-1-thread-2
Task 6 by pool-1-thread-3
```

---

## Solution 8: Inter-Thread Wait
```java
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread loader = new Thread(() -> {
            System.out.println("Loading data...");
            try { Thread.sleep(1000); } catch(Exception e){}
            System.out.println("Data Loaded.");
        });

        Thread processor = new Thread(() -> {
            System.out.println("Processing data...");
        });

        loader.start();
        loader.join(); // Process waits for loader to finish
        processor.start();
    }
}
```
**Output**:
```text
Loading data...
Data Loaded.
Processing data...
```

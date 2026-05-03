# Chapter 8 – Multithreading & Concurrency

## 8.2 Creating Threads (Runnable)
```java
class MyTask implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is working.");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask(), "Thread-1");
        t1.start();
    }
}
```
**Output**:
```text
Thread-1 is working.
```

---

## 8.3 Synchronization
```java
class Counter {
    int count = 0;
    public synchronized void increment() { count++; }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable r = () -> { for(int i=0; i<1000; i++) c.increment(); };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Final Count: " + c.count);
    }
}
```
**Output**:
```text
Final Count: 2000
```

---

## 8.5 Executor Service
```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
public class Main {
    public static void main(String[] args) {
        ExecutorService manager = Executors.newFixedThreadPool(2);
        manager.submit(() -> {
            System.out.println("Task handled by " + Thread.currentThread().getName());
        });
        manager.shutdown();
    }
}
```
**Output**:
```text
Task handled by pool-1-thread-1
```

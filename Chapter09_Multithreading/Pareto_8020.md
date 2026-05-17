# 🟡 Pareto 80/20 — Chapter 9: Multithreading

## ⭐ Critical 20%

### 1. Creating Threads (Runnable — Preferred)
```java
public class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Running in: " + Thread.currentThread().getName());
    }
}

// Usage:
Thread t = new Thread(new MyTask());
t.start();  // DO NOT call run() directly — that runs synchronously!

// With Lambda (cleaner):
Thread t2 = new Thread(() -> System.out.println("Lambda thread!"));
t2.start();
```

### 2. ExecutorService — Professional Thread Management
```java
import java.util.concurrent.*;

ExecutorService executor = Executors.newFixedThreadPool(4);  // 4 threads

for (int i = 0; i < 10; i++) {
    final int taskNum = i;
    executor.submit(() -> System.out.println("Task " + taskNum));
}

executor.shutdown();  // No new tasks; waits for existing ones
executor.awaitTermination(60, TimeUnit.SECONDS);  // Wait max 60s
```

### 3. Synchronized — Thread Safety
```java
public class SafeCounter {
    private int count = 0;

    public synchronized void increment() {  // Only one thread at a time!
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
```

### 4. Thread.sleep() and join()
```java
Thread t = new Thread(() -> {
    try {
        Thread.sleep(1000);  // Wait 1 second
        System.out.println("Done after 1 second");
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();  // Restore interrupted status
    }
});
t.start();
t.join();  // Main thread waits for t to finish
System.out.println("t has finished");
```

## 🎯 Checklist
- [ ] I can create a thread using Runnable and lambda
- [ ] I know the difference between start() and run()
- [ ] I use ExecutorService instead of creating raw threads
- [ ] I understand what a race condition is
- [ ] I can use synchronized to make a method thread-safe

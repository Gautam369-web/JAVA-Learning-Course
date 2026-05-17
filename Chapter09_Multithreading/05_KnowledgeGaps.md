# 🟠 Knowledge Gaps — Chapter 9: Multithreading

## Gap 1: start() vs run() — The #1 Beginner Mistake
```java
Thread t = new Thread(() -> System.out.println("Thread: " + Thread.currentThread().getName()));

t.run();   // ❌ Runs in MAIN thread — not a new thread! getName() = "main"
t.start(); // ✅ Starts a NEW thread — getName() = "Thread-0"
```

## Gap 2: Race Condition — Silent Data Corruption
```java
int counter = 0;
// Thread 1 and Thread 2 both run: counter++ (which is really: read → add 1 → write)
// If they interleave: both read 0, both add 1, both write 1 → result is 1, not 2!
// FIX: Use synchronized or AtomicInteger
AtomicInteger safeCounter = new AtomicInteger(0);
safeCounter.incrementAndGet();  // Thread-safe!
```

## Gap 3: Forgetting to Handle InterruptedException
```java
// ❌ Swallowing the interrupt
try { Thread.sleep(1000); } catch (InterruptedException e) { }

// ✅ Properly restoring interrupted state
try { Thread.sleep(1000); } catch (InterruptedException e) {
    Thread.currentThread().interrupt();  // Restore flag for callers to check
}
```

## 📚 Resources
| Topic | Resource |
|-------|---------|
| Concurrency basics | [Oracle: Concurrency Tutorial](https://docs.oracle.com/javase/tutorial/essential/concurrency/) |
| ExecutorService | [Baeldung: ExecutorService](https://www.baeldung.com/java-executor-service-tutorial) |

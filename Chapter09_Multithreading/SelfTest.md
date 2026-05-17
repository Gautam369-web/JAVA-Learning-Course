# 🟣 Self-Test Questions — Chapter 9: Multithreading

## 🟢 BASIC
**Q1.** What is a thread? How does it differ from a process?
**Q2.** What is the difference between `t.start()` and `t.run()`?
**Q3.** Name 4 states in the Thread lifecycle.
**Q4.** What exception does `Thread.sleep()` throw?

## 🟡 INTERMEDIATE
**Q5.** Write a program with 3 threads that each print their name 5 times. Observe the interleaving.
**Q6.** Create a thread-safe `BankAccount` class where `deposit()` and `withdraw()` are synchronized.
**Q7.** What is a race condition? Write a code example that demonstrates one.

## 🔴 ADVANCED
**Q8.** Use ExecutorService to run 10 tasks using a fixed pool of 3 threads. Print the thread name for each task.
**Q9.** What is the difference between `synchronized` method and `synchronized` block? When would you prefer a block?
**Q10.** Explain deadlock with an example. How do you prevent it?

<details>
<summary>💡 Hints</summary>
- Q2: run() executes in the calling thread. start() launches a new thread.
- Q9: Synchronized block locks only a specific section — finer-grained control, better for performance.
- Q10: Deadlock: Thread A holds Lock1, waits for Lock2. Thread B holds Lock2, waits for Lock1. Prevention: always acquire locks in the same order.
</details>

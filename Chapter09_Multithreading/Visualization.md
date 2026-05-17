# 🔴 Visualization Exercise — Chapter 9: Multithreading

## 🎬 Scene 1: Threads Are Chefs in a Kitchen
A restaurant has ONE chef (single-threaded). Every order must wait until the previous one is done. Now hire THREE chefs (3 threads). Orders get cooked in parallel! But wait — they all share ONE oven (shared resource). Two chefs try to use it at once — disaster! SYNCHRONIZATION is the rule: "One chef at a time uses the oven."

## 🎬 Scene 2: Race Condition — Two Cashiers, One Register
Two cashiers (threads) both see the same balance: ₹1000. Customer A withdraws ₹500. Customer B also withdraws ₹500. Each cashier reads ₹1000 BEFORE the other updates it. Both approve. Both deduct. Balance becomes ₹500 instead of ₹0. **The synchronized keyword is the rule: "Complete the ENTIRE transaction before anyone else touches the register."**

## 🎬 Scene 3: ExecutorService — The HR Department
Instead of hiring raw threads (hiring someone off the street), ExecutorService is your HR department. You tell HR: "I have 100 tasks, use a pool of 4 workers." HR assigns tasks, manages the pool, rehires if someone quits, and tells you when all work is done. Clean, professional, no manual thread management.

## ✍️ After Visualization
1. What happens if you call `thread.run()` instead of `thread.start()`?
2. Why is a race condition hard to debug?
3. What does `ExecutorService.shutdown()` do?

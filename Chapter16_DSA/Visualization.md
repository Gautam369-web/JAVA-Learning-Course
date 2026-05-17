# 🔴 Visualization Exercise — Chapter 16: DSA

## 🎬 Scene 1: Binary Search — The Dictionary Game
You're searching for "Mango" in a physical dictionary. You don't start from page 1 (linear search). You open the MIDDLE — "M" section. "Mango" comes AFTER "Mint"? No — before! You open the middle of the first half. Keep halving until you find it. **Each step eliminates HALF the remaining pages.** 1000 pages → 10 steps. That's O(log n).

## 🎬 Scene 2: Big-O — The Race Track
Imagine 5 runners (algorithms) racing on a track where n = the number of laps:
- **O(1):** Teleports to finish instantly. Always wins.
- **O(log n):** Skips half the track each time. Very fast.
- **O(n):** Runs every lap. Average speed.
- **O(n²):** Runs the track, then runs n laps for EACH of those laps. Exhausted quickly.
- **O(2ⁿ):** Doubles work for every lap added. Collapses at n=50.

**Visualize the race as n grows from 10 to 1,000,000.** The gap between O(n) and O(n²) becomes a chasm.

## 🎬 Scene 3: Recursion — Russian Nesting Dolls
You have a Russian nesting doll. To find the smallest one inside, you open the outermost, find another doll inside, open it, find another... until you hit the SMALLEST doll that doesn't open (BASE CASE). Then you work back out. **The call stack is the stack of open dolls.** Too many dolls (too deep recursion) → StackOverflowError (the table collapses!).

## ✍️ After Visualization
1. How many steps does binary search need to find an element in an array of 1,024 elements?
2. In recursion, what happens if there's no base case?
3. Which is faster for finding a value in a HashMap: O(1) or O(n)?

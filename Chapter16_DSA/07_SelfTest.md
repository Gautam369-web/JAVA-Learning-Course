# 🟣 Self-Test Questions — Chapter 16: DSA

## 🟢 BASIC
**Q1.** What does O(n) mean? Give an example of an O(n) algorithm.
**Q2.** What is the difference between a Stack (LIFO) and a Queue (FIFO)? Give a real-world example of each.
**Q3.** Binary search requires the array to be ______.
**Q4.** What is the base case in a factorial recursive function?

## 🟡 INTERMEDIATE
**Q5.** Write a complete implementation of binary search. Test with: `[2, 5, 8, 12, 16, 23, 38, 56]`, target=23.
**Q6.** Given an array, find the two numbers that sum to a given target (no brute force — use two pointers or HashMap).
**Q7.** Trace bubble sort on `[5, 3, 1, 4, 2]`. Show the array after each pass.
**Q8.** Write a recursive method to compute the sum of all elements in an int array.

## 🔴 ADVANCED
**Q9.** Find the first non-repeating character in a string. What is the time complexity of your solution?
**Q10.** Implement a Stack using two Queues, or a Queue using two Stacks.
**Q11.** Write a method to check if a given string is a palindrome using the two-pointer technique. Then extend it to handle spaces and case-insensitivity (e.g., "A man a plan a canal Panama").
**Q12.** Explain the difference between BFS and DFS. Which would you use to find the shortest path in an unweighted graph?

<details>
<summary>💡 Hints</summary>
- Q5: Expected result: index 5 (value 23)
- Q9: Use HashMap for frequency. O(n) time, O(k) space where k = unique chars.
- Q11: Two pointers from both ends. Skip non-alphanumeric. Compare case-insensitively.
- Q12: BFS for shortest path (it explores level by level). DFS for connectivity/path existence.
</details>

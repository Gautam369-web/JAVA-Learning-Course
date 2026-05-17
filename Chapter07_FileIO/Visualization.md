# 🔴 Visualization Exercise — Chapter 7: File I/O

## 🎬 Scene 1: Reading a File — The Scroll Reader
Imagine an ancient librarian reading a long scroll. The scroll is your file. The librarian reads one line at a time (`readLine()`), speaks it aloud (your program processes it), then moves to the next line. When they reach the end of the scroll, they get `null` — nothing more to read. The library closes at the end (`close()`). **If you forget to close the library, other programs can't access that scroll.**

## 🎬 Scene 2: Writing — The Typewriter
You have a typewriter and a blank sheet (your output file). Every time you call `println()`, the keys strike and add a line to the paper. When you're done, you remove the paper from the typewriter — that's `close()`, which flushes the buffer and saves to disk. **Without removing the paper (closing), some final characters might still be in the buffer — never saved!**

## 🎬 Scene 3: Append Mode
You have a running diary. Each day you open it and ADD a new entry. You don't rip out and rewrite all previous entries. `new FileWriter("diary.txt", true)` is append mode — you add to the end without destroying what came before.

## ✍️ After Visualization
1. What happens if you open a file with `new FileWriter("f.txt")` without the `true` flag and the file has existing content?
2. What does `readLine()` return when it reaches the end of a file?
3. Why is `BufferedReader` faster than just `FileReader`?

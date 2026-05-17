# 🟢 Chapter Summary — Chapter 7: File I/O

## 📋 What This Chapter Covers
File I/O lets your programs **persist data** beyond runtime. You'll learn to read text files, write to files, and manage file metadata — essential for any real application.

## 🗺️ Topic Map
```
CHAPTER 7: FILE I/O
│
├── 1. Reading Text Files
│   ├── FileReader + BufferedReader (efficient line reading)
│   └── Files.readAllLines() (Java NIO — modern approach)
│
├── 2. Writing Text Files
│   ├── FileWriter + BufferedWriter
│   ├── PrintWriter (convenient println support)
│   └── Files.write() (modern NIO)
│
├── 3. File Class — Metadata
│   ├── exists(), isFile(), isDirectory()
│   ├── length(), getName(), getPath()
│   └── mkdir(), delete(), listFiles()
│
└── 4. Try-with-Resources
    └── Auto-close to prevent resource leaks
```

## 💡 5 Key Takeaways
1. **Always close file streams** — use try-with-resources to guarantee this.
2. **BufferedReader is faster than FileReader alone** — buffering reduces disk reads.
3. **FileWriter(file, true)** — the `true` means APPEND mode, not overwrite!
4. **`Files` class (NIO) is the modern way** — `Files.readAllLines()` in one line.
5. **Always handle IOException** — files can be missing, locked, or corrupt.

## 🌡️ Difficulty Rating
| Aspect | Rating |
|--------|--------|
| Concept difficulty | 🟡 Medium |
| Importance | 🟠 High — real apps persist data |

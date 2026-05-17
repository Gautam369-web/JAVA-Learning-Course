# 🟢 Chapter Summary — Chapter 5: Collections Framework

## 📋 What This Chapter Covers
The Collections Framework gives you **dynamic, resizable data structures** — unlike arrays that are fixed in size. The three key types are: **List** (ordered, allows duplicates), **Set** (unique elements), and **Map** (key-value pairs).

## 🗺️ Topic Map
```
CHAPTER 5: COLLECTIONS FRAMEWORK
│
├── 1. List — Ordered & Allows Duplicates
│   ├── ArrayList  → Fast random access (backed by array)
│   └── LinkedList → Fast insert/delete at ends
│
├── 2. Set — Unique Elements Only
│   ├── HashSet  → No order, fastest lookup
│   └── TreeSet  → Sorted order, slightly slower
│
├── 3. Map — Key-Value Pairs
│   ├── HashMap  → No order, fastest
│   └── TreeMap  → Sorted by key
│
├── 4. Iterating Collections
│   ├── for-each loop
│   ├── Iterator
│   └── forEach() with lambda
│
└── 5. Generics in Collections
    └── ArrayList<String>, HashMap<String, Integer>
```

## 💡 5 Key Takeaways
1. **Use ArrayList for most lists** — it's the go-to, general-purpose list.
2. **Use HashSet when you need uniqueness** — automatically prevents duplicates.
3. **Use HashMap for key-value lookups** — like a phone book (name → number).
4. **Always use Generics** — `ArrayList<String>` not raw `ArrayList`.
5. **Collections are interfaces, implementations differ** — `List` is the interface, `ArrayList` is one implementation.

## 🔗 Connections
| Concept | Used Later In |
|---------|--------------|
| ArrayList | Ch 8 (Streams), Ch 16 (DSA problems) |
| HashMap | Ch 16 (frequency counting), Ch 23 (JPA queries) |
| Generics | Ch 8 (full generics chapter) |
| for-each | Ch 8 (Stream API) |

## 🌡️ Difficulty Rating
| Aspect | Rating |
|--------|--------|
| Concept difficulty | 🟡 Medium |
| Importance | 🔴 Critical — used in every real program |

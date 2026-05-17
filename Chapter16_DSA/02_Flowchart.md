# 🔵 Flowchart — DSA (Chapter 16)

## Flowchart 1: Big-O Complexity — Which is Fastest?

```mermaid
flowchart LR
    A["O(1) Constant\nHashMap lookup\n1 operation regardless of size"] --> B
    B["O(log n) Logarithmic\nBinary search\nHalves each time"] --> C
    C["O(n) Linear\nLinear search\nOne pass through data"] --> D
    D["O(n log n) Log-Linear\nMerge sort, Arrays.sort\nSorting algorithms"] --> E
    E["O(n²) Quadratic\nNested loops\nBubble/Selection sort"] --> F
    F["O(2ⁿ) Exponential\nRecursive Fibonacci without memoization\nVERY SLOW"]

    style A fill:#00ff00
    style B fill:#90ee90
    style C fill:#ffff00
    style D fill:#ffa500
    style E fill:#ff6b6b
    style F fill:#ff0000
```

## Flowchart 2: Binary Search

```mermaid
flowchart TD
    A([Array must be SORTED first!]) --> B
    B[Set left=0, right=arr.length-1] --> C
    C{left <= right?}
    C -- ❌ No --> D[Target NOT found → return -1]
    C -- ✅ Yes --> E[mid = left + right / 2]
    E --> F{arr[mid] == target?}
    F -- ✅ Yes --> G[Return mid index ← Found!]
    F -- ❌ arr[mid] < target --> H[Search RIGHT half: left = mid + 1]
    F -- ❌ arr[mid] > target --> I[Search LEFT half: right = mid - 1]
    H & I --> C
```

## Flowchart 3: Choosing an Algorithm

```mermaid
flowchart TD
    A([Problem: Find/Search/Sort?]) --> B

    B{Operation type?}
    B --> C[FIND an element]
    B --> D[SORT a collection]
    B --> E[COMPUTE something recursively]

    C --> F{Array sorted?}
    F -- ✅ Yes --> G[Binary Search O log n]
    F -- ❌ No --> H{Need frequent lookup?}
    H -- ✅ Yes --> I[Use HashMap O 1]
    H -- ❌ No → one-time --> J[Linear Search O n]

    D --> K{Size?}
    K -- Small < 1000 --> L[Any O n² sort is fine]
    K -- Large --> M[Use Arrays.sort O n log n]

    E --> N[Define BASE CASE first!\nThen recursive case]
```

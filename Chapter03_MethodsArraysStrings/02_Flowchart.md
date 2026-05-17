# 🔵 Flowchart — Methods, Arrays & Strings (Chapter 3)

---

## Flowchart 1: How a Method Works

```mermaid
flowchart TD
    A([Main program running]) --> B

    B[Reaches a method call:\nint result = add'3, 5']

    B --> C[Java pauses main program\nand jumps to the method:\npublic int add'int a, int b']

    C --> D[Method receives arguments:\na = 3, b = 5]

    D --> E[Executes method body:\nreturn a + b]

    E --> F{Does method have\na return type?}

    F -- ✅ Yes: int, String, etc. --> G[Returns value: 8\nback to the caller]
    F -- ❌ No: void --> H[Method ends,\nnothing returned]

    G --> I[Main program resumes:\nresult = 8]
    H --> I

    I --> J([Main program continues])
```

---

## Flowchart 2: Accessing Array Elements

```mermaid
flowchart TD
    A(["You have an array: int[] scores = {90, 85, 77, 92, 65}"]) --> B

    B["Array created in memory:\nIndex: 0=90, 1=85, 2=77, 3=92, 4=65\nLength = 5"]

    B --> C{What do you want to do?}

    C --> D["Read element:\nscores[2] → 77"]
    C --> E["Modify element:\nscores[1] = 100"]
    C --> F["Get length:\nscores.length → 5"]
    C --> G["Loop through all:\nfor i = 0 to length-1"]

    G --> H["Access scores[i] for each i"]

    D & E & F & H --> I{"Index valid?\n0 <= index < length"}

    I -- ✅ Yes --> J([Operation succeeds])
    I -- ❌ No: index = 5 or -1 --> K["💥 ArrayIndexOutOfBoundsException!\nProgram crashes"]
```

---

## Flowchart 3: String Comparison — The equals() vs == Trap

```mermaid
flowchart TD
    A([You have two Strings:\nString a = 'Hello'\nString b = 'Hello']) --> B

    B{Using == or .equals?}

    B -- "Using ==" --> C{Are they the SAME\nOBJECT in memory?\ne.g. both String literals?}
    C -- ✅ Same object literal pool --> D[Returns true\nBUT — not reliable!]
    C -- ❌ Different new objects --> E[Returns false\nEVEN IF content is identical!]

    B -- "Using .equals()" --> F{Is the CONTENT\nof both Strings identical?}
    F -- ✅ Yes --> G[Returns TRUE ✅ Correct!]
    F -- ❌ No --> H[Returns FALSE ✅ Correct!]

    D & E --> I[⚠️ Unreliable — avoid for Strings!]
    G & H --> J([✅ Always use .equals for String comparison!])
```

---

## Key Rules Summary

| Concept | Rule |
|---------|------|
| Array index | Always starts at **0**, ends at **length - 1** |
| Method void | Means "returns nothing" |
| String comparison | ALWAYS use `.equals()`, never `==` |
| 2D array access | `array[row][col]` — row first, column second |

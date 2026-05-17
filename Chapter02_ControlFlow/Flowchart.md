# 🔵 Flowchart — How Control Flow Works (Chapter 2)

---

## 🗺️ Main Flowchart: if-else Decision Tree

```mermaid
flowchart TD
    A([Program reaches a decision point]) --> B

    B{Evaluate the condition\ne.g. age >= 18}

    B -- ✅ TRUE --> C[Execute the if block\nGrant access]
    B -- ❌ FALSE --> D{Is there an else-if?}

    D -- ✅ Yes --> E{Evaluate the\nelse-if condition\ne.g. age >= 16}
    E -- ✅ TRUE --> F[Execute else-if block\nPartial access]
    E -- ❌ FALSE --> G{Is there an else?}

    D -- ❌ No --> G

    G -- ✅ Yes --> H[Execute else block\nDeny access]
    G -- ❌ No --> I[Do nothing, continue]

    C & F & H & I --> J([Continue to next line of code])
```

---

## 🗺️ Flowchart 2: Choosing the Right Loop

```mermaid
flowchart TD
    A([You need to repeat something]) --> B

    B{Do you know EXACTLY\nhow many times\nto repeat?}

    B -- ✅ Yes --> C[Use a FOR loop\nfor int i = 0; i < n; i++]
    B -- ❌ No --> D

    D{Does the condition\nneed to be checked\nBEFORE first run?}

    D -- ✅ Yes → might not run at all --> E[Use a WHILE loop\nwhile condition]
    D -- ❌ No → must run at least once --> F[Use DO-WHILE loop\ndo ... while condition]

    C --> G[Execute loop body]
    E --> H{Is condition\nstill true?}
    F --> I[Execute loop body\nat least once]

    G --> J{Reached\nend count?}
    J -- ❌ Not yet --> G
    J -- ✅ Done --> K

    H -- ✅ Yes --> L[Execute loop body]
    L --> H
    H -- ❌ No --> K

    I --> M{Is condition\nstill true?}
    M -- ✅ Yes --> I
    M -- ❌ No --> K

    K([Loop finished — continue program])
```

---

## 🗺️ Flowchart 3: break vs continue

```mermaid
flowchart TD
    A([Loop starts: i = 1]) --> B

    B{i <= 10?}
    B -- ❌ No --> Z([Loop ends])
    B -- ✅ Yes --> C

    C{Is i == 5?}
    C -- ✅ Yes: break --> Z
    C -- ❌ No --> D

    D{Is i == 3?}
    D -- ✅ Yes: continue --> E[Skip rest of body\ni++]
    D -- ❌ No --> F[Execute loop body\nprint i]

    E --> B
    F --> G[i++]
    G --> B
```

> **Result of this loop:** Prints 1, 2, 4 (skips 3 because of continue, stops before 5 because of break)

---

## 🗺️ Flowchart 4: switch Statement

```mermaid
flowchart TD
    A([switch value entered]) --> B{value == case 1?}
    B -- ✅ Yes --> C[Execute case 1 code]
    C --> D{break?}
    D -- ✅ Yes --> Z
    D -- ❌ No → FALL THROUGH --> E

    B -- ❌ No --> E{value == case 2?}
    E -- ✅ Yes --> F[Execute case 2 code]
    F --> G{break?}
    G -- ✅ Yes --> Z
    G -- ❌ No → FALL THROUGH --> H

    E -- ❌ No --> H[Execute default case]

    H --> Z([Continue after switch])
    Z([Done])
```

> ⚠️ **Fall-through warning:** If you forget `break`, Java will run the NEXT case too! Always use `break` unless you explicitly want fall-through.

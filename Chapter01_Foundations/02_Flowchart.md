# 🔵 Flowchart — How Java Works (Chapter 1: Foundations)

> **Goal:** Understand the complete journey from writing Java code to seeing output on your screen — explained step by step, like a GPS route.

---

## 🗺️ Main Flowchart: The Full Java Journey

```mermaid
flowchart TD
    A([🚀 START: You want to build a Java program]) --> B

    B[📝 Step 1: Write your code\nin a .java file\ne.g. HelloWorld.java]

    B --> C{💾 Did you save\nthe file correctly?\nFilename = Class name?}

    C -- ❌ No --> B2[⚠️ Fix the file name!\nFile must match class name\ne.g. class HelloWorld → HelloWorld.java]
    B2 --> B

    C -- ✅ Yes --> D

    D[🔨 Step 2: Compile with javac\nCommand: javac HelloWorld.java]

    D --> E{🔍 Any syntax errors?\ne.g. missing semicolon,\nwrong spelling}

    E -- ❌ Yes, errors found --> F[🛠️ Read the error message\nFind the line number\nFix the mistake]
    F --> D

    E -- ✅ No errors --> G

    G[📦 Step 3: Compiler creates\nHelloWorld.class\nThis is BYTECODE — not English,\nnot machine code, but something\nthe JVM understands]

    G --> H[▶️ Step 4: Run with java\nCommand: java HelloWorld]

    H --> I[🤖 The JVM loads the .class file\nand starts executing from\npublic static void main...]

    I --> J{📢 Does the program\nneed user input?\ne.g. Scanner sc = new Scanner}

    J -- ✅ Yes --> K[⌨️ User types input\nScanner reads it and\nstores it in a variable]
    K --> L

    J -- ❌ No --> L

    L[⚙️ JVM executes each line\nof code one by one:\n• Stores values in variables\n• Does math operations\n• Prints output]

    L --> M[🖥️ Output appears\non the console screen!]

    M --> N{🔄 Run again with\ndifferent inputs?}

    N -- ✅ Yes --> H
    N -- ❌ No --> O

    O([🏁 END: Program Complete!])
```

---

## 📦 Flowchart 2: Understanding Variables

```mermaid
flowchart TD
    A([You need to store some data]) --> B

    B{What TYPE of data\nis it?}

    B --> C[Whole number?\ne.g. age = 16]
    B --> D[Decimal number?\ne.g. price = 9.99]
    B --> E[Single character?\ne.g. grade = 'A']
    B --> F[True or False?\ne.g. isStudent = true]
    B --> G[Text / Words?\ne.g. name = 'Gautam']

    C --> C1[Use: int\nint age = 16;]
    D --> D1[Use: double\ndouble price = 9.99;]
    E --> E1[Use: char\nchar grade = 'A';]
    F --> F1[Use: boolean\nboolean isStudent = true;]
    G --> G1[Use: String\nString name = 'Gautam';]

    C1 & D1 & E1 & F1 & G1 --> H

    H{Will this value\nEVER change?}
    H -- ❌ Never changes --> I[Use final keyword\nfinal int MAX = 100;]
    H -- ✅ Can change --> J[Regular variable\nint score = 0;\nscore = 50; ← can change]

    I & J --> K([✅ Variable is ready to use!])
```

---

## 🔤 Flowchart 3: Reading User Input with Scanner

```mermaid
flowchart TD
    A([Start: Program needs input from user]) --> B

    B[Import the Scanner tool:\nimport java.util.Scanner;]

    B --> C[Create a Scanner object:\nScanner sc = new Scanner'System.in']

    C --> D[Print a message asking for input:\nSystem.out.print'Enter your name: ']

    D --> E{What type of\ndata do you expect?}

    E --> F[Text / whole line?\nsc.nextLine']
    E --> G[Single whole number?\nsc.nextInt']
    E --> H[Decimal number?\nsc.nextDouble']

    F & G & H --> I[Store it in a variable:\nString name = sc.nextLine']

    I --> J[Use the variable in your program:\nSystem.out.println'Hello, ' + name]

    J --> K[Close the scanner when done:\nsc.close']

    K --> O([✅ Input handled successfully!])
```

---

## 🎯 Key Concepts Illustrated in These Flowcharts

| Symbol | Meaning |
|--------|---------|
| ⬭ Oval | Start or End of the process |
| ▭ Rectangle | An action or step |
| ◇ Diamond | A decision (Yes/No question) |
| → Arrow | The flow of execution |

### The 3 Golden Rules of Chapter 1:
1. **File name = Class name** (HelloWorld.java → `class HelloWorld`)
2. **Always compile before running** (`javac` first, then `java`)
3. **Every statement ends with a semicolon** `;`

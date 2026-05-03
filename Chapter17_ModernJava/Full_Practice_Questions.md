# Chapter 17 - Full Practice Questions

## Problem 1 - Beginner: Create a Record

**Problem Statement**  
Create a Java record named `Book` with fields `title`, `author`, and `price`. Read book details and print the record.

**Input Format**
```text
title
author
price
```

**Output Format**
```text
Book[title=<title>, author=<author>, price=<price>]
```

**Sample Input**
```text
Java Basics
Asha
499.0
```

**Sample Output**
```text
Book[title=Java Basics, author=Asha, price=499.0]
```

---

## Problem 2 - Intermediate: Switch Expression Grade Message

**Problem Statement**  
Read a grade character and use a modern switch expression to print the grade message.

Rules:
- `A`: Excellent
- `B`: Good
- `C`: Average
- Any other grade: Invalid

**Input Format**
```text
grade
```

**Output Format**
```text
<message>
```

**Sample Input**
```text
A
```

**Sample Output**
```text
Excellent
```

---

## Problem 3 - Advanced: Sealed Payment Types

**Problem Statement**  
Create a sealed payment model with `CardPayment` and `UpiPayment`. Read payment type and amount. Card payments have a 2 percent fee. UPI payments have no fee. Print final amount.

**Input Format**
```text
paymentType
amount
```

**Output Format**
```text
Final amount: <amountAfterFee>
```

**Sample Input**
```text
CARD
1000
```

**Sample Output**
```text
Final amount: 1020.0
```


# Chapter 20 - Full Practice Questions

## Problem 1 - Beginner: Improve Variable Names

**Problem Statement**  
Given unclear variable names, rewrite them into meaningful names for a student marks program.

**Input Format**
```text
badVariableName
purpose
```

**Output Format**
```text
Better name: <betterVariableName>
```

**Sample Input**
```text
x
total marks
```

**Sample Output**
```text
Better name: totalMarks
```

---

## Problem 2 - Intermediate: Notification Factory

**Problem Statement**  
Use the Factory pattern to create notification objects. If input is `EMAIL`, create email notification. If input is `SMS`, create SMS notification. Print the sent message.

**Input Format**
```text
notificationType
message
```

**Output Format**
```text
<notificationType>: <message>
```

**Sample Input**
```text
EMAIL
Welcome Asha
```

**Sample Output**
```text
EMAIL: Welcome Asha
```

---

## Problem 3 - Advanced: Discount Strategy

**Problem Statement**  
Use the Strategy pattern to calculate a final amount. `NONE` gives no discount, `STUDENT` gives 10 percent discount, and `FESTIVAL` gives 20 percent discount.

**Input Format**
```text
amount
discountType
```

**Output Format**
```text
Final amount: <finalAmount>
```

**Sample Input**
```text
1000
FESTIVAL
```

**Sample Output**
```text
Final amount: 800.0
```


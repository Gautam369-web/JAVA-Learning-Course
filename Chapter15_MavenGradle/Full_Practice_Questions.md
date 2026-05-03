# Chapter 15 - Full Practice Questions

## Problem 1 - Beginner: Create a Minimal Maven Project

**Problem Statement**  
Create a Maven project named `calculator-app` with a valid `pom.xml`. The project should use Java 21.

**Input Format**
```text
groupId
artifactId
javaVersion
```

**Output Format**
```text
Maven project created
Group ID: <groupId>
Artifact ID: <artifactId>
Java Version: <javaVersion>
```

**Sample Input**
```text
com.course
calculator-app
21
```

**Sample Output**
```text
Maven project created
Group ID: com.course
Artifact ID: calculator-app
Java Version: 21
```

---

## Problem 2 - Intermediate: Add JUnit Dependency

**Problem Statement**  
Update a Maven `pom.xml` file to include JUnit 5 as a test dependency. Then create a simple calculator test that checks whether `add(10, 20)` returns `30`.

**Input Format**
```text
a
b
expectedSum
```

**Output Format**
```text
JUnit dependency added
Test result: passed
```

**Sample Input**
```text
10
20
30
```

**Sample Output**
```text
JUnit dependency added
Test result: passed
```

---

## Problem 3 - Advanced: Diagnose Maven Build Failure

**Problem Statement**  
A Maven project fails during `mvn test`. Read the failure message, identify which test failed, fix the code or test, and rerun the build.

**Input Format**
```text
failedTestName
expectedValue
actualValue
```

**Output Format**
```text
Failed test: <failedTestName>
Expected: <expectedValue>
Actual: <actualValue>
Build fixed
```

**Sample Input**
```text
addsTwoNumbers
30
25
```

**Sample Output**
```text
Failed test: addsTwoNumbers
Expected: 30
Actual: 25
Build fixed
```


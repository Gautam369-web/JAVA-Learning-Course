# Chapter 15 - Solutions

## Solution 1
Build tools compile code, run tests, download dependencies, package apps, and standardize project structure.

## Solution 2
```text
src/main/java      production code
src/test/java      test code
```

## Solution 3
```xml
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.course</groupId>
    <artifactId>demo-app</artifactId>
    <version>1.0.0</version>
</project>
```

## Solution 4
`mvn compile` compiles code under `src/main/java` and stores output under `target/`.

## Solution 5
```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.2</version>
    <scope>test</scope>
</dependency>
```

## Solution 6
`mvn package` compiles, tests, and creates a JAR or WAR in `target/`.

## Solution 7
```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.17.1</version>
</dependency>
```

## Solution 8
Maven:
```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.2</version>
    <scope>test</scope>
</dependency>
```

Gradle:
```gradle
testImplementation 'org.junit.jupiter:junit-jupiter:5.10.2'
```

## Solution 9
```text
parent-project/
  pom.xml
  api/
  service/
  data/
```

The parent manages shared versions. Each module has its own `pom.xml`.

## Solution 10
Read the first failing test message, open the test, reproduce with `mvn test`, fix the cause, then rerun the full build.


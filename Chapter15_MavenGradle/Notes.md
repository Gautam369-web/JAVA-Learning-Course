# Chapter 15 - Maven and Gradle Build Tools

Small Java programs can be compiled manually. Real projects need libraries, tests, packaging, and repeatable builds. Maven and Gradle solve that problem.

---

## Goals of Chapter 15
- Understand what a build tool does.
- Learn Maven project structure.
- Add external dependencies.
- Run tests and package applications.
- Understand where Gradle fits.

## Sub-topics
| Section | Topic | Description |
| :--- | :--- | :--- |
| **15.1** | **Build Tools** | Automate compile, test, package |
| **15.2** | **Maven Layout** | Standard Java project structure |
| **15.3** | **pom.xml** | Project configuration |
| **15.4** | **Dependencies** | Use external libraries |
| **15.5** | **Gradle** | Alternative modern build tool |

---

## 15.1 Build Tools: The "Factory Machine"

Without a build tool, you manually compile many files and download libraries yourself. A build tool does this consistently.

Common tasks:
```bash
mvn compile
mvn test
mvn package
```

---

## 15.2 Maven Project Layout

```text
my-app/
  pom.xml
  src/
    main/
      java/
        com/example/App.java
    test/
      java/
        com/example/AppTest.java
```

Maven expects this structure. Following it means tools understand your project automatically.

---

## 15.3 pom.xml: The "Project ID Card"

```xml
<project>
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>my-app</artifactId>
    <version>1.0.0</version>

    <properties>
        <maven.compiler.source>21</maven.compiler.source>
        <maven.compiler.target>21</maven.compiler.target>
    </properties>
</project>
```

Meaning:
- `groupId`: organization or package name.
- `artifactId`: project name.
- `version`: release number.

---

## 15.4 Dependencies: Using Other People's Code

Example: adding JUnit.
```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

Maven downloads the library and adds it to your project.

---

## 15.5 Gradle: Another Build Tool

Gradle uses `build.gradle` instead of `pom.xml`.

```gradle
plugins {
    id 'java'
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter:5.10.2'
}
```

Maven is common in enterprise Java. Gradle is common in Android and many modern projects.

---

## Chapter Summary
Build tools make Java projects repeatable. Learn Maven first because it is widely used and easier to recognize in many Java backend jobs.


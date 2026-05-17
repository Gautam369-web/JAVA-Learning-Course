# 🟣 Self-Test Questions — Chapter 21: Spring Boot

## 🟢 BASIC
**Q1.** What does @SpringBootApplication do? What three annotations does it combine?
**Q2.** What is the difference between @Controller and @RestController?
**Q3.** What is Dependency Injection? Why is it useful?
**Q4.** What is the purpose of application.properties?

## 🟡 INTERMEDIATE
**Q5.** Build a complete Spring Boot endpoint `GET /api/books` that returns a hardcoded list of 3 Book objects (id, title, author).
**Q6.** What is constructor injection and why is it preferred over @Autowired field injection?
**Q7.** Describe the flow of an HTTP request from the client to the database and back in a Spring Boot application.

## 🔴 ADVANCED
**Q8.** What is a Spring Bean? What is the default scope (singleton vs prototype)?
**Q9.** Create a Spring Boot application with 3 layers (Controller, Service, Repository) for a Product CRUD system. Use an in-memory ArrayList in the repository (no database yet).
**Q10.** What happens if Spring cannot find a bean to inject? What exception is thrown?

<details>
<summary>💡 Hints</summary>
- Q1: @Configuration + @EnableAutoConfiguration + @ComponentScan
- Q2: @RestController = @Controller + @ResponseBody (automatically converts return values to JSON)
- Q10: NoSuchBeanDefinitionException or UnsatisfiedDependencyException
</details>

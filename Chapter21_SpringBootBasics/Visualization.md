# 🔴 Visualization Exercise — Chapter 21: Spring Boot

## 🎬 Scene 1: Spring as a Hotel Manager
You walk into a hotel (Spring Boot application). Instead of building your room, making your bed, and cooking your food yourself, the hotel MANAGER (Spring IoC Container) has already arranged everything. You just ask: "I need a room with breakfast" (@Autowired). The manager finds the room (instantiates the bean), stocks the fridge (injects dependencies), and hands you the key. You just USE it.

## 🎬 Scene 2: The 3-Layer Architecture — A Restaurant
A customer (HTTP Client) orders food from a WAITER (Controller). The waiter doesn't cook! They take the order to the CHEF (Service) who applies the recipe/business logic. The chef gets ingredients from the PANTRY (Repository/Database). The pantry returns ingredients to the chef, who cooks and gives the plate to the waiter, who serves it to the customer. Three distinct roles. Three distinct layers. Each knows only its own job.

## 🎬 Scene 3: @RestController — Your Program's Customer Service
Your controller is a customer service desk. When customers (HTTP requests) come in asking for data, the controller:
1. Reads what they want (path variable, request body)
2. Asks the service department for the data
3. Packages it as JSON and sends it back

You (the programmer) just define the desk's hours (`@GetMapping("/api/...")`), what it accepts, and what it returns.

## ✍️ After Visualization
1. In the hotel analogy, what is the "key" the manager gives you?
2. Why doesn't the Controller talk directly to the Repository?
3. What annotation marks a class as a Spring-managed HTTP request handler?

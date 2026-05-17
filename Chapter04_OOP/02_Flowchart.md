# 🔵 Flowchart — How OOP Works (Chapter 4)

---

## Flowchart 1: Class → Object Creation

```mermaid
flowchart TD
    A([Start: You need a 'Dog' in your program]) --> B

    B[Define the Class — the BLUEPRINT:\npublic class Dog\n  String name;\n  int age;\n  void bark]

    B --> C[Create an Object — the ACTUAL dog:\nDog myDog = new Dog'Buddy', 3]

    C --> D[The 'new' keyword triggers the CONSTRUCTOR:\npublic Dog'String name, int age'\n  this.name = name;\n  this.age = age;]

    D --> E[Memory is allocated in the HEAP\nThe object exists! myDog points to it]

    E --> F[Access fields and methods:\nmyDog.name → 'Buddy'\nmyDog.bark → 'Woof!']

    F --> G([Object is ready to use!])
```

---

## Flowchart 2: The 4 Pillars of OOP

```mermaid
flowchart LR
    A[OOP] --> B[🔒 Encapsulation]
    A --> C[👪 Inheritance]
    A --> D[🎭 Polymorphism]
    A --> E[🎨 Abstraction]

    B --> B1[Private fields\nPublic getters/setters\nProtects internal data]
    C --> C1[Child class extends Parent\nChild gets all parent methods\nChild can override behaviors]
    D --> D1[Same method name\nDifferent behavior per class\ne.g. Dog.speak vs Cat.speak]
    E --> E1[Hide complexity\nShow only relevant interface\ne.g. abstract class or interface]
```

---

## Flowchart 3: Inheritance Chain

```mermaid
flowchart TD
    A[Animal — Parent Class\n+ name: String\n+ makeSound void — abstract]

    A --> B[Dog — Child Class\nextends Animal\n+ makeSound: 'Woof!'\n+ fetch void]

    A --> C[Cat — Child Class\nextends Animal\n+ makeSound: 'Meow!'\n+ purr void]

    B --> D{Animal ref = new Dog\nref.makeSound called?}
    D --> E[✅ Polymorphism!\nCalls Dog's makeSound\nOutputs: Woof!\nEven though ref type is Animal]
```

---

## Flowchart 4: Interface vs Abstract Class — Which to Use?

```mermaid
flowchart TD
    A{What relationship does\nthe child have with parent?}

    A -- "IS-A relationship\ne.g. Dog IS-A Animal" --> B[Use Abstract Class\nor regular Class with extends]

    A -- "CAN-DO relationship\ne.g. Dog CAN-DO Trainable" --> C[Use Interface\nwith implements]

    B --> D[class Dog extends Animal]
    C --> E[class Dog implements Trainable]

    D & E --> F{Need multiple inheritance?}

    F -- "Multiple behaviors needed" --> G[Use multiple Interfaces!\nclass Dog extends Animal\n  implements Trainable, Swimmable]

    F -- "Just one parent needed" --> H[Single class/abstract\nextension is fine]
```

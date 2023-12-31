# Abstract-Factory (Creational)
The Abstract Factoy design pattern is useful when;
- a system should be independent of how its products are created, composed and represented
- a system should be configured with one of multiple families of products
- a family of related product objects is designed to be used together, and this needs to be enforced
- you want to reveal a products interface and not their implementations

Concrete factories are created at run-time. These factories create product objects with a particular implementation. Seperate products can be created by using the corresponding concrete factory. The AbstractFactory defers creation of products to its Concrete Factory sub-class.

**Benefits:**
- Isolates concrete classes
- Enhances the ability to exchange productg families easily
- Promotes consistency amoung products (ensures the application uses products from one family at a time)


**Consequences:**
- Supporting new kinds of products if difficult

**Other Design Patterns Commonly used with Abstract Factory:**

Factory Method 
- Define a factory method for each product, however it requires a new concrete factory for each product family even if they differ slightly

Prototype
- The concrete factory is initialized with a prototypical instance of each product in the family and it creates a new product by cloning its prototype (used if many product families are possible). This eliminates the need for a new concrete factory class for each new product family.

# Maze - Abstract Factory Example
This program consists of a maze that utilizes factories to create differnt types of rooms, walls and doors of a hypothetical game. These actions are shows by print messages to the console.

![image](https://github.com/evan-placenis/Abstract-Factory/assets/112578037/568c15d9-e65f-468f-b9d2-52fb03ea5d63)

The example shows the utility of the pattern by being able to easily create a new factory and call it withing the Client file (line 29-31) to extend the application (amoung other benefits).

![image](https://github.com/evan-placenis/Abstract-Factory/assets/112578037/313ea2bd-bb4b-4aaf-ac44-95f016fbbc3f)





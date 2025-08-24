Pattern Name: Decorator
Pattern Category: Structural

Description:
    - The Decorator pattern allows behavior to be added to individual objects dynamically without affecting other objects of the same class.
    - It provides a flexible alternative to subclassing for extending functionality.
    - Think of it like adding toppings to a pizza - you can add cheese, pepperoni, mushrooms, etc., without changing the base pizza.
    - It follows the Open/Closed Principle: open for extension, closed for modification.

The key idea is:
    - "Add new behavior to objects dynamically by wrapping them with decorator objects."

The Problem:
    - You want to add new functionality to objects without modifying their existing code.
    - Subclassing leads to a large number of subclasses for different combinations.
    - You need to add or remove responsibilities at runtime.
    - You want to avoid creating complex inheritance hierarchies.

The Solution:
    - Create a decorator class that implements the same interface as the component.
    - The decorator holds a reference to the component and adds behavior before/after delegating to it.
    - Multiple decorators can be chained together to add multiple behaviors.
    - Each decorator can be applied independently and in any order.

Code Flow Explanation:

What This Example Does:
This example demonstrates how to use the Decorator pattern to build custom coffee orders. Starting with a simple coffee, you can add milk, sugar, and whipped cream dynamically, with each addition increasing the cost and updating the description.

Step-by-Step Code Flow:

1. Coffee Interface (Coffee.java)
   - Purpose: The component interface that defines the contract
   - Contains: getCost() and getDescription() methods
   - Represents: The base functionality that all coffees must have

2. SimpleCoffee Class (SimpleCoffee.java)
   - Purpose: The concrete component that implements the base functionality
   - Contains: Basic coffee cost ($2.0) and description
   - Represents: The simplest form of coffee without any additions

3. CoffeeDecorator Abstract Class (CoffeeDecorator.java)
   - Purpose: The abstract decorator that implements the Coffee interface
   - Contains: Protected reference to a Coffee object
   - Delegates: Calls to the wrapped Coffee object by default

4. Concrete Decorator Classes (MilkDecorator.java, SugarDecorator.java, WhipDecorator.java)
   - Purpose: Add specific behaviors to the wrapped Coffee object
   - Each Decorator: Adds its own cost and description
   - Chain Together: Multiple decorators can be applied to one coffee

5. Main Program (Main.java)
   - Demonstrates: Various coffee combinations using decorators
   - Shows: How decorators can be chained and ordered
   - Creates: Different coffee orders with different costs and descriptions

Real-World Example: Coffee Shop Ordering System

Imagine you're building a coffee shop app that:
- Has a base coffee (Simple Coffee)
- Allows customers to add toppings (Milk, Sugar, Whip)
- Needs to calculate total cost dynamically
- Wants to show detailed descriptions of orders
- Avoids creating classes like CoffeeWithMilk, CoffeeWithMilkAndSugar, etc.

Without Decorator Pattern:
You'd need classes like CoffeeWithMilk, CoffeeWithSugar, CoffeeWithMilkAndSugar, etc. - exponential growth!

With Decorator Pattern:
Start with SimpleCoffee and wrap it with decorators. Add MilkDecorator, SugarDecorator, WhipDecorator as needed!

Benefits:
- Flexibility: Add or remove behaviors at runtime
- Single Responsibility: Each decorator has one specific purpose
- Open/Closed: Open for extension, closed for modification
- Avoids Inheritance Explosion: No need for multiple subclasses
- Dynamic Composition: Behaviors can be combined in any order

Use Cases:
- Coffee/Drink Ordering: Adding toppings and modifications
- Text Formatting: Adding bold, italic, underline to text
- File I/O: Adding buffering, compression, encryption to streams
- UI Components: Adding borders, scrollbars, tooltips to widgets
- Middleware: Adding logging, caching, authentication to services

Drawbacks:
- Complexity: Can lead to many small classes
- Debugging: Harder to debug due to multiple layers
- Performance: Multiple method calls through decorator chain
- Understanding: Can be confusing to understand the flow

How to Execute the Code:
1. Navigate to the decorator folder in terminal:
   cd structural/decorator

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Decorator Pattern Demo ===

1. Simple Coffee:
Cost: $2.0
Description: Simple Coffee

2. Coffee with Milk:
Cost: $2.5
Description: Simple Coffee, Milk

3. Coffee with Milk and Sugar:
Cost: $2.7
Description: Simple Coffee, Milk, Sugar

4. Coffee with All Toppings:
Cost: $3.4
Description: Simple Coffee, Milk, Sugar, Whip

5. Different Decorator Order:
Order 1 (Sugar + Whip):
Cost: $2.9
Description: Simple Coffee, Sugar, Whip

Order 2 (Whip + Sugar):
Cost: $2.9
Description: Simple Coffee, Whip, Sugar

6. Building Coffee Step by Step:
Base: Simple Coffee - $2.0
Add Milk: Simple Coffee, Milk - $2.5
Add Sugar: Simple Coffee, Milk, Sugar - $2.7
Add Whip: Simple Coffee, Milk, Sugar, Whip - $3.4

Key Takeaways:
1. Dynamic Behavior: Add behaviors at runtime without changing existing code
2. Composition Over Inheritance: Use composition to add functionality
3. Chainable Decorators: Multiple decorators can be applied in sequence
4. Open/Closed Principle: Open for extension, closed for modification
5. Single Responsibility: Each decorator adds one specific behavior

Decorator Pattern Structure:
- Component Interface: Defines the contract (Coffee)
- Concrete Component: Basic implementation (SimpleCoffee)
- Abstract Decorator: Implements Component and holds Component reference
- Concrete Decorators: Add specific behaviors (MilkDecorator, SugarDecorator, WhipDecorator)

Simple Analogy:
Think of it like decorating a Christmas tree:
- Base Tree = Component (SimpleCoffee)
- Ornaments = Decorators (MilkDecorator, SugarDecorator)
- Each Ornament = Adds its own decoration
- Final Tree = All decorations combined
- Result = Beautiful, customized tree

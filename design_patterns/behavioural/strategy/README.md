Pattern Name: Strategy
Pattern Category: Behavioral

Description:
    - The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
    - It allows the algorithm to vary independently from clients that use it.
    - Think of it like choosing a payment method - you can pay with credit card, PayPal, or cash, but the checkout process remains the same.
    - It's useful when you have multiple ways to accomplish the same task and want to make them interchangeable.

The key idea is:
    - "Define a family of algorithms, encapsulate each one, and make them interchangeable."

The Problem:
    - You have multiple algorithms that accomplish the same task.
    - You want to select an algorithm at runtime.
    - You need to avoid conditional statements for algorithm selection.
    - You want to make algorithms easily extensible.
    - You need to support multiple algorithm implementations.

The Solution:
    - Create a Strategy interface that defines the algorithm contract.
    - Implement concrete strategy classes for each algorithm.
    - Create a Context class that uses the strategy.
    - The context can change strategies at runtime.
    - Algorithms are encapsulated and interchangeable.

Code Flow Explanation:

What This Example Does:
This example demonstrates a simple calculator system where different mathematical operations (add, subtract, multiply) are implemented as interchangeable strategies.

Step-by-Step Code Flow:

1. Strategy Interface (Strategy.java)
   - Purpose: Defines the contract for all strategies
   - Method: doOperation() performs the algorithm
   - Represents: The algorithm abstraction

2. Concrete Strategy Classes (OperationAdd.java, OperationSubtract.java, OperationMultiply.java)
   - Purpose: Implement specific algorithms
   - Behavior: Each implements doOperation() differently
   - Represents: Different ways to accomplish the same task

3. Context Class (Context.java)
   - Purpose: Uses the strategy to perform operations
   - Behavior: Holds a strategy and executes it
   - Represents: The client that uses strategies

Real-World Example: Payment Processing System

Imagine you're building an e-commerce application that:
- Supports multiple payment methods (credit card, PayPal, cryptocurrency)
- Needs to process payments differently for each method
- Should be easy to add new payment methods
- Must maintain clean, maintainable code
- Should allow runtime payment method selection

Without Strategy Pattern:
You'd have complex if-else statements, tight coupling, and difficulty adding new payment methods!

With Strategy Pattern:
Payment methods are cleanly encapsulated, easily extensible, and interchangeable at runtime!

Benefits:
- Algorithm Encapsulation: Each algorithm is encapsulated in its own class
- Runtime Selection: Strategies can be changed at runtime
- Easy Extension: New strategies can be added without changing existing code
- Eliminates Conditionals: No complex if-else statements for algorithm selection
- Single Responsibility: Each strategy class handles one algorithm

Use Cases:
- Payment Processing: Different payment methods
- Sorting Algorithms: Different sorting strategies
- Compression: Different compression algorithms
- Validation: Different validation rules
- Pricing: Different pricing strategies

Drawbacks:
- Object Proliferation: Can create many strategy objects
- Client Knowledge: Client must know about available strategies
- Strategy Selection: Need to decide which strategy to use
- Memory Usage: Each strategy is a separate object

How to Execute the Code:
1. Navigate to the strategy folder in terminal:
   cd behavioural/strategy

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Strategy Pattern Demo ===

10 + 5 = 15
10 - 5 = 5
10 * 5 = 50

Key Takeaways:
1. Algorithm Encapsulation: Each algorithm is encapsulated in its own class
2. Interchangeability: Strategies can be swapped at runtime
3. Clean Architecture: Algorithm logic is separated from client logic
4. Easy Extension: New strategies can be added without changing existing code
5. Runtime Flexibility: Different strategies can be used for the same task

Strategy Pattern Structure:
- Strategy Interface: Defines algorithm contract
- Concrete Strategies: Implement specific algorithms
- Context: Uses the strategy
- Client: Creates and configures strategies

Simple Analogy:
Think of it like choosing a transportation method:
- Destination = Task to accomplish
- Transportation Methods = Strategies (car, bus, bike, walk)
- Traveler = Context (uses the chosen method)
- Route Planning = Strategy selection
- Result = Same destination reached using different methods

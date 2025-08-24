Pattern Name: Bridge
Pattern Category: Structural

Description:
    - The Bridge pattern decouples an abstraction from its implementation, allowing both to vary independently.
    - It separates the interface hierarchy from the implementation hierarchy, creating two separate hierarchies.
    - Think of it like a bridge connecting two sides of a river - the abstraction and implementation can change independently.
    - It prevents a permanent binding between an abstraction and its implementation.

The key idea is:
    - "Separate abstraction from implementation so both can vary independently."

The Problem:
    - You have a class hierarchy that grows exponentially when you add new features.
    - You want to avoid permanent binding between abstraction and implementation.
    - You need to share an implementation among multiple objects.
    - You want to hide implementation details from clients.

The Solution:
    - Create two separate hierarchies: one for abstraction and one for implementation.
    - Use composition to connect the abstraction with its implementation.
    - The abstraction holds a reference to the implementation interface.
    - Both hierarchies can evolve independently without affecting each other.

Code Flow Explanation:

What This Example Does:
This example demonstrates how to use the Bridge pattern to separate shape drawing from color implementation. Shapes (Circle, Rectangle) can be drawn in different colors (Red, Green, Blue) without creating a complex inheritance hierarchy.

Step-by-Step Code Flow:

1. DrawAPI Interface (DrawAPI.java)
   - Purpose: The implementation interface that defines drawing operations
   - Contains: drawCircle() and drawRectangle() methods
   - Represents: How to draw shapes (the implementation)

2. Concrete Drawing Classes (RedCircle.java, GreenCircle.java, BlueRectangle.java)
   - Purpose: Implement the DrawAPI interface with specific colors
   - Contains: Specific drawing logic for each color
   - Each class: Handles one specific color and shape combination

3. Abstract Shape Class (Shape.java)
   - Purpose: The abstraction that holds a reference to the implementation
   - Contains: Protected DrawAPI reference and abstract draw() method
   - Represents: What to draw (the abstraction)

4. Concrete Shape Classes (Circle.java, Rectangle.java)
   - Purpose: Extend the abstract Shape class with specific shape logic
   - Contains: Shape-specific properties and coordinates
   - Use: The DrawAPI reference to delegate actual drawing

5. Main Program (Main.java)
   - Demonstrates: How to combine different shapes with different colors
   - Shows: Dynamic color changes and independent evolution
   - Creates: Various combinations of shapes and drawing implementations

Real-World Example: Shape Drawing System

Imagine you're building a graphics application that:
- Supports different shapes (circles, rectangles, triangles)
- Needs multiple color options (red, green, blue, etc.)
- Wants to add new shapes or colors easily
- Avoids creating classes like RedCircle, BlueRectangle, GreenTriangle

Without Bridge Pattern:
You'd need classes like RedCircle, BlueCircle, GreenCircle, RedRectangle, BlueRectangle, etc. - exponential growth!

With Bridge Pattern:
Separate shape hierarchy from color hierarchy. Add new shapes or colors independently!

Benefits:
- Decoupling: Abstraction and implementation are completely separate
- Extensibility: Easy to add new shapes or colors without affecting existing code
- Single Responsibility: Each class has one clear purpose
- Open/Closed Principle: Open for extension, closed for modification
- Avoids Inheritance Explosion: No need for classes like RedCircle, BlueRectangle

Use Cases:
- Graphics Applications: Separating shapes from rendering methods
- Database Drivers: Abstracting database operations from specific database types
- Operating Systems: Separating platform-specific code from application logic
- Device Drivers: Abstracting hardware operations from specific devices
- UI Frameworks: Separating UI components from platform-specific rendering

Drawbacks:
- Complexity: Adds more classes and complexity to the system
- Understanding: Can be harder to understand initially
- Over-Engineering: May be overkill for simple scenarios
- Design: Requires careful design to identify the right abstractions

How to Execute the Code:
1. Navigate to the bridge folder in terminal:
   cd structural/bridge

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Bridge Pattern Demo ===

1. Drawing Red Circle:
Drawing Red Circle at position(100,100), radius: 10

2. Drawing Green Circle:
Drawing Green Circle at position(200,200), radius: 15

3. Drawing Blue Rectangle:
Drawing Blue Rectangle at position(300,300), width: 20, height: 30

4. Same Circle with Different Colors:
Red version:
Drawing Red Circle at position(50,50), radius: 25
Green version:
Drawing Green Circle at position(50,50), radius: 25

5. Dynamic Color Change:
Initially red:
Drawing Red Circle at position(150,150), radius: 20
Changed to green:
Drawing Green Circle at position(150,150), radius: 20

Key Takeaways:
1. Two Hierarchies: Separate abstraction hierarchy from implementation hierarchy
2. Composition Over Inheritance: Use composition to connect abstraction with implementation
3. Independent Evolution: Both hierarchies can change without affecting each other
4. Dynamic Binding: Implementation can be changed at runtime
5. Avoid Explosion: Prevents exponential growth of classes

Bridge Pattern Structure:
- Abstraction: The interface that clients use (Shape)
- Refined Abstraction: Specific implementations of the abstraction (Circle, Rectangle)
- Implementation: The interface for implementation (DrawAPI)
- Concrete Implementation: Specific implementations (RedCircle, GreenCircle, BlueRectangle)

Simple Analogy:
Think of it like a real bridge:
- Left Bank = Abstraction (shapes)
- Right Bank = Implementation (colors)
- Bridge = Connection between them
- Result = You can reach any color from any shape independently

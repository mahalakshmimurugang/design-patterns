Pattern Name: Visitor
Pattern Category: Behavioral

Description:
    - The Visitor pattern represents an operation to be performed on elements of an object structure.
    - It lets you define a new operation without changing the classes of the elements on which it operates.
    - Think of it like a repair technician visiting different parts of a house - the technician can work on different items without changing them.
    - It's useful when you need to perform operations on objects without modifying their classes.

The key idea is:
    - "Represent an operation to be performed on elements of an object structure without changing the classes of the elements."

The Problem:
    - You need to perform operations on objects without modifying their classes.
    - You want to add new operations to existing object structures.
    - You have a stable object structure but frequently changing operations.
    - You want to separate algorithms from the objects they operate on.
    - You need to perform operations across different object hierarchies.

The Solution:
    - Create a Visitor interface that defines visit methods for each element type.
    - Implement concrete visitors for specific operations.
    - Add an accept() method to element classes that takes a visitor.
    - The accept() method calls the appropriate visit method on the visitor.
    - Visitors can perform operations on elements without changing element classes.

Code Flow Explanation:

What This Example Does:
This example demonstrates a computer system where different parts (keyboard, mouse, monitor) can be visited by a display visitor to show information about each part.

Step-by-Step Code Flow:

1. ComputerPart Interface (ComputerPart.java)
   - Purpose: Defines the contract for all computer parts
   - Method: accept() takes a visitor
   - Represents: The elements that can be visited

2. ComputerPartVisitor Interface (ComputerPartVisitor.java)
   - Purpose: Defines visit methods for each element type
   - Methods: visit() for each specific part type
   - Represents: The operations that can be performed

3. Concrete Parts (Keyboard.java, Monitor.java, Mouse.java)
   - Purpose: Implement specific computer parts
   - Behavior: Each implements accept() to call visitor
   - Represents: The actual elements being visited

4. Computer Class (Computer.java)
   - Purpose: Composite part that contains other parts
   - Behavior: Accepts visitor and delegates to child parts
   - Represents: A complex element structure

5. ComputerPartDisplayVisitor (ComputerPartDisplayVisitor.java)
   - Purpose: Concrete visitor implementation
   - Behavior: Implements display logic for each part type
   - Represents: A specific operation (displaying)

Real-World Example: Document Processing System

Imagine you're building a document processing system that:
- Has different document elements (paragraphs, images, tables)
- Needs to perform various operations (export to PDF, validate, count words)
- Should be extensible for new operations
- Must not modify existing element classes
- Should support complex document structures

Without Visitor Pattern:
You'd need to modify element classes for each new operation, violating the Open/Closed Principle!

With Visitor Pattern:
New operations can be added as visitors without changing existing element classes!

Benefits:
- Open/Closed Principle: New operations without changing element classes
- Single Responsibility: Each visitor handles one operation
- Easy Extension: New operations are just new visitor classes
- Separation of Concerns: Operations are separated from element logic
- Complex Operations: Visitors can coordinate operations across multiple elements

Use Cases:
- Document Processing: Different operations on document elements
- Compiler Design: Code analysis and transformation
- Graphics Systems: Rendering and manipulation operations
- Data Structures: Traversal and analysis operations
- Configuration Systems: Validation and processing operations

Drawbacks:
- Breaking Encapsulation: Visitors may need access to element internals
- Complex Structure: Can be complex to understand and implement
- Type Safety: Requires casting or type checking
- Performance: Additional method calls for each element

How to Execute the Code:
1. Navigate to the visitor folder in terminal:
   cd behavioural/visitor

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Visitor Pattern Demo ===

Displaying Mouse.
Displaying Keyboard.
Displaying Monitor.
Displaying Computer.

Key Takeaways:
1. Operation Separation: Operations are separated from element classes
2. Visitor Interface: Defines operations for each element type
3. Accept Method: Elements accept visitors and delegate operations
4. Easy Extension: New operations are new visitor classes
5. Complex Operations: Visitors can coordinate across multiple elements

Visitor Pattern Structure:
- Element Interface: Defines accept() method
- Concrete Elements: Implement accept() and call visitor
- Visitor Interface: Defines visit methods for each element type
- Concrete Visitors: Implement specific operations
- Client: Uses visitors to perform operations

Simple Analogy:
Think of it like a home inspection:
- House = Object structure (elements to visit)
- Inspector = Visitor (performs operations)
- Room Types = Element types (kitchen, bedroom, bathroom)
- Inspection Tasks = Visit methods (check electrical, plumbing, structure)
- Result = Inspector can examine different rooms without changing the house

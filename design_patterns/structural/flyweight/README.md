Pattern Name: Flyweight
Pattern Category: Structural

Description:
    - The Flyweight pattern reduces memory usage by sharing common parts of state between multiple objects.
    - It separates intrinsic state (shared) from extrinsic state (unique) to minimize memory footprint.
    - Think of it like a text editor - instead of storing font, size, and color for every character, you store these properties once and reuse them.
    - It's useful when you need to create a large number of similar objects that share common properties.

The key idea is:
    - "Share common parts of state between multiple objects to reduce memory usage and improve performance."

The Problem:
    - You need to create a large number of similar objects.
    - These objects share common properties that consume memory.
    - Creating each object individually wastes memory and resources.
    - You want to optimize memory usage for applications with many objects.
    - You need to maintain object identity while sharing common state.

The Solution:
    - Separate intrinsic state (shared, immutable) from extrinsic state (unique, context-dependent).
    - Create a factory that manages and reuses flyweight objects.
    - Store intrinsic state in flyweight objects and pass extrinsic state as parameters.
    - Use a cache to avoid creating duplicate flyweight objects.
    - Clients work with flyweights through the factory.

Code Flow Explanation:

What This Example Does:
This example demonstrates how to use the Flyweight pattern for character rendering. Instead of creating separate style objects for each character, the pattern shares common styles (font, size, color) between multiple characters, significantly reducing memory usage.

Step-by-Step Code Flow:

1. CharacterStyle Class (CharacterStyle.java)
   - Purpose: Represents intrinsic state (shared properties)
   - Contains: Font, size, and color properties
   - Behavior: Immutable object that can be shared between characters
   - Represents: The flyweight object that stores common state

2. Character Class (Character.java)
   - Purpose: Combines intrinsic state (style) with extrinsic state (symbol, position)
   - Contains: Character symbol and reference to shared CharacterStyle
   - Methods: display() method that takes position as extrinsic state
   - Represents: The client object that uses the flyweight

3. CharacterFactory Class (CharacterFactory.java)
   - Purpose: Manages and reuses CharacterStyle flyweight objects
   - Contains: Static cache of created styles and factory methods
   - Behavior: getStyle() creates new styles or returns existing ones
   - Result: Ensures only unique styles are created and stored

4. Main Program (Main.java)
   - Demonstrates: Creating multiple characters with shared styles
   - Shows: How the factory reuses existing styles
   - Creates: 10 characters but only 2 unique styles
   - Result: Memory savings through style sharing

Real-World Example: Text Editor with Character Rendering

Imagine you're building a text editor that:
- Needs to render thousands of characters on screen
- Each character has properties like font, size, and color
- Many characters share the same styling properties
- Memory usage is critical for performance
- You want to avoid creating duplicate style objects

Without Flyweight Pattern:
Every character would have its own style object, using huge amounts of memory for thousands of characters!

With Flyweight Pattern:
Common styles are shared between characters, dramatically reducing memory usage while maintaining functionality!

Benefits:
- Memory Efficiency: Significantly reduces memory usage by sharing common state
- Performance: Fewer object creations and better cache utilization
- Scalability: Can handle large numbers of objects efficiently
- Consistency: Shared state ensures consistent appearance
- Maintainability: Centralized management of common properties

Use Cases:
- Text Editors: Sharing character styles and formatting
- Game Development: Sharing texture and material properties
- Graphics Applications: Sharing color palettes and brush styles
- Database Systems: Sharing connection properties
- Network Applications: Sharing protocol configurations

Drawbacks:
- Complexity: Adds complexity to object creation and management
- State Management: Need to carefully separate intrinsic and extrinsic state
- Thread Safety: Shared flyweights may need synchronization
- Debugging: Can make debugging more complex due to shared state
- Overhead: Factory and cache management adds some overhead

How to Execute the Code:
1. Navigate to the flyweight folder in terminal:
   cd structural/flyweight

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Flyweight Pattern Demo ===

Creating new style: Arial, 12, Black
Reusing existing style: Arial, 12, Black
Reusing existing style: Arial, 12, Black
Reusing existing style: Arial, 12, Black
Reusing existing style: Arial, 12, Black
Creating new style: Times, 14, Blue
Reusing existing style: Times, 14, Blue
Reusing existing style: Times, 14, Blue
Reusing existing style: Times, 14, Blue
Reusing existing style: Times, 14, Blue

Displaying characters:
Character 'H' at position (0, 0) with Font: Arial, Size: 12, Color: Black
Character 'e' at position (1, 0) with Font: Arial, Size: 12, Color: Black
Character 'l' at position (2, 0) with Font: Arial, Size: 12, Color: Black
Character 'l' at position (3, 0) with Font: Arial, Size: 12, Color: Black
Character 'o' at position (4, 0) with Font: Arial, Size: 12, Color: Black
Character 'W' at position (0, 1) with Font: Times, Size: 14, Color: Blue
Character 'o' at position (1, 1) with Font: Times, Size: 14, Color: Blue
Character 'r' at position (2, 1) with Font: Times, Size: 14, Color: Blue
Character 'l' at position (3, 1) with Font: Times, Size: 14, Color: Blue
Character 'd' at position (4, 1) with Font: Times, Size: 14, Color: Blue

Flyweight Benefits:
Total characters created: 10
Unique styles created: 2
Memory saved by sharing styles!

Style Cache Contents:
Key: Arial12Black -> Font: Arial, Size: 12, Color: Black
Key: Times14Blue -> Font: Times, Size: 14, Color: Blue

Key Takeaways:
1. State Separation: Separate intrinsic (shared) from extrinsic (unique) state
2. Object Sharing: Share common objects to reduce memory usage
3. Factory Management: Use factory to manage and cache flyweight objects
4. Memory Efficiency: Dramatically reduce memory usage for many similar objects
5. Performance: Better cache utilization and fewer object creations

Flyweight Pattern Structure:
- Flyweight Interface: Defines methods that use extrinsic state
- Concrete Flyweight: Implements the interface and stores intrinsic state
- Flyweight Factory: Manages and reuses flyweight objects
- Client: Uses flyweights and passes extrinsic state

Simple Analogy:
Think of it like a library:
- Book Content = Intrinsic state (shared between all copies)
- Book Copy = Extrinsic state (unique location, borrower, due date)
- Library = Factory (manages book copies)
- Reader = Client (uses book copy with specific context)
- Result = Many readers can use the same book content without duplicating it

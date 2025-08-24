Pattern Name: Composite
Pattern Category: Structural

Description:
    - The Composite pattern allows you to compose objects into tree structures to represent part-whole hierarchies.
    - It lets clients treat individual objects and compositions of objects uniformly.
    - Think of it like a file system - files and folders can be treated the same way, but folders can contain other files and folders.
    - It provides a way to work with complex tree structures using a simple, unified interface.

The key idea is:
    - "Compose objects into tree structures to represent part-whole hierarchies, treating individual objects and compositions uniformly."

The Problem:
    - You have a tree structure of objects (e.g., file system, organization chart, GUI components).
    - You want to treat individual objects and groups of objects the same way.
    - You need to perform operations on both individual objects and composite objects.
    - You want to avoid checking the type of object before performing operations.
    - You need a way to build complex structures from simple components.

The Solution:
    - Create a common interface that both individual objects and compositions implement.
    - Individual objects (leaves) implement the interface directly.
    - Composite objects (containers) implement the interface and hold collections of child objects.
    - Both types can be treated uniformly by client code.
    - Operations are performed recursively through the tree structure.

Code Flow Explanation:

What This Example Does:
This example demonstrates how to use the Composite pattern to represent a file system structure. Files (leaves) and Directories (composites) both implement the same interface, allowing them to be treated uniformly while building a hierarchical structure.

Step-by-Step Code Flow:

1. FileSystemItem Interface (FileSystemItem.java)
   - Purpose: Common interface for both individual files and directories
   - Contains: display(), getName(), and getSize() methods
   - Represents: The contract that all file system items must follow

2. File Class (File.java)
   - Purpose: Leaf component that represents individual files
   - Contains: File name, size, and direct implementation of interface methods
   - Behavior: display() shows file info, getSize() returns actual file size
   - Represents: Individual objects that cannot contain other objects

3. Directory Class (Directory.java)
   - Purpose: Composite component that can contain other file system items
   - Contains: Directory name and collection of child FileSystemItem objects
   - Methods: add(), remove() for managing children, recursive display() and getSize()
   - Behavior: display() shows directory info and recursively displays children

4. Main Program (Main.java)
   - Demonstrates: Building and displaying a file system tree structure
   - Shows: How to create files and directories and compose them
   - Creates: A hierarchical structure with root directory containing subdirectories
   - Result: Tree structure displayed with proper indentation and size calculations

Real-World Example: File System Management

Imagine you're building a file manager application that:
- Needs to represent files and folders in a tree structure
- Should calculate total size of directories (sum of all contained files)
- Wants to display the entire structure with proper hierarchy
- Needs to treat files and folders uniformly for operations
- Should allow easy addition/removal of items from folders

Without Composite Pattern:
You'd need separate code to handle files vs. folders, different display logic, and complex size calculations!

With Composite Pattern:
Files and folders implement the same interface, can be composed into any structure, and operations work uniformly!

Benefits:
- Uniform Treatment: Treat individual and composite objects the same way
- Simple Client Code: No need to check object types before operations
- Easy Structure Building: Compose complex structures from simple components
- Recursive Operations: Operations automatically work through the entire tree
- Extensibility: Easy to add new types of components

Use Cases:
- File Systems: Representing files and directories
- GUI Components: Building complex UI hierarchies
- Organization Charts: Representing company structures
- Menu Systems: Building nested menu structures
- Document Structures: Representing sections and subsections

Drawbacks:
- Type Safety: Can lose type safety when treating composites and leaves uniformly
- Performance: Operations may traverse entire tree structure
- Complexity: Can make the design more complex than necessary for simple cases
- Memory: Composite objects need to store collections of children

How to Execute the Code:
1. Navigate to the composite folder in terminal:
   cd structural/composite

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Composite Pattern Demo ===

File System Structure:
📁 Root (8704 bytes)
  📁 Documents (1536 bytes)
    📄 document.txt (1024 bytes)
    📄 readme.md (512 bytes)
  📁 Pictures (7168 bytes)
    📄 image.jpg (2048 bytes)
    📄 video.mp4 (5120 bytes)

Individual Component Details:
Root size: 8704 bytes
Documents size: 1536 bytes
Pictures size: 7168 bytes
File1 size: 1024 bytes

Key Takeaways:
1. Uniform Interface: Both leaves and composites implement the same interface
2. Tree Structure: Build complex hierarchies from simple components
3. Recursive Operations: Operations automatically work through the entire structure
4. Composition: Compose objects into any desired structure
5. Same Treatment: Client code treats all objects uniformly

Composite Pattern Structure:
- Component Interface: Common interface for all objects (FileSystemItem)
- Leaf: Individual objects that cannot have children (File)
- Composite: Objects that can contain other objects (Directory)
- Client: Uses the Component interface to work with the structure

Simple Analogy:
Think of it like a family tree:
- Person = Component (can be individual or parent)
- Individual = Leaf (no children)
- Parent = Composite (has children)
- Family Tree = Structure (composed of both types)
- Result = Can treat everyone the same way while building complex relationships

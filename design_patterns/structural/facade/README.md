Pattern Name: Facade
Pattern Category: Structural

Description:
    - The Facade pattern provides a simplified interface to a complex subsystem, making it easier to use.
    - It hides the complexity of the subsystem and provides a single entry point for client code.
    - Think of it like a receptionist at a hotel - you don't need to know about housekeeping, maintenance, or room service details.
    - It promotes loose coupling between the client and the subsystem components.

The key idea is:
    - "Provide a simple interface to a complex subsystem, hiding its complexity from clients."

The Problem:
    - You have a complex subsystem with many classes and dependencies.
    - Client code needs to interact with multiple subsystem components.
    - The subsystem is difficult to use and understand.
    - You want to reduce coupling between client code and subsystem.
    - You need to provide a simple interface for common operations.

The Solution:
    - Create a Facade class that provides a simplified interface to the subsystem.
    - The Facade knows how to work with all the subsystem components.
    - Clients only interact with the Facade, not the complex subsystem directly.
    - The Facade handles the complexity and coordinates between subsystem components.

Code Flow Explanation:

What This Example Does:
This example demonstrates how to use the Facade pattern to simplify computer operations. Instead of dealing with complex CPU, Memory, and HardDrive operations separately, the Facade provides simple methods like startComputer(), shutdownComputer(), and loadProgram().

Step-by-Step Code Flow:

1. Subsystem Components (CPU.java, Memory.java, HardDrive.java)
   - Purpose: Complex classes that handle specific computer operations
   - CPU: Handles freezing, jumping, and executing instructions
   - Memory: Manages loading, clearing, and verifying data
   - HardDrive: Handles reading, writing, and seeking operations
   - Each Component: Has its own complex logic and methods

2. ComputerFacade Class (ComputerFacade.java)
   - Purpose: Provides a simplified interface to the complex subsystem
   - Contains: References to all subsystem components (CPU, Memory, HardDrive)
   - Methods: startComputer(), shutdownComputer(), restartComputer(), etc.
   - Coordinates: Multiple subsystem operations into simple method calls

3. Main Program (Main.java)
   - Demonstrates: How clients use the simplified Facade interface
   - Shows: Complex operations reduced to simple one-line method calls
   - Creates: A ComputerFacade instance and calls its methods
   - Result: Clean, simple code that hides subsystem complexity

Real-World Example: Computer System Interface

Imagine you're building a computer management application that:
- Needs to start up computers (involves CPU, Memory, HardDrive coordination)
- Must load programs (requires HardDrive reading and Memory loading)
- Should backup data (involves HardDrive writing and Memory verification)
- Wants to restart computers (requires shutdown then startup sequence)
- Avoids exposing complex subsystem details to users

Without Facade Pattern:
Users would need to know about CPU.freeze(), Memory.load(), HardDrive.read(), etc., and coordinate them manually!

With Facade Pattern:
Users just call computer.startComputer() and the Facade handles all the complexity internally!

Benefits:
- Simplicity: Provides a simple interface to complex subsystems
- Loose Coupling: Reduces dependency between client and subsystem
- Encapsulation: Hides subsystem complexity from clients
- Single Responsibility: Facade handles subsystem coordination
- Easy Maintenance: Changes to subsystem don't affect client code

Use Cases:
- Computer Systems: Simplifying hardware operations
- Database Access: Providing simple CRUD operations
- File Systems: Simplifying file operations
- Network APIs: Providing simple interfaces to complex protocols
- Game Engines: Simplifying graphics, audio, and input systems

Drawbacks:
- God Object: Facade can become too large if it handles too many responsibilities
- Tight Coupling: Facade becomes tightly coupled to the subsystem
- Hidden Complexity: May hide important subsystem details from clients
- Testing: Harder to test individual subsystem components in isolation

How to Execute the Code:
1. Navigate to the facade folder in terminal:
   cd structural/facade

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Facade Pattern Demo ===

1. Starting Computer:
=== Starting Computer ===
CPU: Freezing...
HardDrive: Reading 1024 bytes from LBA 0
Memory: Loading data at position 0 with 1024 bytes
CPU: Jumping to position 0
CPU: Executing instructions...
Computer started successfully!

2. Loading Program:
=== Loading Program ===
HardDrive: Seeking to LBA 1000
HardDrive: Reading 20 bytes from LBA 1000
Memory: Loading data at position 1000 with 20 bytes
Memory: Verifying data at position 1000
Program loaded successfully!

3. Backing Up Data:
=== Backing Up Data ===
HardDrive: Seeking to LBA 2000
HardDrive: Writing 13 bytes to LBA 2000
Memory: Verifying data at position 2000
Data backup completed!

4. Restarting Computer:
=== Restarting Computer ===
=== Shutting Down Computer ===
Memory: Clearing all data
CPU: Freezing...
Computer shut down successfully!
=== Starting Computer ===
CPU: Freezing...
HardDrive: Reading 1024 bytes from LBA 0
Memory: Loading data at position 0 with 1024 bytes
CPU: Jumping to position 0
CPU: Executing instructions...
Computer started successfully!

5. Shutting Down Computer:
=== Shutting Down Computer ===
Memory: Clearing all data
CPU: Freezing...
Computer shut down successfully!


Key Takeaways:
1. Simplified Interface: Complex operations become simple method calls
2. Subsystem Encapsulation: Hide complexity from client code
3. Single Entry Point: One class handles all subsystem interactions
4. Loose Coupling: Clients don't depend on subsystem details
5. Coordination: Facade coordinates multiple subsystem operations

Facade Pattern Structure:
- Subsystem Classes: Complex classes with specific responsibilities (CPU, Memory, HardDrive)
- Facade Class: Provides simplified interface and coordinates subsystem operations
- Client: Uses the Facade instead of interacting with subsystem directly

Simple Analogy:
Think of it like a restaurant:
- Kitchen Staff = Subsystem (Chef, Sous Chef, Dishwasher)
- Waiter = Facade (takes your order, coordinates with kitchen)
- Customer = Client (just tells waiter what they want)
- Result = Customer gets food without knowing kitchen complexity

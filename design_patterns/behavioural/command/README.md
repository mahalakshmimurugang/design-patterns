Pattern Name: Command
Pattern Category: Behavioral

Description:
    - The Command pattern encapsulates a request as an object, allowing you to parameterize clients with different requests.
    - It decouples the object that invokes the operation from the object that knows how to perform it.
    - Think of it like a remote control - you press a button and it executes a command without knowing what the command does.
    - It allows you to queue operations, log them, and support undoable operations.

The key idea is:
    - "Encapsulate a request as an object, allowing you to parameterize clients with different requests and support undoable operations."

The Problem:
    - You need to decouple the object that invokes an operation from the object that performs it.
    - You want to parameterize objects with operations.
    - You need to queue operations, log them, or support undoable operations.
    - You want to support macro operations (combining multiple commands).
    - You need to support operations that can be executed at different times.

The Solution:
    - Create a Command interface with execute() and undo() methods.
    - Encapsulate each request in a concrete Command object.
    - The invoker calls execute() on the command object.
    - The receiver performs the actual work.
    - Commands can be stored, queued, and undone.

Code Flow Explanation:

What This Example Does:
This example demonstrates a smart home lighting system using the Command pattern. A remote control can turn lights on/off in different rooms, and supports undo operations.

Step-by-Step Code Flow:

1. Command Interface (Command.java)
   - Purpose: Defines the contract for all command objects
   - Methods: execute() and undo()
   - Represents: The command abstraction

2. Light Class (Light.java)
   - Purpose: Receiver that performs the actual work
   - Methods: turnOn() and turnOff()
   - Represents: The device being controlled

3. Concrete Commands (LightOnCommand.java, LightOffCommand.java)
   - Purpose: Encapsulate specific requests
   - Each Command: Holds reference to receiver and implements execute/undo
   - Represents: Specific actions that can be performed

4. RemoteControl Class (RemoteControl.java)
   - Purpose: Invoker that triggers commands
   - Behavior: Stores commands and calls execute() when buttons are pressed
   - Represents: The client that uses commands

5. NoCommand Class (NoCommand.java)
   - Purpose: Null object pattern for unused slots
   - Behavior: Does nothing when executed
   - Represents: Default behavior for empty slots

Real-World Example: Smart Home Control System

Imagine you're building a smart home system that:
- Controls multiple devices (lights, fans, appliances)
- Supports remote control from mobile apps
- Allows scheduling of operations
- Supports undo/redo functionality
- Can create macros (turn off all lights at once)

Without Command Pattern:
You'd have tightly coupled code, difficult to extend, and no support for undo operations!

With Command Pattern:
You can easily add new devices, support undo, and create complex automation sequences!

Benefits:
- Decoupling: Invoker doesn't know how commands are implemented
- Extensibility: Easy to add new commands without changing existing code
- Undo Support: Commands can be undone
- Queuing: Commands can be stored and executed later
- Macro Support: Multiple commands can be combined

Use Cases:
- GUI Buttons: Each button executes a command
- Undo/Redo: Commands can be undone and redone
- Macro Recording: Recording and replaying sequences
- Remote Control: Controlling devices remotely
- Job Queues: Queuing operations for later execution

Drawbacks:
- Command Objects: Can create many small objects
- Complexity: May be overkill for simple operations
- Memory Usage: Commands need to store state for undo
- Learning Curve: Understanding the pattern structure

How to Execute the Code:
1. Navigate to the command folder in terminal:
   cd behavioural/command

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Command Pattern Demo ===

Living Room light is ON
Kitchen light is ON
Living Room light is OFF
Living Room light is ON

Key Takeaways:
1. Command Encapsulation: Each request is encapsulated in a command object
2. Decoupling: Invoker doesn't know about receivers
3. Undo Support: Commands can be undone
4. Extensibility: Easy to add new commands
5. Parameterization: Commands can be stored and executed later

Command Pattern Structure:
- Command Interface: Defines execute() and undo() methods
- Concrete Commands: Implement specific operations
- Receiver: Knows how to perform operations
- Invoker: Triggers command execution
- Client: Creates and configures commands

Simple Analogy:
Think of it like ordering food at a restaurant:
- Menu Item = Command (what you want to order)
- Waiter = Invoker (takes your order)
- Kitchen = Receiver (prepares the food)
- Order Slip = Command object (encapsulates the request)
- Result = Food is prepared without waiter knowing how to cook

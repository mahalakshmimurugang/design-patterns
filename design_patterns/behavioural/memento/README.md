Pattern Name: Memento
Pattern Category: Behavioral

Description:
    - The Memento pattern captures and externalizes an object's internal state so that the object can be restored to this state later.
    - It provides the ability to restore an object to its previous state without violating encapsulation.
    - Think of it like a save game feature - you can save your progress and return to it later.
    - It's useful for implementing undo/redo functionality and state restoration.

The key idea is:
    - "Capture and externalize an object's internal state so that the object can be restored to this state later."

The Problem:
    - You need to save and restore an object's state.
    - You want to implement undo/redo functionality.
    - You need to capture object state without violating encapsulation.
    - You want to restore objects to previous states.
    - You need to maintain a history of object states.

The Solution:
    - Create a Memento class that stores the object's state.
    - The Originator creates mementos and can restore from them.
    - A CareTaker manages the collection of mementos.
    - The Originator's state is saved to and restored from mementos.
    - Encapsulation is maintained as the memento doesn't expose internal structure.

Code Flow Explanation:

What This Example Does:
This example demonstrates a simple state management system where an object can save its state to mementos and restore from them, showing how to implement undo/redo functionality.

Step-by-Step Code Flow:

1. Memento Class (Memento.java)
   - Purpose: Stores the state of the originator
   - Contains: The state data
   - Behavior: Provides access to stored state
   - Represents: A snapshot of object state

2. Originator Class (Originator.java)
   - Purpose: The object whose state needs to be saved/restored
   - Methods: setState(), saveStateToMemento(), getStateFromMemento()
   - Behavior: Creates mementos and restores from them
   - Represents: The object being managed

3. CareTaker Class (CareTaker.java)
   - Purpose: Manages the collection of mementos
   - Methods: add(), get(), getMementoCount()
   - Behavior: Stores and retrieves mementos
   - Represents: The history manager

Real-World Example: Text Editor with Undo/Redo

Imagine you're building a text editor that:
- Allows users to type and edit text
- Supports undo/redo operations
- Can save and restore document states
- Maintains a history of changes
- Should be efficient with memory usage

Without Memento Pattern:
You'd need complex state tracking, potential encapsulation violations, and difficult undo/redo implementation!

With Memento Pattern:
You can cleanly save and restore object states while maintaining encapsulation!

Benefits:
- Encapsulation: Object's internal structure is not exposed
- State Restoration: Easy to restore objects to previous states
- Undo/Redo: Simple implementation of undo/redo functionality
- History Management: Can maintain a history of object states
- Clean Separation: State management is separated from business logic

Use Cases:
- Text Editors: Undo/redo functionality
- Games: Save/load game states
- Drawing Applications: Step-by-step undo
- Database Systems: Transaction rollback
- Configuration Management: Restoring previous settings

Drawbacks:
- Memory Usage: Can consume significant memory with many states
- Performance: Creating and restoring mementos adds overhead
- Complexity: Can become complex with large state objects
- State Synchronization: Need to ensure memento consistency

How to Execute the Code:
1. Navigate to the memento folder in terminal:
   cd behavioural/memento

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Memento Pattern Demo ===

State set to: State #1
State set to: State #2
State set to: State #3
Current State: State #3
State restored to: State #1
State restored to: State #2

Key Takeaways:
1. State Encapsulation: Object state is captured without exposing internals
2. Memento Creation: Originator creates mementos of its state
3. State Restoration: Originator can restore from mementos
4. History Management: CareTaker manages the collection of mementos
5. Clean Architecture: State management is separated from business logic

Memento Pattern Structure:
- Memento: Stores the originator's state
- Originator: Creates and restores mementos
- CareTaker: Manages the memento collection
- Client: Uses the system

Simple Analogy:
Think of it like a camera system:
- Camera = Originator (the object being photographed)
- Photo = Memento (captures the state at a moment)
- Photo Album = CareTaker (stores all the photos)
- Taking Photo = saveStateToMemento()
- Looking at Photo = getStateFromMemento()
- Result = You can see how things looked at any point in time

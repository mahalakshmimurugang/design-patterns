Pattern Name: State
Pattern Category: Behavioral

Description:
    - The State pattern allows an object to alter its behavior when its internal state changes.
    - It appears as if the object changed its class, but the change is handled by state objects.
    - Think of it like a traffic light - it behaves differently (red, yellow, green) based on its current state.
    - It's useful for objects that have multiple states and different behaviors in each state.

The key idea is:
    - "Allow an object to alter its behavior when its internal state changes, appearing as if the object changed its class."

The Problem:
    - You have an object that behaves differently based on its state.
    - You want to avoid large conditional statements based on state.
    - You need to add new states without changing existing code.
    - You want to encapsulate state-specific behavior.
    - You need to manage state transitions cleanly.

The Solution:
    - Create a State interface that defines state-specific behavior.
    - Implement concrete state classes for each state.
    - Create a Context class that maintains the current state.
    - State objects handle their own behavior and state transitions.
    - The context delegates behavior to the current state object.

Code Flow Explanation:

What This Example Does:
This example demonstrates a simple player state system where a player can be in different states (start, stop) and behaves differently in each state.

Step-by-Step Code Flow:

1. State Interface (State.java)
   - Purpose: Defines the contract for all states
   - Method: doAction() performs state-specific behavior
   - Represents: The state abstraction

2. Context Class (Context.java)
   - Purpose: Maintains reference to current state
   - Methods: setState(), getState(), doAction()
   - Behavior: Delegates actions to current state
   - Represents: The object whose behavior changes

3. StartState Class (StartState.java)
   - Purpose: Concrete implementation of start state
   - Behavior: Handles start state actions
   - Represents: One possible state of the context

4. StopState Class (StopState.java)
   - Purpose: Concrete implementation of stop state
   - Behavior: Handles stop state actions
   - Represents: Another possible state of the context

Real-World Example: Video Player State Management

Imagine you're building a video player that:
- Has multiple states (playing, paused, stopped, loading)
- Behaves differently in each state (play button works only when stopped)
- Needs to handle state transitions (play → pause → stop)
- Should be extensible for new states
- Must maintain clean, maintainable code

Without State Pattern:
You'd have complex if-else statements, difficult state management, and hard-to-maintain code!

With State Pattern:
Each state is cleanly encapsulated, state transitions are simple, and adding new states is easy!

Benefits:
- Clean State Management: Each state is encapsulated in its own class
- Easy State Transitions: State changes are handled by state objects
- Extensibility: New states can be added without changing existing code
- Eliminates Conditionals: No large if-else statements based on state
- Single Responsibility: Each state class handles one state's behavior

Use Cases:
- Game Development: Player states, game states
- Workflow Systems: Process states, approval states
- UI Components: Button states, form states
- Network Protocols: Connection states, protocol states
- Business Logic: Order states, user states

Drawbacks:
- Object Proliferation: Can create many state objects
- State Transition Logic: State transitions may be scattered
- Memory Usage: Each state is a separate object
- Learning Curve: Understanding state relationships

How to Execute the Code:
1. Navigate to the state folder in terminal:
   cd behavioural/state

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== State Pattern Demo ===

Player is in start state
Current state: Start State
Player is in stop state
Current state: Stop State

Key Takeaways:
1. State Encapsulation: Each state is encapsulated in its own class
2. Behavior Delegation: Context delegates behavior to current state
3. State Transitions: States can change the context's state
4. Clean Architecture: State logic is separated from context logic
5. Easy Extension: New states can be added without changing existing code

State Pattern Structure:
- State Interface: Defines state-specific behavior
- Concrete States: Implement specific state behavior
- Context: Maintains current state and delegates actions
- Client: Uses the context

Simple Analogy:
Think of it like a vending machine:
- Vending Machine = Context (the object that changes behavior)
- States = Different modes (idle, selecting, dispensing, out of stock)
- Buttons = Actions that work differently in each state
- State Transitions = Moving between different modes
- Result = Same machine behaves differently based on its current state

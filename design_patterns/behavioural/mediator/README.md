Pattern Name: Mediator
Pattern Category: Behavioral

Description:
    - The Mediator pattern defines an object that encapsulates how a set of objects interact.
    - It promotes loose coupling by keeping objects from referring to each other explicitly.
    - Think of it like an air traffic controller - planes don't talk directly to each other, they communicate through the controller.
    - It centralizes complex communications and control logic between objects.

The key idea is:
    - "Define an object that encapsulates how a set of objects interact, promoting loose coupling."

The Problem:
    - You have a set of objects that need to communicate with each other.
    - Direct communication creates tight coupling between objects.
    - The communication logic becomes complex and hard to maintain.
    - You want to change how objects interact without changing the objects themselves.
    - You need to centralize communication control.

The Solution:
    - Create a Mediator interface that defines communication methods.
    - Implement a concrete Mediator that manages object interactions.
    - Objects communicate through the mediator instead of directly.
    - The mediator knows about all objects and routes messages appropriately.
    - Objects only know about the mediator, not each other.

Code Flow Explanation:

What This Example Does:
This example demonstrates a chat room system where users communicate through a mediator, showing how objects can interact without direct coupling.

Step-by-Step Code Flow:

1. ChatMediator Interface (ChatMediator.java)
   - Purpose: Defines the contract for mediators
   - Methods: sendMessage() and addUser()
   - Represents: The mediator abstraction

2. User Abstract Class (User.java)
   - Purpose: Abstract base for all users
   - Contains: Reference to mediator and name
   - Methods: Abstract send() and receive()
   - Represents: Colleagues that need to communicate

3. ChatUser Class (ChatUser.java)
   - Purpose: Concrete user implementation
   - Behavior: Sends messages through mediator, receives messages from mediator
   - Represents: Actual chat participants

4. ChatMediatorImpl Class (ChatMediatorImpl.java)
   - Purpose: Concrete mediator implementation
   - Behavior: Manages user list and routes messages
   - Contains: List of all users
   - Represents: The central communication hub

Real-World Example: Chat Room System

Imagine you're building a chat application that:
- Has multiple users who need to communicate
- Supports different types of messages (text, files, notifications)
- Needs to handle user authentication and permissions
- Should support private and group conversations
- Must be scalable and maintainable

Without Mediator Pattern:
You'd have complex direct connections between users, tight coupling, and difficult message routing!

With Mediator Pattern:
Users communicate cleanly through a central mediator, making the system easy to extend and maintain!

Benefits:
- Loose Coupling: Objects don't know about each other directly
- Centralized Control: All communication logic is in one place
- Easy Maintenance: Communication changes only affect the mediator
- Reusability: Objects can be reused in different contexts
- Simplified Communication: Complex interactions become simple

Use Cases:
- Chat Applications: Managing user communications
- Air Traffic Control: Coordinating aircraft movements
- GUI Components: Managing widget interactions
- Workflow Systems: Coordinating process steps
- Event Systems: Managing event routing

Drawbacks:
- Centralization: Mediator can become a bottleneck
- Complexity: Mediator can become complex with many objects
- Single Point of Failure: If mediator fails, communication stops
- Performance: Mediator adds overhead to communication

How to Execute the Code:
1. Navigate to the mediator folder in terminal:
   cd behavioural/mediator

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Mediator Pattern Demo ===

John sends: Hello everyone!
Jane receives: Hello everyone!
Bob receives: Hello everyone!
Jane sends: Hi John!
John receives: Hi John!
Bob receives: Hi John!
Bob sends: Good morning team!
John receives: Good morning team!
Jane receives: Good morning team!

Key Takeaways:
1. Centralized Communication: All interactions go through the mediator
2. Loose Coupling: Objects don't reference each other directly
3. Single Responsibility: Mediator handles all communication logic
4. Easy Extension: New communication rules only affect mediator
5. Clean Architecture: Communication logic is separated from business logic

Mediator Pattern Structure:
- Mediator Interface: Defines communication methods
- Concrete Mediator: Implements communication logic
- Colleague Interface: Defines object communication methods
- Concrete Colleagues: Objects that need to communicate
- Client: Creates and configures the system

Simple Analogy:
Think of it like a conference call system:
- Conference Call = Mediator (manages all communications)
- Participants = Colleagues (users who need to talk)
- Phone Lines = Communication channels
- Conference Operator = Mediator implementation
- Result = Everyone can talk without knowing each other's phone numbers

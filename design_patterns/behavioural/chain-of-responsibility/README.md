Pattern Name: Chain of Responsibility
Pattern Category: Behavioral

Description:
    - The Chain of Responsibility pattern allows you to pass requests along a chain of handlers until one of them handles the request.
    - It creates a chain of receiver objects for a request, with each receiver either handling the request or passing it to the next receiver.
    - Think of it like a customer service system - your call gets passed from one department to another until someone can help you.
    - It decouples the sender from the receiver and allows multiple objects to handle the request.

The key idea is:
    - "Pass requests along a chain of handlers until one of them handles the request, avoiding coupling between sender and receiver."

The Problem:
    - You have multiple objects that can handle a request, but you don't know which one should handle it.
    - You want to avoid coupling the sender to specific receivers.
    - You need to dynamically determine which object should handle a request.
    - You want to allow multiple objects to have a chance to handle the request.
    - You need to process requests in a specific order or priority.

The Solution:
    - Create a chain of handler objects, each with a reference to the next handler.
    - Each handler decides whether it can handle the request or pass it to the next handler.
    - The request travels along the chain until it's handled or reaches the end.
    - Handlers can be added, removed, or reordered dynamically.
    - The sender only needs to know about the first handler in the chain.

Code Flow Explanation:

What This Example Does:
This example demonstrates how to use the Chain of Responsibility pattern for a technical support system. Support requests are passed through different levels of support staff (Level 1, Level 2, Level 3) based on their priority, with each level deciding whether it can handle the request or pass it along.

Step-by-Step Code Flow:

1. SupportRequest Class (SupportRequest.java)
   - Purpose: Represents the request object that travels through the chain
   - Contains: Description, issue details, and priority level
   - Represents: The data that needs to be processed by handlers

2. SupportHandler Abstract Class (SupportHandler.java)
   - Purpose: Abstract base class for all handlers in the chain
   - Contains: Reference to next handler and abstract canHandle method
   - Behavior: handle() method processes request or passes to next handler
   - Represents: The contract that all handlers must follow

3. Concrete Handler Classes (Level1Support.java, Level2Support.java, Level3Support.java)
   - Purpose: Specific implementations of handlers with different capabilities
   - Each Handler: Implements canHandle() based on priority ranges
   - Level 1: Handles basic issues (priority 1-3)
   - Level 2: Handles intermediate issues (priority 4-6)
   - Level 3: Handles advanced issues (priority 7-9)

4. Main Program (Main.java)
   - Demonstrates: Building and using the chain of handlers
   - Shows: How requests flow through different support levels
   - Creates: Various support requests with different priorities
   - Result: Requests are handled by appropriate support levels

Real-World Example: Technical Support System

Imagine you're building a technical support system that:
- Has multiple levels of support staff with different expertise
- Needs to route support tickets based on complexity and priority
- Should automatically escalate issues that can't be resolved
- Wants to avoid hardcoding which support level handles which issues
- Needs to be flexible for adding new support levels

Without Chain of Responsibility Pattern:
You'd need complex routing logic, if-else statements, and tight coupling between request types and handlers!

With Chain of Responsibility Pattern:
Requests automatically flow through the chain until the right handler processes them!

Benefits:
- Loose Coupling: Sender doesn't need to know which handler will process the request
- Flexibility: Easy to add, remove, or reorder handlers
- Single Responsibility: Each handler focuses on its specific capability
- Dynamic Chain: Chain can be modified at runtime
- Avoids Coupling: No need to specify the exact handler for each request

Use Cases:
- Technical Support: Routing support tickets to appropriate staff
- Logging Systems: Different loggers for different message types
- Event Handling: Processing events through multiple handlers
- Middleware: Processing requests through multiple layers
- Exception Handling: Different exception handlers for different error types

Drawbacks:
- Chain Management: Need to ensure the chain is properly set up
- Performance: Request may travel through entire chain before being handled
- Debugging: Can be harder to trace request flow through the chain
- Chain Order: Order of handlers in the chain matters
- Infinite Loops: Risk of circular references in the chain

How to Execute the Code:
1. Navigate to the chain-of-responsibility folder in terminal:
   cd behavioural/chain-of-responsibility

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Chain of Responsibility Pattern Demo ===

Processing request: Password Reset
Level 1 Support is handling: Password Reset
Priority: 1, Issue: User forgot password
Request resolved by Level 1 Support

Processing request: Software Installation
Level 1 Support cannot handle this request. Passing to next handler...
Level 2 Support is handling: Software Installation
Priority: 5, Issue: Office software not installing
Request resolved by Level 2 Support

Processing request: Server Down
Level 1 Support cannot handle this request. Passing to next handler...
Level 2 Support cannot handle this request. Passing to next handler...
Level 3 Support is handling: Server Down
Priority: 9, Issue: Production server crashed
Request resolved by Level 3 Support

Processing request: Email Setup
Level 1 Support is handling: Email Setup
Priority: 2, Issue: Outlook configuration
Request resolved by Level 1 Support

Processing request: Database Error
Level 1 Support cannot handle this request. Passing to next handler...
Level 2 Support cannot handle this request. Passing to next handler...
Level 3 Support cannot handle this request. Passing to next handler...
No handler can process this request: Database Error
Request will be escalated to management.

Key Takeaways:
1. Chain Setup: Create handlers and link them in sequence
2. Request Flow: Requests travel through chain until handled
3. Handler Decision: Each handler decides if it can process the request
4. Loose Coupling: Sender doesn't know which handler will process
5. Dynamic Chain: Chain can be modified at runtime

Chain of Responsibility Pattern Structure:
- Handler Interface: Abstract class defining the chain structure
- Concrete Handlers: Specific implementations with different capabilities
- Request Object: Data that travels through the chain
- Client: Initiates requests without knowing the chain structure

Simple Analogy:
Think of it like a restaurant service chain:
- Customer Request = Support request (what needs to be done)
- Waiter = Level 1 Support (basic requests)
- Chef = Level 2 Support (intermediate requests)
- Manager = Level 3 Support (complex requests)
- Chain = Waiter -> Chef -> Manager
- Result = Request gets handled by the right person automatically

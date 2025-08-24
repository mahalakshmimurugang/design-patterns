Pattern Name: Observer
Pattern Category: Behavioral

Description:
    - The Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
    - It establishes a loose coupling between the subject and observers.
    - Think of it like a newspaper subscription - when news is published, all subscribers automatically receive it.
    - It's useful for implementing event handling systems and maintaining consistency between related objects.

The key idea is:
    - "Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically."

The Problem:
    - You have objects that need to be notified when another object changes.
    - You want to maintain consistency between related objects.
    - You need to implement event handling systems.
    - You want to avoid tight coupling between objects.
    - You need to support multiple observers for a single subject.

The Solution:
    - Create a Subject interface that manages observers.
    - Create an Observer interface that defines the update method.
    - Subjects register and notify observers when state changes.
    - Observers implement the update method to respond to changes.
    - The subject doesn't need to know about specific observer implementations.

Code Flow Explanation:

What This Example Does:
This example demonstrates a news agency system where multiple news channels (observers) automatically receive updates when the news agency (subject) publishes new news.

Step-by-Step Code Flow:

1. Subject Interface (Subject.java)
   - Purpose: Defines the contract for subjects
   - Methods: registerObserver(), removeObserver(), notifyObservers()
   - Represents: The object being observed

2. Observer Interface (Observer.java)
   - Purpose: Defines the contract for observers
   - Method: update() receives notifications
   - Represents: Objects that need to be notified

3. NewsAgency Class (NewsAgency.java)
   - Purpose: Concrete subject implementation
   - Behavior: Manages observer list and notifies them
   - Contains: List of observers and news data
   - Represents: The news source

4. NewsChannel Class (NewsChannel.java)
   - Purpose: Concrete observer implementation
   - Behavior: Receives and displays news updates
   - Contains: Channel name
   - Represents: News consumers

Real-World Example: News Broadcasting System

Imagine you're building a news application that:
- Has a central news source that publishes stories
- Supports multiple news channels and subscribers
- Automatically notifies all subscribers of new content
- Allows dynamic subscription/unsubscription
- Should be scalable and maintainable

Without Observer Pattern:
You'd have tight coupling, manual notification systems, and difficulty managing multiple subscribers!

With Observer Pattern:
News automatically flows to all subscribers, maintaining loose coupling and easy extensibility!

Benefits:
- Loose Coupling: Subject and observers are loosely coupled
- Automatic Updates: Observers are automatically notified of changes
- Dynamic Relationships: Observers can be added/removed at runtime
- Broadcast Communication: One change can notify many observers
- Extensibility: Easy to add new observers without changing subjects

Use Cases:
- Event Handling: GUI events, system events
- Model-View: Separating data from presentation
- Publish-Subscribe: News, social media feeds
- Configuration Changes: Notifying components of config updates
- Sensor Systems: Monitoring and alerting systems

Drawbacks:
- Memory Leaks: Observers must be properly removed
- Performance: Notifying many observers can be slow
- Order Dependency: Observer notification order may matter
- Unexpected Updates: Observers may receive unexpected notifications

How to Execute the Code:
1. Navigate to the observer folder in terminal:
   cd behavioural/observer

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Observer Pattern Demo ===

CNN received news: Breaking: New technology breakthrough!
BBC received news: Breaking: New technology breakthrough!
Fox News received news: Breaking: New technology breakthrough!
CNN received news: Update: Weather forecast for tomorrow
BBC received news: Update: Weather forecast for tomorrow
Fox News received news: Update: Weather forecast for tomorrow

Key Takeaways:
1. Loose Coupling: Subject and observers don't know each other's details
2. Automatic Notification: Observers are automatically updated
3. Dynamic Registration: Observers can be added/removed at runtime
4. Broadcast Communication: One change notifies all observers
5. Event-Driven Architecture: Supports event-based programming

Observer Pattern Structure:
- Subject Interface: Defines observer management methods
- Concrete Subject: Implements observer management
- Observer Interface: Defines update method
- Concrete Observers: Implement update behavior
- Client: Creates and configures the system

Simple Analogy:
Think of it like a social media platform:
- Social Media Platform = Subject (publishes content)
- Users = Observers (subscribe to content)
- Posts = State changes (trigger notifications)
- News Feed = Update method (receives notifications)
- Result = All followers automatically see new posts

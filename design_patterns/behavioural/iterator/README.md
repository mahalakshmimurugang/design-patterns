Pattern Name: Iterator
Pattern Category: Behavioral

Description:
    - The Iterator pattern provides a way to access elements of a collection without exposing its underlying representation.
    - It decouples the collection from the iteration logic, allowing different iteration strategies.
    - Think of it like a TV remote control that lets you navigate through channels without knowing how they're stored.
    - It provides a uniform interface for traversing different types of collections.

The key idea is:
    - "Provide a way to access elements of a collection sequentially without exposing its underlying representation."

The Problem:
    - You need to access elements of a collection without knowing its internal structure.
    - You want to support multiple traversal methods for the same collection.
    - You need to provide a uniform interface for different collection types.
    - You want to decouple collection logic from iteration logic.
    - You need to support concurrent iteration.

The Solution:
    - Create an Iterator interface with hasNext(), next(), and remove() methods.
    - Implement concrete iterators for specific collections.
    - Create a Container interface that provides an iterator.
    - Collections implement the Container interface.
    - Clients use iterators to traverse collections.

Code Flow Explanation:

What This Example Does:
This example demonstrates a simple name repository that can be iterated through using the Iterator pattern, showing how to access collection elements without exposing the internal array structure.

Step-by-Step Code Flow:

1. Iterator Interface (Iterator.java)
   - Purpose: Defines the contract for all iterators
   - Methods: hasNext(), next(), remove()
   - Represents: The iteration abstraction

2. Container Interface (Container.java)
   - Purpose: Defines the contract for collections
   - Method: getIterator() returns an iterator
   - Represents: The collection abstraction

3. NameRepository Class (NameRepository.java)
   - Purpose: Concrete collection implementation
   - Behavior: Stores names and provides an iterator
   - Contains: Private NameIterator inner class
   - Represents: The actual collection

4. NameIterator Inner Class
   - Purpose: Concrete iterator implementation
   - Behavior: Iterates through the names array
   - State: Maintains current position (index)
   - Represents: The iteration logic

Real-World Example: Database Result Set Iterator

Imagine you're building a database application that:
- Returns large result sets from queries
- Needs to process results one at a time
- Should support different iteration strategies
- Must handle memory efficiently
- Should provide a clean API for clients

Without Iterator Pattern:
You'd expose internal data structures, have tight coupling, and difficulty supporting different traversal methods!

With Iterator Pattern:
You can iterate through collections cleanly, support multiple iteration strategies, and maintain loose coupling!

Benefits:
- Encapsulation: Collection internals are hidden
- Multiple Iteration: Same collection can have different iterators
- Uniform Interface: Consistent way to traverse different collections
- Loose Coupling: Collection and iteration logic are separate
- Concurrent Access: Multiple iterators can work simultaneously

Use Cases:
- Collections: Iterating through lists, sets, maps
- Database Results: Processing query results
- File Systems: Traversing directory structures
- Network Data: Processing streaming data
- Custom Data Structures: Iterating through custom collections

Drawbacks:
- Performance: Iterator objects add overhead
- Complexity: Additional abstraction layer
- Memory: Iterator objects consume memory
- Learning Curve: Understanding iterator lifecycle

How to Execute the Code:
1. Navigate to the iterator folder in terminal:
   cd behavioural/iterator

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Iterator Pattern Demo ===

Names in repository:
Name: Robert
Name: John
Name: Julie
Name: Lora

Key Takeaways:
1. Collection Encapsulation: Internal structure is hidden from clients
2. Iterator Interface: Uniform way to traverse collections
3. Separation of Concerns: Collection and iteration logic are separate
4. Multiple Iterators: Same collection can have multiple iterators
5. Clean API: Simple interface for collection traversal

Iterator Pattern Structure:
- Iterator Interface: Defines iteration methods
- Concrete Iterator: Implements iteration logic
- Container Interface: Defines collection contract
- Concrete Container: Implements collection
- Client: Uses iterator to traverse collection

Simple Analogy:
Think of it like a library catalog system:
- Book Collection = Container (the actual books)
- Catalog Card = Iterator (how to find books)
- Library Staff = Container implementation (manages books)
- Patron = Client (wants to browse books)
- Result = Easy access to books without knowing storage details

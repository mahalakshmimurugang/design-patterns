Pattern Name: Prototype
Pattern Category: Creational

Description:
    - The Prototype pattern is like making a photocopy of a document.
    - Instead of writing a new document from scratch, you copy an existing one and change what you need.
    - It's useful when creating new objects is expensive or when you want to avoid complex object creation.
    - The copied object is completely independent of the original.

The key idea is:
    - "Copy an existing object instead of creating a new one from scratch."

The Problem:
    - Creating new objects takes time and resources
    - You have an object that's almost what you need, just needs small changes
    - You want to avoid writing the same code multiple times
    - Need to create objects that are similar to existing ones

The Solution:
    - Implement the Cloneable interface in your class
    - Override the clone() method to provide proper cloning behavior
    - Use the clone() method to create copies of existing objects
    - Modify the copies as needed while keeping the original unchanged

Code Flow Explanation:

What This Example Does:
This example shows how to properly implement the Prototype pattern using Java's Cloneable interface. The Document class implements Cloneable and overrides the clone() method to create exact copies of documents.

Step-by-Step Code Flow:

1. Document Class (Document.java)
   - Purpose: A simple document with title, content, and author
   - Implements: Cloneable interface for proper cloning support
   - Contains: Overridden clone() method that calls super.clone()
   - Clone Method: Uses Java's built-in cloning mechanism

2. Main Program (Main.java)
   - Creates: One original document
   - Clones: The document multiple times using clone() method
   - Modifies: The cloned documents
   - Shows: Original stays unchanged
   - Handles: CloneNotSupportedException properly

Real-World Example: Document Copying

Imagine you're working in an office where you need to:
- Create meeting notes
- Make copies for different departments
- Modify each copy slightly
- Keep the original unchanged

Without Prototype Pattern:
You'd have to type the same document multiple times, which is slow and error-prone.

With Prototype Pattern:
Make one document, then use clone() to copy it and modify each copy. Much faster and easier!

Benefits:
- Proper Implementation: Uses Java's built-in Cloneable interface
- Built-in Support: Leverages Java's native cloning mechanism
- Type Safety: clone() method returns the correct type
- Exception Handling: Properly handles CloneNotSupportedException
- Standard Approach: Follows Java best practices for cloning

Use Cases:
- Document Templates: Copying forms, reports, or letters
- Configuration Files: Copying default settings and customizing them
- Game Objects: Copying characters, items, or levels
- Database Records: Copying existing records with modifications
- Email Templates: Copying standard emails and personalizing them

Drawbacks:
- Memory: Storing prototypes uses some memory
- Shallow Copy: Only copies basic properties (not nested objects)
- Exception Handling: Need to handle CloneNotSupportedException
- Cloneable Interface: Must implement Cloneable to use clone()

How to Execute the Code:
1. Navigate to the prototype folder in terminal:
   cd creational/prototype

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Simple Prototype Pattern Demo ===

1. Creating Original Document:
Title: Meeting Notes
Content: Discuss project timeline
Author: John
---

2. Cloning the Document:
Title: Meeting Notes
Content: Discuss project timeline
Author: John
---

3. Modifying the Cloned Document:
Title: Updated Meeting Notes
Content: Discuss project timeline and budget
Author: John
---

4. Original Document (unchanged):
Title: Meeting Notes
Content: Discuss project timeline
Author: John
---

5. Creating Another Clone:
Title: Budget Meeting
Content: Review project costs
Author: John
---

Key Takeaways:
1. Implement Cloneable: Your class must implement Cloneable interface
2. Override clone(): Provide proper clone() method implementation
3. Use super.clone(): Call super.clone() for basic cloning functionality
4. Exception Handling: Handle CloneNotSupportedException properly
5. Type Casting: Cast the result of super.clone() to your class type

Proper Implementation Details:
- Class must implement Cloneable interface
- Override clone() method with @Override annotation
- Call super.clone() to get basic object copy
- Cast result to your class type
- Handle CloneNotSupportedException
- clone() method should be public

Simple Analogy:
Think of it like a photocopier:
- Original document = Prototype (implements Cloneable)
- Photocopy = Result of clone() method
- Modifying copy = Changing the cloned object
- Original stays the same = Prototype unchanged

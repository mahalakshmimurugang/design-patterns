Pattern Name: Template Method
Pattern Category: Behavioral

Description:
    - The Template Method pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
    - It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
    - Think of it like a recipe template - the basic steps are defined, but you can customize specific ingredients.
    - It's useful when you have an algorithm with a fixed structure but variable steps.

The key idea is:
    - "Define the skeleton of an algorithm in a method, deferring some steps to subclasses."

The Problem:
    - You have an algorithm with a fixed structure but variable steps.
    - You want to avoid duplicating the algorithm structure in multiple classes.
    - You need to allow subclasses to customize specific parts of the algorithm.
    - You want to maintain the algorithm's overall structure.
    - You need to ensure certain steps are always executed in the same order.

The Solution:
    - Create an abstract class with a template method that defines the algorithm structure.
    - Define abstract methods for steps that subclasses must implement.
    - The template method calls the abstract methods in the correct order.
    - Subclasses implement the abstract methods to customize behavior.
    - The overall algorithm structure remains fixed.

Code Flow Explanation:

What This Example Does:
This example demonstrates a game system where different games (Cricket, Football) follow the same template (initialize, start, end) but implement each step differently.

Step-by-Step Code Flow:

1. Game Abstract Class (Game.java)
   - Purpose: Defines the template method and algorithm structure
   - Methods: Abstract initialize(), startPlay(), endPlay()
   - Template Method: play() defines the algorithm structure
   - Represents: The algorithm template

2. Cricket Class (Cricket.java)
   - Purpose: Concrete implementation of the game template
   - Behavior: Implements game-specific initialization, start, and end
   - Represents: One specific algorithm implementation

3. Football Class (Football.java)
   - Purpose: Another concrete implementation of the game template
   - Behavior: Implements football-specific initialization, start, and end
   - Represents: Another specific algorithm implementation

Real-World Example: Document Processing System

Imagine you're building a document processing system that:
- Handles different document types (PDF, Word, HTML)
- Follows the same processing steps (parse, validate, transform, save)
- Allows customization for each document type
- Must maintain consistent processing order
- Should be easy to add new document types

Without Template Method Pattern:
You'd have duplicated algorithm structure, inconsistent processing, and difficulty maintaining the code!

With Template Method Pattern:
Each document type follows the same template while customizing specific steps!

Benefits:
- Algorithm Structure: Fixed algorithm structure prevents duplication
- Customization: Subclasses can customize specific steps
- Consistency: Ensures all implementations follow the same structure
- Extensibility: Easy to add new implementations
- Code Reuse: Common algorithm logic is shared

Use Cases:
- Document Processing: Different document types with same workflow
- Build Systems: Different build targets with same process
- Game Engines: Different games with same lifecycle
- Data Processing: Different data sources with same pipeline
- Workflow Systems: Different processes with same steps

Drawbacks:
- Inheritance: Requires inheritance (can't use composition)
- Rigid Structure: Algorithm structure is fixed
- Override Complexity: Subclasses must understand the template
- Debugging: Template method flow can be complex to debug

How to Execute the Code:
1. Navigate to the template-method folder in terminal:
   cd behavioural/template-method

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Template Method Pattern Demo ===

Cricket Game Initialized! Start playing.
Cricket Game Started. Enjoy the game!
Cricket Game Finished!

Football Game Initialized! Start playing.
Football Game Started. Enjoy the game!
Football Game Finished!

Key Takeaways:
1. Algorithm Structure: Template method defines the fixed algorithm structure
2. Customizable Steps: Abstract methods allow step customization
3. Consistent Flow: All implementations follow the same order
4. Code Reuse: Common logic is shared in the template
5. Easy Extension: New implementations only need to implement specific steps

Template Method Pattern Structure:
- Abstract Class: Defines template method and abstract steps
- Template Method: Defines algorithm structure
- Abstract Methods: Steps that subclasses must implement
- Concrete Classes: Implement specific steps
- Client: Uses the template method

Simple Analogy:
Think of it like a restaurant ordering system:
- Order Process = Template method (fixed steps)
- Menu Items = Abstract methods (customizable steps)
- Restaurant Types = Concrete implementations (specific menus)
- Customer = Client (uses the ordering process)
- Result = Same ordering process with different menu options

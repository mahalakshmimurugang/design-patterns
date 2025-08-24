Pattern Name: Builder
Pattern Category: Creational

Description:
    - The Builder Pattern is used to construct complex objects step by step.
    - It separates the construction process from the final representation of the object.
    - Instead of passing a large set of parameters into a constructor, the builder allows chaining methods to configure the object gradually.
    - Makes object creation more readable, flexible, and easy to extend.

The key idea is:
    - "Build an object step by step, and get the final product at the end."

The Problem:
    - Constructors with too many parameters make object creation hard to read and maintain
    - Optional parameters and complex configurations make the code messy and error-prone
    - Creating objects with different combinations of parameters requires multiple constructors

The Solution:
    - Provide a Builder class with methods to configure each part of the object
    - After configuration, a build() method returns the final object
    - Makes object creation more readable through method chaining
    - Handles default values for unspecified parameters

Code Flow Explanation:

What This Example Does:
This example demonstrates building different types of computers using the Builder pattern. Instead of having multiple constructors for different computer configurations, we use a single ComputerBuilder that can create computers with any combination of specifications.

Step-by-Step Code Flow:

1. Computer Class (Computer.java)
   - Purpose: The final product that gets built
   - Contains: All computer components (CPU, RAM, Storage, Graphics Card, Motherboard)
   - Constructor: Takes all parameters at once
   - Methods: Getters and toString for displaying the computer

2. ComputerBuilder Class (ComputerBuilder.java)
   - Purpose: The builder that constructs Computer objects step by step
   - Contains: Same fields as Computer, but they can be set individually
   - Key Methods:
     - setCpu(), setRam(), setStorage(), etc. - Each returns this for method chaining
     - build() - Creates and returns the final Computer object with default values for unspecified parts

3. Main Program (Main.java)
   - Demonstrates: Four different ways to build computers
   - Shows: How flexible the Builder pattern is

Real-World Example: Computer Building System

Imagine you're building a computer customization website where customers can:
- Choose their CPU (Intel i3, i5, i7, AMD Ryzen, etc.)
- Select RAM amount (8GB, 16GB, 32GB)
- Pick storage type and size (SSD, HDD, NVMe)
- Choose graphics card (Integrated, GTX, RTX series)
- Select motherboard

Without Builder Pattern:
You'd need multiple constructors or a complex constructor
Computer computer1 = new Computer("Intel i7", "16GB", "1TB SSD", "RTX 3080", "ASUS ROG");
Computer computer2 = new Computer("Intel i3", "8GB", null, null, null); // What about defaults?

With Builder Pattern:
Clean, readable, flexible
Computer gamingPC = new ComputerBuilder()
    .setCpu("Intel i7")
    .setRam("16GB")
    .setStorage("1TB NVMe SSD")
    .setGraphicsCard("RTX 3080")
    .setMotherboard("ASUS ROG Z690")
    .build();

Computer basicPC = new ComputerBuilder()
    .setCpu("Intel i3")
    .setRam("8GB")
    .build(); // Everything else gets default values!

Benefits:
- Readable Code: Method chaining makes object creation easy to understand
- Flexible: Can specify only the parts you want, others get sensible defaults
- Maintainable: Easy to add new computer components without changing existing code
- No Telescoping Constructors: Don't need multiple constructors for different parameter combinations
- Immutable Objects: Once built, the Computer object cannot be changed

Use Cases:
- Computer/Electronics Configuration: Building custom PCs, laptops, smartphones
- Meal Ordering Systems: Creating meals with different combinations of items
- Document Builders: Creating complex documents with various sections
- Database Query Builders: Constructing SQL queries step by step
- Configuration Objects: Building complex configuration objects for applications

Drawbacks:
- Additional Classes: Requires creation of Builder classes, which adds extra code
- Overkill for Simple Objects: May be unnecessary for objects with few parameters
- Complexity: Can add complexity for very simple object creation

How to Execute the Code:
1. Navigate to the builder folder in terminal:
   cd creational/builder

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Builder Pattern Demo ===

1. Building a Basic Computer:
Computer{CPU='Intel i3', RAM='8GB', Storage='256GB SSD', Graphics Card='Integrated Graphics', Motherboard='Standard Motherboard'}

2. Building a Gaming Computer:
Computer{CPU='Intel i7', RAM='16GB', Storage='1TB NVMe SSD', Graphics Card='RTX 3080', Motherboard='ASUS ROG Z690'}

3. Building a Computer with Partial Configuration:
Computer{CPU='AMD Ryzen 5', RAM='8GB', Storage='512GB SSD', Graphics Card='Integrated Graphics', Motherboard='Standard Motherboard'}

4. Building a Computer with Default Configuration:
Computer{CPU='Default CPU', RAM='8GB', Storage='256GB SSD', Graphics Card='Integrated Graphics', Motherboard='Standard Motherboard'}

Key Takeaways:
1. Method Chaining: Each setter returns this, allowing you to chain methods
2. Default Values: Unspecified parameters get sensible defaults
3. Flexibility: Can create objects with any combination of parameters
4. Readability: Code is self-documenting and easy to understand
5. Maintainability: Easy to add new parameters or change defaults
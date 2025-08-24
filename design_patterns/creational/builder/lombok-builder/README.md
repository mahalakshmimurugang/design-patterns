Pattern Name: Lombok Builder
Pattern Category: Creational

Description:
    - Lombok Builder is an annotation-based approach to implement the Builder pattern automatically.
    - It uses the @Builder annotation to generate all the builder code at compile time.
    - Eliminates the need to write boilerplate code for builders, constructors, getters, and toString methods.
    - Provides the same benefits as the traditional Builder pattern with much less code.

The key idea is:
    - "Let Lombok generate the builder code for you, focus on your business logic."

The Problem:
    - Traditional Builder pattern requires writing a lot of boilerplate code
    - Need to manually create builder classes with setter methods
    - Repetitive code for getters, setters, constructors, and toString methods
    - Time-consuming to implement and maintain

The Solution:
    - Use Lombok's @Builder annotation to automatically generate builder code
    - Lombok creates the builder class, constructors, getters, and toString at compile time
    - Clean, minimal code with maximum functionality
    - Easy to maintain and modify

Code Flow Explanation:

What This Example Does:
This example demonstrates building different types of computers using Lombok's @Builder annotation. Instead of manually writing builder classes, Lombok automatically generates all the necessary code, making the implementation much cleaner and simpler.

Step-by-Step Code Flow:

1. Computer Class (Computer.java)
   - Purpose: The final product that gets built
   - Contains: All computer components (CPU, RAM, Storage, Graphics Card, Motherboard)
   - Annotations: @Builder and @ToString
   - Lombok automatically generates: Builder class, constructors, getters, toString

2. Main Program (Main.java)
   - Demonstrates: Five different ways to build computers using Lombok's generated builder
   - Shows: How clean and simple the Lombok Builder pattern is

Real-World Example: Computer Building System

Imagine you're building a computer customization website where customers can:
- Choose their CPU (Intel i3, i5, i7, AMD Ryzen, etc.)
- Select RAM amount (8GB, 16GB, 32GB)
- Pick storage type and size (SSD, HDD, NVMe)
- Choose graphics card (Integrated, GTX, RTX series)
- Select motherboard

Without Lombok Builder Pattern:
You'd need to manually write all the builder code, getters, setters, constructors, and toString methods.

With Lombok Builder Pattern:
Just add @Builder annotation and Lombok does all the work!
Computer gamingPC = Computer.builder()
    .cpu("Intel i7")
    .ram("16GB")
    .storage("1TB NVMe SSD")
    .graphicsCard("RTX 3080")
    .motherboard("ASUS ROG Z690")
    .build();

Benefits:
- Minimal Code: Just add @Builder annotation, Lombok generates everything else
- Automatic Generation: Builder class, constructors, getters, toString are auto-generated
- Clean Syntax: Same readable method chaining as traditional builder
- Easy Maintenance: Change fields, Lombok automatically updates generated code
- No Boilerplate: Focus on business logic, not repetitive code
- Consistent: All generated code follows best practices

Use Cases:
- Any object with multiple optional parameters
- Configuration objects with many settings
- Data transfer objects (DTOs)
- API request/response objects
- Database entity objects
- Settings and configuration classes

Drawbacks:
- Dependency on Lombok: Requires Lombok library in your project
- Compile-time Generation: Generated code is not visible in source
- Learning Curve: Need to understand Lombok annotations
- IDE Support: Some IDEs may need plugins for full Lombok support

How to Execute the Code:

Prerequisites:
1. Install Lombok in your project:
   - Add Lombok dependency to your build tool (Maven, Gradle)
   - Or download lombok.jar and add to classpath

2. Ensure your IDE supports Lombok:
   - Install Lombok plugin for IntelliJ IDEA
   - Enable annotation processing in Eclipse

Execution Steps:
1. Navigate to the lombok-builder folder in terminal:
   cd creational/builder/lombok-builder

2. Compile all Java files (with Lombok in classpath):
   javac -cp "path/to/lombok.jar" *.java

3. Run the main program:
   java -cp "path/to/lombok.jar:." Main

Expected Output:
=== Lombok Builder Pattern Demo ===

1. Building a Basic Computer:
Computer(cpu=Intel i3, ram=8GB, storage=null, graphicsCard=null, motherboard=null)

2. Building a Gaming Computer:
Computer(cpu=Intel i7, ram=16GB, storage=1TB NVMe SSD, graphicsCard=RTX 3080, motherboard=ASUS ROG Z690)

3. Building a Computer with Partial Configuration:
Computer(cpu=AMD Ryzen 5, ram=null, storage=512GB SSD, graphicsCard=null, motherboard=null)

4. Building a Computer with No Configuration:
Computer(cpu=null, ram=null, storage=null, graphicsCard=null, motherboard=null)

5. Building with Custom Default Builder:
Computer(cpu=Default CPU, ram=8GB, storage=256GB SSD, graphicsCard=Integrated Graphics, motherboard=Standard Motherboard)

Key Takeaways:
1. Annotation Magic: @Builder generates all builder code automatically
2. Clean Code: Minimal source code with maximum functionality
3. Same Benefits: All advantages of Builder pattern without the boilerplate
4. Easy Maintenance: Change fields, Lombok handles the rest
5. Professional Quality: Generated code follows best practices

Comparison with Traditional Builder:
- Traditional: ~50 lines of code, manual maintenance
- Lombok: ~10 lines of code, automatic maintenance
- Same functionality, much less effort
- Perfect for rapid prototyping and production code

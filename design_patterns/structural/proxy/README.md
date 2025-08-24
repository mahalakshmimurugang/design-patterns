Pattern Name: Proxy
Pattern Category: Structural

Description:
    - The Proxy pattern provides a surrogate or placeholder for another object to control access to it.
    - It acts as a representative object that can control access to the real object.
    - Think of it like a credit card - it's a proxy for your bank account, controlling access and providing security.
    - It allows you to add a layer of control over object access without changing the original object.

The key idea is:
    - "Provide a surrogate object that controls access to another object, allowing you to add functionality without changing the original."

The Problem:
    - You need to control access to an object (e.g., lazy loading, access control, logging).
    - You want to add functionality without modifying the original object.
    - You need to delay the creation of expensive objects until they're actually needed.
    - You want to add security, caching, or monitoring to object access.
    - You need to provide a local representation for a remote object.

The Solution:
    - Create a Proxy class that implements the same interface as the real object.
    - The Proxy holds a reference to the real object and controls access to it.
    - The Proxy can create the real object on-demand (lazy loading).
    - The Proxy can add functionality like access control, logging, or caching.
    - Clients interact with the Proxy as if it were the real object.

Code Flow Explanation:

What This Example Does:
This example demonstrates how to use the Proxy pattern for lazy loading of images. Instead of loading all images immediately (which would be expensive), the Proxy creates RealImage objects only when they're first needed, saving memory and improving performance.

Step-by-Step Code Flow:

1. Image Interface (Image.java)
   - Purpose: Defines the contract that both RealImage and ProxyImage must implement
   - Contains: display() and getFileName() methods
   - Represents: The common interface that clients expect

2. RealImage Class (RealImage.java)
   - Purpose: The real object that does the actual work
   - Contains: File loading logic with simulated delay (1 second)
   - Behavior: Automatically loads image from disk when constructed
   - Cost: Expensive operation that takes time and memory

3. ProxyImage Class (ProxyImage.java)
   - Purpose: Controls access to RealImage and provides lazy loading
   - Contains: Reference to RealImage (initially null) and filename
   - Lazy Loading: Creates RealImage only when display() is first called
   - Additional Methods: isImageLoaded() and preloadImage() for control

4. Main Program (Main.java)
   - Demonstrates: Lazy loading, access control, and memory management
   - Shows: How Proxy delays RealImage creation until needed
   - Creates: Multiple ProxyImage instances without loading images
   - Result: Memory-efficient image management with on-demand loading

Real-World Example: Image Gallery Application

Imagine you're building an image gallery application that:
- Has hundreds of high-resolution images
- Needs to display images quickly when users browse
- Wants to save memory by not loading all images at once
- Should provide smooth user experience without delays
- Needs to control when images are loaded into memory

Without Proxy Pattern:
All images would be loaded immediately when the gallery starts, using huge amounts of memory and taking a long time to initialize!

With Proxy Pattern:
Images are loaded only when first displayed, saving memory and providing instant gallery startup!

Benefits:
- Lazy Loading: Expensive objects created only when needed
- Access Control: Control when and how objects are accessed
- Memory Efficiency: Save memory by delaying object creation
- Same Interface: Client code works with both Proxy and Real object
- Additional Functionality: Can add logging, caching, or security

Use Cases:
- Image/Media Loading: Lazy loading of large files
- Database Connections: Connection pooling and access control
- Remote Services: Local representation of remote objects
- Caching: Proxy with caching capabilities
- Security: Access control and authentication
- Logging: Track object access and operations

Drawbacks:
- Complexity: Adds another layer of indirection
- Performance: Slight overhead for proxy method calls
- Debugging: Can make debugging more complex
- Design: Requires careful design to avoid over-engineering
- Memory: Proxy objects themselves consume memory

How to Execute the Code:
1. Navigate to the proxy folder in terminal:
   cd structural/proxy

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Proxy Pattern Demo ===

1. Lazy Loading Example:
Creating ProxyImage (RealImage not created yet)...
Checking if image is loaded: false
First display call (will create RealImage):
Creating RealImage for: photo1.jpg
Loading image: photo1.jpg from disk...
Image loaded: photo1.jpg
Displaying image: photo1.jpg
Checking if image is loaded: true
Second display call (uses existing RealImage):
Displaying image: photo1.jpg

2. Multiple Proxy Images:
Created 3 proxy images, but no RealImages yet!
Image 1 loaded: true
Image 2 loaded: false
Image 3 loaded: false

3. Preloading Images:
Preloading image 2...
Loading image: photo2.jpg from disk...
Image loaded: photo2.jpg
Image 2 loaded: true
Displaying preloaded image 2:
Displaying image: photo2.jpg

4. Access Control:
Displaying image 3 (will create RealImage):
Creating RealImage for: photo3.jpg
Loading image: photo3.jpg from disk...
Image loaded: photo3.jpg
Displaying image: photo3.jpg
All images now loaded:
Image 1 loaded: true
Image 2 loaded: true
Image 3 loaded: true

5. Memory Management Simulation:
Total memory used by images: 3 RealImage objects

Key Takeaways:
1. Lazy Loading: Create expensive objects only when needed
2. Access Control: Control when and how objects are accessed
3. Same Interface: Proxy implements the same interface as Real object
4. Memory Efficiency: Save memory by delaying object creation
5. Additional Functionality: Can add features without changing original object

Proxy Pattern Structure:
- Subject Interface: Common interface for Real object and Proxy (Image)
- Real Subject: The actual object that does the work (RealImage)
- Proxy: Controls access to Real object and adds functionality (ProxyImage)
- Client: Uses the Subject interface (works with both Proxy and Real)

Simple Analogy:
Think of it like a credit card:
- Bank Account = Real object (your money)
- Credit Card = Proxy (controls access to your money)
- You = Client (use the card without knowing bank details)
- Result = Controlled access with additional features (fraud protection, rewards)

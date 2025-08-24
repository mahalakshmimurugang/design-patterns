Pattern Name: Adapter
Pattern Category: Structural

Description:
    - The Adapter pattern acts as a bridge between two incompatible interfaces.
    - It allows objects with incompatible interfaces to work together by wrapping the existing interface.
    - Think of it like a power adapter that lets you plug a US device into a European outlet.
    - It converts the interface of one class into another interface that clients expect.
    - The Adapter pattern acts as a bridge between two incompatible interfaces, allowing them to work together.

The key idea is:
    - "Make incompatible interfaces work together by creating a bridge between them."

The Problem:
    - You have an existing class with an interface that doesn't match what you need.
    - You want to use a class that has a different interface than expected.
    - You need to integrate third-party libraries with different interfaces.
    - You want to reuse existing classes without modifying their code.

The Solution:
    - Create an Adapter class that implements the target interface.
    - The Adapter wraps the existing class and translates calls to it.
    - The client code works with the target interface, not the adapted class.
    - The Adapter handles the conversion between the two interfaces.

Code Flow Explanation:

What This Example Does:
This example demonstrates how to use the Adapter pattern to make an audio player support different audio formats. The AudioPlayer can natively play MP3 files, but uses adapters to play VLC and MP4 files through existing AdvancedMediaPlayer implementations.

Step-by-Step Code Flow:

1. MediaPlayer Interface (MediaPlayer.java)
   - Purpose: The target interface that the client expects
   - Contains: play() method that takes audioType and fileName
   - Represents: The standard interface for playing media files

2. AdvancedMediaPlayer Interface (AdvancedMediaPlayer.java)
   - Purpose: The existing/legacy interface that needs to be adapted
   - Contains: playVlc() and playMp4() methods
   - Represents: Third-party or existing media player functionality

3. Concrete Player Classes (VlcPlayer.java, Mp4Player.java)
   - Purpose: Implement the AdvancedMediaPlayer interface
   - Contains: Specific logic for playing VLC and MP4 files
   - Each class: Handles only its specific format

4. MediaAdapter Class (MediaAdapter.java)
   - Purpose: The adapter that bridges the two interfaces
   - Implements: MediaPlayer interface (target)
   - Contains: Reference to AdvancedMediaPlayer (adaptee)
   - Translates: MediaPlayer.play() calls to appropriate AdvancedMediaPlayer methods

5. AudioPlayer Class (AudioPlayer.java)
   - Purpose: The client that uses the MediaPlayer interface
   - Contains: Logic to handle different audio formats
   - Uses: MediaAdapter for VLC and MP4 formats
   - Handles: MP3 natively, delegates others to adapter

Real-World Example: Audio Player Compatibility

Imagine you're building a music app that:
- Has built-in support for MP3 files
- Wants to add support for VLC and MP4 files
- Uses third-party libraries for VLC and MP4 playback
- Needs a unified interface for all audio formats

Without Adapter Pattern:
You'd have to modify the existing code or create separate methods for each format, making the code complex and hard to maintain.

With Adapter Pattern:
Create adapters that translate the unified interface calls to the specific third-party library calls. Clean, maintainable, and extensible!

Benefits:
- Compatibility: Makes incompatible interfaces work together
- Reusability: Reuse existing classes without modification
- Single Responsibility: Each adapter handles one specific conversion
- Open/Closed Principle: Easy to add new adapters without changing existing code
- Clean Integration: Integrate third-party libraries seamlessly

Use Cases:
- Legacy System Integration: Connecting old systems with new interfaces
- Third-Party Library Integration: Making external libraries work with your code
- Interface Standardization: Creating consistent interfaces across different systems
- Database Adapters: Supporting different database types with same interface
- API Wrappers: Converting between different API formats

Drawbacks:
- Complexity: Adds extra classes and complexity to the system
- Performance: Small overhead due to additional method calls
- Maintenance: Need to maintain adapters when interfaces change
- Over-Engineering: Can be overkill for simple interface mismatches

How to Execute the Code:
1. Navigate to the adapter folder in terminal:
   cd structural/adapter

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Adapter Pattern Demo ===

1. Playing MP3 (built-in support):
Playing mp3 file. Name: beyond the horizon.mp3

2. Playing MP4 (using adapter):
Playing mp4 file. Name: alone.mp4

3. Playing VLC (using adapter):
Playing vlc file. Name: far far away.vlc

4. Trying unsupported format:
Invalid media. avi format not supported

5. Direct adapter usage:
Playing mp4 file. Name: sample.mp4
Playing vlc file. Name: sample.vlc

Key Takeaways:
1. Interface Translation: Adapter translates calls between incompatible interfaces
2. Wrapper Pattern: Adapter wraps the existing class and provides new interface
3. Client Isolation: Client code doesn't need to know about the adapted class
4. Extensibility: Easy to add new adapters for different interfaces
5. Legacy Integration: Perfect for integrating existing systems with new code

Adapter Pattern Structure:
- Target Interface: What the client expects (MediaPlayer)
- Adaptee: The existing class with incompatible interface (AdvancedMediaPlayer)
- Adapter: The bridge class that implements target interface (MediaAdapter)
- Client: The code that uses the target interface (AudioPlayer)

Simple Analogy:
Think of it like a power adapter:
- US Device = Client (expects US interface)
- European Outlet = Adaptee (provides European interface)
- Power Adapter = Adapter (converts between interfaces)
- Result = Device works in different country

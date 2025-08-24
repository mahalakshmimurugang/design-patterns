Pattern Name: Abstract Factory
Pattern Category: Creational

Description:
    - Abstract Factory is a design pattern used to create families of related objects without specifying their concrete classes.
    - It provides an interface for creating multiple types of objects from a specific family or group.
    - This helps in creating systems that are flexible and extendable with minimal changes.
    - Factory of the factory design pattern.
    - Example: Gaming character equipment system

Code Flow Explanation

### What This Example Does
This example simulates a gaming system where different character types (Warrior and Mage) need different equipment (weapons and armor). The Abstract Factory pattern ensures that each character gets the right type of equipment.

Step-by-Step Code Flow

1. **Main Program Starts** (`Main.java`)
   - Creates a Warrior character with appropriate equipment
   - Creates a Mage character with appropriate equipment

2. **Factory Selection**
   - For Warrior: Uses `WarriorFactory`
   - For Mage: Uses `MageFactory`

3. **Equipment Creation**
   - Each factory creates the right weapon and armor for its character type
   - Warrior gets: Sword (weapon) + Shield (armor)
   - Mage gets: Staff (weapon) + Robe (armor)

4. **Output Display**
   - Shows what equipment each character received


Usecase:
    - Gaming systems where different character classes need different equipment
    - UI frameworks that work on different operating systems
    - Database systems supporting different database types

Drawbacks:
    - Adds more classes and complexity (one factory per product family).
    - Can be overkill if only one product type or very few variations exist.

How to execute the code:
    - go to the file path in the terminal
    - javac *.java // to compile all the java files
    - java Main.java // to run the main file.

Expected Output
```
Creating a Warrior:
Weapon: Sword
Armor: Shield

Creating a Mage:
Weapon: Staff
Armor: Robe
```
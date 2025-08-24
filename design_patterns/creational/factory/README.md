Pattern name: Factory Method
Pattern category: Creational

Description:
    - The Factory Pattern is like a smart object generator.
    - based on the input parameters, the factory design pattern creates an object
    - works on abstarct class or interface
    - Instead of creating objects directly using new, you use a factory class or method to decide which object to create. 
    The key idea is:

        “Let a factory method decide which class to instantiate based on input or condition.”

The problem:
    - Unlike Singleton, factory patterns avoids object creation using new clauses.

The solution:
    - takes any input as an input parameter
    - Internally decides which object has to be created.

Usecase:
    - You are building a notification system. Based on user preference, you need to create and send either an EmailNotification, SMSNotification, or PushNotification.
    - Using a Factory, you can abstract this creation and simply say:
    
    Notification n = NotificationFactory.getNotification("email");

Drawbacks:
    - Overuse can lead to many factory classes and make the design harder to navigate.

How to execute the code:
    - go to the file path in the terminal
    - javac *.java // to compile all the java files
    - java Main.java // to run the main file.



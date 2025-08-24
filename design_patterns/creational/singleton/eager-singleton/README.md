Pattern Name: EagerSingleton
Pattern Category: Creational (Singleton)

Description:    
    - Deals with the eagerly initialising an Object when the JVM loads the class - avoiding the multithread problem.
    - This pattern ensures that only one instance of the class is created and used.
    
Usecase:
    - Incase if we are connecting to a database, it is a good practice to create one single instance of the DB connection and use the same connection to execute the line of queries instead of establishing a new connection for every query.

Drawbacks:
    - Though this class avoids multithread problem, there is a scenario where the Object occupies space even when the Class's properties aren't used.
    - To overcome this issue - use synchronised function to make the class as synchronised and lets the other thread to wait until the previous completes its execution.
    - Works similar to LazySingleton but with a synchronised function.

How to execute the code:
    - go to the file path in the terminal
    - javac *.java // to compile all the java files
    - java Main.java // to run the main file.

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Facade Pattern Demo ===\n");
        
        // Create the facade
        ComputerFacade computer = new ComputerFacade();
        
        // Example 1: Start the computer (simple one-line call)
        System.out.println("1. Starting Computer:");
        computer.startComputer();
        
        // Example 2: Load a program (simple one-line call)
        System.out.println("2. Loading Program:");
        byte[] programData = "Hello World Program".getBytes();
        computer.loadProgram(1000, programData.length);
        
        // Example 3: Backup data (simple one-line call)
        System.out.println("3. Backing Up Data:");
        byte[] backupData = "Important Data".getBytes();
        computer.backupData(2000, backupData);
        
        // Example 4: Restart the computer (simple one-line call)
        System.out.println("4. Restarting Computer:");
        computer.restartComputer();
        
        // Example 5: Shutdown the computer (simple one-line call)
        System.out.println("5. Shutting Down Computer:");
        computer.shutdownComputer();
        
    }
}

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
    
    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }
    
    public void startComputer() {
        System.out.println("=== Starting Computer ===");
        cpu.freeze();
        memory.load(0, hardDrive.read(0, 1024));
        cpu.jump(0);
        cpu.execute();
        System.out.println("Computer started successfully!\n");
    }
    
    public void shutdownComputer() {
        System.out.println("=== Shutting Down Computer ===");
        memory.clear();
        cpu.freeze();
        System.out.println("Computer shut down successfully!\n");
    }
    
    public void restartComputer() {
        System.out.println("=== Restarting Computer ===");
        shutdownComputer();
        startComputer();
    }
    
    public void backupData(long lba, byte[] data) {
        System.out.println("=== Backing Up Data ===");
        hardDrive.seek(lba);
        hardDrive.write(lba, data);
        memory.verify(lba);
        System.out.println("Data backup completed!\n");
    }
    
    public void loadProgram(long position, int size) {
        System.out.println("=== Loading Program ===");
        hardDrive.seek(position);
        byte[] programData = hardDrive.read(position, size);
        memory.load(position, programData);
        memory.verify(position);
        System.out.println("Program loaded successfully!\n");
    }
}

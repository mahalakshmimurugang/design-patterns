public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Memory: Loading data at position " + position + " with " + data.length + " bytes");
    }
    
    public void clear() {
        System.out.println("Memory: Clearing all data");
    }
    
    public void verify(long position) {
        System.out.println("Memory: Verifying data at position " + position);
    }
}

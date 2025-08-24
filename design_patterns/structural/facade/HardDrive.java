public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("HardDrive: Reading " + size + " bytes from LBA " + lba);
        return new byte[size];
    }
    
    public void write(long lba, byte[] data) {
        System.out.println("HardDrive: Writing " + data.length + " bytes to LBA " + lba);
    }
    
    public void seek(long lba) {
        System.out.println("HardDrive: Seeking to LBA " + lba);
    }
}

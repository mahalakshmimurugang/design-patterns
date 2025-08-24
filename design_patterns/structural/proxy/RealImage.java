public class RealImage implements Image {
    private String fileName;
    
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }
    
    private void loadFromDisk() {
        System.out.println("Loading image: " + fileName + " from disk...");
        // Simulate loading time
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Image loaded: " + fileName);
    }
    
    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
    
    @Override
    public String getFileName() {
        return fileName;
    }
}

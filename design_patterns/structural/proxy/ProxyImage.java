public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;
    
    public ProxyImage(String fileName) {
        this.fileName = fileName;
        // Note: RealImage is NOT created here - lazy loading!
    }
    
    @Override
    public void display() {
        if (realImage == null) {
            // Create RealImage only when first needed (lazy loading)
            System.out.println("Creating RealImage for: " + fileName);
            realImage = new RealImage(fileName);
        }
        // Now delegate to the real image
        realImage.display();
    }
    
    @Override
    public String getFileName() {
        return fileName;
    }
    
    // Additional proxy methods for access control
    public boolean isImageLoaded() {
        return realImage != null;
    }
    
    public void preloadImage() {
        if (realImage == null) {
            System.out.println("Preloading image: " + fileName);
            realImage = new RealImage(fileName);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Proxy Pattern Demo ===\n");
        
        // Example 1: Lazy Loading
        System.out.println("1. Lazy Loading Example:");
        ProxyImage proxyImage = new ProxyImage("photo1.jpg");
        System.out.println("Proxy created (no RealImage loaded yet)");
        System.out.println("Image loaded: " + proxyImage.isImageLoaded());
        
        System.out.println("\nFirst display call (creates RealImage):");
        proxyImage.display();
        System.out.println("Image loaded: " + proxyImage.isImageLoaded());
        
        System.out.println("\nSecond display call (uses existing RealImage):");
        proxyImage.display();
        System.out.println();
        
        // Example 2: Multiple Images
        System.out.println("2. Multiple Images:");
        ProxyImage proxy2 = new ProxyImage("photo2.jpg");
        ProxyImage proxy3 = new ProxyImage("photo3.jpg");
        
        System.out.println("Created 3 proxies, loaded images: " + 
            (proxyImage.isImageLoaded() ? 1 : 0) + 
            (proxy2.isImageLoaded() ? 1 : 0) + 
            (proxy3.isImageLoaded() ? 1 : 0));
        
        System.out.println("\nLoading image 2:");
        proxy2.display();
        
        System.out.println("\nTotal loaded images: " + 
            (proxyImage.isImageLoaded() ? 1 : 0) + 
            (proxy2.isImageLoaded() ? 1 : 0) + 
            (proxy3.isImageLoaded() ? 1 : 0));
    }
}

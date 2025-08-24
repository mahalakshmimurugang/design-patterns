public class Main {
    public static void main(String[] args) {
        System.out.println("=== Composite Pattern Demo ===\n");
        
        // Create files
        File file1 = new File("document.txt", 1024);
        File file2 = new File("image.jpg", 2048);
        File file3 = new File("video.mp4", 5120);
        File file4 = new File("readme.md", 512);
        
        // Create directories
        Directory documents = new Directory("Documents");
        Directory pictures = new Directory("Pictures");
        Directory root = new Directory("Root");
        
        // Build the file system structure
        documents.add(file1);
        documents.add(file4);
        pictures.add(file2);
        pictures.add(file3);
        
        root.add(documents);
        root.add(pictures);
        
        // Display the entire structure
        System.out.println("File System Structure:");
        root.display(0);
        
        System.out.println("\nIndividual Component Details:");
        System.out.println("Root size: " + root.getSize() + " bytes");
        System.out.println("Documents size: " + documents.getSize() + " bytes");
        System.out.println("Pictures size: " + pictures.getSize() + " bytes");
        System.out.println("File1 size: " + file1.getSize() + " bytes");
    }
}

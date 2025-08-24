public class Main {
    public static void main(String[] args) {
        System.out.println("=== Simple Prototype Pattern Demo ===\n");
        
        try {
            // Create an original document (prototype)
            System.out.println("1. Creating Original Document:");
            Document originalDoc = new Document("Meeting Notes", "Discuss project timeline", "John");
            originalDoc.display();
            
            // Clone the document
            System.out.println("2. Cloning the Document:");
            Document clonedDoc = originalDoc.clone();
            clonedDoc.display();
            
            // Modify the cloned document
            System.out.println("3. Modifying the Cloned Document:");
            clonedDoc.setTitle("Updated Meeting Notes");
            clonedDoc.setContent("Discuss project timeline and budget");
            clonedDoc.display();
            
            // Show that original is unchanged
            System.out.println("4. Original Document (unchanged):");
            originalDoc.display();
            
            // Create another clone
            System.out.println("5. Creating Another Clone:");
            Document anotherClone = originalDoc.clone();
            anotherClone.setTitle("Budget Meeting");
            anotherClone.setContent("Review project costs");
            anotherClone.display();
            
        } catch (CloneNotSupportedException e) {
            System.out.println("Error: Cloning not supported - " + e.getMessage());
        }
    }
}

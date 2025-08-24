public class Document implements Cloneable {
    private String title;
    private String content;
    private String author;
    
    public Document(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    
    // Override clone method from Cloneable interface
    @Override
    public Document clone() throws CloneNotSupportedException {
        return (Document) super.clone();
    }
    
    // Method to display document info
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
        System.out.println("Author: " + author);
        System.out.println("---");
    }
    
    // Method to modify the cloned document
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
}

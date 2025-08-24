public class Directory implements FileSystemItem {
    private String name;
    private java.util.List<FileSystemItem> children;
    
    public Directory(String name) {
        this.name = name;
        this.children = new java.util.ArrayList<>();
    }
    
    public void add(FileSystemItem item) {
        children.add(item);
    }
    
    public void remove(FileSystemItem item) {
        children.remove(item);
    }
    
    @Override
    public void display(int indent) {
        String spaces = "  ".repeat(indent);
        System.out.println(spaces + "📁 " + name + " (" + getSize() + " bytes)");
        
        for (FileSystemItem child : children) {
            child.display(indent + 1);
        }
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public long getSize() {
        long totalSize = 0;
        for (FileSystemItem child : children) {
            totalSize += child.getSize();
        }
        return totalSize;
    }
}

public class File implements FileSystemItem {
    private String name;
    private long size;
    
    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }
    
    @Override
    public void display(int indent) {
        String spaces = "  ".repeat(indent);
        System.out.println(spaces + "📄 " + name + " (" + size + " bytes)");
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public long getSize() {
        return size;
    }
}

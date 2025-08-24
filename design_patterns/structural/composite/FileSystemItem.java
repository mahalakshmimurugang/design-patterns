public interface FileSystemItem {
    void display(int indent);
    String getName();
    long getSize();
}

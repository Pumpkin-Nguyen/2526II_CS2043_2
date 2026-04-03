public class FileItem extends FileSystemItem {
    private int size;

    public FileItem(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void print(String indent) {
        System.out.printf(indent + "File: %s (%dKB)\n".formatted(this.getName(), this.size));
    }
}

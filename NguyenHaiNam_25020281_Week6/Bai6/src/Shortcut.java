public class Shortcut extends FileSystemItem {
    private FileSystemItem target;

    public Shortcut(String name, FileSystemItem target) {
        super(name);
        this.target = target;
    }

    @Override
    public void print(String indent) {
        System.out.printf(indent + "Shortcut: %s -> %s\n", this.getName(), this.target.getPath());
    }
}

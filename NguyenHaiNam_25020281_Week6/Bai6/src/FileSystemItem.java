public abstract class FileSystemItem {
    private String name;
    private Folder parent;

    public FileSystemItem(String name) {
        this.name = name;
    }

    public abstract void print(String indent);
    public String getPath() {
        if (parent == null) {
            return "/" + name;
        }
        String parentPath = parent.getPath();
        return (parentPath.equals("/") ? "" : parentPath) + "/" + name;
    };

    public String getName() {
        return this.name;
    }

    public void setParent(Folder parent) {
        this.parent = parent;
    }
}
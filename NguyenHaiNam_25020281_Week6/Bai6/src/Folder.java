import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemItem {
    private List<FileSystemItem> items = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void print(String indent) {
        System.out.printf(indent + "Folder: %s\n", this.getName());
        for (FileSystemItem item : items) {
            item.print(indent + "  ");
        }
    }

    public void addItem(FileSystemItem item) {
        item.setParent(this);
        items.add(item);
    }
}

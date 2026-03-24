import java.util.ArrayList;

public class LibrarySection<T extends MediaItem> {
    private ArrayList<T> items = new ArrayList<>();
    private String sectionName;

    public LibrarySection(String sectionName) {
        this.sectionName = sectionName;
    }

    public void addItem(T newItem) {
        items.add(newItem);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public void check() {
        System.out.println("Khu vực " + this.sectionName + ":");
        for (T item : items) {
            System.out.println(item);
        }
    }
}

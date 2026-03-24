public class DVD extends MediaItem {
    private String author;
    private int length;

    public DVD(String id, String name, String author, int length) {
        super(id, name);
        this.author = author;
        this.length = length;
    }

    @Override
    public String toString() {
        return "%s - %s - %d".formatted(this.getName(), author, length);
    }
}
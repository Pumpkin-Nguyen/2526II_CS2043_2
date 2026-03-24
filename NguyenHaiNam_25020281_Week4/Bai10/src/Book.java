public class Book extends MediaItem {
    private String author;
    private int pageNums;

    public Book(String id, String name, String author, int pageNums) {
        super(id, name);
        this.author = author;
        this.pageNums = pageNums;
    }

    @Override
    public String toString() {
        return "%s - %s - %d".formatted(this.getName(), author, pageNums);
    }
}

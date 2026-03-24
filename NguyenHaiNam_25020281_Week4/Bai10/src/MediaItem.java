public abstract class MediaItem {
    private String id, name;
    public MediaItem(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

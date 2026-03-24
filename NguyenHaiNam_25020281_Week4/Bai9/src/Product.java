public abstract class Product {
    private String id, name;

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String getExtraInfo();

    @Override
    public String toString() {
        return this.name + " - " + getExtraInfo();
    }
}

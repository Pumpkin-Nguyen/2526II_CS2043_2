abstract class Product {
    private String id, name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public abstract double getFinalPrice();
}

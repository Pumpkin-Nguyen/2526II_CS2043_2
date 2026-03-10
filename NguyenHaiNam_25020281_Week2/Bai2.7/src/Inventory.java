public class Inventory {
    Product[] items;

    public Inventory(Product[] initialItems) {
        this.items = initialItems;
    }

    public static void main() {
        Product[] arr = { new Product("0", "Laptop", 1000.0), new Product("1", "Iphone", 699.2) };
        Inventory kho = new Inventory(arr);

        arr[0].setPrice(5000);

        System.out.println("Danh sách sản phẩm trong kho:");
        for (int i = 0; i < 2; i++) {
            kho.items[i].display();
        }
    }
}

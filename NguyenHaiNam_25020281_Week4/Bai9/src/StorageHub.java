import java.util.ArrayList;

public class StorageHub<T extends Product> {
    private ArrayList<T> inventory = new ArrayList<>();
    private String storageHubName;

    public StorageHub(String storageHubName) {
        this.storageHubName = storageHubName;
    }

    public void addProduct(T newProduct) {
        inventory.add(newProduct);
    }

    public void removeProduct(T product) {
        inventory.remove(product);
    }

    public void check() {
        System.out.println("Kho " + storageHubName + ":");
        for (T product : inventory) {
            System.out.println(product);
        }
    }

}

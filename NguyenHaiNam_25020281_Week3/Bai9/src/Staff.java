public abstract class Staff implements IPayable {
    private String id, name;
    public Staff(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

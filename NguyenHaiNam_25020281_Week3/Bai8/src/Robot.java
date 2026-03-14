public abstract class Robot {
    private int id;
    private String modelName;
    private int batteryLevel;

    public Robot(int id, String modelName) {
        this.id = id;
        this.modelName = modelName;
    }

    public String getModelName() {
        return this.modelName;
    }

    public void chargeBattery() {
        this.batteryLevel = 100;
    }

    public final void showIdentity() {
        System.out.printf("ID: %d - Model: %s\n", this.id, this.modelName);
    }

    public abstract void performMainTask();
}

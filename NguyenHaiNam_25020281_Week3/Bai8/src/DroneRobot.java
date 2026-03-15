public class DroneRobot extends Robot implements Flyable, GPS, ElectronicDevice {
    public DroneRobot(int id, String modelName) {
        super(id, modelName);
    }

    @Override
    public void performMainTask() {
        System.out.println(this.getModelName() + " performing main task");
        this.fly();
        this.getCoordinates();
    }

    @Override
    public void fly() {
        System.out.println(this.getModelName() + " flying");
    }

    @Override
    public void getCoordinates() {
        System.out.println(this.getModelName() + " getting coordinates");
    }

    @Override
    public void turnOn() {}
}

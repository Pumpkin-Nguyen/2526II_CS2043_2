public class DroneRobot extends Robot implements Flyable, GPS, ElectronicDevice {
    public DroneRobot(int id, String modelName) {
        super(id, modelName);
    }

    public void performMainTask() {
        System.out.println(this.getModelName() + " performing main task");
        this.fly();
        this.getCoordinates();
    }

    public void fly() {
        System.out.println(this.getModelName() + " flying");
    }

    public void getCoordinates() {
        System.out.println(this.getModelName() + " getting coordinates");
    }

    public void turnOn() {}
}

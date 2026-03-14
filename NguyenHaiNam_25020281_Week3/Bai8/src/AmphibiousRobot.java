public class AmphibiousRobot extends Robot implements Flyable, Swimmable, GPS {
    public AmphibiousRobot(int id, String modelName) {
        super(id, modelName);
    }

    public void performMainTask() {
        System.out.println(this.getModelName() + " performing main task");
        this.fly();
        this.swim();
        this.getCoordinates();
    }

    public void fly() {
        System.out.println(this.getModelName() + " flying");
    }

    public void swim() {
        System.out.println(this.getModelName() + " swimming");
    }

    public void getCoordinates() {
        System.out.println(this.getModelName() + " getting coordinates");
    }
}

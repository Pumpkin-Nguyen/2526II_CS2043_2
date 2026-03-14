public class FishRobot extends Robot implements Swimmable {
    public FishRobot(int id, String modelName) {
        super(id, modelName);
    }    

    public void performMainTask() {
        System.out.println(this.getModelName() + " performing main task");
        this.swim();
    }

    public void swim() {
        System.out.println(this.getModelName() + " swimming");
    }
}

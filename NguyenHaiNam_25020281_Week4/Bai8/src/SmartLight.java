public class SmartLight extends ElectronicDevice implements Adjustable {
    private int lightLevel = 1;
    
    public SmartLight(String id, String name) {
        super(id, name);
    }

    @Override
    public void changeLevel(int newLevel) {
        if (newLevel < 0 || newLevel > 10) {
            System.out.println("Light level must between 0 and 10.");
            return;
        }

        this.lightLevel = newLevel;
    }
}

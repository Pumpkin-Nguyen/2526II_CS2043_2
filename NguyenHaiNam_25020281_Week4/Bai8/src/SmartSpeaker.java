public class SmartSpeaker extends ElectronicDevice implements Adjustable, WifiSupport {
    private int volume = 1;

    public SmartSpeaker(String id, String name) {
        super(id, name);
    }

    @Override
    public void changeLevel(int newLevel) {
        if (newLevel < 0 || newLevel > 10) {
            System.out.println("Volume level must between 0 and 10.");
            return;
        }

        this.volume = newLevel;
    }

    @Override
    public void connectWifi() {
        System.out.println(this.getName() + " connected to wifi");
    }
}

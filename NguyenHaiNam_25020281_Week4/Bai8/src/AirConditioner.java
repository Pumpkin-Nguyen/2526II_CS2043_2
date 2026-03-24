public class AirConditioner extends ElectronicDevice implements WifiSupport {
    public AirConditioner(String id, String name) {
        super(id, name);
    }    

    @Override
    public void connectWifi() {
        System.out.println(this.getName() + " connected to wifi");
    }
}

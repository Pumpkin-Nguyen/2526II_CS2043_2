import java.util.ArrayList;

public class Hub {
    private ArrayList<ElectronicDevice> devices = new ArrayList<>();

    public void addDevice(ElectronicDevice device) {
        devices.add(device);
    }

    public void turnOffAll() {
        System.out.println("Turn Off All Devices:");
        for (ElectronicDevice device : devices) {
            device.turnOff();
        }
    }

    public void setupWifi() {
        System.out.println("Setup Wifi:");
        for (ElectronicDevice device : devices) {
            if (device instanceof WifiSupport) {
                WifiSupport supportedDevice = (WifiSupport) device;
                supportedDevice.connectWifi();
            }
        }
    }
}

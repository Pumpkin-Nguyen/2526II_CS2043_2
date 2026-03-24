public abstract class ElectronicDevice {
    private String id, name;
    private boolean status = true;

    public ElectronicDevice(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void turnOff() {
        this.status = false;
        System.out.println(name + " turned off");
    }

    public void turnOn() {
        this.status = true;
        System.out.println(name + " turned on");
    }
}

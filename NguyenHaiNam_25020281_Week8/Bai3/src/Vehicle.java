import v1.Vehicle;

abstract class Vehicle {
    protected String plate;
    protected String brand;

    public Vehicle(String plate, String brand) {
        this.plate = plate;
        this.brand = brand;
    }

    public String getInfo() {
        return getVehicleType() + " [" + plate + "] - " + brand;
    }

    protected abstract String getVehicleType();
}

abstract class GasVehicle extends Vehicle {
    protected double fuelLevel = 0;

    public GasVehicle(String plate, String brand) {
        super(plate, brand);
    }

    public void refuel(double liters) { fuelLevel += liters; }
}

abstract class ElectricVehicle extends Vehicle {
    protected int batteryPercent = 0;
    public ElectricVehicle(String plate, String brand) {
        super(plate, brand);
    } 

    public void charge(int percent) { batteryPercent += percent; }
}




class MotorBike extends GasVehicle {
    public MotorBike(String plate, String brand) {
        super(plate, brand);
    }

    protected String getVehicleType() {
        return "Xe máy";
    }
}

class Car extends GasVehicle {
    public Car(String plate, String brand) {
        super(plate, brand);
    }

    public String getVehicleType() {
        return "Ô tô";
    }
}

class ElectricCar extends ElectricVehicle {
    public ElectricCar(String plate, String brand) {
        super(plate, brand);
    }

    public String getVehicleType() {
        return "Xe điện";
    }
}
package v0;

public class ParkingTicketv0 {
    private final Vehiclev0 vehicle;
    private final int hours;

    public ParkingTicketv0(Vehiclev0 vehicle, int hours) {
        this.vehicle = vehicle;
        this.hours = hours;
    }
    public Vehiclev0 getVehicle() { return vehicle; }
    public int getHours() { return hours; }
}


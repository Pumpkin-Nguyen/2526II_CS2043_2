package v1;

public class ParkingTicket {
    private final Vehicle vehicle;
    private final int hours;

    public ParkingTicket(Vehicle vehicle, int hours) {
        this.vehicle = vehicle;
        this.hours = hours;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getHours() {
        return hours;
    }

    public double calculateFee() {
        double thisFee = 0;
        switch (this.getVehicle().getType()) {
            case Vehicle.CAR:
                thisFee += 10;
                if (this.getHours() > 2) {
                    thisFee += (this.getHours() - 2) * 3;
                }
                break;
            case Vehicle.BIKE:
                thisFee += 5;
                if (this.getHours() > 3) {
                    thisFee += (this.getHours() - 3) * 2;
                }
                break;
            case Vehicle.TRUCK:
                thisFee += 15 + this.getHours() * 4;
                break;
        }

        return thisFee;
    }

    public int calculateBonusPoints() {
            int bonusPoints = 0;

            // bonus points
            bonusPoints++;
            if (this.getVehicle().getType() == Vehicle.TRUCK && this.getHours() > 5) {
                bonusPoints++;
            }

            return bonusPoints;
    }
}
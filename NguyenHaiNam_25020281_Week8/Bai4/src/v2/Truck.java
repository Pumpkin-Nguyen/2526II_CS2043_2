package v2;

public class Truck extends Vehicle {
    public Truck(String plate) {
        super(plate);
    }

    @Override
    public double calculateFee(int hours) {
        return 15 + hours * 4;
    }

    public int calculateBonusPoints(int hours) {
        return hours > 5 ? 2 : 1;
    }
}

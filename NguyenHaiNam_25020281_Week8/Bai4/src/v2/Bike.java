package v2;

public class Bike extends Vehicle {
    public Bike(String plate) {
        super(plate);
    }

    @Override
    public double calculateFee(int hours) {
        double thisFee = 5;
        if (hours > 3) {
            thisFee += (hours - 3) * 2;
        }

        return thisFee;
    }
}

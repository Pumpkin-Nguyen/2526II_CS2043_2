package v2;

public class Car extends Vehicle {
    public Car(String plate) {
        super(plate);
    }

    @Override
    public double calculateFee(int hours) {
        double thisFee = 10;
        if (hours > 2) {
            thisFee += (hours - 2) * 3;
        }

        return thisFee;
    }
}

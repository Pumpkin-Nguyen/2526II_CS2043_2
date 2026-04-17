public class Main {
    public static void main(String[] args) {
        Car car = new Car("34H-20239", "HuynDai");
        car.refuel(10);
        System.out.println(car.getInfo());

        MotorBike motorBike = new MotorBike("34F1-14165", "Honda");
        motorBike.refuel(5);
        System.out.println(motorBike.getInfo());

        ElectricCar electricCar = new ElectricCar("34F-10229", "Vinfast");
        electricCar.charge(50);
        System.out.println(electricCar.getInfo());
    }
}

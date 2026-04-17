public class Main {
    public static void main(String[] args) {
        CalculateFee calculateFee = new CalculateFee();
        System.out.println(calculateFee.calculateFee("GYM", 3, 4.5, true));

        Triangle triangle = new Triangle(23.1, 25.4);
        System.out.println(triangle.getArea());
    }
}

public class StandardOrder extends Order {
    public StandardOrder(double weight, double distance) {
        super(weight, distance);
    }

    @Override
    public double getDeliveryFee() {
        return this.weight * 3000 + this.distance * 500;
    }

    @Override
    public String getLabel() {
        return "[THƯỜNG]";
    }
}

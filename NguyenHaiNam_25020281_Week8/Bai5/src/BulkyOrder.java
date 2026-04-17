public class BulkyOrder extends Order {
    public BulkyOrder(double weight, double distance) {
        super(weight, distance);
    }

    @Override
    public double getDeliveryFee() {
        return this.weight * 4000 + this.distance * 600 + 50000;
    }

    @Override
    public String getLabel() {
        return "[HÀNG CỒNG KỀNH]";
    }
}

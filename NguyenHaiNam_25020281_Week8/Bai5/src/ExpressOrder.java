public class ExpressOrder extends Order {
    public ExpressOrder(double weight, double distance) {
        super(weight, distance);
    }

    @Override
    public double getDeliveryFee() {
        return (this.weight * 3000 + this.distance * 500) * 1.5;
    }

    @Override
    public String getLabel() {
        return "[HỎA TỐC]";
    }
}

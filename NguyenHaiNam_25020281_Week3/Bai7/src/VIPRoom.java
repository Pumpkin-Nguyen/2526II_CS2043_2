public class VIPRoom extends Room {
    public VIPRoom(String number, int price, int daysRent) {
        super(number, price, daysRent);
    }

    @Override
    public int getFinalPrice() {
        return this.getPrice() * this.getDaysRent();
    }
}

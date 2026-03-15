public class StandardRoom extends Room {
    public StandardRoom(String number, int price, int daysRent) {
        super(number, price, daysRent);
    }

    @Override
    public int getFinalPrice() {
        int daysRent = getDaysRent();
        if (daysRent > 3) {
            return (int) (this.getPrice() * daysRent * (1 - 0.05));
        } else {
            return this.getPrice() * daysRent;
        }
    }
}

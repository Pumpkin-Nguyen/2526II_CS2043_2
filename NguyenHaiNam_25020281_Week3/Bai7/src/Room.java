abstract class Room {
    private String number;
    private int price;
    private int daysRent;

    public Room(String number, int price, int daysRent) {
        this.number = number;
        this.price = price;
        this.daysRent = daysRent;
    }

    public int getPrice() {
        return this.price;
    }
    
    public int getDaysRent() {
        return this.daysRent;
    }
    
    public abstract int getFinalPrice();
}

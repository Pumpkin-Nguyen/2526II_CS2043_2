import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Food extends Product {
    private LocalDate expireDate;
    
    public Food(String id, String name, double price, String date) {
        super(id, name, price);

        this.expireDate = LocalDate.parse(date);
    }
    
    @Override
    public double getFinalPrice() {
        if (LocalDate.now().until(this.expireDate, ChronoUnit.DAYS) < 7) {
            return this.getPrice() * 0.8;
        } else {
            return this.getPrice();
        }
    }

    @Override
    public void printDetails() {
        System.out.printf("%s - Food - %.1f\n", this.getName(), this.getFinalPrice());
    }
}



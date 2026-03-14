import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Food extends Product {
    private LocalDate expireDate;
    
    public Food(String id, String name, double price, String date) {
        super(id, name, price);

        this.expireDate = LocalDate.parse(date);
    }
    
    public double getFinalPrice() {
        if (expireDate.until(LocalDate.now(), ChronoUnit.DAYS) < 7) {
            return this.getPrice() * 0.8;
        } else {
            return this.getPrice();
        }
    }
}

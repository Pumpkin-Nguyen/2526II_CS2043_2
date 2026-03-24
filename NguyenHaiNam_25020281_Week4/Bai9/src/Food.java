import java.time.LocalDate;

public class Food extends Product {
    private LocalDate expireDate;
    public Food(String id, String name, LocalDate expireDate) {
        super(id, name);
        this.expireDate = expireDate;
    }

    @Override
    public String getExtraInfo() {
        return expireDate.toString();
    }
}

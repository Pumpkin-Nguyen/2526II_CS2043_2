import java.time.LocalDate;

public class Ticket {
    private String id, content;
    private LocalDate timestamp;
    public Ticket(String id, String content, LocalDate timestamp) {
        this.id = id;
        this.content = content;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return String.format("# Ticket %s: %s", this.id, this.content);
    }
}

package v1;
import java.util.ArrayList;
import java.util.List;

public class ParkingCustomer {
    private final String name;
    private final List<ParkingTicket> tickets = new ArrayList<>();

    public ParkingCustomer(String name) {
        this.name = name;
    }
    public void addTicket(ParkingTicket ticket) {
        tickets.add(ticket);
    }

    public String receipt() {
        double totalFee = calculateTotalFee();
        int bonusPoints = calculateTotalBonusPoints();
        
        String result = "Parking Receipt for " + name + "\n";

        for (ParkingTicket each : tickets) {
            result += "\t" + each.getVehicle().getPlate() + "\t" + each.calculateFee() + "\n";
        }

        result += "Total fee is " + totalFee + "\n";
        result += "You earned " + bonusPoints + " bonus points";
        return result;
    }

    protected double calculateTotalFee() {
        return this.tickets.stream().mapToDouble(ParkingTicket::calculateFee).sum();
    }

    protected int calculateTotalBonusPoints() {
        return this.tickets.stream().mapToInt(ParkingTicket::calculateBonusPoints).sum();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] parts = line.split(" ");
        String typeRoom = parts[0];
        int daysRent = Integer.parseInt(parts[1]);

        if (typeRoom.equals("V")) {
            VIPRoom room = new VIPRoom("001", 2_000_000, daysRent);
            System.out.println(room.getFinalPrice());
        } else if (typeRoom.equals("S")) {
            StandardRoom room = new StandardRoom("001", 500_000, daysRent);
            System.out.println(room.getFinalPrice());
        }
        
        scanner.close();
    }
}

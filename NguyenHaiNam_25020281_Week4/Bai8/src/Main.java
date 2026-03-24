import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());
        Hub myHome = new Hub();

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            String type = parts[0];
            String id = parts[1];
            String name = parts[2];

            switch (type) {
                case "L": myHome.addDevice(new SmartLight(id, name)); break;
                case "AC": myHome.addDevice(new AirConditioner(id, name)); break;
                case "S": myHome.addDevice(new SmartSpeaker(id, name)); break;
                case "C": myHome.addDevice(new SmartCurtain(id, name)); break;
            }
        }

        scanner.close();

        myHome.turnOffAll();
        System.out.println();
        myHome.setupWifi();
    }
}

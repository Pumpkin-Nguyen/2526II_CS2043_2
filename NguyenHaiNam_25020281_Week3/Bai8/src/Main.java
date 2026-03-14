import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

        ArrayList<Robot> robots = new ArrayList<Robot>();

        for (int i = 0; i < n; i ++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            String type = parts[0];
            int id = Integer.parseInt(parts[1]);
            String modelName = parts[2];

            if (type.equals("DR")) {
                robots.add(new DroneRobot(id, modelName));
            } else if (type.equals("FR")) {
                robots.add(new FishRobot(id, modelName));
            } else if (type.equals("AR")) {
                robots.add(new AmphibiousRobot(id, modelName));
            }
        }

        for (Robot robot : robots) {
            robot.performMainTask();
            System.out.println();
        }

        Robot robot = robots.remove(0);
        // robot.fly(); // Không thể gọi do lớp Robot không cài đặt interface Flyable

        if (robot instanceof Flyable) {
            DroneRobot droneRobot = (DroneRobot) robot;
            droneRobot.fly(); // Đã gọi được hàm fly()
        } else {
            System.out.println("Robot này không có kỹ năng bay!");
        }

        robot = robots.remove(0);
        if (robot instanceof Swimmable) {
            FishRobot fishRobot = (FishRobot) robot;
            fishRobot.swim();
        } else {
            System.out.println("Robot này không có kỹ năng bơi!");
        }

        robot = robots.remove(0);
        if (robot instanceof GPS) {
            AmphibiousRobot amphibiousRobot = (AmphibiousRobot) robot;
            amphibiousRobot.getCoordinates();
        } else {
            System.out.println("Robot này không có kỹ năng lấy tọa độ!");
        }
        
        scanner.close();
    }
}

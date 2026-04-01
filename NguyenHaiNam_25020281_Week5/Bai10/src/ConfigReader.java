import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConfigReader {
    public static void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Config file: ");
        String configFile = scanner.nextLine();

        Map<String, String> configs = new HashMap<>();

        BufferedReader reader = null;
        try {

            reader = new BufferedReader(new FileReader(configFile));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=", 2);

                if (parts.length == 2) {
                    configs.put(parts[0], parts[1]);
                } else {
                    throw new InvalidConfigException("Syntax error");
                }
            }

            validateConfig(configs);

            System.out.println(configs);
            System.out.println("Config loaded successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Config file not found.");
        } catch (IOException e) {
            System.out.println("I/O error.");
            e.printStackTrace();
        } catch (InvalidConfigException e) {
            System.out.println("Invalid config: " + e.getMessage() + ".");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("I/O error.");
                e.printStackTrace();
            }
            scanner.close();

            System.out.println("Program finished.");
        }
    }

    public static void validateConfig(Map<String, String> configs) throws InvalidConfigException {
        if (!configs.containsKey("username"))
            throw new InvalidConfigException("Missing username key");
        if (!configs.containsKey("timeout"))
            throw new InvalidConfigException("Missing timeout key");

        try {
            int timeout = Integer.parseInt(configs.get("timeout"));

            if (timeout <= 0) {
                throw new InvalidConfigException("Key timeout must be greater than 0");
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }

        if (configs.containsKey("maxConnections")) {
            int maxConn = Integer.parseInt(configs.get("maxConnections"));
            if (maxConn < 1) {
                throw new InvalidConfigException("Key maxConnections must be >= 1");
            }
        }
    }
}

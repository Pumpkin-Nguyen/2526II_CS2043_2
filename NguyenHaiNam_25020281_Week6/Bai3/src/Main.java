import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Win or Mac: ");
        String type = scanner.nextLine().trim().toLowerCase();

        if (type.equals("win")) {
            WindowsFactory windowsFactory = new WindowsFactory();
            WindowsButton windowsButton = windowsFactory.createButton();
            WindowsCheckbox windowsCheckbox = windowsFactory.createCheckbox();
            
            windowsButton.render();
            windowsCheckbox.render();
        } else if (type.equals("mac")) {
            MacFactory macFactory = new MacFactory();
            MacButton macButton = macFactory.createButton();
            MacCheckbox macCheckbox = macFactory.createCheckbox();

            macButton.render();
            macCheckbox.render();
        }
        
        scanner.close();
    }
}
public class Main {
    public static void main(String[] args) {
        Notifier multiNotifier = new EmailNotifier();
        multiNotifier = new SmsNotifier(multiNotifier);
        multiNotifier = new FacebookNotifier(multiNotifier);

        multiNotifier.send("Hello!");
    }
}
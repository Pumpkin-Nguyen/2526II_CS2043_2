public class SmsApp extends NotificationApp {
    @Override
    public Notification createNotification() {
        return new SmsNotifcation();
    }
}

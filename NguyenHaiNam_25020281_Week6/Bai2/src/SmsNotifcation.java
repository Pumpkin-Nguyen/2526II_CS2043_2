public class SmsNotifcation implements Notification {

    @Override
    public void send(String msg) {
        System.out.println("Sending SMS: " + msg);
    }
}

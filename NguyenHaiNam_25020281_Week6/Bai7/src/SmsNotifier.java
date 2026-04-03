public class SmsNotifier extends NotifierDecorator {
    public SmsNotifier(Notifier notifier) {
        super(notifier);
    } 

    @Override
    public void send(String msg) {
        super.send(msg);
        notifySms(msg);
    }

    public void notifySms(String msg) {
        System.out.println("SMS sent: " + msg);
    }
}

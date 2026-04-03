public class FacebookNotifier extends NotifierDecorator {

    public FacebookNotifier(Notifier notifier) {
        super(notifier);
    }

    public void send(String msg) {
        super.send(msg);
        notifyFacebook(msg);
    }

    public void notifyFacebook(String msg) {
        System.out.println("Facebook sent: " + msg);
    }
    
}

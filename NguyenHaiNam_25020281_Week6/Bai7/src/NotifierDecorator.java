public abstract class NotifierDecorator implements Notifier{
    private Notifier component;

    public NotifierDecorator(Notifier n) {
        component = n;
    }

    public void send(String msg) {
        component.send(msg);
    }
}

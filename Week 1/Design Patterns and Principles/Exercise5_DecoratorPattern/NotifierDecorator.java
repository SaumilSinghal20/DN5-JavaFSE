public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrapped;

    public NotifierDecorator(Notifier n) {
        this.wrapped = n;
    }

    @Override
    public void send(String msg) {
        wrapped.send(msg);
    }
}

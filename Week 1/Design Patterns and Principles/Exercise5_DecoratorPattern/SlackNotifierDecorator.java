public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier n) {
        super(n);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        sendSlackMsg(msg);
    }
    
    private void sendSlackMsg(String t) {
        System.out.println("Slack message pushed: " + t);
    }
}

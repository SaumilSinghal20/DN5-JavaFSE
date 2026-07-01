public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier n) {
        super(n);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        sendSMS(msg);
    }
    
    private void sendSMS(String text) {
        System.out.println("SMS Sent: " + text);
    }
}

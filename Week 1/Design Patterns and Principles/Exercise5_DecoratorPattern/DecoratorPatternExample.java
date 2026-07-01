public class DecoratorPatternExample {
    public static void main(String[] args) {
        Notifier basicMail = new EmailNotifier();
        
        Notifier smsAndEmail = new SMSNotifierDecorator(basicMail);
        
        Notifier allChannels = new SlackNotifierDecorator(smsAndEmail);
        
        System.out.println("--- Sending simple email ---");
        basicMail.send("Hello World");
        
        System.out.println("\n--- Sending all ---");
        allChannels.send("Server is down!");
    }
}

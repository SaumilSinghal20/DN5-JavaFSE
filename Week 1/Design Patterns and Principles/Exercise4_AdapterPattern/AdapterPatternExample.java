public class AdapterPatternExample {
    public static void main(String[] args) {
        PaymentProcessor p1 = new StripeAdapter(new StripeGateway());
        p1.processPayment(50.0);
        
        PaymentProcessor p2 = new PaytmAdapter(new PaytmGateway());
        p2.processPayment(20.0);
    }
}

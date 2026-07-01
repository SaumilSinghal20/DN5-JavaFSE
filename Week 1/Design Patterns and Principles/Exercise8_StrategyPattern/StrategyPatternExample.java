public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentContext ctx1 = new PaymentContext(new CreditCardPayment("Alice", "1234567890123344"));
        ctx1.executePayment(250.0);
        
        PaymentContext ctx2 = new PaymentContext(new PayPalPayment("alice@example.com"));
        ctx2.executePayment(99.99);
    }
}

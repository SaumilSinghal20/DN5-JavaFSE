public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripe;

    public StripeAdapter(StripeGateway s) {
        this.stripe = s;
    }

    @Override
    public void processPayment(double amount) {
        stripe.makePayment(amount);
    }
}

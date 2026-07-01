public class PaymentContext {
    private PaymentStrategy method;

    public PaymentContext(PaymentStrategy m) {
        this.method = m;
    }

    public void executePayment(double amount) {
        method.pay(amount);
    }
}

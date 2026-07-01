public class PaytmAdapter implements PaymentProcessor {
    private PaytmGateway paytm;

    public PaytmAdapter(PaytmGateway p) {
        this.paytm = p;
    }

    @Override
    public void processPayment(double amount) {
        // assuming amount is in USD, converting to INR roughly
        double inr = amount * 82.5; 
        paytm.payAmount(inr);
    }
}

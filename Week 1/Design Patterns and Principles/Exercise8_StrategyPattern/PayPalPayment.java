public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String em) {
        this.email = em;
    }

    @Override
    public void pay(double amt) {
        System.out.println(amt + " paid via PayPal account: " + email);
    }
}

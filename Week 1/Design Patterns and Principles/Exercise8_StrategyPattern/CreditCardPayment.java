public class CreditCardPayment implements PaymentStrategy {
    private String name;
    private String cardNum;

    public CreditCardPayment(String n, String c) {
        this.name = n;
        this.cardNum = c;
    }

    @Override
    public void pay(double amt) {
        System.out.println(amt + " paid with credit card ending in " + cardNum.substring(cardNum.length() - 4));
    }
}

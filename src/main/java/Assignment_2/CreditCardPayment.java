package Assignment_2;

public class CreditCardPayment implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println(("Processed a payment of " + amount + " through credit card payment"));
    }

}

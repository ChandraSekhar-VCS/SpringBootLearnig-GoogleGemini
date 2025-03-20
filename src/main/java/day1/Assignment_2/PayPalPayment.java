package day1.Assignment_2;

public class PayPalPayment implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processed a paymment of " + amount + " through PayPal");
    }
}

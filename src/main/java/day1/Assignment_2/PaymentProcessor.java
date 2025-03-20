package day1.Assignment_2;
//CONSTRUCTOR INJECTION
//public class PaymentProcessor {
//    private PaymentGateway paymentGateway;
//    public PaymentProcessor(PaymentGateway paymentGateway) {
//        this.paymentGateway = paymentGateway;
//    }
//    public void process(double amount) {
//        paymentGateway.processPayment(amount);
//    }
//}

//SETTER INJECTION
public class PaymentProcessor {
    private PaymentGateway paymentGateway;
    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    public void process(double amount){
        paymentGateway.processPayment(amount);
    }
}

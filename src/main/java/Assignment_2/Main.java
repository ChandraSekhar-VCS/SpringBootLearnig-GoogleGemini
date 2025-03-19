package Assignment_2;
//CONSTRUCTOR INJECTION
//public class Main {
//    public static void main(String[] args) {
//        PaymentGateway gateway = new CreditCardPayment();
//        PaymentProcessor processor = new PaymentProcessor(gateway);
//        processor.process(5000);
//    }
//}

//SETTER INJECTION
public class Main {
    public static void main(String[] args) {
        PaymentGateway gateway = new PayPalPayment();
        PaymentProcessor processor = new PaymentProcessor();
        processor.setPaymentGateway(gateway);
        processor.process(2100556);
    }
}

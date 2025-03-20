package day1.Assignment_1;

//MAIN  METHOD WITH CONSTRUCTOR INJECTION
//public class Main {
//    public static void main(String[] args) {
//        //DEPENDENCY CREATION
//        NotificationService service = new PushNotificationService();
//        //DEPENDENCY INJECTION
//        NotificationProcessor processor = new NotificationProcessor(service);
//        processor.process("A new Biryani is waiting for you.!!");
//    }
//}

//MAIN METHOD WITH SETTER INJECTION
public class Main{
    public static void main(String[] args) {
        NotificationService service = new VoiceNotificationService();
        NotificationProcessor processor = new NotificationProcessor();
        processor.setNotificationService(service);
        processor.process("A new Chicken Biryani is waiting for you");
    }
}

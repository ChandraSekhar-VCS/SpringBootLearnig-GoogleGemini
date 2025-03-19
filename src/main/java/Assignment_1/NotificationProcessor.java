package Assignment_1;

//NOTIFICATION PROCESSOR FOR CONSTRUCTOR INJECTION
//public class NotificationProcessor {
//    private NotificationService notificationService;
//    public NotificationProcessor(NotificationService notificationService){
//        this.notificationService = notificationService;
//    }
//    public void process(String message){
//        notificationService.notify(message);
//    }
//}
// NOTIFICATION PROCESSOR FOR SETTER INJECTION
public class NotificationProcessor {
    private NotificationService notificationService;
    public void setNotificationService(NotificationService notificationService){
        this.notificationService = notificationService;
    }
    public void process(String message){
        notificationService.notify(message);
    }
}

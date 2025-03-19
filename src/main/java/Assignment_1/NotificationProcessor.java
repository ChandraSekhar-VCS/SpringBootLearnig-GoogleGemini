package Assignment_1;

public class NotificationProcessor {
    private NotificationService notificationService;
    public NotificationProcessor(NotificationService notificationService){
        this.notificationService = notificationService;
    }
    public void process(String message){
        notificationService.notify(message);
    }
}

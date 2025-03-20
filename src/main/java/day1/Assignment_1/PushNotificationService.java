package day1.Assignment_1;

public class PushNotificationService implements NotificationService {
    @Override
    public void notify(String message){
        System.out.println("PUSH NOTIFICATION : " + message);
    }
}

package Assignment_1;

public class VoiceNotificationService implements NotificationService {
    @Override
    public void notify(String message){
        System.out.println(("VOICE NOTIFICATION :" + message));
    }
}

package day1.Assignment_3;

public class Main {
    public static void main(String[] args) {
        Logger logger = new FileLogger();
        Application application = new Application(logger);
        application.login("This is a message logged on to a File");
    }
}

package day1.Assignment_3;

public class FileLogger implements Logger {
    public void log(String message) {
        System.out.println("Logging to a file :" + message);
    }
}

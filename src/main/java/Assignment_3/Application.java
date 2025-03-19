package Assignment_3;

public class Application {
    private Logger logger;
    public Application(Logger logger) {
        this.logger = logger;
    }
    public void login(String message){
        logger.log(message);
    }
}

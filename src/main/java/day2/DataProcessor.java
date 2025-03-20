package day2;

public class DataProcessor {
    private final DatabaseService databaseService;
    public DataProcessor(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
    public void process(){
        databaseService.connect();
        System.out.println("Processing Data....");
    }
}

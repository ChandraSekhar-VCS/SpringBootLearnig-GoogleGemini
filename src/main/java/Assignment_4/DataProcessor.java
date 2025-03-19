package Assignment_4;

public class DataProcessor {
    private DataStorage storage;

    public void setStorage(DataStorage storage) {
        this.storage = storage;
    }
    public void process(String data){
        storage.store(data);
    }
}

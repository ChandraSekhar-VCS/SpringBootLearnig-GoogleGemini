package Assignment_4;

public class Main {
    public static void main(String[] args) {
        DataStorage storage = new MemoryStorage();
        DataProcessor processor = new DataProcessor();
        processor.setStorage(storage);
        processor.process("Abdnljwdukb,iukwdnli");
    }
}

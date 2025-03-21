package day2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/resources/beans.xml");
        DataProcessor processor = (DataProcessor) applicationContext.getBean("dataProcessor");
        processor.process();
    }
}

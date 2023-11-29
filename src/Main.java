import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> buffer = new ArrayList<>();

        Thread producer = new Thread(new Producer(buffer));

        Thread consumer = new Thread(new Consumer(buffer));

        Thread consumer2 = new Thread(new Consumer(buffer));

        producer.start();
        consumer.start();
        consumer2.start();
    }
}
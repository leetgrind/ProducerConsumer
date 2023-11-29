import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MainTS {

    public static void main(String[] args) {

        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        Thread producer = new Thread(new ProducerTS(queue));
        producer.setName("Producer");

        Thread consumer1 = new Thread(new ConsumerTS(queue));
        consumer1.setName("Consumer1");
        Thread consumer2 = new Thread(new ConsumerTS(queue));
        consumer2.setName("Consumer2");

        producer.start();
        consumer1.start();
        consumer2.start();

    }
}

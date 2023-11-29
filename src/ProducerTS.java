import java.util.UUID;
import java.util.concurrent.BlockingQueue;

public class ProducerTS implements Runnable{

    private BlockingQueue<String> taskQueue;

    public ProducerTS(BlockingQueue<String> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {

        while (true) {

            String id = UUID.randomUUID().toString();

            try {
                taskQueue.put(id);
                System.out.println(Thread.currentThread().getName() + " generated event " + id);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

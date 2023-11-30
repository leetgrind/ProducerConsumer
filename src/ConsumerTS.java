import java.util.concurrent.BlockingQueue;

public class ConsumerTS implements Runnable{

    private BlockingQueue<String> taskQueue;

    public ConsumerTS(BlockingQueue<String> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
              String id = taskQueue.take();
              Thread.sleep(2000);
              System.out.println(Thread.currentThread().getName() + " processing the id " + id);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

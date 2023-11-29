import java.util.List;

public class Consumer implements Runnable{

    private List<String> buffer;

    public Consumer(List<String> buffer) {
        this.buffer = buffer;
    }


    @Override
    public void run() {

        while (true) {

            if(buffer.isEmpty()) {
                continue;
            }
            else {
                System.out.println(Thread.currentThread().getName() + " processing " + buffer.remove(0));
            }

        }

    }
}

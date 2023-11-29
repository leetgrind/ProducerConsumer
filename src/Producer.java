import java.util.List;

public class Producer implements Runnable{

    private List<String> buffer;

    public Producer(List<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {

        for(int i=0; i<4; i++) {

            synchronized (buffer) {
                buffer.add(String.valueOf(i));
            }
            System.out.println(Thread.currentThread().getName() + " added a number");
        }

    }
}

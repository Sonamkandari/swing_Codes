import java.util.LinkedList;

class ProducerConsumer {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private final int CAPACITY = 5;

    public void produce() throws InterruptedException {
        int item = 0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == CAPACITY) {
                    wait();
                }
                System.out.println("Producer produced: " + item);
                buffer.add(item++);
                notify(); // Notify one consumer that an item is produced
                Thread.sleep(1000); // Simulating some work
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.size() == 0) {
                    wait();
                }
                int item = buffer.remove();
                System.out.println("Consumer consumed: " + item);
                notifyAll(); // Notify all producers that an item is consumed
                Thread.sleep(1000); // Simulating some work
            }
        }
    }
}
public class producon{
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        // Creating producer thread
        Thread producerThread = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Creating consumer thread
        Thread consumerThread = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Starting threads
        producerThread.start();
        consumerThread.start();
    }
}

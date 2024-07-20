import java.util.LinkedList;

class PC {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 1;
    int value = 0;

    public void produce() throws InterruptedException {
        int producedCount = 0;
        while (producedCount < 10) {
            synchronized (this) {
                // producer thread waits while list is full
                while (list.size() == capacity)
                    wait();
    
                System.out.println("Producer produced-" + value);
    
                // insert the jobs in the list
                list.add(value++);
    
                // notifies the consumer thread that now it can start consuming
                notify();
    
                // makes the working of program easier to understand
                Thread.sleep(10);
                producedCount++;
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                // consumer thread waits while list is empty
                while (list.size() == 0)
                    wait();

                // retrieve the first job from the list
                int val = list.removeFirst();

                System.out.println("Consumer consumed-" + val);

                // Wake up producer thread
                notify();

                // and sleep
                Thread.sleep(10);
            }
        }
    }
}

public class Threadexample {
    public static void main(String[] args) throws InterruptedException {
        // Object of a class that has both produce() and consume() methods
        final PC pc = new PC();

        // Create producer thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Create consumer thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Let the main thread wait for the producer to finish producing 10 items
        t1.join();

        // Interrupt the consumer thread after 10 items have been produced
        t2.interrupt();
    }
}
class Counter {
    private int count = 0;

    // Synchronized method to increment count
    public synchronized void increment() {
        count++;
    }

    // Method to increment count using synchronized block
    public void incrementWithBlock() {
        synchronized (this) {
            count++;
        }
    }

    // Method to get current count value
    public int getCount() {
        return count;
    }
}

class MyThread extends Thread {
    private Counter counter;
    private boolean useSynchronizedMethod;

    public MyThread(Counter counter, boolean useSynchronizedMethod) {
        this.counter = counter;
        this.useSynchronizedMethod = useSynchronizedMethod;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (useSynchronizedMethod) {
                counter.increment();
            } else {
                counter.incrementWithBlock();
            }
        }
    }
}

public class S3Q2 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyThread thread1 = new MyThread(counter, true);
        MyThread thread2 = new MyThread(counter, false);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final Count with synchronized method: " + counter.getCount());

        counter = new Counter(); // Reset counter for next run

        thread1 = new MyThread(counter, false);
        thread2 = new MyThread(counter, true);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final Count with synchronized block: " + counter.getCount());
    }
}

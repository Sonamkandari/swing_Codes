class MyThread extends Thread {
    private static int threadCounter = 0;
    private int threadId;

    public MyThread(String name) {
        super(name);
        threadId = ++threadCounter;
    }

    public int getID() {
        return threadId;
    }

    public void run() {
        System.out.println("Running thread: " + Thread.currentThread().getName() + ", ID: " + getID());
        try {
            // Using sleep() to pause the thread for 1 second
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class dit13 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");

        // Using getName() to get the thread name
        System.out.println("Thread name: " + thread1.getName());

        // Using setName() to set the thread name
        thread1.setName("New Thread 1");
        System.out.println("New thread name: " + thread1.getName());

        // Using getPriority() to get the thread priority
        System.out.println("Thread priority: " + thread1.getPriority());

        // Using setPriority() to set the thread priority
        thread1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("New thread priority: " + thread1.getPriority());

        // Using isDaemon() to check if the thread is a daemon thread
        System.out.println("Is thread daemon: " + thread1.isDaemon());

        // Using setDaemon() to set the thread as a daemon thread
        thread1.setDaemon(true);
        System.out.println("Is thread daemon after setting: " + thread1.isDaemon());

        // Starting the thread
        thread1.start();

        // Using sleep() in the main thread to wait for the other thread to finish
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        // Using wait() to pause the main thread
        synchronized (dit13.class) {
            try {
                dit13.class.wait(1000);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted while waiting");
            }
        }
    }
}
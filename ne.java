// Q1) Creating Threads

// a) Creating a thread by extending Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread created by extending Thread class");
    }
}

// b) Creating a thread by implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread created by implementing Runnable interface");
    }
}

public class ne {

    public static void main(String[] args) throws InterruptedException {

        // c) Naming a thread
        MyThread thread1 = new MyThread();
        thread1.setName("Thread1");

        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.setName("Thread2");

        // d) Getting and setting priority
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        // e) Starting thread twice
        thread1.start();
        try {
            thread1.start(); // This will throw IllegalThreadStateException
        } catch (IllegalThreadStateException ex) {
            System.out.println("Cannot start the thread twice.");
        }

        thread2.start();

        // f) Making a thread as Daemon
        thread1.setDaemon(true);

        // g) Creating a thread group
        ThreadGroup threadGroup = new ThreadGroup("MyThreadGroup");
        Thread thread3 = new Thread(threadGroup, myRunnable);

        // h) Garbage collection
        thread1 = null;
        thread2 = null;
        System.gc();

        // i) Pausing a thread using sleep of Thread class
        Thread.sleep(1000);
    }
}

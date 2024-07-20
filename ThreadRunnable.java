public class ThreadUsingRunnable implements Runnable {
    private Thread thread; // Reference to the current thread

    public ThreadUsingRunnable() {
        thread = new Thread(this); // Create a new thread
    }

    // Get the ID of the thread
    public long getID() {
        return thread.getId();
    }

    // Get the name of the thread
    public String getName() {
        return thread.getName();
    }

    // Set the name of the thread
    public void setName(String name) {
        thread.setName(name);
    }

    // Get the priority of the thread
    public int getPriority() {
        return thread.getPriority();
    }

    // Set the priority of the thread
    public void setPriority(int priority) {
        thread.setPriority(priority);
    }

    // Check if the thread is a daemon thread
    public boolean isDaemon() {
        return thread.isDaemon();
    }

    // Set the thread to be a daemon thread or not
    public void setDaemon(boolean daemon) {
        thread.setDaemon(daemon);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread using Runnable interface: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the class that implements Runnable
        ThreadUsingRunnable obj = new ThreadUsingRunnable();

        // Starting the thread
        obj.thread.start();

        // Print thread properties
        System.out.println("Thread ID: " + obj.getID());
        System.out.println("Thread Name: " + obj.getName());

        // Set and print thread priority
        obj.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread Priority: " + obj.getPriority());

        // Set and print daemon status
        obj.setDaemon(true);
        System.out.println("Is Daemon: " + obj.isDaemon());

        // Demonstrate sleep method
        try {
            System.out.println("Sleeping for 3 seconds...");
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Demonstrate wait method
        synchronized (obj) {
            try {
                System.out.println("Thread waiting...");
                obj.wait(2000); // Wait for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


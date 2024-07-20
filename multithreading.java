class MultithreadingDemo implements Runnable {
    private String name;

    public MultithreadingDemo(String name) {
        this.name = name;
    }

    public void run() {
        try {
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " (" + name + ") is running");
            // Making the thread sleep for 1000 milliseconds
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    public long getID() {
        return Thread.currentThread().getId();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return Thread.currentThread().getPriority();
    }

    public void setPriority(int priority) {
        Thread.currentThread().setPriority(priority);
    }

    public boolean isDaemon() {
        return Thread.currentThread().isDaemon();
    }

    public void setDaemon(boolean isDaemon) {
        Thread.currentThread().setDaemon(isDaemon);
    }

    public void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    public void waitMethod() {
        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

class multithreading {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            MultithreadingDemo threadDemo = new MultithreadingDemo("Thread-" + (i + 1));
            Thread object = new Thread(threadDemo);
            object.start();
            // Setting priorities for the threads
            object.setPriority(Thread.MIN_PRIORITY + i);
            // Setting one thread as daemon
            if (i == 0) {
                object.setDaemon(true);
            }
        }
    }
}

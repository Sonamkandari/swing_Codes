public class ThreadUsingRunnable implements Runnable {
    private Thread thread;
    public ThreadUsingRunnable() {
        thread = new Thread(this); 
    }

    public long getID() {
        return thread.getId();
    }

 
    public String getName() {
        return thread.getName();
    }


    public void setName(String name) {
        thread.setName(name);
    }

    public int getPriority() {
        return thread.getPriority();
    }
    public void setPriority(int priority) {
        thread.setPriority(priority);
    }
    public boolean isDaemon() {
        return thread.isDaemon();
    }
    public void setDaemon(boolean daemon) {
        thread.setDaemon(daemon);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread using Runnable interface: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadUsingRunnable obj = new ThreadUsingRunnable();
        obj.thread.start();
        System.out.println("Thread ID: " + obj.getID());
        System.out.println("Thread Name: " + obj.getName());
        obj.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread Priority: " + obj.getPriority());
        obj.setDaemon(true);
        System.out.println("Is Daemon: " + obj.isDaemon());
        try {
            System.out.println("Sleeping for 3 seconds...");
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (obj) {
            try {
                System.out.println("Thread waiting...");
                obj.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

import java.util.concurrent.Semaphore;

public class sem {
    public static void main(String[] args) {
        // Creating a semaphore with 2 permits
        Semaphore semaphore = new Semaphore(2); 

        // Acquiring permits by threads
        Thread thread1 = new Thread(() -> {
            try {
                semaphore.acquire(); // Acquire a permit
                System.out.println(Thread.currentThread().getName() + " acquired a permit");
                Thread.sleep(2000); // Simulating some work
                semaphore.release(); // Release the permit
                System.out.println(Thread.currentThread().getName() + " released a permit");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                semaphore.acquire(); // Acquire a permit
                System.out.println(Thread.currentThread().getName() + " acquired a permit");
                Thread.sleep(2000); // Simulating some work
                semaphore.release(); // Release the permit
                System.out.println(Thread.currentThread().getName() + " released a permit");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();

        Checking available permits
        System.out.println("Available permits: " + semaphore.availablePermits());
    }
}

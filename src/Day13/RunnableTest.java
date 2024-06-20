package Day13;

public class RunnableTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable(1));
        Thread thread1 = new Thread(new MyRunnable(2));
        Thread thread2 = new Thread(new MyRunnable(3));
        Thread thread3 = new Thread(new MyRunnable(4));
        Thread thread4 = new Thread(new MyRunnable(5));

        thread.start();
        thread1.start();
        Thread.sleep(5000);
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

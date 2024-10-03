
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Value: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");

        thread1.start(); // Start Thread 1
        thread2.start(); // Start Thread 2

        // Main thread execution
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread - Value: " + i);
            try {
                Thread.sleep(500); // Sleep for 0.5 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

package multiThreading.threadRunnable;
//Используйте два способа для создания потоков.
// В первом методе run() 10 раз увеличьте i=0, во втором - 5 раз разделите число на 2.
public class MainRun {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(new MyRunnable());
        myThread.setName("MyThread");
        thread.setName("MyRunnable");

        myThread.start();
        thread.start();
    }
}

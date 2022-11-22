package multiThreading.threadRunnable;

public class MyThread  extends Thread{

    @Override
    public void run() {
        int i = 0;
        while(i < 10){
            i++;
            System.out.printf("%s %d\n",Thread.currentThread().getName(),i);
        }
    }
}

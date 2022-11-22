package multiThreading.threadRunnable;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        double number  = Math.random() * 100;
        int count  = 0;

        while(count < 5){
            System.out.printf("%s %.2f\n",Thread.currentThread().getName(),number);
            number /= 2;
            count++;
        }

    }
}

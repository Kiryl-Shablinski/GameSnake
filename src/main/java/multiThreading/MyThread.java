package multiThreading;

import java.util.Date;

//Создайте свой поток исполнения, обязательно использовав методы run() и start(),
// в методе run() выведите время и текущую дату.
public class MyThread extends Thread{
    public static void main(String[] args) {
       MyThread thread = new MyThread();
       thread.start();

    }
    @Override
    public void run() {
       Date date  = new Date();
        System.out.printf("Current date: %tT %tA %td %tB %tY", date, date, date, date, date);
    }
}

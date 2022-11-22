package multiThreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

//Создайте многопоточное приложение,
// где некоторое число, которое пользователь ввёл с клавиатуры, хотят 10 раз уменьшить на единицу.
// Просмотрите результат без использования синхронизации и с использованием ключевого слова syncronized.
public class SeveralThreads {
    public static void main(String[] args) {
        try (BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(bufRead.readLine());
            Resurses resurses = new Resurses(x);
            for (int i = 0; i < 5; i++) {
                Thread myTread = new Thread(new CountThread(resurses));
                myTread.start();
            }
        } catch (IOException o) {
            o.printStackTrace();
        }

    }
    public static long timeOfWork() {
        return new Date().getTime();
    }
}

class CountThread implements Runnable {
    Resurses resurses;


    public CountThread(Resurses resurses) {
        this.resurses = resurses;
    }

    @Override
    public void run() {
        resurses.increment();
    }
}

class Resurses {
    int x;

    public Resurses(int x) {
        this.x = x;
    }

    public synchronized void increment() {
        for (int i = 0; i < 2; i++) {
            x--;
            System.out.println(Thread.currentThread().getName() + ": " + x);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

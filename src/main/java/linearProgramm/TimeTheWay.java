package linearProgramm;

import java.util.Scanner;

public class TimeTheWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance, speed;
        double time;
        System.out.println("Введите расстояние ");
        distance = sc.nextInt();
        System.out.println("Введите скорость ");
        speed = sc.nextInt();
        sc.close();
        // определим время в пути
        time = (double) distance / speed;

        // переведем дробную часть времени в минуты
        int timeMinut = (int) ((time -((int) time)) * 60);

        System.out.println("Время в пути: " + (int) time + " час " + timeMinut + " мин");

    }
}

package linearProgramm;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double time = sc.nextInt();
        int distance =sc.nextInt();
        //перевод минут в часы
       time = time / 60;
       // вычисляем скорость км/ч
        double speed =  distance / time;
        System.out.println("speed " +  speed + " км/ч");
    }
}
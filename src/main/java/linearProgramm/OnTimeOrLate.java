package linearProgramm;
//На вход подаётся 6 чисел. Первые два - это количество минут и часов текущего времени.
// Вторые два - время к которому вам нужно успеть на работу. Третья двойка - время в минутах за которое нужно добраться до работы. Нужно узнать, успеете ли вы к нужному времени на работу.
//Пример ввода: 8 0 9 0 1 20 Пример ввода: 8 25 9 10 1 10
//Вывод: Не успеете Вывод: Не успеете

import java.util.Scanner;

public class OnTimeOrLate {
    public static void main(String[] args) {
        //текущее время часы\минуты
        int currentTimeHours;
        int currentTimeMinutes;
        // время, к которому нужно успеть часы\минуты
        int necessaryTimeHours;
        int necessaryTimeMinutes;
        // время в пути часы\минуты
        int timeWayHours;
        int timeWayMinutes;

        Scanner sc = new Scanner(System.in);
        currentTimeHours = sc.nextInt();
        currentTimeMinutes = sc.nextInt();
        necessaryTimeHours = sc.nextInt();
        necessaryTimeMinutes = sc.nextInt();
        timeWayHours = sc.nextInt();
        timeWayMinutes = sc.nextInt();
        sc.close();
        //переведем время в минуты
        currentTimeMinutes += currentTimeHours * 60;
        necessaryTimeMinutes += necessaryTimeHours *60;
        timeWayMinutes += timeWayHours * 60;

        System.out.println(beOnTime(currentTimeMinutes, necessaryTimeMinutes, timeWayMinutes));

    }
        public static String beOnTime(int start, int end, int way){

        return  end - start >= way ? "Успеете" : "Не успеете";
    }
}

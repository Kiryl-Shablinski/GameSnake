package linearProgramm;
//На входе подаётся три числа. Ожидается, что одно из них нечётное. Вывести номер нечётного.
//Пример ввода: 2 6 7.
//Вывод: 3.
import java.util.Scanner;

public class PositionNumber {
    public static void main(String[] args) {
       int number1, number2, number3;
        int position1 = 1, position2 = 2, position3 = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();

        if (oddNumber(number1)) {
           System.out.println("Номер числа " + position1);

       }
        if (oddNumber(number2)) {
            System.out.println("Номер числа " + position2);

        }
        if (oddNumber(number3)) {
            System.out.println("Номер числа " + position3);
        }
        else{
            System.out.println("Среди введенных чисел нет нечетных");
        }

    }
    public static boolean oddNumber(int number){
        return number % 2 == 1 ;
    }
}

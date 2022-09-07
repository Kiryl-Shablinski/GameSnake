package linearProgramm;

import java.util.Scanner;

public class SummNumber {
    public static void main(String[] args) {
        int sum , number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        number = sc.nextInt();
        sc.close();

        //решим данное задание с помощью рекурсии
        System.out.println("Сумма цифр числа = "  + sumRecurs(number));

        // решение арифметикой
        sum = number  % 10;
        number = number / 10;
        sum += number % 10;
        number = number / 10;
        sum += number % 10;
        number = number / 10;
        sum += number % 10;

        System.out.println("Сумма цифр числа = "  + sum);
    }
    private static int sumRecurs(int number){
        int sum = 0;
        if (number < 10) {
            sum += number;
            return sum;
        }
        sum += number % 10;
       return sum + sumRecurs(number / 10);
    }
}

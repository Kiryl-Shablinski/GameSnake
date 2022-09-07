package linearProgramm;

import java.util.Scanner;

//Отсортируйте 3 числа по убыванию.
//Пример ввода: 3 4 1
//Вывод: 4 3 1
public class SortDescending {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();

        sort(a, b, c);
    }

    public static void sort(int a, int b, int c) {

        int tmp;
        if (b < c) {
            tmp = c;
            c = b;
            b = tmp;
        }

        if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        if (b < c) {
            tmp = c;
            c = b;
            b = tmp;
        }

        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
    }
}





package linearProgramm;

import java.util.Scanner;

public class Condescending {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        a= sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();

        int tmp;
        if (b > a) {
            tmp = a;
            a = b;
            b = tmp;
        }

        if (c > b) {
            tmp = c;
            c = b;
            b = tmp;
        }

        if (b > a) {
            tmp = a;
            a = b;
            b = tmp;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

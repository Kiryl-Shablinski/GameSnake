package linearProgramm;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
       int a, b, c;
       Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        a = sc.nextInt();
        System.out.println("Введите число");
        b = sc.nextInt();
        System.out.println("Введите число");
        c = sc.nextInt();
        sc.close();
        if (triangle(a,b, c)) {
            System.out.println("Треугольник может быть");
        }
        else {
            System.out.println("Треугольник  не может быть");
        }

    }
    public static boolean triangle(int a, int b, int c){
       int gipotenusa,katet1, katet2;
       if (a >= b ) {
           gipotenusa = a;
           katet1 = b;
           katet2 = c;
       }
        else {
           gipotenusa = b;
           katet1 = a;
           katet2 = c;
       }

        if(c > gipotenusa) {
            gipotenusa = c;
            katet1 = b;
            katet2 = a;
        }

        if ((gipotenusa * gipotenusa) == ((katet1 * katet1) + (katet2 * katet2))) return true;


        return false;
    }
}

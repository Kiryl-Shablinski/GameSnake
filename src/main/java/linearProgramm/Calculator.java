package linearProgramm;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a, b;
        char sign;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        a= sc.nextInt();
        b = sc.nextInt();
        sign = sc.next().charAt(0);
        sc.close();

        switch (sign) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Not correct sign");
                break;
        }
    }
}

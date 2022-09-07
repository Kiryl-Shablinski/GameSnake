package cycles;

import java.util.Scanner;

public class NumberPow {
    public static void main(String[] args) {
        int number, pow;
        double result = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        number = sc.nextInt();
        System.out.println("Enter pow");
        pow = sc.nextInt();
        sc.close();

        if (pow == 0) System.out.println( (int) result);
        if (pow > 0) System.out.println(powNumber(number, pow));
        if (pow < 0) System.out.println(result / powNumber(number, pow));
    }
    public static  int powNumber(int number, int pow){
        int result = 1;

        for (int i = 1; i <= Math.abs(pow); i++)
            result *= number;

        return result;
    }
}

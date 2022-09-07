package cycles;

import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
       //a * x + b = 0
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        System.out.println(equation(a,b));

    }
     public static double equation( int a, int b){

        return (double) -b / a;
     }
}

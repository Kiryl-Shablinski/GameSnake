package exceptoins;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       try {
           int a = sc.nextInt();
           int b = sc.nextInt();
           System.out.println(a / b);
       }catch (InputMismatchException o){
           System.out.println("It's not number");
       }catch (ArithmeticException o){
           System.out.println("Division by zero");
       }
    }
}

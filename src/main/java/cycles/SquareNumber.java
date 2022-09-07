package cycles;

import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
       int number;
       int i = 1;
       int square = i;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();

        while(square < number){
            System.out.print(square + " ");
            square = ++i * i;
        }
    }
}

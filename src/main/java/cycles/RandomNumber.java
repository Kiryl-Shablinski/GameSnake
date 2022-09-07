package cycles;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        int number, count;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        count = sc.nextInt();
        sc.close();

        print(number, count);
    }

    public static void print(int number, int count){

        for (int i = 0; i < count; i++){
            System.out.print(randNumber(number) + " ");
        }
    }

    public static int randNumber(int number){

        return (int) ((Math.random() * 2 * number) - number);
    }
}

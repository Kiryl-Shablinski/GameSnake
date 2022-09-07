package cycles;

import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = sc.nextInt();
        sc.close();

        System.out.println("Sum evenNumber: " + sumEvenNumber(number));
    }
    public static int sumEvenNumber(int number){
        int sum = 0;
        for (int i = 2; i <= number; i = i + 2){
            sum += i;
        }
        return sum;
    }
}

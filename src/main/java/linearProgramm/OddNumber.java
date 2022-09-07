package linearProgramm;

import java.util.Scanner;

public class OddNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, nextOddNumber;
        System.out.println("Введите число");
        number = sc.nextInt();

        nextOddNumber = number + 1 + number % 2;
        System.out.println("Следующее нечетное число: " + nextOddNumber);


    }
}

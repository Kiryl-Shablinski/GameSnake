package cycles;

import java.util.Scanner;

public class AnyPower {
    public static void main(String[] args) {
        int number;
        int power;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entry number:");
        number = sc.nextInt();
        System.out.println("Entry power:");
        power = sc.nextInt();
        sc.close();

        int result = 1;
        int count = 0;
        while(count != Math.abs(power)){
            result *= number;
            count++;
        }
        if (power < 0 && number != 1){
            System.out.println(1.0 / result);
        }else{
            System.out.println(result);
        }
    }
}

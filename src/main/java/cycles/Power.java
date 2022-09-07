package cycles;

import java.util.Scanner;

public class Power {

        public static void main(String[] args) {
            int number;
            int power;
            int result = 1;
            int count = 1;

            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            power = sc.nextInt();
            sc.close();

            while(count != power){
              result *= number;
                count ++;
            }
            System.out.println(result);

        }

}

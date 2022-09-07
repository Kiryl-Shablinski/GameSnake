package cycles;

import java.util.Scanner;

public class Lnd {
    public static void main(String[] args) {
        int number;
        int count = 2;
       //largest natural divisor
        int lnd = 2;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();

        while(count < number){
            if (number % count == 0){
                lnd = count;
            }
            count ++;
        }
        if (count == number && lnd == 2){
            System.out.println(number);
        } else{
            System.out.println(lnd);
        }
    }
}

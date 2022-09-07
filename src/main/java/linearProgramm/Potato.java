package linearProgramm;

import java.util.Scanner;

public class Potato {

    public static void main(String[] args) {
        int money, cent, price, priceCent, count;
        Scanner sc = new Scanner(System.in);
        price =sc.nextInt();
        priceCent =sc.nextInt() + price * 100;
        money =sc.nextInt();
        cent =sc.nextInt() + money * 100;
        count=sc.nextInt();

        if (cent >= (priceCent * count)){
            System.out.println("Хватит");
        }else {
            System.out.println("Не хватит");
        }
    }
}

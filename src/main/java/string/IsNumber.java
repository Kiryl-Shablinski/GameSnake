package string;

//Определить, является ли введённое значение числом. Если оно является числом, то определить чётное или нечётное.

import java.util.Scanner;

public class IsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();
        char[] chars = line.toCharArray();

        for (char symbol : chars){
           //проверим, является ли число отрицательным
            if (chars[0] == 45) continue;
            if (!isNumber(symbol)) {
                System.out.println("It isn't number");
                System.exit(1);
            }
        }
        if (chars[chars.length - 1] % 2 == 0)
            System.out.println("Number is even");
        else System.out.println("Number isn't even");
    }
    public static boolean isNumber(char symbol){
        return symbol >= 48 && symbol <= 57;
    }
}

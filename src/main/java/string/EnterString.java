package string;

import java.util.Scanner;

public class EnterString {
    public static String enterString() {
        String line;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        line = sc.nextLine();
        sc.close();
        return line;
    }
}

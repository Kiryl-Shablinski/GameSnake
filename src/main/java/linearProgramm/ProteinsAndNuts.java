package linearProgramm;

import java.util.Scanner;

public class ProteinsAndNuts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int proteins, nuts;
        proteins = sc.nextInt();
        nuts = sc.nextInt();
        sc.close();
         int count  = nuts / proteins;
        System.out.println(count);
    }
}

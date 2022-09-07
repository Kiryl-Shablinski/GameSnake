package linearProgramm;

import java.util.Scanner;

public class CheesTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        sc.close();
        if (pieceMove(x1, y1, x2, y2)){
            System.out.println("Ладья может сделать ход");
        }else {
            System.out.println("Ладья не может сделать ход");
        }

    }
    public static boolean pieceMove(int x1, int y1, int x2, int y2){

       if (x1 == x2 && y1 == y2){
           return false;
       }
        return x1 == x2 || y1 == y2;
    }
}

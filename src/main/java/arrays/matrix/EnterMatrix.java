package arrays.matrix;

import java.util.Scanner;

public class EnterMatrix {
    public static int[][] entry(){
        int [][] matrix;
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix's size: ");
        n = sc.nextInt();
        m = sc.nextInt();
        matrix = new int[n][m];

        System.out.println("Enter matrix's elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return matrix;
    }

    public static int[][] randomEnter(int size, int number){
      int [][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * number);
            }
        }
        return matrix;
    }

    public static int[][] randomEnter(int n, int m, int number){
        int [][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * number);
            }
        }
        return matrix;
    }
}

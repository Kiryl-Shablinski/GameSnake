package arrays.matrix;

import java.util.Scanner;

// заполните матрицу случайными числами от 0 до 20, и выведите матрицу, в которой все элементы будут умножены на 3
public class RandomMultiMatrix {
    public static void main(String[] args) {
      int n, m;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter matrix's size:");
      n = sc.nextInt();
      m = sc.nextInt();
      int [][] matrix = new int[n][m];

      for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 20);
                matrix[i][j] *= 3;
                System.out.print(matrix[i][j] + " ");
          }
          System.out.println();
      }
    }
}

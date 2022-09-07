package arrays.matrix;

public class MaxMatrixElement {
    public static void main(String[] args) {
        int[][] matrix = EnterMatrix.entry();
        int max = matrix[0][0];
        int line = 0, column = 0;
        int m, n = matrix.length;

      for (int i = 0; i < n; i++){
          m = matrix[i].length;
          for (int j = 0; j < m; j++) {
              if (max < matrix[i][j]) {
                   max = matrix[i][j];
                   line = i;
                   column = j;
              }
          }
      }
        System.out.printf("Max element matrix line: %d  column: %d", line, column);
    }
}

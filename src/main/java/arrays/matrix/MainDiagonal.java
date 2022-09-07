package arrays.matrix;


import java.util.Scanner;

public class MainDiagonal {
    public static void main(String[] args) {

        int size, number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix's size: ");
        size = sc.nextInt();
        System.out.print("Enter number line: ");
        number = sc.nextInt();
        sc.close();
        int[][] matrix = EnterMatrix.randomEnter(size, number);

        print(matrix);
        System.out.println("-----------");

        for (int i = 0; i < size; i++)
            matrix[i][i] = matrix[number][i];

        print(matrix);
    }

    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

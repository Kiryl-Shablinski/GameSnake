package arrays.matrix;
//На вход подаётся размерность матрицы. Далее матрица заполняется случайными числами от 0 до 9 включительно.
//Разверните введённую строку матрицы задом наперёд.

import java.util.Scanner;

public class ReversLineMatrix {
    //создадим статическую переменную класс, для возможности обращаться к ней из разных мест программы
   static int[][] matrix;

    public static void main(String[] args) {
        int n, m, number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix sizes:");
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println("Enter matrix's line for revers: ");
        number = sc.nextInt();
        sc.close();
        matrix = EnterMatrix.randomEnter(n, m, 10);
       print();
        System.out.println("--------------");
        //для правильной визуализации строки, введенную строку уменьшаем на 1
        reversLine(number - 1);
       print();

    }

    public static void reversLine(int number){
        int size = matrix[number].length;
        int [] lineMarix = new int[size];

        for (int i = 0; i < size; i++) {
           lineMarix[(size - 1) - i] = matrix[number][i];
        }

        for (int i = 0; i < size; i++) {
            matrix[number][i] = lineMarix[i];
        }
    }

    public static void print(){
        for (int[] ints: matrix) {
            for (int inInts: ints) {
                System.out.print(inInts + " ");
            }
            System.out.println();
        }
    }
}

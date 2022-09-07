package arrays;

import java.util.Scanner;

public class IndexMinElement {

    public static void main(String[] args) {
        int[] arr = inputElement();
        int ind =  indexMin(arr);
        System.out.println("\nIndex min element = " + ind);

    }
    public static int[] inputElement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array length: ");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++){
            System.out.print("Input elementArray: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static int indexMin(int[]arr){
        int min = arr[0];
        int ind = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] <= min) {
                min = arr[i];
                ind = i;
            }
        }
        return ind;
    }
}

package arrays;

import java.util.Scanner;

public class EvenIndex {

    public static void main(String[] args) {
        int[] arr = inputElement();


        for (int i = 0; i < arr.length; i +=2)
            System.out.print(arr[i] + " ");
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
}

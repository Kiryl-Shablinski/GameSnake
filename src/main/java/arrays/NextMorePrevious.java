package arrays;

import java.util.Scanner;

public class NextMorePrevious {
    public static void main(String[] args) {
        int[] arr = inputElement();


        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i + 1] > arr[i])
                System.out.print("Next element(s) more previous: " + arr[i + 1] + " ");
        }
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

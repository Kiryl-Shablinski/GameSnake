package arrays;

import java.util.Scanner;

public class EnterArray {

    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array's size: ");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter array's element: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
}

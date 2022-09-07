package cycles;


import java.util.Scanner;

public class LocalMax{
    public static void main(String[] args) {
        int preNumber,number, postNumber;
        int localMax = 0;
        Scanner sc = new Scanner(System.in);
        preNumber = sc.nextInt();
        number = sc.nextInt();
        do{
        if  (preNumber == 0 || number  ==0) {
            System.out.println("No local number");
            System.exit(1);
        }
        postNumber = sc.nextInt();

        if (postNumber == 0 && localMax != 0)
                break;
        else if (postNumber == 0) {
            System.out.println("No local number");
            System.exit(1);
        }

        if (number > preNumber && number > postNumber && number != localMax) {
            localMax = number;
            System.out.println(localMax);
        }
            preNumber = number;
            number = postNumber;

        }while(postNumber != 0);

        sc.close();
    }
}


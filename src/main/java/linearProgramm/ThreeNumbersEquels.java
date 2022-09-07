package linearProgramm;

public class ThreeNumbersEquels {
    public static void main(String[] args) {
        System.out.println("Количество совпадений: " + equelsNumber(34, 34, 34));
        System.out.println("Количество совпадений: " + equelsNumber(3, 84, 84));
        System.out.println("Количество совпадений: " + equelsNumber(4, -4, -34));
    }

    public static int equelsNumber(int a, int b, int c){
        int count = 0;
        if (a == b) count++;
        if (b == c) count++;
        if (a == c) count++;

        return count;
    }

}

package string;

//Вводится строчка текста, затем вводится на следующей строке одна буква латинского алфавита.
//Найдите, сколько раз в тексте встречается введенный символ.

import java.util.Scanner;

public class CountCharsToLine {

    public static void main(String[] args) {
        String line;
        Scanner sc = new Scanner(System.in);
        line = sc.nextLine();
        char letter = sc.next().charAt(0);
        System.out.println("Count letter\"" + letter + "\": " + countLetter(line, letter));
    }

    public static int countLetter(String line, char letter){
        int count = 0;
        char[] letters = line.toCharArray();
        for (char simb : letters){
            if (simb == letter)
                count++;
        }
        return count;
    }
}

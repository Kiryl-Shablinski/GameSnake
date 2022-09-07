package string;


import java.util.Scanner;

//1. Вводится строка, в которой слова разделяются пробелами. Найти самое длинное слово.
//2. На вход подаётся две строки. Определить, есть ли в первой введённой строке вторая.
public class MaxLengthWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String line = sc.nextLine();
        System.out.println("Enter word");
        String subString = sc.nextLine();
        sc.close();

        String[] words = line.split(" ");
        String longestWord = getLongestWord(words);
        System.out.println("The longest word: " + longestWord);

        boolean subStringContains =subStringContains(words, subString);

        System.out.println(subStringContains ? "Text contains word" : "Text doesn't contains word");

    }


    public static String getLongestWord(String[] words) {
        String longestWord = words[0];
        for (String word :
                words) {
            if (word.length() > longestWord.length())
                longestWord = word;

        }
        return longestWord;
    }

    public static boolean subStringContains(String[] words, String subString) {
        char[] charsSubString = subString.toCharArray();
        for (String word : words) {
            if (word.length() == subString.length()) {
                char[] charsWord = word.toCharArray();
                boolean ifContains = false;
                for (int i = 0; i < charsWord.length; i++) {
                    if (charsWord[i] != charsSubString[i])
                        break;
                    ifContains = true;
                }
                if (ifContains) return true;
            }
        }

        return false;

    }
}

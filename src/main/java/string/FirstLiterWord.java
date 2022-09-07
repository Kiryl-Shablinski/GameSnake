package string;

//Необходимо вывести те слова, в которых первая и последняя буквы совпадают.


public class FirstLiterWord {
    static String line = EnterString.enterString();

    public static void main(String[] args) {
        String[] words = line.split(" ");

        for (String word : words) {
            if (isEquals(word))
                System.out.print(word + " ");
        }

    }

    public static boolean isEquals(String word) {
        return word.charAt(0) == word.charAt(word.length() - 1);
    }
}

package collections;

import java.util.Set;
import java.util.TreeSet;

//Создать TreeSet из 20 различных слов и вывести полученную коллекцию в консоль,
// чтобы просмотреть сортировку, реализованную в TreeSet.
public class MyTreeSet {
    private static  Set<String> trs = new TreeSet<>();
    public static void main(String[] args) {
        //заполним TreeSet словами
        for (int i = 0; i < 20; i++) {
            trs.add(createword());
        }
        //получились не слова, а наборы букв, но работает
        System.out.println(trs);

    }
    public static String createword(){
        //будем создавать слова из русских строчных букв
        StringBuilder sb = new StringBuilder();
        int length = (int) (Math.random() * 19) + 1;
       do {
           char symbol = (char) (Math.random() * (1103 - 1072) + 1072);
           sb.append(symbol);
       }
           while (sb.length() <= length);
      return sb.toString();
    }
}
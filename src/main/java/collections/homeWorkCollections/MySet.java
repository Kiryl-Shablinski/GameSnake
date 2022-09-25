package collections.homeWorkCollections;

import java.util.*;

//    Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 5".
//    Избавиться от повторяющихся элементов в строке.
//    Вывести результат на экран.
public class MySet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //разобьем строку на массив элементов по любому знаку пунктуации
        String[] elements = sc.nextLine().split(",");

        //добавим элементы в HashSet, удаляя при этом лишние пробелы в начале и в конце элемента
        Set<String> mySet = new HashSet<>();
        for (String element : elements){
            mySet.add(element.trim());
        }

        System.out.println("MySet size = " + mySet.size());
        for (String element : mySet){
            System.out.println(element);
        }
    }
}

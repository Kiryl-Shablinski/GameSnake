package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Необходимо создать ArrayList из целых чисел. Затем следует перебрать коллекцию,
// если число чётное, добавить его в список с чётными числами,
// если нечетное - в список с нечётными числами соответственно. Вывести оба списка на экран,
// использовать метод для нахождения числа элементов в списке и сравнить, какой список больше.
public class MyArrayList {
    public static void main(String[] args) {
       //Мы можем создать стрим для заполнения списка данными.
        // Либо можно ручками через метод коллекции add(object)
        List<Integer> list = Stream.of(1,45,3,67,87,45,2,9,78,56,44,23)
                .collect(Collectors.toList());


        List<Integer> evenNumber = new ArrayList<>();
        List<Integer> oddNumber = new ArrayList<>();

        for (Integer number : list){
            if (evenNumber(number))
                evenNumber.add(number);
            else
                oddNumber.add(number);
        }
        System.out.print("List evenNumber: ");
        print(evenNumber);
        System.out.print("List oddNumber: ");
        print(oddNumber);

        if (evenNumber.size() > oddNumber.size()) {
            System.out.println("List evenNumber is  more than list oddNumber");
        } else {
            System.out.println("List oddNumber is more than list evenNumber");
        }
    }

    public static  void print (List<?> list){

        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public  static boolean evenNumber(int number){
       return number % 2 == 0;
    }
}

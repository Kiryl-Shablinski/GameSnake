package collections.iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
//Создайте ArrayList, используя ListIterator, обойдите коллекцию в обратном порядке и выведите все элементы в консоль, после вывода удалите каждый элемент.
//Проверьте коллекцию на пустоту, используя метод isEmpty().

public class MyListIterator {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>(Arrays.asList(3,5,6,8,2));
        myListIterator(list);
        if (list.isEmpty()) System.out.println("List is empty");
        else System.out.println("List isn't empty" + list);
    }
    public static void myListIterator(List<Integer>list){
        ListIterator<Integer> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            int tmp = listIterator.previous();
            System.out.print(tmp + " ");
            listIterator.remove();
        }
    }
}

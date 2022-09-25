package collections.iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyIterator {
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(2,4,6,7,8,9,0,7,5,4,3,5);
    iteratorList(list);
    }

    public static void iteratorList(List<Integer>list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int number = iterator.next();
            if (number % 2 == 0)
                System.out.print(number + " ");
            else iterator.remove();
        }
    }
}

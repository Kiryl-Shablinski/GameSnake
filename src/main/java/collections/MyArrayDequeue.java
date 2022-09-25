package collections;
//Создать структуру ArrayDeque, элементы которой - столицы.
// Используя методы addFirst() и addLast(), добавьте некоторое количество элементов.
// Используя методы getLast() и getFirst(),
// выведите последний и первый элемент соответственно, а также длину коллекции.

import java.util.ArrayDeque;

public class MyArrayDequeue {
    private static ArrayDeque<Capital> deque = new ArrayDeque<>();

    public static void main(String[] args) {

       Capital minsk = new Capital("Minsk");
       Capital moscow = new Capital("Moscow");
       Capital kiev = new Capital("Kiev");
       Capital warsaw = new Capital("Warsaw");
       Capital vilnius = new Capital("Vilnius");
       Capital berlin = new Capital("Berlin");
       deque.addFirst(minsk);
       deque.addFirst(moscow);
       deque.addLast(berlin);
       deque.addFirst(vilnius);
       deque.addLast(kiev);
       deque.add(warsaw);

        System.out.println("Head: " +deque. getFirst());
        System.out.println("Tail: " + deque.getLast());
        System.out.println("Length: " + deque.size());

    }
}



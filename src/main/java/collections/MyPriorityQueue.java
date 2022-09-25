package collections;

import java.util.PriorityQueue;
//Создайте PriorityQueue из 100 случайных чисел, выведите её на экран,
// найдите длину и среднее значение всех чисел.
public class MyPriorityQueue {
    private static PriorityQueue<Integer> myQueue = new PriorityQueue<>();

    public static void main(String[] args) {
        enterQueue();
        long sum = 0;

        for (Integer number: myQueue){
            sum +=number;
            System.out.println(number);
        }

        System.out.println("Length queue: " + myQueue.size());
        System.out.print("Medium number : ");
        int medium = (int) (sum / myQueue.size());
        System.out.println(medium);
    }
    public static void enterQueue(){
        int number;
        for (int i = 0; i < 100; i++) {
            number = (int) (Math.random() * Integer.MAX_VALUE);
            myQueue.add(number);
        }
    }
}

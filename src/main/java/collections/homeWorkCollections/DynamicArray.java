package collections.homeWorkCollections;
//    Создать динамический массив, содержащий объекты класса HeavyBox.
//    Распечатать его содержимое, используя for each.
//    Изменить вес первого ящика на 1.
//    Удалить последний ящик.
//    Получить массив, содержащий ящики коллекции, тремя способами и вывести на консоль.
//    Удалить все ящики.

import java.util.ArrayList;
import java.util.Arrays;



public class DynamicArray {
    private static ArrayList<HeavyBox> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add(new HeavyBox(300));
        list.add(new HeavyBox(1800));
        list.add(new HeavyBox(200));
        list.add(new HeavyBox(148));
        print();
        HeavyBox tmpBox = list.get(0);
        tmpBox.setWeight(tmpBox.getWeight() + 1);
        list.set(0, tmpBox);
        System.out.println("\nSet first element");
        print();
        list.remove(list.size() - 1);

        System.out.println("\nRemove last element");
        print();

        System.out.println("\nFirst method list to array");
        HeavyBox[] arrayBoxes = list.toArray(new HeavyBox[0]);
        System.out.println(Arrays.toString(arrayBoxes));

        System.out.println("\nSecond method list to array");
        HeavyBox[] arrayBoxes1 = new HeavyBox[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arrayBoxes1[i] = list.get(i);
        }
        for (HeavyBox box : arrayBoxes1) {
            System.out.println(box);
        }

        System.out.println("\nThirty method list to array");
        Object[] arrayBoxes2 = list.toArray();
        System.out.println(Arrays.toString(arrayBoxes2));

        transferElement();
        System.out.println("\nOld list");
        print();

        System.out.println("\nList clearing");
        list.clear();
        System.out.println("List is empty");
    }

    public static void print() {
        for (HeavyBox box : list) {
            System.out.println(box);
        }
    }




   public static void transferElement() {
       ArrayList<HeavyBox> newLists = new ArrayList<>();
       for (int i = 0; i < list.size(); i++){
           if (list.get(i).getWeight() > 300) {
               newLists.add(list.get(i));
               list.remove(i);
               i--;
           }
       }
       System.out.println("\n New list ");
       for (HeavyBox box : newLists) {
           System.out.println(box);
       }
   }


}

package generic;

import generic.animal.Cat;
import generic.animal.Lion;

//Задача 1. Создайте обобщённый конструктор, который принимает два параметра: T и V.
// В конструкторе необходимо сравнить классы этих двух параметров и
// предусмотреть соответствующий вывод результата в консоли.
public class SomeConstructor {
    public <T, V> SomeConstructor(T t, V v) {
        if (t.getClass() == v.getClass()) {
            System.out.println("Parameter's classes are equals");
        } else {
            System.out.println("Parameter's classes aren't equals");
        }

    }

    public static void main(String[] args) {
        SomeConstructor some = new SomeConstructor(new Lion("Persik", "Yellow"),
                new Lion("Barsik", "white"));
        some = new SomeConstructor(new Lion("Persik", "Yellow"),
                new Cat("Barsik", "white"));
         some = new SomeConstructor(45,
               5879879);
    }
}
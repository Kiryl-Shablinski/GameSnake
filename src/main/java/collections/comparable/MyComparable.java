package collections.comparable;

import java.util.TreeSet;

public class MyComparable {
    public static void main(String[] args) {
        TreeSet<Animal> treeSet = new TreeSet<>();
        treeSet.add(new Animal("Cat"));
        treeSet.add(new Animal("Dog"));
        treeSet.add(new Animal("Arlekino"));

        for (Animal animal : treeSet){
            System.out.println(animal);
        }

    }
}
package collections.comparable;

import java.util.*;


public class MyComparator {
    public static void main(String[] args) {
        Comparator<Animal>  compAnimal = new NameComparator().thenComparing(new ColourComparator());
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Dog", "brow"));
        animals.add(new Animal("Cat", "grey"));
        animals.add(new Animal("Dog", "black"));
        animals.add(new Animal("Arlekino", "white"));

        animals.sort(compAnimal);

        for (Animal animal : animals){
            System.out.println(animal);
        }

    }
}

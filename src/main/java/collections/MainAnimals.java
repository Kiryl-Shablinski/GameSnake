package collections;

import java.util.*;

public class MainAnimals {
    private static List<Animal> list = new LinkedList<>();

    public static void main(String[] args) {
        MainAnimals animals = new MainAnimals();
        animals.addAnimal();
        print();
        animals.removeAnimal();
        print();

    }

    public void addAnimal() {
        list.add(new Animal("Barsik"));
        list.add(new Animal("Vaska"));
        list.add(new Animal("Murka"));
        list.add(new Animal("Asteriks"));
        list.add(new Animal("Asteriks"));
        list.add(new Animal("Zorka"));
        list.add(new Animal("Uma"));
        list.add(new Animal("Rokki"));
        list.add(new Animal("Etty"));
        list.add(new Animal("Asteriks"));
        list.add(new Animal("Eva"));
        list.add(new Animal("Roni"));
    }

    public  boolean isVomel(char ch) {
        List<Character> chrList = Arrays.asList('A', 'a', 'E', 'e', 'I', 'i','O',  'o', 'U', 'u');
        return chrList.contains(ch);
    }

    public void removeAnimal(){
        for (int i = 0; i < list.size(); i++){
           char firstLiter = list.get(i).getName().charAt(0);
            if (isVomel(firstLiter)){
                list.remove(list.get(i));
                i--;
            }
        }
    }

    public static void print(){
        for (Animal animal: list ){
            System.out.print(animal + " ");
        }
        System.out.println();
    }

}

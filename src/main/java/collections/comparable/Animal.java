package collections.comparable;

import java.util.Comparator;

public class Animal  {
    private String name;

    private String colour;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
class NameComparator implements Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class ColourComparator implements Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getColour().compareTo(o2.getColour());
    }
}



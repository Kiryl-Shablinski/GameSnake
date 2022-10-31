package generic.animal;

public class Animal {
    protected String name;
    protected String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() +
                " name='" + name + '\'' +
                ", color='" + color + '\'';
    }
}

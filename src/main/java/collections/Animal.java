package collections;



//Создайте класс Animal, где поле name, - название животного.
// Добавьте 10 животных в LinkedList, удалите те объекты, name которых начинается с гласной буквы.
public class Animal {
    public String getName() {
        return name;
    }

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

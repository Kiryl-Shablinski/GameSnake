package generic.animal;
//Задача 2. Создайте класс Animal и несколько классов-наследников.
// Далее создайте обобщённый класс, который ограничен extends Animal.
// В обобщённом методе вам необходимо в качестве параметра T принимать различные подклассы животных и
// выводить название животного и его цвет.
public class Main {
    public static void main(String[] args) {
        Animal tiger = new Tiger("Umka", "Blue");
        Animal lion = new Lion("Persik", "Yellow");
        Cat cat = new Cat("Barsik", "white");
        Lynx lynx = new Lynx("Raduga", "haki");

        GenericAnimal<Animal> generic = new GenericAnimal<>();
        generic.printAnimal(tiger);
        generic.printAnimal(lion);
        generic.printAnimal(cat);
        generic.printAnimal(lynx);
    }
}

package generic.animal;

public class GenericAnimal <T extends Animal>{
    public  void printAnimal(T animal){
        System.out.println(animal);
    }
}

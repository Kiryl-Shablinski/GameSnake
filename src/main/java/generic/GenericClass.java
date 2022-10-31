package generic;

//Создайте обобщённый класс, который содержит метод checkTheClass().
// Суть этого метода - получить имя класса объекта, который вы передаёте в качестве параметра.
// Метод, соответственно, тоже обобщённый.
public class GenericClass <T>{
    public T checkTheClass(T object){
        return (T) object.getClass().getSimpleName();
    }

    public static void main(String[] args) {
        GenericClass clazz = new GenericClass<>();
        String str = "";
        Integer integer = 0;
        System.out.println(clazz.checkTheClass(str));
        System.out.println(clazz.checkTheClass(integer));
    }
}

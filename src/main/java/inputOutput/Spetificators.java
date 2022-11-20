package inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Пользователь вводит три элемента с консоли: его имя, фамилию и телефон.
// С помощью метода printf() отформатируйте результирующую строку так,
// чтобы вместо троеточий «Пользователя зовут … … .
// Его возраст - …» находилась введённая информация. Использовать спецификаторы формата!
public class Spetificators {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
           String[] input = bufferedReader.readLine().split(" ");
            User user = new User(input[0], input[1], Integer.parseInt(input[2]));
            if((user.getAge() % 10) == 1) {
                System.out.printf("«Пользователя зовут %s %s. Его возраст - %d год»",
                        user.getName(), user.getLastName(), user.getAge());
            } else if((user.getAge() % 10) > 0 && (user.getAge() % 10) < 5 ) {
                    System.out.printf("«Пользователя зовут %s %s. Его возраст - %d года»",
                            user.getName(), user.getLastName(), user.getAge());
                }else{
                    System.out.printf("«Пользователя зовут %s %s. Его возраст - %d лет»",
                            user.getName(), user.getLastName(), user.getAge());
                }
        }catch (IOException o){
            o.getMessage();
        }
    }
}

class User{
    private String name;
    private String lastName;
    private int age;

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}

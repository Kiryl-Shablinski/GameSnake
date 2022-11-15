package inputOutput;
//Прочитайте числа с консоли, предусмотрите, чтобы в случае ввода нечисловых данных, в консоли об этом уведомлялось.
//Прочитанные числа просуммировать и вывести результат.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyIO {
    public static void main(String[] args) {
       try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
          String str;
          int sum = 0;
          while (!(str = bufferedReader.readLine()).equals("exit")){
           try {
               int number = Integer.parseInt(str);
               sum += number;
           }catch (NumberFormatException o){
               System.out.println("You entered wrong information. Please, enter number");
           }
          }
           System.out.println("Number's sum = " + sum);
       }catch (IOException o){
            o.printStackTrace();
       }

    }
}

package inputOutput;
//Прочитайте некоторое количество строк в консоли.
// Далее выведите длину каждой из строк различными способами консольного вывода.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class LengthStr {
    public static void main(String[] args) {
        PrintWriter pwr = new PrintWriter(System.out);
        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            int count  = 0;
            Map<String, Integer> mapStr = new HashMap<>();
            while (count < 3){
                String str = bfr.readLine();
                int length = str.length();
                mapStr.put(str,length);
                count++;
            }
            print(mapStr, pwr);

            //для проверки корректности работы вывода
            System.out.println("Method is finished");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            pwr.close();
        }
    }

    public static void print(Map<String, Integer> map, PrintWriter pwr){
       for (Integer length : map.values()){
           System.out.println("Length string first way: " + length);
           pwr.println("Length string second way: " + length);

           //необходим для того, чтобы записать все данные перед закрытием потока
           pwr.flush();
       }
    }
}

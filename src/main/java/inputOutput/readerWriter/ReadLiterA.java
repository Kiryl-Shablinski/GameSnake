//Используя класс FileReader, прочитайте данные из любого файла и количество букв «а»,
// которые в нём встречаются.
// Результат запишите в этот же файл вместо данных, которые там были изначально.
package inputOutput.readerWriter;
import java.io.*;

public class ReadLiterA {
    public static void main(String[] args) {
        char[] buffer = new char[1000];
        int count = 0;

        try(FileReader freader= new FileReader("Letters a");
            FileWriter fileWriter = new FileWriter("Letters a")){
            while (freader.read(buffer) > 0){
              for (char symbol : buffer) {
                  if (symbol == 'а')
                      count++;
              }
            }
            String s = Integer.toString(count);
            fileWriter.write("Count letters 'a': ");
            fileWriter.write(s);
            fileWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

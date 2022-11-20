package inputOutput.fileWriteToConvert;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//Прочитайте несколько строк с консоли.
// Если их длина составляет больше n (n выбираете сами), то записать их в файл, в ином случае пропустить.
public class ReadConsoleWriteFile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             FileOutputStream outFile = new FileOutputStream("readConsoleWriteFile")){

            int n = (int) (Math.random() * 10);
            System.out.println("Length text: " + n);
           //количество считываемых строк
            int count = 0;
            byte[] byteArray;
            while( count < 4){
               //к считываемой строке добавим символ переноса коретки
                String tmp = sc.nextLine().concat("\n");
                if (tmp.length() > n){
                    byteArray = tmp.getBytes();
                    outFile.write(byteArray);
                }
                count++;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

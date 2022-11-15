package file;


import java.io.*;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MyFile {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("readme.txt");
        if (!(Files.exists(path))) {
            Files.createFile(path);
        }
   /*     String str ="I love Java";
        File file  = new File("readme.txt");
        FileWriter writer = new FileWriter(file);
        writer.write(str);
        writer.close();

    */

        FileReader reader = new FileReader("readme.txt");
        BufferedReader buffer = new BufferedReader(reader);
        String strRead;
      while ((strRead = buffer.readLine()) != null) {
          System.out.println(strRead);
      }
        buffer.close();


      //      if (Files.exists(path)){
      //          Files.delete(path);
      //      }
    }
}

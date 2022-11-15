package inputOutput.fileWriteToConvert;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainFile {
    public static void main(String[] args) {
        try(FileInputStream inFile  = new FileInputStream("E:\\A65CCAFF2D1C500EFA3EE7708751171086B56FD2");
            FileOutputStream outFile = new FileOutputStream("E:\\Кирилл\\tmp1\\frilanse",true)){
            byte[] buffer = new byte[1000];
            while(inFile.available() > 0){
                int count = inFile.read(buffer);
                outFile.write(buffer, 0, count);
            }
        }catch (IOException o){
            o.printStackTrace();
        }
    }
}

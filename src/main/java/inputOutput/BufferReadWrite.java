package inputOutput;

import java.io.*;

public class BufferReadWrite {
    public static void main(String[] args) throws IOException {
        try(BufferedWriter bfwr = new BufferedWriter(new PrintWriter(System.out))){
            String s = "I love Java";
            bfwr.write(s);
            bfwr.newLine();
            bfwr.write(s);
        }
    }
}

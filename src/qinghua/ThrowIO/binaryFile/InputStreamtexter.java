package qinghua.ThrowIO.binaryFile;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamtexter {
    public static void main(String[] args) throws IOException {
        FileInputStream s = new FileInputStream("1.txt");
        int c;
        while ((c =s.read()) != -1){
            System.out.write(c);
        }
        s.close();
    }
}

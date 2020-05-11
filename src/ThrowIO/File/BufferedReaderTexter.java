package ThrowIO.File;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderTexter {
    public static void main(String[] args) {
        String fileName = "2.txt";
        String line;
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            line = in.readLine();
            while ((line != null)){
                System.out.println(line);
                line = in.readLine();
            }
            in.close();
        }catch (IOException iox){
            System.out.println("Problem reading" + fileName);
        }
    }
}

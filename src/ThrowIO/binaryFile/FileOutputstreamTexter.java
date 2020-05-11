package ThrowIO.binaryFile;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.*;
public class FileOutputstreamTexter {
    public static void main(String[] args) {
        String fileName = "data1.dat";
        int value0 = 255;
        int value1 = 0;
        int value2 = -1;
        try{
            DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName));
            out.writeInt(value0);
            out.writeInt(value1);
            out.writeInt(value2);
            out.close();
        }catch (IOException iox){
            System.out.println("Problem writing" + fileName);
        }
    }
}

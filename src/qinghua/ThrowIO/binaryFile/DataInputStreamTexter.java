package qinghua.ThrowIO.binaryFile;

import java.io.*;

public class DataInputStreamTexter {
    public static void main(String[] args) {
        String fileName = "data1.dat";
        int sum = 0;
        try{
            DataInputStream instr = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream(fileName)
                    )
            );
            try{
                while (true){
                    sum += instr.readInt();
                }
            }catch (EOFException eof){
                System.out.println("The sum is " + sum);
                instr.close();
            }
        }catch (IOException iox){
            System.out.println("Problem reading " + fileName);
        }
    }
}

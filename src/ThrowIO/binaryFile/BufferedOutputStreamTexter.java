package ThrowIO.binaryFile;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTexter {
    public static void main(String[] args) throws IOException {
        String fileName = "mixedType.dat";
        DataOutputStream dataOut = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(fileName)
                )
        );
        dataOut.writeInt(0);
        System.out.println(dataOut.size() + " bytes have been wrrtten.");
        dataOut.writeDouble(31.2);
        System.out.println(dataOut.size() + " bytes have been wrrtten.");
        dataOut.writeBytes("JAVA");
        System.out.println(dataOut.size() + " bytes have been wrrtten.");
        dataOut.close();
    }
}

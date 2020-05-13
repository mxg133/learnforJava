package qinghua.ThrowIO.binaryFile;

import java.io.*;

public class FileOutputStreamTexter2 {
    public static void main(String[] args) throws Exception{
        DataOutputStream out = new DataOutputStream(
                new FileOutputStream("trytry.dat")
        );
        out.writeByte(-1);
        out.close();
        DataInputStream in = new DataInputStream(
                new FileInputStream("trytry.bat")
        );
        int a = in.readByte();
        System.out.println(Integer.toHexString(a));
        System.out.println(a);
//        退回 重读
        in.skip(-1);
        a = in.readUnsignedByte();
        System.out.println(Integer.toHexString(a));
        System.out.println(a);
        in.close();

    }
}

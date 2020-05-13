package qinghua.ThrowIO.GZIP;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTexter {
    public static void main(String[] args) throws IOException {
        ZipOutputStream out = new ZipOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("text.gz")
                )
        );
        for (int i = 0; i < args.length; i++) {
            System.out.println("Writing file " + args[i]);
            BufferedInputStream in = new BufferedInputStream(
                    new FileInputStream(args[i])
            );
            out.putNextEntry(new ZipEntry(args[i]));
            int c;
            while ((c = in.read()) != -1){
                out.write(c);
            }
            in.close();
        }
        out.close();

        System.out.println("Reading file");
        ZipInputStream in2 = new ZipInputStream(
                new BufferedInputStream(
                        new FileInputStream("text.gz")
                )
        );
        ZipEntry ze;
        while ((ze = in2.getNextEntry()) != null){
            System.out.println("Reading file " + ze.getName());
            int x;
            while ((x = in2.read()) != -1){
                System.out.write(x);
                System.out.println();
            }
            in2.close();
        }
    }
}

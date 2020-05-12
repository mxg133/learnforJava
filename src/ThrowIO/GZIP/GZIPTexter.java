package ThrowIO.GZIP;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZIPTexter {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("Hello.txt");
        GZIPOutputStream out = new GZIPOutputStream(
                new FileOutputStream("Text.gz")
        );
//        压缩过程
        System.out.println("Writing compressing file from Hello.txt to text.gz");
        int c;
        while ((c = in.read()) != -1){
            out.write(c);
        }
        in.close();
        out.close();

//        解压缩过程
        System.out.println("Reading file form text.gz to monitor");
        BufferedReader in2 = new BufferedReader(
                new InputStreamReader(
                        new GZIPInputStream(
                                new FileInputStream("Text.gz")
                        )
                )
        );
        String s;
        while ((s = in2.readLine()) != null){
            System.out.println(s);
        }
        in2.close();

        System.out.println("Writing decompression to newHello.txt");
        GZIPInputStream in3 = new GZIPInputStream(
                new FileInputStream("text.gz")
        );
        FileOutputStream out2 = new FileOutputStream("newHello.txt");
        while ((c = in3.read()) != -1){
            out2.write(c);
        }
        in3.close();
        out2.close();
    }
}

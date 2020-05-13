package qinghua.ThrowIO;

import java.io.*;

public class Redirecting {
    public static void main(String[] args) throws IOException {
//        将Redirecting.java复制到test.out中
//        将输入流对象直接关联到一个磁盘文件的
        BufferedInputStream in = new BufferedInputStream(
                new FileInputStream( "Redirecting.java"));
//        构造一个输出流对象，直接关联到了一个磁盘文件，文件后缀随便起的一个名字，
        PrintStream out = new PrintStream(
                new BufferedOutputStream(
                        new FileOutputStream("test.out")));

//        进行重新定向
//        调用System.setIn(in);将标准输入流重新定向为in这个输入流对象，就是关联到磁盘Redirecting.java文件上而不是关联到键盘
        System.setIn(in);
//        调用System.setOut(out);将标准输出流关联到out这个输出流对象，指向的是test.out"磁盘文件，就不用关联标准输出流--显示器了
        System.setOut(out);
//        将标准错误信息输出流关联到test.out"文件，因为out指向的是test.out"文件。
        System.setErr(out);

//        构造一个有缓冲的输入流 能够使输入的效率更高一些，但是BufferedReader这个缓冲流本身并不执行读磁盘文件的操作，只是一个处理流，
//        所以引一个真正的能够从文件读取信息的节点流作为参数，才能构造这个缓冲的BufferedReader
//        InputStreamReader就是一个桥梁，
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {//readLine()按行读入，遍历每一行
            System.out.println(s);//这个System.out已经指向test.out
        }

        in.close();
        out.close();
    }
}

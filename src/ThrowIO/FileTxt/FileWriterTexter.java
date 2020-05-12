package ThrowIO.FileTxt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTexter {
    public static void main(String[] args) throws IOException {
//        main方法中声明抛出IO异常，没有捕获和处理异常
//        创建一个1.txt文本文件
        String fileName1 = "1.txt";//给文件起个名字1.txt
        try {
//        创建文本文件的时候，构造一个FileWriter输出流对象writer
            FileWriter writer = new FileWriter(fileName1,true);//（）里应该是文件名作为参数，可以是绝对路径 true追加到底行

//        就可以向文件写信息了
            writer.write("hello!\n");
            writer.write("This is a file\n");
            writer.write("中文!\n");
            writer.close();
        }catch (IOException iox){
            System.out.println("Problem writing" + fileName1);
        }

//        用newLine()实现跨平台换行
        String fileName2 = "2.txt";
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName2));
        out.write("hello");
        out.newLine();
        out.write("中文");
        out.newLine();
        out.write("实现换行");
        out.close();
    }
}

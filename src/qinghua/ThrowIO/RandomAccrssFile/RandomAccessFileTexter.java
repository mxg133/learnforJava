package qinghua.ThrowIO.RandomAccrssFile;

import java.io.RandomAccessFile;

public class RandomAccessFileTexter {
    String Filename;
    public RandomAccessFileTexter(String Filename){
        this.Filename = Filename;
    }
    public void writeEmployee(Employee e, int n)throws Exception{
        RandomAccessFile ra = new RandomAccessFile(Filename, "rw");
        ra.seek(n*20);//将位置指示器移到指定位置上
        for (int i = 0; i < 8; i++) {
            ra.writeChar(e.m_name[i]);
        }
        ra.writeInt(e.m_age);
        ra.close();
    }
    public void readEmployee(int n)throws Exception{
        char buf[] = new char[8];
        RandomAccessFile ra = new RandomAccessFile(Filename, "r");
        ra.seek(n*20);//将位置指示器移到指定位置上
        for (int i = 0; i < 8; i++) {
            buf[i] = ra.readChar();
        }
        System.out.println("name");
        System.out.println(buf);
        System.out.println("age:" + ra.readInt());
        ra.close();
    }
}
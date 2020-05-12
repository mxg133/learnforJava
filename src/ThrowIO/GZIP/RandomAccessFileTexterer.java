package ThrowIO.GZIP;

import ThrowIO.RandomAccrssFile.Employee;
import ThrowIO.RandomAccrssFile.RandomAccessFileTexter;

import java.io.RandomAccessFile;

public class RandomAccessFileTexterer {
    public static void main(String[] args) throws Exception{
        RandomAccessFileTexter t = new RandomAccessFileTexter("temp/1.txt");
        Employee e1 = new Employee("wang er", 23);
        Employee e2 = new Employee("小路", 18);
        Employee e3 = new Employee("礼花", 34);
        t.writeEmployee(e1, 0);
        t.writeEmployee(e3, 2);
        System.out.println("第一个雇员信息：");
        t.readEmployee(0);
        System.out.println("第一个雇员信息：");
        t.readEmployee(2);
        t.writeEmployee(e2, 1);
        System.out.println("第一个雇员信息：");
        t.readEmployee(1);

    }
}

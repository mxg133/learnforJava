package atguigu.day16.exer.my;

import java.awt.desktop.PrintFilesEvent;

public class EcmDef {

    public static void main(String[] args) {
    try {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        System.out.println(ecm(i, j));
    }catch (NumberFormatException e){
        System.out.println("数据类型不一致！！！");
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("缺少命令行参数！！！");
    }catch (ArithmeticException e){
        System.out.println("除0异常！！！");
    }catch (EcDef e){
        e.getMessage();
    }

    }

    public static int ecm(int i, int j) throws EcDef {
        if (i < 0 || j < 0) {
            throw new EcDef("不能有负数！！！！");
        }
        return i / j;
    }
}
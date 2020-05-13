package qinghua.ThrowIO.FileClass;

import java.io.File;

public class FileTexter {
    public static void main(String[] args) {
        File f = new File("Hello.txt");

        if (f.exists()){//判断文件是否是否存在
            f.delete();//删除原文件
        }else {
            try {
                f.createNewFile();//创建新文件
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

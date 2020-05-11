package ThrowIO.FileCopy;

import java.io.*;

public class CopyMaker {
    String sourceName;
    String destName;
    BufferedReader source;
    BufferedWriter dest;
    String line;//指向读取中间缓冲的数据

    private boolean openFiles(){
        try{
            source = new BufferedReader(new FileReader(sourceName));
        }catch (IOException iox){
            System.out.println("Problen opening " + sourceName);
            return false;
        }
        try {
            dest = new BufferedWriter(new FileWriter(destName));
        }catch (IOException iox){
            System.out.println("Problen opening " + destName);
            return false;
        }
        return true;
    }

    private boolean copyFiles(){
        try {
            line = source.readLine();
            while (line != null){
                dest.write(line);
                dest.newLine();
                line = source.readLine();
            }
        }catch (IOException iox){
            System.out.println("Problen reading or writing");
            return false;
        }
        return true;
    }

    private boolean closeFiles(){
        boolean retVal = true;
        try {
            source.close();
        }catch (IOException iox){
            System.out.println("Problem closing " + sourceName);
            retVal = false;
        }
        try {
            dest.close();
        }catch (IOException iox){
            System.out.println("Problem closing " + destName);
            retVal = false;
        }
        return retVal;
    }

    public boolean copy(String scr, String dst){
        sourceName = scr;
        destName = dst;
        return openFiles() && copyFiles() && closeFiles();
    }
}

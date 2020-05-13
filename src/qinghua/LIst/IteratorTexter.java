package qinghua.LIst;

import java.util.Iterator;
import java.util.Vector;

public class IteratorTexter {
    public static void main(String[] args) {
        String num[] = {
                "123", "1234", "3543", "4365", "235235", "23523", "23", "2345", "42345", "234"
        };
        Vector<String> aVector = new Vector<String>(java.util.Arrays.asList(num));
        System.out.println("Before Vector: " + aVector);
        Iterator<String> nums = aVector.iterator();
        while (nums.hasNext()){
            String aString = (String)nums.next();
            System.out.println(aString);
            if (aString.length() > 4){
                nums.remove();
            }
        }
        System.out.println("After Vector: " + aVector);
    }
}

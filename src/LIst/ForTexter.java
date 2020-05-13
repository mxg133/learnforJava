package LIst;

import java.util.Enumeration;
import java.util.Vector;

public class ForTexter {
    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();
        for (String day:dayNames
             ) {System.out.println(day);

        }
    }
}

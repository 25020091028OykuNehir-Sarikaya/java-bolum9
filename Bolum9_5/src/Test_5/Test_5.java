
package Test_5;

import java.util.GregorianCalendar;
import tr.edu.istiklal.Gregorian;

public class Test_5 {

    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        Gregorian g = new Gregorian();

       
        
        System.out.println(g.getYear(calendar));
        System.out.println( g.getMonth(calendar));
        System.out.println(g.getDay(calendar));

        
        g.setTime(calendar, 1234567898765L);
        
        System.out.println(g.getYear(calendar));
        System.out.println( g.getMonth(calendar));
        System.out.println( g.getDay(calendar));
    }
}

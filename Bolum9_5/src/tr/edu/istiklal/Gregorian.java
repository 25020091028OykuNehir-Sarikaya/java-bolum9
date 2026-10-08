
package tr.edu.istiklal;

import java.util.GregorianCalendar;

public class Gregorian {

    public int getYear(GregorianCalendar calendar) {
        return calendar.get(GregorianCalendar.YEAR);
    }

    public int getMonth(GregorianCalendar calendar) {
        return calendar.get(GregorianCalendar.MONTH) + 1;
    }

    public int getDay(GregorianCalendar calendar) {
        return calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public void setTime(GregorianCalendar calendar, long millis) {
        calendar.setTimeInMillis(millis);
    }
}
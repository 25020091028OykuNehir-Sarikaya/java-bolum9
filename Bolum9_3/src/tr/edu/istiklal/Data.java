package tr.edu.istiklal;

import java.util.Date;

public class Data {

    public static long[] times = {
        10000L, 100000L, 1000000L, 10000000L,
        100000000L, 1000000000L, 10000000000L, 100000000000L
    };

    public static void showDate(Date date, long elapsedTime) {
        date.setTime(elapsedTime);
        System.out.println(date.toString());
    }
}
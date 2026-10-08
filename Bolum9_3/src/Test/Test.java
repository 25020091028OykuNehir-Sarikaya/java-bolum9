package Test;

import java.util.Date;
import tr.edu.istiklal.Data;

public class Test {

    public static void main(String[] args) {
        Date dt = new Date();

        for (long t : Data.times) {
            Data.showDate(dt, t);
        }
    }
}
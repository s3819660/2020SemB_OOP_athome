package wk3;

import java.util.GregorianCalendar;

public class Q9_GregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR) + " " +
                gregorianCalendar.get(GregorianCalendar.MONTH) + " " + gregorianCalendar.get(GregorianCalendar.DAY_OF_WEEK));

        gregorianCalendar.setTimeInMillis(1234567898765L);
        System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR) + " " +
                gregorianCalendar.get(GregorianCalendar.MONTH) + " " + gregorianCalendar.get(GregorianCalendar.DAY_OF_WEEK));
    }
}


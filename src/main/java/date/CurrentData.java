package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CurrentData {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MMM_ d HH : mm");
        System.out.println(sdf.format(date));
        Calendar calendar = new GregorianCalendar();

        System.out.println("Year: " + calendar.get(Calendar.YEAR));
    }
}

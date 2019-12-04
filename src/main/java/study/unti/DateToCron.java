package study.unti;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author
 */
public class DateToCron {

    private static final String CRON_DATE_FORMAT = "ss mm HH dd MM ? yyyy";

    public static String getCron(Date date){
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat(CRON_DATE_FORMAT);
        String time=null;
        if(date!=null){
           time = simpleDateFormat.format(date);
        }
        return time;
    }
}

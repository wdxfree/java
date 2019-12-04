package study.unti;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class testTimer  extends TimerTask {
    @Override
    public void run() {
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm:ss");
        String time=simpleDateFormat.format(date);
        System.out.println(time+"正在执行testTimer");
    }
}

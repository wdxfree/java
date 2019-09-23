package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class testDate {
    public static void main(String[] args) {
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }

        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyyMMdd");
        String time=simpleDateFormat.format(new Date());
        System.out.println(time);


    }


}

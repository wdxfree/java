package algorithm;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class testRateLimter {

    public static final SimpleDateFormat timeFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final RateLimiter rateLimiter=RateLimiter.create(2);


    @RequestMapping("/sayHello")
    public String sayHello(){
        if (rateLimiter.tryAcquire()){
            System.out.println(timeFormat.format(new Date()));

            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else {
            System.out.println("limit");
        }
        return "hello";
    }

    @RequestMapping("/sayHi")
    public String sayHi(){
        rateLimiter.acquire(5);
        System.out.println(timeFormat.format(new Date()));
        return "hi";
    }







}

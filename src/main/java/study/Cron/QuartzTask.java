package study.Cron;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author
 */
@Component
public class QuartzTask implements Job {




    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        Jedis jedis=null;
        try {
            jedis=(Jedis) jobExecutionContext.getScheduler().getContext().get("jedis");
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        Long setnx = jedis.setnx("cron", "cron");
        if(setnx!=1){
            System.out.println("未能获取到锁");
        }
        else {
            System.out.println("获取到锁");


            for(int i=0;i<10000;i++){
                int j=0;
                j++;
            }
//            jedis.del("cron");
//            System.out.println("释放锁");
        }
    }


}

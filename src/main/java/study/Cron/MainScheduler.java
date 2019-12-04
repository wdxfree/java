package study.Cron;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

/**
 * @Author
 */
@Component("MainScheduler")
public class MainScheduler {

    @Autowired
    private  QuartzTask quartzTask;

    @Autowired
    private Jedis jedis;

    public  void  schedulerJob()  {
        SchedulerFactory schedulerFactory =new StdSchedulerFactory();
        Scheduler scheduler = null;
        try {
            scheduler = schedulerFactory.getScheduler();
            scheduler.getContext().put("jedis",jedis);
            JobDetail jobDetail = JobBuilder.newJob(quartzTask.getClass()).withDescription("jop1").build();
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group3")
                    .withSchedule(CronScheduleBuilder.cronSchedule("0 * * * * ? *"))
                    .build();
            scheduler.scheduleJob(jobDetail, trigger);
            scheduler.start();

        } catch (SchedulerException e) {
            e.printStackTrace();
        }


    }
}

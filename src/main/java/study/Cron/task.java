package study.Cron;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

/**
 * @Author
 */
@Component
public class task {

    @Autowired
    private Jedis jedis;

    @Scheduled(fixedRate = 1400)
    public int te(){
        jedis.connect();
        Long setnx = jedis.setnx("cron", "cron");
        if(setnx!=1){
            return 0;
        }
        Long cron = jedis.del("cron");
        System.out.println("这是进程一的创建方式"+cron);
        System.out.println("test1");
        return 1;
    }

}

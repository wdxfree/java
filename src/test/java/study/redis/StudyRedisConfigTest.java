package study.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import static org.junit.Assert.*;

/**
 * @Author
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StudyRedisConfigTest {
    @Autowired
    private Jedis jedis;

    @Test
    public void createRedis(){
        jedis.connect();
        String s = jedis.get("one");
        System.out.println(s);
    }
}
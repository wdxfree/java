package study.redis;

import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

import java.net.URI;
import java.util.List;

/**
 * @Author
 */

@Configuration
public class StudyRedisConfig {
    @Autowired
    private  RedisProperties redisProperties;

    @Bean
    public Jedis createJedis(){

        List<String> strings = redisProperties.getUri();
        URI uri =null;


        for(String s:strings){
            uri=URI.create(s);
        }
        Jedis jedis = null;
        jedis= new Jedis(uri.getHost(),uri.getPort());
        return  jedis;
    }
}

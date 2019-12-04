package study.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;
import java.net.URL;

import static org.junit.Assert.*;

/**
 * @Author
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisPropertiesTest {
    @Autowired
    private RedisProperties redisProperties;

    @Test
    public void getUri() {
        if(redisProperties!=null){
            System.out.println(redisProperties);

            if(redisProperties.getUri()!=null){
                for(String s:redisProperties.getUri()){
                    URI ur = URI.create(s);
                    System.out.println(ur);
                    System.out.println(ur.getHost());
                    System.out.println(ur.getPort());
                    System.out.println(ur.getAuthority());
                    System.out.println(ur.getFragment());
                }
            }

        }

    }
}